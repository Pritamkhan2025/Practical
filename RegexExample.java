package String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String args[]) {
		Pattern p=Pattern.compile(".a");//single dot represent single character
		//compile regular expression into pattern
		Matcher m=p.matcher("ma");//.a dot represent single char m
		boolean b=m.matches();//output for b
		boolean bb=Pattern.compile("..m").matcher("aam").matches();//output for bb(true/false)
		//character class --[abc]=a,b,c[^abc]=any char except abc[a-zA-z]=either upper or lower case
		boolean b1=Pattern.matches("[a-zA-Z]","Anudip");//true
		//Quantifiers
		//x? -x occur once or not at all    x+ -- x occur once or more than one
		//x* -- x occur zero or more time   x{n} -- x occur n time
		//x{n,}  -- x occur n or more time 
		boolean b2=Pattern.matches("[a-zA-Z0-9]{8,}","Anudip123ppp");//true
		//meta char  ---/d-[0-9],/s --white space char,/w - [a-zA-Z0-9]
		//match any phone number
		boolean b3=Pattern.matches("[6789]{1}[0-9]{9}","8348222888");//{1} 1st digit of ph no {9} rest 9 digit
		//for email
		boolean b4=Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z]{3}","pritam123_.-@gmail.com");
		boolean b5=Pattern.matches("^[a-zA-Z0-9+_.-]{8,}","Pritam@123_.");//false
		System.out.println(b+" "+bb+" "+b1+" "+b2+" "+b3+" "+b4+" "+b5);
	}

}
