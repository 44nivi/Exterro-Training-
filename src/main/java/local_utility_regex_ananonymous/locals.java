package local_utility_regex_ananonymous;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class locals
{


public static void main(String[] args) {

Locale ll = new Locale("");

DK1 pobj = new DK1();

pobj.showDate(ll.JAPANESE);

pobj.showDate(ll.CHINESE);

pobj.showDate(ll.CANADA);

}

}

class DK1{
public void showDate(Locale locale) {
Date d = new Date();
DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
System.out.println(df.format(d));


double Money =9088;
NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
System.out.println("Locale-->" + locale + "--date-->" + nf.format(Money));



}
}