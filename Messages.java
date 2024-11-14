import java.time.LocalDateTime;
public class Messages{
    private String content;
    private String sender;
    private String reciever;
    private int messageID;
    private boolean status;
    private LocalDateTime timestamps;

    public Messages(String sender,String content,String reciever,boolean status,int messageID,LocalDateTime timestamps){
        this.sender=sender;
        this.reciever=reciever;
        this.content=content;
        this.status=status;
        this.messageID=messageID;
        this.timestamps=LocalDateTime.now();
    }
    public LocalDateTime getTimeStamps(){
        return timestamps;
    }

    public void setTimeStemps(LocalDateTime timestamps){
        this.timestamps=timestamps;
    }

    public String getSender(){
        return sender;
    }
    public void setSender(String sender){
        this.sender=sender;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getReciever() {
        return reciever;
    }

    public String getContent() {
        return content;
    }

    public boolean getStatus() {
        return status;
    }

    public int getMessageID() {
        return messageID;
    }
    @Override
    public String toString(){
        return "Message{"+
                "Sender: "+sender+
                ", Reciever: "+reciever+
                ", Content: "+content+
                ", status: "+status+
                ", messageID: "+messageID+
                ", timestamps: "+timestamps+
                "}";

    }



}
