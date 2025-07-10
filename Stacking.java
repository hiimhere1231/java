import java.util.ArrayList;

public class Stacking {
    public static void main(String[] args){
        ArrayList<Integer> umbersN = new ArrayList<Integer>();
        umbersN.add(4332);
        Stacks stack = new Stacks(umbersN);
        System.out.println(stack);
        System.out.println(stack.getTop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
