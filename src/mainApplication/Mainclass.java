package mainApplication;

import utilities.Printable;
import utilities.evennum;
import utilities.oddnum;

public class Mainclass {
public static void main(String[] args)
{
	Printable p=new evennum();
	Printable p1=new oddnum();
	p.getSum();
	p.getcount();
	p.print();
	
	p1.getSum();
	p1.getcount();
	p1.print();
}
}
