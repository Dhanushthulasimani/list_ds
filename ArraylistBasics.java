import java.util.ArrayList;

public class ArraylistBasics {
    public  static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);
        list.set(0,55);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(6));
        System.out.println(list.size());
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
    }
}
