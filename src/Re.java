public class Re {
    public static void main(String[] args) throws Exception {
        coutninging(6, 18);
    }
    public static int coutninging(int x, int y){
        if(x>y){
            return x;
        }
        else{
            System.out.println(x);
            coutninging(x+1, y);
            return x;
        }
    }
}
