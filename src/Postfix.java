import java.util.ArrayList;
import java.util.Scanner;


public class Postfix {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> equationInFrench = new ArrayList<Integer>();
        Stacks stack = new Stacks(equationInFrench);

        System.out.println("put the numbers (commas between no spaces)");
        String numbers = scan.nextLine();
        String[] strListHehe = numbers.split("[^0-9+\\-*/]+");

        for(int i = 0; i < strListHehe.length; i++){
            String stringi = strListHehe[i];
            System.out.println(stringi);
            System.out.println(stack.getTop());
            if(stringi.equals("+") == false && stringi.equals("-") == false && stringi.equals("*") == false && stringi.equals("/") == false){
                int inti = Integer.parseInt(stringi);
                stack.add(inti);
                System.out.println(inti);
                System.out.println(stack.getTop());
            }
            else{
                int back = stack.pop();
                System.out.println(back);
                int front = stack.pop();
                System.out.println(front);
                System.out.println("popped");
                if(stringi.equals("+")){
                    System.out.println("plus");
                    int equation = front+back;
                    stack.add(equation);
                }
                else if(stringi.equals("-")){
                    System.out.println("minus");
                    int equation = front-back;
                    stack.add(equation);
                }
                else if(stringi.equals("*")){
                    System.out.println("mult");
                    int equation = front*back;
                    stack.add(equation);
                }
                else{
                    System.out.println("division");
                    int equation = front/back;
                    stack.add(equation);
                }
            }
        }
        System.out.println(stack.getTop());
    }
}
