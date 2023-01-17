// reminder: name variables more descriptively, especially when there are lots of them
// also, types (int, double, boolean) should be lowercase for now
public class Quadratic {
    public static void main(String[] args) {
             double num = Double.parseDouble(args[0]);
             double num1 = Double.parseDouble(args[1]);
             double num2 = Double.parseDouble(args[2]);
             if(num !=0){
                double test = num1 * -1;
                //b *-1
                if((Math.pow(num1,2)+(-4*num*num2))>0){
                    double test4 = Math.sqrt(Math.pow(num1,2)+(-4*num*num2));
                    //squared b^2 - (4ac)
                    double part1 = test +test4;
                    double part2 = test - test4;
                    double ans1 = part1/(num * 2);
                    double ans2 = part2/(num * 2);
                    System.out.println("A = "+num);
                    System.out.println("B = "+ num1);
                    System.out.println("C = "+ num2);
                    System.out.println("One answer is "+ans1);
                    System.out.println("Another anwser is "+ans2);
                } else {
                    double ans4 = (Math.pow(num1,2)+(-4*num*num2));
                    System.out.println("You can not square root "+ans4);
                    
                }
             } else{
                double ans3 = ((num2 *-1)/num1);
                System.out.println("The anwser is "+ ans3);
            }
    }        
        
        
    //testing is javac Quadratic.java;java Quadratic 
}
