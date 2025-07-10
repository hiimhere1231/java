import java.util.ArrayList;

public class Quesadilla {
    private ArrayList<Integer> q;

    public Quesadilla(){
        this.q = new ArrayList<Integer>();
    }

    public Quesadilla(int numebr){
        this.q = new ArrayList<Integer>();
        q.add(numebr);
    }

    public Quesadilla(ArrayList<Integer> numebrs){
        this.q = new ArrayList<Integer>();
        for(int i = 0; i < numebrs.size(); i++){
            q.add(numebrs.get(i));
        }
    }

    public int getStart(){
        if(q.size() > 0){
            return q.get(0);
        }
        return -1;
    }

    public void add(int value){
        q.add(value);
    }

    public int remove(){
        if(q.size() != 0){
            return q.remove(0);
        }
        else{
            return -1;
        }
    }

    public String toString(){
        return "this queue has a size of "+q.size()+" with a start value of "+getStart();
    }
}
