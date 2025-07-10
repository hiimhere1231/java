import java.util.ArrayList;

public class Queso { 
    public static void main(String[] args){
        ArrayList<Integer> qu = new ArrayList<Integer>();
        qu.add(1);
        Quesadilla q = new Quesadilla(qu);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }
}
