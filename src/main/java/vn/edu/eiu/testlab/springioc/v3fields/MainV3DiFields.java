package vn.edu.eiu.testlab.springioc.v3fields;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV3DiFields {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contractService = context.getBean(ContractService.class);
        contractService.makeContract("abc.pdf");

        ContractService contractService2 = context.getBean("makingContract",ContractService.class);
        contractService2.makeContract("xyz.pdf");
    }
}
