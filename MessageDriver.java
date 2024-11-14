import java.time.LocalDateTime;
public class MessageDriver{
    public static void main(String[] args) {
        SMS app=new SMS();
        app.SendMessages("Rutaba","AOA","Alesha");
        System.out.println("\nREADING MESSAGE:");
        app.ReadMessages();
        app.SearchSender();
        app.Delete();
        app.sortMessage();
        app.displayMessages();
    }

}

