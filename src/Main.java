import java.util.ArrayList;

import jdk.internal.jshell.tool.resources.version;
public class Main
{
    public static void main(String[] args) 
    {
        ArrayOrganizer org = new ArrayOrganizer();
        ArrayList<Integer> list1  = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3  = new ArrayList<Integer>();
        list1.add(100);
        list1.add(500);
        list1.add(900);

        list2.add(800);
        list2.add(600);
        list2.add(300);

        list3.add(400);
        list3.add(700);
        list3.add(200);
        System.out.print("Result => ");
        System.out.println(org.concatAndSort(list1, list2, list3));
        System.out.println("Successfully reverted in Git");
    }
}
