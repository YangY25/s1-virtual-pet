import javax.swing.*;


public class RunnerMain {
    public RunnerMain(){
        VirtualPet v = new VirtualPet();
        v.exercise();
        takeABeat(1000);
        v.feed();
        takeABeat(1000);
        v.play();
        takeABeat(1000);
        String ans = getAnswer("Do you want to know what I did today?");
        if (ans.equals("Yes")){
            v.today();
        }else{
            v.notToday();
        }
        takeABeat(1000);
        v.hungry();
        String ans1 = getAnswer("Can you feed me?");
    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Respound",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;

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