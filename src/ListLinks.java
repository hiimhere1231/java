public class ListLinks {
    
    private Node nodeOne;
    private int nodeSize = 0;

    public ListLinks(int randValue){
        this.nodeSize = 1;
        nodeOne = new Node(randValue);
    }

    public ListLinks(int[] hi){
        nodeOne = new Node(hi[0]);
        nodeSize = hi.length;
        Node node = nodeOne;
        for(int i = 1; i < nodeSize; i++){
            node.setNode(new Node(hi[i]));
            node = node.getNode();
        }
    }

    public String toString(){
        Node node = nodeOne;
        String s = "";
        for(int i = 0; i < nodeSize; i++){
            s += node.getValue()+", ";
            node = node.getNode();
        }
        
        return s;
    }

    
    public ListLinks(){

    }
    public int getSize(){
        return nodeSize;
    }

    public Node get(int index){
        Node node = nodeOne;
        for(int i = 0; i < index; i++){
            node = node.getNode();
        }
        return node;
    }

    public int getInt(int index){
        Node node = nodeOne;
        for(int i = 0; i < index; i++){
            node = node.getNode();
        }
        return node.getValue();
    }

    public void add(int ewNumberN){
        Node NewNumber = new Node(ewNumberN);
        NewNumber.setNode(nodeOne);
        nodeOne = NewNumber;
        nodeSize += 1;
    }

    public void addEnd(int ewNumberN){
        Node NewNumber = new Node(ewNumberN);
        Node nodeAtFinal = get(nodeSize-1);
        nodeAtFinal.setNode(NewNumber);
        nodeSize += 1;
    }

    public void addAt(int ewNumberN, int index){
        if(index == 0){
            add(ewNumberN);
        }
        else{
            Node NewNumber = new Node(ewNumberN);
            Node nodeAtIndex = get(index-1);
            Node newNumberNext = nodeAtIndex.getNode();
            nodeAtIndex.setNode(NewNumber);
            NewNumber.setNode(newNumberNext);
            nodeSize += 1;
        }
    }

    public void remove(int emoveRumberN){
        if(emoveRumberN == 0){
            nodeOne = get(1);
            nodeSize -= 1;
        }
        else{
            
            Node removal = get(emoveRumberN-1);
            removal.setNode(removal.getNode().getNode());
            nodeSize -= 1;
        }
    }

    public int find(int value){
        for(int i = 0; i < nodeSize; i++){
            if(getInt(i) == value){
                return i;
            }
        }
        return -2;
    }


    /* 
     * find
     */

}
