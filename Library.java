public class Library {
    public static void main(String[] args){
        Map book = new Map();
        book.put("hi", "an informal greeting");
        book.put("hi", "a formal greeting");
        System.out.println(book.get("hi"));
        System.out.println(book.containsKey("what"));
        book.put("sign", "an object, quality, or event whose presence or occurrence indicates the probable presence or occurrence of something else.");
        System.out.println(book);
    }
}
