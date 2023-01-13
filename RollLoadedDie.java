import javax.swing.plaf.synth.SynthSpinnerUI;

public class RollLoadedDie {
    public static void main(String[] args) {
        Double test = Math.random();
        if(test <0.126){
            System.out.println("There is a dot on the die, one.");
        }else if(test <=0.25){
            System.out.println("There is 2 dots on the die, two.");
        }else if (test <= 0.375){
            System.out.println("You see three dots on the die, 3.");
        }else if (test <=0.50){
            System.out.println("There is 4 dots on the die, four.");
        }else if (test <=0.625){
            System.out.println("You see five dots on the die, 5.");
        }else {
            System.out.println("You see six dots on the die, 6.");
        }
    }
}
// javac RollLoadedDie.java; java RollLoadedDie 