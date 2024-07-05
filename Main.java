package linkedlistds;


public class Main {
        public static void main(String[] args) throws Exception {
            Implentationlinkedlist list=new Implentationlinkedlist();
            list.addlast(10);
            list.addlast(30);
            list.addlast(40);
            list.addlast(50);
            list.addfirst(100);
            list.addlast(40);
            list.addfirst(20);
           list.disp();
           // } catch (Exception e) {
             //   throw new RuntimeException(e);
            //}
            //list.getlast();
            list.remove();


            System.out.println(list.getfirst());
            System.out.println(list.getAt(3));
            System.out.println(list.getNodeAt(3));
            System.out.println(list.removeAt(3));



        }

}
