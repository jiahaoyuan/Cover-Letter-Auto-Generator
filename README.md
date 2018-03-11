# Cover-Letter-Auto-Generator

Due to the large amount to applications of jobs and interns, I decided to write a Cover Letter Auto-Generator. Apache POI must be imported.

It can carry out two functions:
1. Detect key words in the qualification section of the job description
2. Generate a responsive cover letter to all the qualifications above depending on your pre-entry value

<b>Example:</b>
1. if one of the qualification is that:
"* familiar with Java",

  then the keyword "java" will be detected.

2. You will have to write a description of yourself about "Java" in advance, which could be outputed accordingly.
You may wrote "Very familiar with Java in both Object-Orientated Programmings" and advanced functions.


<b>Example Output:</b>

* familiar with Java
<br>Very familiar with Java in both "Object-Orientated Programmings" and advanced functions.


<b>DEMO</b>:
1. Import "Real_Generator_1.java" and "Qualification.java" into the same package in Eclipse 
<br>(I am using Object-Oriented approach, so you will need to run "Real_Generator_1.java", which will call "Qualification.java" )
2. Open the file "Qualification Example.docx" and copy everything inside
3. Run the "Real_Generator_1.java" and paste from "Qualification Example.docx" to System.in
4. The document "Jiahao_Yuan's_Cover_Letter.docx" will be generated into your folder. A example output is attached.

<b>Apache POI:</b>
Tutorial:
https://www.tutorialspoint.com/apache_poi_word/index.htm

Installation and Environment Setting:
(Recommend to work with Eclipse)
https://www.tutorialspoint.com/apache_poi_word/apache_poi_word_installation.htm
https://www.youtube.com/watch?v=RsrF2Ku7ad4
