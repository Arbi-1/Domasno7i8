import java.util.List;
import java.util.ArrayList;

public class Glavna {
    public static void main(String[] args) {
        List<String> Emails = new ArrayList<>();
        Emails.add("mail5@yahoo.com");
        Emails.add("mail10@yahoo.com");
        Emails.add("mail15@yahoo.com");
        Emails.add("mail20@yahoo.com");

        for (String element : Emails) {
            System.out.println(element);


        }

    }

}
