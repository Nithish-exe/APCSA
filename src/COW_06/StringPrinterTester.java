package COW6;

import java.io.*;

public class StringPrinterTester
{
   public static void main(String [] args){
      testAll();
   }

   public static void testAll(){
      testPrintEachChar();
      System.out.println();
      System.out.println("===================================================");
      testPrintOutInReverse();
      System.out.println();
      System.out.println("===================================================");
      testPrintTwoWords();
      System.out.println();
      System.out.println("===================================================");
      testPrintOutBirthday();
      System.out.println();
      System.out.println("===================================================");
      testPrintOutAddress();
      System.out.println();
      System.out.println("===================================================");
      testPrintWords();
   }   
   
   public static void testPrintEachChar(){ 
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutEachChar(\"Hokies\")");
      printer.printOutEachChar("Hokies");
   }
   
   public static boolean testPrintEachCharExact(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutEachChar(\"Hokies\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutEachChar("Hokies");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Char1: H\r\nChar2: o\r\nChar3: k\r\nChar4: i\r\nChar5: e\r\nChar6: s\r\n");
   }

   public static void testPrintOutInReverse(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutInReverse(\"Hokies\")");
      printer.printOutInReverse("Hokies");
   }
   
   public static boolean testPrintOutInReverseExact(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutInReverse(\"Hokies\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutInReverse("Hokies");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Char6: s\r\nChar5: e\r\nChar4: i\r\nChar3: k\r\nChar2: o\r\nChar1: H\r\n");
   }

   public static void testPrintTwoWords(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printTwoWords(\"Virginia Tech\")");
      printer.printTwoWords("Virginia Tech");
   }
   
   public static boolean testPrintTwoWordsExact(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printTwoWords(\"Virginia Tech\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printTwoWords("Virginia Tech");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Word #1\r\nChar1: V\r\nChar2: i\r\nChar3: r\r\nChar4: g\r\nChar5: i\r\nChar6: n\r\nChar7: i\r\nChar8: a\r\nWord #2\r\nChar1: T\r\nChar2: e\r\nChar3: c\r\nChar4: h\r\n");
   }

   public static void testPrintOutBirthday(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutBirthday(\"January 13, 1978\")");
      printer.printOutBirthday("January 13, 1978");
      System.out.println();
      System.out.println("Testing: printOutBirthday(\"March 9, 1976\")");
      printer.printOutBirthday("March 9, 1976");
   }
   
   public static boolean testPrintOutBirthdayExact1(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutBirthday(\"January 13, 1978\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutBirthday("January 13, 1978");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Month: January\r\nDay: 13\r\nYear: 1978\r\n");
   }
   
   public static boolean testPrintOutBirthdayExact2(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutBirthday(\"March 9, 1976\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutBirthday("March 9, 1976");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Month: March\r\nDay: 9\r\nYear: 1976\r\n");
   }

   public static void testPrintOutAddress(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutAddress(\"211 Baker Street, Sterling, VA 20165\")");
      printer.printOutAddress("211 Baker Street, Sterling, VA 20165");
      System.out.println();
      System.out.println("Testing: printOutAddress(\"18515 North Crescent Avenue, Prince William, MD 91481\")");
      printer.printOutAddress("18515 North Crescent Avenue, Prince William, MD 91481");
   
   }
   
   public static boolean testPrintOutAddressExact1(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutAddress(\"211 Baker Street, Sterling, VA 20165\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutAddress("211 Baker Street, Sterling, VA 20165");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Number: 211\r\nStreet Name: Baker Street\r\nCounty:  Sterling\r\nState:  VA\r\nZIP: 20165\r\n");
   }
   
   public static boolean testPrintOutAddressExact2(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printOutAddress(\"18515 North Crescent Avenue, Prince William, MD 91481\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printOutAddress("18515 North Crescent Avenue, Prince William, MD 91481");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Number: 18515\r\nStreet Name: North Crescent Avenue\r\nCounty:  Prince William\r\nState:  MD\r\nZIP: 91481\r\n");   
   }

   public static void testPrintWords(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printWords(\"Virginia Polytechnic Institute State University go yeah\")");
      printer.printWords("Virginia Polytechnic Institute State University go yeah");
   }
   
   public static boolean testPrintWordsExact(){
      StringPrinter printer = new StringPrinter();
      System.out.println("Testing: printWords(\"Virginia Polytechnic Institute State University go yeah\")");
      
      PrintStream ps_consule = System.out;
      final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
      System.setOut(new PrintStream(myOut));
      
      printer.printWords("Virginia Polytechnic Institute State University go yeah");
      
      String standardOutput = myOut.toString();
      final ByteArrayOutputStream regOut = new ByteArrayOutputStream();    
      System.setOut(ps_consule);
      
      return standardOutput.equals("Word 1: Virginia\r\nWord 2: Polytechnic\r\nWord 3: Institute\r\nWord 4: State\r\nWord 5: University\r\nWord 6: go\r\nWord 7: yeah\r\n");
   }
}
