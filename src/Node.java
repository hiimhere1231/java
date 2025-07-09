public class Node {
    private int value;
    private Node nod;

    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public Node getNode(){
        return nod;
    }

    public void setNode(Node nod){
        this.nod = nod;
    }
    
    public String toString(){
        String e = Integer.toString(getValue());
        return e;
    }

    public static int get(int emoveRumberN) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}
