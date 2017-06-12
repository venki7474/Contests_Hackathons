public class StoD {
//public Date stoD(String dateString) {
	public static void main(String[] args) {
	Date date = null;
	Date formatteddate = null;
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	try {
	date = df.parse(dateString);
	formatteddate = df.format(date);
	} catch ( Exception ex){ System.out.println(ex);}
	}
}