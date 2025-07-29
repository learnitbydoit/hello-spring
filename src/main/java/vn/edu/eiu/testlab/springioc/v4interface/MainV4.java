package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contractService = context.getBean(ContractService.class);

        //Cách 3: truyền qua setter, getBean pdfGene để tạo file pdf, getBean docxGene để tạo file docx
        /*DocumentGenerator documentGene = context.getBean("pdfGene",DocumentGenerator.class);*/

        contractService.makeContract();
    }
}
