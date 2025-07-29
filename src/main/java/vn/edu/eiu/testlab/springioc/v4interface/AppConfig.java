package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("vn.edu.eiu.testlab.springioc.v4interface")
public class AppConfig {
    @Bean
    //@Primary
    public DocxGenerator docxGene(){
        return new DocxGenerator();
    };
    @Bean
    @Primary
    public PdfGenerator pdfGene(){
        return new PdfGenerator();
    }

}
