public class Bina {
    public static void main(String[] args){
        int numberr = 6;
        BinaryTree tree = new BinaryTree(numberr);
        tree.insert(6);
        tree.insert(3);
        tree.insert(7);
        tree.insert(5);
        tree.insert(9);
        tree.insert(10);
        tree.insert(21);
        tree.insert(1984);
        System.out.println(tree.getRight().getRight().getRight().getRight().getValue());
        System.out.println(tree.minValue());
    }
}