import javax.swing.*;


public class RunnerMain {
    public RunnerMain(){
        VirtualPet v = new VirtualPet();
        v.exercise();
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
        String ans1 = getAnswer("Can you feed me?");
        if(ans1.equals("Yes")){
            String an = getAnswer("How many time you want to feed?");
            for (int i = 0; i < Integer.valueOf(an); i++) {
                v.feed();
            }
        }else{
            v.notToday();
        }
        takeABeat(1000);
        v.checkHealth();
        String ans2 = getAnswer("Is it night right now?");
        v.time(ans2);
        v.sleep();
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