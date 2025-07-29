package vn.edu.eiu.testlab.springioc.v1diconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV1DiConstructor {
    public static void main(String[] args) {
        //Khai báo context quản lý bean
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Nhờ context lấy bean
        ContractService contractService = context.getBean(ContractService.class);

        //tạo hợp đồng và xuất pdf
        contractService.makeContract();
    }
}