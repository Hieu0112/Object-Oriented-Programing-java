package CodeJava1.MangDoiTuong;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.util.Comparator;
class Person{
    private String name;
    private Date birthday;
     SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    public Person(String name,String birthday) throws ParseException {
        this.name=name;
        this.birthday=sdf.parse(birthday);
    }

    public String getName() {
        return name;
    }

    public Long getBirthday() {
        return birthday.getTime();
    }
    
}
public class TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<Person>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s = sc.nextLine();
            String[] tokens = s.split(" ");
            Person a = new Person(tokens[0],tokens[1]);
            list.add(a);
        }
        Collections.sort(list, Comparator.comparingLong(Person::getBirthday));
        System.out.println(list.get(list.size()-1).getName());
        System.out.println(list.get(0).getName());
        
    }
}
