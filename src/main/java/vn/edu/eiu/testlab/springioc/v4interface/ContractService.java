package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    private DocumentGenerator documentGene;
    //DocumentGenerator là interface, nghĩa là sẽ  có nhiều loại obj thuộc về nó, nên phải dùng @Qualifier  để chỉ rõ dùng loại cụ thể nào.
    public ContractService (@Qualifier("docxGenerator")DocumentGenerator documentGene) {
        this.documentGene = documentGene;
    }

    //Hàm xử lý chính
    public void makeContract() {
        //Xử lý
        //tạo file
        documentGene.generateFile("abc");
    }
}
