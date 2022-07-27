package String;
import java.util.StringTokenizer;

public class stringtokenizereg {
	public static void my() {
		StringTokenizer t=new StringTokenizer("Anudip"
				+ " Foundation "
				+ "skill "
				+ "and carrer "
				+ "devolopment"," ");
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken(" "));{
				StringTokenizer st=new StringTokenizer("I am Pritam, Stayting in kolkata");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken(","));
				}
			}
		}
		
	}
	public static void main(String args[]) {
		my();
	}

}
