package vn.edu.eiu.testlab.springbean.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** SRP: Khai báo thông tin cấu hình các class sẽ là Dependency trong app
 * */
@Configuration //Spring context sẽ đọc thông tin cấu hình trong class này để tạo các Object dependency và gọi nó là bean.
@ComponentScan("vn.edu.eiu.testlab.springbean.v1scan")//Lệnh này sẽ quét các class trong package được khai báo trong (), các class nào có các annotation sau sẽ được tạo bean: @Component, @Service, @Controller, @RestController,@Repository...
//@ComponentScan(basePackages = {"vn.edu.eiu.testlab.springbean.v1scan","vn.edu.eiu.testlab.springbean"})//Scan nhiều packages khác nhau
public class AppConfig {
    //Tự tạo các obj dependency trong này, tuy nhiên ở đây sẽ không tạo, vì ta dùng chế độ scan tự động.
}
