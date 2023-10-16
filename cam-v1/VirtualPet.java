/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int health = 100;
    boolean late = false;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        if (health <=30 ){
            health = health +0;
        }else if(health !=100){
            health = health + 1;
        }else{
            health = health +1;
        }
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("exercising");
    }

    public void hungery(){
        face.setMessage("I'm hungry");
        face.setImage("starving");
    }

    public void play(){
        if (hunger >= 10){
            face.setMessage("I'm hungry, I have no energy to play");
            face.setImage("srarving");
        }else{
            face.setMessage("hooray!");
            face.setImage("ecstatic");
        }
    }

    public void checkHealth(){
        if(health >=90){
            face.setMessage("I'm fine!");
            face.setImage("joyful");
        }else if(health >= 70){
            face.setMessage("I feel like I'm not feeling well");
            face.setImage("sick");
        }else if(health >= 50){
            face.setMessage("I'm not feeling well");
            face.setImage("verysick");
        }else if(health >= 20){
            face.setMessage("...");
            face.setImage("dead");
        }
    }

    public void sleep() {
        hunger = hunger + 1;
        if (late == true){
            face.setImage("asleep");
        }else{
            face.setImage("normal");
            face.setMessage("It's not time to sleep yet");
        }
    }

    public void today(){
        hunger = hunger + 5;
        int min = 1; 
        int max = 5;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        if (random_int == 1){
            face.setImage("love");
            face.setMessage("I met my crush today");
        }else if (random_int == 2){
            face.setImage("normal");
            face.setMessage("I did nothing today");
        }else if (random_int == 3){
            face.setImage("shocked");
            face.setMessage("I watched a show that shocked me");
        }else if (random_int == 4){
            face.setImage("angry");
            face.setMessage("I failed my test today");
        }else{
            face.setImage("happy");
            face.setMessage("I get full credit on my test today");
        }
    }

    public void time(String get_time){
        if (get_time.equals("No")){
            late = false;
        }else{
            late = true;
        }
    }

    public void gift(){
        face.setMessage("Thank you for playing with me!");
        int minn = 1; 
        int maxx = 2;
        int random_int = (int)Math.floor(Math.random() * (maxx - minn + 1) + minn);
        if (random_int == 1){
            face.setImage("pushingdaisies");
        }else{
            face.setImage("loveflower");
        }
    }

    public void notToday(){
        hunger = hunger + 5;
        face.setImage("normal");
        face.setMessage("Fine...");
    }

    public int getHealth(){
        return health;
    }

    public int getHunger(){
        return hunger;
    }

} // end Virtual Pet