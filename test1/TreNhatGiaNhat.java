package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Person{
    private String name;
    private Date birthday;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    public Person(String name,String birthday) throws ParseException {
        this.name=name;
        this.birthday=sdf.parse(birthday);
    }

    public String getName() {
        return name;
    }

    public int toCompare(Person a){
        if(a.birthday.after(birthday))
            return 1;
        else
            return -1;
    }
}
public class TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Person>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s= sc.nextLine();
            s=s.replaceAll("\\s+"," ");
            String[] arr=s.split(" ");
            Person res=new Person(arr[0],arr[1]);
            list.add(res);
        }
        Collections.sort(list,Person::toCompare);
        System.out.println(list.get(0).getName());
        System.out.println(list.get(list.size()-1).getName());
    }
}