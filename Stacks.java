import java.util.ArrayList;

public class Stacks {
    private ArrayList<Integer> blank;

    public Stacks(){
        this.blank = new ArrayList<Integer>();
    }

    public Stacks(int number){
        this.blank = new ArrayList<Integer>();
        blank.add(number);
    }

    public Stacks(ArrayList<Integer> numbers){
        this.blank = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++){
            blank.add(numbers.get(i));
        }
    }

    public void add(int value){
        blank.add(value);
    }

    public int getTop(){
        int top = blank.size();
        if(top != 1){
            int topVal = blank.get(top-1);
            return topVal;
        }
        else{
            return -1;
        }
    }

    public int pop(){
        return blank.remove(blank.size()-1);
    }

    public String toString(){
        return "the top of this stack has a value of "+getTop()+" and this stack has a size of "+blank.size();
    }

}