
package ASM_DSA;

import java.util.Date;
public class Message {
    private String Message;
    private String Name;
    private Date Time;   
    public Message(){
        this.Message = " ";
    }

    public Message(String Message) {
        this.Message = Message;
    }

    public Message(String Message, String Name, Date Time) {
        this.Message = Message;
        this.Name = Name;
        this.Time = Time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date Time) {
        this.Time = Time;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

  
}
