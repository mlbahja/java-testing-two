import java.util.*;
import java.util.Arrays;

public class DateFormatter {
    private long date;
    private String formattedDate;
    private String format;

    public DateFormatter(long date, String format){
        this.date = date;
        // this.formattedDate = formattedDate;
        this.format = format;
        
    }
    public DateFormatter() {
        this(System.currentTimeMillis() / 1000L, "DD/MM/YYYY");
    }

    public DateFormatter(long date) {
        this(date, "DD/MM/YYYY");
    }
    public String getFormattedDate(){
        var x =this.output();
        if(x == null){
            return null;
        }
        setFormattedDate(x);
        return this.formattedDate;
    }
    public void setFormattedDate(String fDat){

        this.formattedDate = fDat;
    }
    public long getDate(){
        return this.date;
    }
    public String getFormat(){
        return this.format;
    }
    public void setDate(long a){
        this.date = a;
    }
    public void setFormat(String S){
        this.format = S;
    }

    public static String getMonth(int monthNumber) {
        String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        return months[monthNumber];
    
    }

      private static String two(int n) {
        return (n < 10 ? "0" : "") + n;
    }
    public String output(){
        
        Date dBaraka = new Date(this.getDate() * 1000);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTime(dBaraka);
        
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month =calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        var input = this.getFormat();
        String x = null ;
        //System.out.println("--------- "+input);
            if (input.contains("/")){
                var aftersplit = input.split("/");
                if (aftersplit[0].toLowerCase().equals("dd") &&
                aftersplit[1].toLowerCase().equals("mm") &&
                aftersplit[2].toLowerCase().equals("yyyy")){
                    x = two(day) + "/" + two(month + 1) + "/" + year;
               }
               
            }else if (input.contains(" ")){
                var aftersplit = input.split(" ");
                 
                 if (aftersplit[0].toLowerCase().equals("dd") &&
                    aftersplit[1].toLowerCase().equals("month") &&
                   aftersplit[2].toLowerCase().equals("yyyy")){
                   x =  two(day) + " " + getMonth(month) + " " + year;
                }
                
            }else if (input.contains(".")){
                var aftersplit = input.split("\\.");
               if (aftersplit[0].toLowerCase().equals("dd") &&
               aftersplit[1].toLowerCase().equals("mm") && 
               aftersplit[2].toLowerCase().equals("yyyy")){
                   x =  two(day) + "." + two(month + 1) + "." + year;
               }
            }else{
                return null;
            }
            
        
                return x;


    }


    public static void main(String[] args) {

        DateFormatter df = new DateFormatter(1656374400, "DD/MM/YYYY");
        System.out.println(df.getFormattedDate());

        df.setFormat("dd.MM.yyyy");
        System.out.println(df.getFormattedDate());

        df.setDate(1672531200);
        System.out.println(df.getFormattedDate());

        df.setFormat("DD month yyyy");
        System.out.println(df.getFormattedDate());

    }

}