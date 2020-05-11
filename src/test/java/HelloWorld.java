import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:../../../web/WEB-INF/applicationContext.xml"})
public class HelloWorld {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws Exception{
        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
//
//    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void connection() {
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://" + "localhost"
//                + "/" + "" + "?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul&useSSL=false", "root", "Victory2017")) {
//            log.info(conn);
//        } catch (Exception e) {
//            fail(e.getMessage());
//        }
//    }
}