package com.yewon.controller;

import com.yewon.DTO.UserDto;
import com.yewon.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    @Autowired
    BCryptPasswordEncoder pwdEncoder;



    @RequestMapping("/")
    public String index(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        if(httpSession.getAttribute("login") != null){
            return "homepage";
        }else{
            return "index";
        }
    }

    @RequestMapping("/home")
    public String home(){
        return "homepage";
    }

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String checkLogin(@ModelAttribute UserDto userDto, HttpSession httpSession, Model model, HttpServletResponse res) throws Exception {
       UserDto userInfo = userService.selectUser(userDto);
        System.out.println("userDto의 pw: " + userDto.getUserPassword());
        System.out.println("userInfo의 pw: " + userInfo.getUserPassword());

        if(userInfo==null || !pwdEncoder.matches(userDto.getUserPassword(), userInfo.getUserPassword())) {
            System.out.println("null: ");
            res.setContentType("text/html; charset=UTF-8");
            PrintWriter out = res.getWriter();
            out.println("<script>alert('해당 회원 정보를 찾을 수 없습니다.');</script>");
            out.flush();
            return "index";

        }else{
                model.addAttribute("user", userInfo);
                res.setContentType("text/html; charset=UTF-8");
                PrintWriter out = res.getWriter();
                out.println("<script>alert('환영합니다.');</script>");
                out.flush();
                return "homepage";
            }
    }

    @RequestMapping(value="/join", method=RequestMethod.GET)
    public String joinGET(){
        System.out.println("/join");
        return "join";
    }

    @RequestMapping(value="/join", method=RequestMethod.POST)
    public String joinPOST(@ModelAttribute UserDto dto, HttpServletResponse res) throws Exception{
        dto.setUserPassword(pwdEncoder.encode(dto.getUserPassword()));
        userService.insertUser(dto);


        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<script>alert('회원가입이 완료되었습니다!');</script>");
        out.flush();

        return "index";
    }

}
