package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contractService = context.getBean(ContractService.class);
        contractService.makeContract();
    }
}
