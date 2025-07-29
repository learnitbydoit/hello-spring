package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/** DocumentGenerator là interface, nghĩa là sẽ  có nhiều loại obj thuộc về nó, nên phải chỉ rõ dùng loại cụ thể nào. Có các cách sau:
 * 1. Tự khai báo @Bean + @Primary trong class AppConfig
 * 2. Dùng @Qualifier("tên bean class cụ thể") lúc truyền tham số cho constructor của class này. Nếu vừa có dùng @Primary, vừa có dùng  @Qualifier, thì @Qualifier sẽ được ưu tiên.
 * 3. Dùng truyền dependency qua setter, lúc gọi (main) sẽ getBean cụ thể để truyền vào. Nếu dùng cả 3 cách thì cách này được ưu tiên nhất.*/
@Service
public class ContractService {
    private DocumentGenerator documentGene;

    //Cách 2
    @Autowired
    public ContractService (@Qualifier("docxGene")DocumentGenerator documentGene) {
        this.documentGene = documentGene;
    }

    //Cách 3
    /*@Autowired
    public void setDocumentGenerator(DocumentGenerator documentGene){
        this.documentGene = documentGene;
    }*/

    //Hàm xử lý chính
    public void makeContract() {
        //Xử lý
        //tạo file
        documentGene.generateFile("abc");
    }
}
