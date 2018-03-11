package DEMO;
import java.util.*;

public class Qualification {
	String q;
	
	public Qualification(String q) {
		this.q = q;
	}
	
	public String process() {
		String lc = q.toLowerCase();
		String temp = "";
		// if only java 
		if (lc.contains("java")&(!lc.contains("object oriented"))&(!lc.contains("object-oriented")))
			temp += "Very familiar with Java in both Object-Orientated Programming"
					+ " and advanced functions.\n";
		// if only OO
		if ((lc.contains("object oriented"))|(lc.contains("object-oriented")))
			temp += "Very familiar with Object-Oriented Programming in Java, for example."
					+ " Implemented many data structures by OO. "
					+ "Also wrote a SML interpreter in Java by Object-Oriented approach\n";
			
		if (lc.contains("python"))	
			temp += "Used Python to conduct a Natural Language Processing"
					+ " (NLP) & Information Retrieval project.\n";
		
		if (lc.contains("javascript"))
			temp += "Built multiple web applications & tools by JavaScript, like "
					+ "Dynamic Programming in Nucleotide Alignment (Bioinformatics), "
					+ "and Sudoku solver.\n";
		
		if (lc.contains("c++"))
			temp += "Familiar with C++ and took two classes in operating systems.\n";
		
		if (lc.contains("html")|lc.contains("css")|lc.contains("bootstrap"))
			temp += "Built my personal webpage with HTML, CSS and JavaScript based on Bootstrap"
					+ " Demo: www.csc.villanova.edu/~jiyuan/ \n";
		
		if (lc.contains("sql"))
			temp += "Used MySQL to create a small grocery store database.\n";
		
		if (lc.contains("linux"))
			temp += "Familiar with Linux commands.\n";
		
		
		return temp;
		
	}
	
}
