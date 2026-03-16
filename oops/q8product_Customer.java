package Gfg.oops;
class product{
	private String itemNo;
	private String name;
	double price;
	int qty;
	public String getitemNo() {
		return itemNo;
	}
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}public int getqty() {
		return qty;
	}
	public void setPrice(double price) {
		this.price = price;

	}
	public void setqty(int qty) {
		this.qty = qty;
	}
	public product(String itemNo,String name){
		this.itemNo=itemNo;
		this.name = name;
	}
}
class consumer{
	String custId;
	String name;
	String address;
	String phno;
	public String getcustIf() {
		return custId;
	}
	public String getname() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public String getphno() {
		return phno;
	}
	public void setDetails(String add,String ph ){
		address = add;
		phno = ph;
	}
	public consumer(String custId,String name) {
		this.custId=custId;
		this.name = name;
	}
}
public class q8product_Customer {
	public static void main(String[] args) {
		consumer c = new consumer("ABhi22","Abhi");
		c.setDetails("Ab023", "7479814011");
		product p = new product("Krishna puri","Aryan");
		p.setqty(20);
		p.setPrice(200);
		System.out.println(c.getcustIf());
		System.out.println(c.getname());
		System.out.println(c.getaddress());
		System.out.println(c.getphno());
		System.out.println(p.getitemNo());
		System.out.println(p.getname());
		System.out.println(p.getprice());
		System.out.println(p.getqty());
	}
}
