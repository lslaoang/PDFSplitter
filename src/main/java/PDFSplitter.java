import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class PDFSplitter {

    public static void main(String args[]) throws IOException{

        File file = new File("{Insert source path here}");
        PDDocument pdDocument = PDDocument.load(file);

        Splitter splitter = new Splitter();
        List<PDDocument> pages = splitter.split(pdDocument);
        Iterator<PDDocument> iterator = pages.listIterator();

        int i =1;
        while(iterator.hasNext()){
            PDDocument pd = iterator.next();
            pd.save("{Insert output path here}/name" + i++ +".pdf");
        }
        System.out.print("PDF Created");
        pdDocument.close();


    }
}
