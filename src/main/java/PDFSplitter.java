import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class PDFSplitter {

    public static void main(String args[]) throws IOException{

        File file = new File("D:\\xtra\\PDFSplitter\\src\\main\\resources\\BPITrade_ApplicationForm.pdf");
        PDDocument pdDocument = PDDocument.load(file);

        Splitter splitter = new Splitter();
        List<PDDocument> pages = splitter.split(pdDocument);
        Iterator<PDDocument> iterator = pages.listIterator();

        int i =1;
        while(iterator.hasNext()){
            PDDocument pd = iterator.next();
            pd.save("C:/Users/Lao/OneDrive/Desktop/PDF Result/splitPDf" + i++ +".pdf");
        }
        System.out.print("PDF Created");
        pdDocument.close();


    }
}
