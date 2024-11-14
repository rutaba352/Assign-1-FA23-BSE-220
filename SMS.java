import java.util.Scanner;
import java.time.LocalDateTime;
public class SMS {
    Messages message[][];
    int msgAcount = 0;
    int sendAcount = 0;
    {
        message =  new Messages[4][1];
        System.out.print("\nSend Message\n");
    }


    public void SendMessages(String sender, String content, String reciever) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < message[i].length; j++) {
                System.out.println("Sender:");
                sender = sc.nextLine();
                System.out.println("Message:");
                content = sc.nextLine();
                System.out.println("Status (seen/unseen):");
                String statusStr = sc.nextLine(); // Read entire line

                boolean status;
                if (statusStr.equalsIgnoreCase("seen")) {
                    status = true;
                } else if (statusStr.equalsIgnoreCase("unseen")) {
                    status = false;
                } else {
                    System.out.println("Invalid status. Please enter 'seen' or 'unseen'.");
                    continue; // Skip this iteration and ask for input again
                }

                message[i][j] = new Messages(sender, content, reciever, status, msgAcount, LocalDateTime.now());
                msgAcount++;
                System.out.println("MESSAGE FROM: " + sender + " to :" + reciever);
                break;
            }
        }
    }
    {
        System.out.println("---MESSAGE__(seen,unseen)");
    }
    public void ReadMessages(){
        for(int i = 0; i< message.length; i++){
            if (message[i][0].getStatus()) {
                System.out.println("Message seen: " + message[i][0]);
            } else {
                System.out.println("Message unseen: " + message[i][0]);
            }
        }
    }
    {
        System.out.println("---SEARCH SENDER\n");
    }

    public void SearchSender() {
        String Status=null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the sender");
        String sender=sc.nextLine();


        for(int i = 0; i< message.length; i++){
            for(int j = 0; j< message[i].length; j++){
                String x= message[i][j].getSender();
                if(sender.equals(x)){
                    Status="Sender found";
                    break;
                }
                else {

                    Status="Sender is not found";
                    break;

                }

            }
            if(Status=="Sender is found"){

                break;
            }


        }
        System.out.println(Status);
    }
    public void Delete() {
        String Status=null;

        Scanner sc = new Scanner(System.in);

        System.out.println("index of message enter:");
        int num=sc.nextInt();


        for(int i = 0; i< message.length; i++){
            for(int j = 0; j< message[i].length; j++){
                int x= message[i][j].getMessageID();
                if(num==x){


                    message[i][j].setContent(null);
                    Status=" your Message deleted";

                    break;

                }
                else {

                    Status="Index not found. No message deleted";
                    break;

                }

            }
            if(Status=="Message deleted"){

                break;
            }


        }
        System.out.println(Status);
        System.out.print("_________________________________________");
    }
    public void sortMessage() {
        // Bubble sort for 2D array
        for (int i = 0; i < message.length - 1; i++) {
            for (int j = 0; j < message[i].length; j++) {
                for (int k = 0; k < message.length - 1; k++) {
                    for (int l = 0; l < message[k].length; l++) {
                        // Ensure we don't go out of bounds and both messages are valid
                        if (message[k + 1] != null && message[k + 1][l] != null &&
                                message[k][l] != null &&
                                message[k + 1][l].getMessageID() > message[k][l].getMessageID()) {

                            // Swap messages to sort in descending order
                            Messages temp = message[k][l];
                            message[k][l] = message[k + 1][l];
                            message[k + 1][l] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Messages are arranged.");
    }
    public void displayMessages() {
        System.out.println("\nMy CHAT\n");

        for(int i = 0; i< msgAcount; i++) {
            for(int j = 0; j< message[i].length; j++) {
                if (message[i][j].getContent()!= null|| message[i][j].getContent()==null) {
                    System.out.print("  \nMessages:      "  + message[i][j].getContent());
                    System.out.println("\nsender:   "   + message[i][j].getSender());
                    System.out.println("\n MessageID:    "    + message[i][j].getMessageID() );
                    System.out.println("\nStatus:" + message[i][j].getStatus());
                    System.out.println(" \nTimeStamps:   " + message[i][j].getTimeStamps());
                    System.out.println(message[i][j]);



                }
                else{
                    System.out.print("Invalid messages");
                }
                //System.out.println(messages[i][j]);
            }
        }

    }


}

