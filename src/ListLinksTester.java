public class ListLinksTester {
    public static void main(String[] args){
        int[] numbers = {1, 4, 6, 7, 9};
        ListLinks list = new ListLinks(numbers);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
    }
}
