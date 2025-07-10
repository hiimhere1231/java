import java.util.ArrayList;

public class Map {

    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> defs = new ArrayList<String>();

    public Map(){

    }

    public String get(String word){
        int wordIndex = words.indexOf(word);
        return defs.get(wordIndex);
    }

    public void put(String word, String def){
        if(containsKey(word)){
            defs.set(words.indexOf(word), def);
        }
        else{
            words.add(word);
            defs.add(def);
        }
    }

    public boolean containsKey(String word){
        for(int i = 0; i < words.size(); i++){
            if(words.get(i) == word){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String h = "";
        for(int i = 0; i < words.size(); i++){
            h += "the word "+words.get(i)+" means "+defs.get(i)+"\n";
        }
        return h;
    }
}
