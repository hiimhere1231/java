public class BinaryTree {
    private int number;
    private BinaryTree left;
    private BinaryTree right;
    public BinaryTree(int number){
        this.number = number;
    }


    public int getValue(){
        return number;
    }

    public void setValue(int number){
        this.number = number;
    }

    public BinaryTree getRight(){
        return right;
    }

    public BinaryTree getLeft(){
        return left;
    }

    public void insert(int value){
        if(value >= number){
            if(right == null){
                right = new BinaryTree(value);
            }
            else{
                right.insert(value);
            }
        }
        else{
            if(left == null){
                left = new BinaryTree(value);
            }
            else{
                left.insert(value);
            }
        }
    }

    public BinaryTree find(int value){
        if(value == number){
            return this;
        }
        else if(value > number){
            if(right == null){
                return null;
            }
            return right.find(value);
        }
        else{
            if(left == null){
                return null;
            }
            return left.find(value);
        }
    }

    public int minValue(){
        if(left == null){
            return this.getValue();
        }
        return left.minValue();
    }

    public void remove(int value){
        

    }

}
