package DEMO;

// to detect current local date
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// scanner
import java.util.Scanner;

// File I/O
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

// Apache IOP
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Real_Generator_1 {
	 private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");	   
	
	public static void main(String[] args) throws Exception{
		XWPFDocument CL = new XWPFDocument();
		FileOutputStream outputStream = new FileOutputStream(new File("Jiahao_Yuan's_Cover_Letter.docx"));
		XWPFParagraph paragraph1 = CL.createParagraph();
 		XWPFRun Name = paragraph1.createRun();
		
		// Start with Name 
		Name.setText("Jiahao Yuan");
		Name.addBreak();
		Name.setText("\r\n 800 Lancaster Ave.");
		Name.addBreak();
		Name.setText("Philadelphia, PA, 19085");
		Name.addBreak();
		Name.setText("4845154219");
		Name.addBreak();
		Name.setText("eddiejiahaoyuan@gmail.com");
		Name.addBreak();
		Name.addBreak();
		
		Date date = new Date();
        Name.setText(sdf.format(date));
        
        Name.addBreak(); 
        Name.addBreak();
        
        // Content
        
		XWPFRun Content = paragraph1.createRun();
		
		Content.setText("Dear HR Manager:");
		Content.addBreak();
		Content.addBreak();
		Content.setText("In response to your advertisement in the"+ 
				" Milliken Valley Sentinel for Vice President,"+ 
				" Operations, please consider the following:");
        Content.addBreak();
        Content.addBreak();
        
        // Main Requirement
        // set scanner and switch
        
        //XWPFRun skill = paragraph.createRun();
        Scanner scan1 = new Scanner(System.in);
        String temp = "";
        String input;
        String output;
        

		
        while (scan1.hasNextLine()) {
        	input = scan1.nextLine();
        	Qualification q = new Qualification(input);
        	output = q.process();
        	
        	if (!(output=="")) {
                XWPFRun requirement = paragraph1.createRun();
        		requirement.setBold(true);
        		requirement.setText(input);
        		requirement.addBreak();
        		
            
        
        		XWPFRun myAnswer = paragraph1.createRun();
        		String[] tempArray = output.split("\n");
        		for (int i=0; i<tempArray.length; i++) {
        			myAnswer.setText(tempArray[i]);
        			myAnswer.addBreak();
        		}
            	myAnswer.addBreak();
        	
        		
        	}

        }
        XWPFRun enclosure = paragraph1.createRun();
        enclosure.setText("Yours Sincerely,");
        enclosure.addBreak();
        enclosure.setText("Jiahao");
        System.out.println("DONE");
		CL.write(outputStream);
		outputStream.close();
		CL.close();
		System.out.println("closed");
		
	}

}
