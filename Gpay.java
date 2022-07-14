package inheri;

public class Gpay {
	private String name;
	private String email;
	private long amount;
	private long accno;
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {		
		this.name=name;
  }
	public String getEmail() {		//getter method for email
		return email;
	}
	public void setEmail(String email) {		//setter method for email
		this.email=email;
  }
	public long getAmount() {		//getter method for amount
		return amount;
	}
	public void setAmount(long amount) {		//setter method for amount
		this.amount=amount;
  }
	public long getAccno() {		//getter method for accno
		return accno;
	}
	public void setAccno(long accno) {		//setter method for accno
		this.accno=accno;
  }


}
class Test_Gpay {
	public static void main(String ags[]) {
		Gpay g=new Gpay();
		g.setName("Pritam");
		g.setEmail("Pritam2025");
		g.setAmount(50015);
		g.setAccno(123456789);
		System.out.println(g.getName()+" "+g.getEmail()+" "+g.getAmount()+" "+g.getAccno());		
		
	}

}
