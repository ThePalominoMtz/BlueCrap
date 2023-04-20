package test;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import java.io.FileNotFoundException;

public class pdf_generator2 {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\PC\\OneDrive\\Escritorio\\pito.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document = new Document(pdfDocument);

        document.close();

        System.out.println("Holaaaaaaa");

    }

}
