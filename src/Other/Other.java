package Other;

import java.io.File;
import java.util.*;

public class Other {
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<String>();
        list.add("Яна");
        list.add("Ваня");
        list.add("Саша");
        list.add("Саша");

        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2){
                return s1.toString().compareTo(s2.toString());
            }
        });
        for(String s : list){
            System.out.println(s);
        }
        File newDir = new File("c://Hyinya");
        newDir.mkdir();
        System.out.println(newDir.exists());



    }




}

