package test;

import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.io.FileNotFoundException;
import static mesas.Mesa01.test;

public class pdf_generator {

    public void crearPDF() throws FileNotFoundException {
        String path = "C:\\Users\\PC\\OneDrive\\Escritorio\\test.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        float columnWidth[] = {200f, 50f, 100f};
        Table table = new Table(columnWidth);

        String[] tableHeader = {"Productos", "Piezas", "Precio"};

        String[][] itemArray = {
            {"Box", "Red", "Big"},
            {"Bat", "White", "Big"},
            {"Stick", "Black", "Long"},
            {"Toy Gun", "Gray", "Small"},
            {"Ball", "Red", "Small"}
        };

        Color headerBg = new DeviceRgb(0x11, 0x98, 0x249);

        for (int i = 0; i < 3; i++) {
            table.addCell(new Cell().add(new Paragraph(tableHeader[i]).setBackgroundColor(headerBg)));
        }

        for (int i = 0; i < test.size(); i++) {

            table.addCell(new Cell().add(new Paragraph(test.get(i))));

        }

        document.add(table);
        document.close();

        System.out.println("PDF GENERADO");

    }

    public static void main(String[] args) {

    }

}
