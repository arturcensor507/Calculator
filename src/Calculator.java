import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator {
	 public static void main(String[] args) throws IOException {
		   System.out.println(calc(""));
	 }
	 public static String calc(String input) throws IOException {
		 String[] roman = {"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
		  ArrayList list = new ArrayList();
		  list.add("");
		  list.add(1,"I");
	      list.add(2,"II");
		  list.add(3,"III");
	      list.add(4,"IV");
	      list.add(5,"V");
		  list.add(6,"VI");
	      list.add(7,"VII");
		  list.add(8,"VIII");
		  list.add(9,"IX");
		  list.add(10,"X");
		  String a;
		  String b;
		  String z;
		  String art;
		 int a2;
	     int b2;
	     int c;
           Scanner Calc1 = new Scanner(System.in);
           art = Calc1.nextLine();
           String[] sem = art.split(" ");
           a = sem[0];
           z = sem[1];
           b = sem[2];
           if (sem.length!= 3){
   	      	throw new IOException("throws Exception");
   	      	}
	    if((a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9") || a.equals("10")) && (b.equals("1") || b.equals("2") || b.equals("3") || b.equals("4") || b.equals("5") || b.equals("6") || b.equals("7") || b.equals("8") || b.equals("9") || b.equals("10"))) {
	    	a2 = Integer.parseInt(a);
	    	b2 = Integer.parseInt(b);
	    	 if(a2 >10 || b2>10) {
	   	      throw new IOException("throws Exception //т.к. используются одновременно разные системы счисления");
	   	     }
	    	 switch(z) {
	 	    case "+" :
	 	      c = a2+b2;
	 	      System.out.println(c);
	 	      break;
	 	    case "-" :
	 	      c = a2-b2;
	 	      System.out.println(c);
	 	      break;
	 	    case "/" :
	 	      c = a2/b2;
	 	      System.out.println(c);
	 	      break;
	 	    case "*" :
	 	      c = a2*b2;
	 	      System.out.println(c);
	 	      break;
	 	      default:
	 	    	 throw new IOException("throws Exception");
	 	        }
	    } else if((a.equals("I") || a.equals("II") || a.equals("III") || a.equals("IV") || a.equals("V") || a.equals("VI") || a.equals("VII") || a.equals("VIII") || a.equals("IX") || a.equals("X")) && (b.equals("I") || b.equals("II") || b.equals("III") || b.equals("IV") || b.equals("V") || b.equals("VI") || b.equals("VII") || b.equals("VIII") || b.equals("IX") || b.equals("X"))) {
	    	a2 = list.indexOf(a);
	    	b2 = list.indexOf(b);
	    	 if(a2 >10 || b2>10) {
	   	      throw new IOException("throws Exception");
	   	     }
	    	 switch(z) {
	 	    case "+" :
	 	      c = a2+b2;
	 	      if(c<1) {
	 	    	 throw new IOException("throws Exception");  
	 	      }
	 	     String s1 = roman[c];
	 	      System.out.println(s1);
	 	      break;
	 	    case "-" :
	 	      c = a2-b2;
	 	     if(c<1) {
	 	    	 throw new IOException("throws Exception");  
	 	      }
	 	     String s2 = roman[c];
	 	      System.out.println(s2);
	 	      break;
	 	    case "/" :
	 	      c = a2/b2;
	 	     if(c<1) {
	 	    	 throw new IOException("throws Exception");  
	 	      }
	 	     String s3 = roman[c];
	 	      System.out.println(s3);
	 	      break;
	 	    case "*" :
	 	      c = a2*b2;
	 	     if(c<1) {
	 	    	 throw new IOException("throws Exception");  
	 	      }
	 	     String s4 = roman[c];
	 	      System.out.println(s4);
	 	      break;
	 	      default:
	 	    	 throw new IOException("throws Exception");
	 	        }
	    } else {
	    	throw new IOException("throws Exception");
	    }
	    return input;
	 }
}