package ArrayList;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        String[] arr1 = { "Article", "for", "Geeks", "for", "Geeks" };
        String[] arr2 = { "Article", "Geeks", "Geeks" };
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for(String i :arr1){
          list1.add(i);
        }
        for(String i :arr2){
            list2.add(i);
        }
        System.out.println("Common elements : ");
        for(int i=0; i<list1.size(); i++){
            String element = list1.get(i);
            if(list2.contains(element)){
                System.out.print(element+ " ");
                list2.remove(element);
            }
        }



    }
}
