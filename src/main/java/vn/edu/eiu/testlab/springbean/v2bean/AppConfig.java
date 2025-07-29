package vn.edu.eiu.testlab.springbean.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    /*//Cách 1:
    @Bean //Nếu dùng cách này thì tên hàm sẽ được lấy đặt tên  cho bean, nên sẽ không theo quy tắt v+o mà là tên của class theo cú pháp camel.
    public PdfGeneratorUtil pdfGeneratorUtil(){
        return new PdfGeneratorUtil();
    }*/
    //Cách 2:
    @Bean("pdfGeneratorUtil")//Đặt alias cho Bean
    public PdfGeneratorUtil getPdfGeneratorUtil(){
        return new PdfGeneratorUtil();
    }
}
