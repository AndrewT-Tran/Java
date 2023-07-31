import java.util.Date;
public class VoiceMessageUtil {
    //classes are made up of attributes and methods
    public String greeting(){
        //public means we can call this method outside of the class and we are returning a string
        return "Hello You";
    }
    public String greeting (String name ){
        return "Hello " + name + "!";

    }     
    public String greeting2 (String name, int age){
        return "Hello " + name + " you are, " + age;}
    public String greeting3 (String name, int age){
        return String.format("Hello %s you are %d years old", name, age);
    }
    public void getCurrentData(){
        Date today = new Date();
        System.out.println(today);
    }     
}
