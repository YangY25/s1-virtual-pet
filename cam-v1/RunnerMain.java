import javax.swing.*;


public class RunnerMain {
    public RunnerMain(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        String ans = getAnswer("How are you?");
        if(ans.equals("Good")){
            v.respondPostitively();
        }
    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Your Message",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
                );
                if(s.equals("Yes"));

    }

    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }

    public static void main(String[] args){
        new RunnerMain(); 
    }   

}