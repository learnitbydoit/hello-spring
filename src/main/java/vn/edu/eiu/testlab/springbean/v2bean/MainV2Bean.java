package vn.edu.eiu.testlab.springbean.v2bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV2Bean {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Tạo bean, do đặt alias cho bean nên sẽ lỗi
        /*PdfGeneratorUtil pdfGene1 = context.getBean("getPdfGeneratorUtil", PdfGeneratorUtil.class);
        pdfGene1.generatePdfFile("1407.pdf");*/


        PdfGeneratorUtil pdfGene2 = context.getBean( PdfGeneratorUtil.class);
        pdfGene2.generatePdfFile("1402.pdf");

        PdfGeneratorUtil pdfGene3 = context.getBean("pdfGeneratorUtil" ,PdfGeneratorUtil.class);
        pdfGene3.generatePdfFile("1403.pdf");

    }
}
