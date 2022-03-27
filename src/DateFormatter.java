import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

import static java.time.format.DateTimeFormatter.ISO_DATE;

public class DateFormatter {
    public static void main(String[] args) throws Exception {

        String string1 = "2022-03-23T06:05:01.019Z";
     Date df1 = new SimpleDateFormat("yyyy-MM-dd").parse(string1);
        System.out.println(string1+"\t"+df1);

    }
}
