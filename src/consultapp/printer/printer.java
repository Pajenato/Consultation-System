/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultapp.printer;

import java.awt.Graphics;
import java.awt.print.*;

public class printer implements Printable {

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        // Assuming your content to be printed is within the printable area
        graphics.drawString("Hello, World!", 100, 100);

        return PAGE_EXISTS;
    }
    
    public static void printing(){
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(new printer());

        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        }
    }

}

