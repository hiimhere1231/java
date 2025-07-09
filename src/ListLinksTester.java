public class ListLinksTester {
    public static void main(String[] args){
        int[] numbers = {1, 4, 6, 7, 9};
        ListLinks list = new ListLinks(numbers);
        System.out.println(list);
        list.addEnd(6);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.addAt(14, 0);
        System.out.println(list);
        int value = 5; 
        System.out.println("the value "+value+" has been found at position "+(list.find(value)+1));
    }
}
