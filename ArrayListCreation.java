import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCreation {
    static void printList(ArrayList<String>list){
    }
    static ArrayList<String>returnArrayList(){
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] stringArray = {"Max", "key"};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        
        list.add(7);
        list.add(5);
        list.set(0, 8);
        list.remove(1);
        stringList.remove("Max");
        System.out.println(list.contains(1));
    }

}