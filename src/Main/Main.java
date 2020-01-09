package Main;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String fileName = new String("C:\\Users\\gabriel_hijo\\Documents\\NetBeansProjects\\kata4_2020\\src\\email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
