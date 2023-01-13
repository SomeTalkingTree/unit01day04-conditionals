public class ThreeEqual {
    public static void main(String[] args) {
        
        if(args.length < 3){
            System.out.println("One of them is empty.");
        } else{
            int num = Integer.parseInt(args[0]);
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            if (num == num1 && num == num2 && num1 == num2) {
                System.out.println("This is all equal");
            } else if(num != num1 || num1 != num2 || num != num2){
                if(num == num1 & num1 !=num2){
                    System.out.println("The last number is not equal to the others.");
                } else if(num != num1 & num1 ==num2){
                    System.out.println("The first number is not equal to the others.");
                } else if(num == num2 & num !=num1){
                    System.out.println("The second number is not equal to the others.");
                }else{
                    System.out.println("None of the numbers are equal to each other.");
                }
                
            }
        } 
    }
}
//javac ThreeEqual.java;java ThreeEqual 