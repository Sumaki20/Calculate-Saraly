/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programfinal;
import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class aaa {  
     public static void main(String[] args) throws DocumentException, FileNotFoundException, IOException {
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("TableCellBorder.pdf"));
            doc.open();

            PdfPTable table = new PdfPTable(3);
            PdfPTable table2 = new PdfPTable(2);
            PdfPCell cell1 = new PdfPCell(new Phrase(""));
            cell1.setUseBorderPadding(true);
            

            // Setting cell's border width and color
            cell1.setBorderWidth(5f);
            cell1.setBorderColor(BaseColor.WHITE);
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase("Salary slip"));
            
            cell2.setUseBorderPadding(true);

            // Setting cell's background color
            cell2.setBorderColor(BaseColor.WHITE);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            // Setting cell's individual border color
            //cell2.setBorderWidthTop(1f);
            //cell2.setBorderColorTop(BaseColor.RED);
            //cell2.setBorderColorRight(BaseColor.GREEN);
            //cell2.setBorderColorBottom(BaseColor.BLUE);
            //cell2.setBorderColorLeft(BaseColor.BLACK);
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase(""));
            cell3.setUseBorderPadding(true);
            cell3.setBorderColor(BaseColor.WHITE);
            // Setting cell's individual border width
            //cell3.setBorderWidthTop(2f);
            //cell3.setBorderWidthRight(1f);
            //cell3.setBorderWidthBottom(2f);
            //cell3.setBorderWidthLeft(1f);
            table.addCell(cell3);
            
            PdfPCell cell4 = new PdfPCell(new Phrase(""));
            cell4.setUseBorderPadding(true);

            // Setting cell's border width and color
            cell4.setBorderWidth(5f);
            cell4.setBorderColor(BaseColor.WHITE);
            table.addCell(cell4);
            
            
            
            PdfPCell cell5 = new PdfPCell(new Phrase(""));
            cell5.setUseBorderPadding(true);

            // Setting cell's border width and color
            cell5.setBorderWidth(5f);
            cell5.setBorderColor(BaseColor.WHITE);
            table.addCell(cell5);
            
            PdfPCell cell6 = new PdfPCell(new Phrase(""));
            cell6.setUseBorderPadding(true);

            // Setting cell's border width and color
            cell6.setBorderWidth(5f);
            cell6.setBorderColor(BaseColor.WHITE);
            table.addCell(cell6);
            table.completeRow();
            
            
            
            PdfPCell cell7 = new PdfPCell(new Phrase("Company\n"));
            
            cell7.setUseBorderPadding(true);

            // Setting cell's background color
            cell7.setBorderColor(BaseColor.WHITE);
            cell7.setHorizontalAlignment(Element.ALIGN_LEFT);         
            table.addCell(cell7);

            PdfPCell cell8 = new PdfPCell(new Phrase(""));
            cell8.setUseBorderPadding(true);
            cell8.setBorderColor(BaseColor.WHITE);
            cell8.setFixedHeight(50);
            table.addCell(cell8);
            
            PdfPCell cell9 = new PdfPCell(new Phrase(""));
            cell9.setUseBorderPadding(true);
            cell9.setHorizontalAlignment(Element.ALIGN_RIGHT);
            // Setting cell's border width and color
            cell9.setBorderColor(BaseColor.WHITE);
            table.addCell(cell9);
            table.completeRow();
            
            PdfPCell cell10 = new PdfPCell(new Phrase("\nIncome"));
            
            cell10.setUseBorderPadding(true);

            // Setting cell's background color
            cell10.setBorderColor(BaseColor.BLACK);
            cell10.setHorizontalAlignment(Element.ALIGN_CENTER);         
            table2.addCell(cell10);

            PdfPCell cell11 = new PdfPCell(new Phrase("\nDeduct income"));
            cell11.setUseBorderPadding(true);
            cell11.setBorderColor(BaseColor.BLACK);
            cell11.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell11.setFixedHeight(50);
            table2.addCell(cell11);
            table2.completeRow();
            //PdfPCell cell12 = new PdfPCell(new Phrase(""));
            //cell12.setUseBorderPadding(true);
            //cell12.setHorizontalAlignment(Element.ALIGN_RIGHT);
            // Setting cell's border width and color
            //cell12.setBorderColor(BaseColor.BLACK);
            //table.addCell(cell9);
            
            
            PdfPCell cell13 = new PdfPCell(new Phrase(" Salary"));
            
            cell13.setUseBorderPadding(true);

            // Setting cell's background color
            cell13.setBorderColor(BaseColor.BLACK);
            cell13.setHorizontalAlignment(Element.ALIGN_MIDDLE);         
            table2.addCell(cell13);

            PdfPCell cell14 = new PdfPCell(new Phrase(""));
            cell14.setUseBorderPadding(true);
            cell14.setBorderColor(BaseColor.BLACK);
            cell14.setFixedHeight(200);
            table2.addCell(cell14);
            
            //PdfPCell cell15 = new PdfPCell(new Phrase(""));
            //cell15.setUseBorderPadding(true);
            //cell15.setHorizontalAlignment(Element.ALIGN_RIGHT);
            // Setting cell's border width and color
            //cell15.setBorderColor(BaseColor.BLACK);
            //table.addCell(cell15);
            table2.completeRow();
            
            
            doc.add(table);
            doc.add(table2);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            doc.close();
        }
    }
}