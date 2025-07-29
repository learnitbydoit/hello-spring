package vn.edu.eiu.testlab.springioc.v1diconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    //Khai báo dependency
    private PdfGeneratorUtil pdfGene;
    //Constructor được dùng để tiêm dependency
    @Autowired //Báo cho spring context biết là dùng constructor này để tiêm dependency. Nếu chỉ có một constructor thì có thể không khai báo.
    public ContractService(PdfGeneratorUtil pdfGene) {
        this.pdfGene = pdfGene;
    }
    public ContractService() {}//Đây là constructor default, nếu không khai báo là tự có với mọi class. Nếu có định nghĩa một constructor khác có tham số thì sẽ bỏ qua không dùng, nếu không khai báo tường minh.
    //hàm xử lý chính tạo hợp đồng
    public void makeContract(){
        //Logic xử lý hợp đồng
        //Gọi repo lưu db
        //Gọi pdf xuất file
        pdfGene.generatePdfFile("1450.pdf");
    }
}
