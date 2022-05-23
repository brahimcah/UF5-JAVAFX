import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println((String)datetimeformat.format(date));
    }

