import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Soertstakin {
    public static void main(String[] args){
        System.out.println("How manies?");
        Scanner scan = new Scanner(System.in);
        int man = scan.nextInt();
        Random rand = new Random();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i <= man; i++){
            res.add(rand.nextInt(10000));
        }
        System.out.println(res);
        stalining(res);
    }
    public static void stalining(List<Integer> res){
        for(int i = 0; i < res.size()-1; i++){
            if(res.get(i) > res.get(i+1)){
                res.remove(i+1);
                System.out.println(res);
            }
        }
        for(int i = 0; i < res.size()-1; i++){
            if(res.get(i) > res.get(i+1)){
                stalining(res);
            }
        }
    }
}
