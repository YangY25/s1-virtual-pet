/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    int health = 100;
    
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
        }
    }

    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public int getHealth(){
        return health;
    }

    public int getHunger(){
        return hunger;
    }

} // end Virtual Pet
