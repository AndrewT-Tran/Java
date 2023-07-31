public class Test {
    public static void main(String[] args){
        VoiceMessageUtil vmu = new VoiceMessageUtil();
        // we have to call the class and then the method
        // we are basically importing this class into this file
        System.out.println(vmu.greeting());
        System.out.println(vmu.greeting("Andrew"));
        System.out.println(vmu.greeting2("Andrew", 26));
        vmu.getCurrentData();
    }
}
