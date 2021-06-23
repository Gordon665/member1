package Demo.idv.gordon.triangle;

/**
 * Hello world!
 *
 */
public class App 
{
	public String testTriangle(int a, int b, int c) {
		String result = "";
		if ((a<=0) || (b<=0) || (c<=0)) {
		result = "Not a Triangle \n";
		}
		else {
		result = "Be a Triangle \n";
		if (((a+b)<c) || ((a+c)<b) || ((b+c)<a)) {
		result = "Not a Triangle \n";
		}
		else { 
		if ((a==b) ||(b==c) || (a==c)) {
		result = "Isoscceles Triangle \n";
		}
		if ((a==b) && (b==c)) {
		result = "Regular Triangle \n";
		}
		if (((a*a+b*b)==(c*c)) || ((a*a+c*c)==(b*b)) || ((b*b+c*c)==(a*a))) {
		result = "Right Triangle";
		}
		}
		}
		return result;
		}
}
