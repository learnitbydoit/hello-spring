package vn.edu.eiu.testlab.springioc.v2setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class MainV2DiSetter {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Gọi bean
        ContractService contractService = (ContractService) context.getBean("contractService");
        //Không cần tự tạo bean pdfGenerator rồi gọi setter mà chỉ cần khai báo @Autowired ở phương thức setter của ContractService, spring context tự biết để lấy và truyền cho contractService.
        contractService.makeContract("01", LocalDate.now());

    }

}
