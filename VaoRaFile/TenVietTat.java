package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Name{
    private String name,viettat,ten;

    public Name(String name) {
        this.name = name;
        String[]tmp=name.toUpperCase().split("\\s+");
        this.viettat=""+tmp[0].charAt(0);
        for(int i=1;i<tmp.length;i++)
            this.viettat=viettat+"."+tmp[i].charAt(0);
        this.ten=tmp[tmp.length-1];
    }
    public String getName() {
        return name;
    }

    public String getTen() {
        return ten;
    }
    
    public String getViettat() {
        return viettat;
    }
    
}
public class TenVietTat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        List<Name>list=new ArrayList<>();
        while(t-->0){
            list.add(new Name(sc.nextLine()));
        }
        Collections.sort(list, new Comparator<Name>(){
            @Override
            public int compare(Name o1, Name o2) {
                if(o1.getTen().equalsIgnoreCase(o2.getTen()))
                    return o1.getName().compareTo(o2.getName());
                else
                    return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String re=sc.nextLine();
            re="^"+re.substring(0,re.indexOf("*"))+"[A-Z.]{1}+"+re.substring(re.indexOf("*")+1);
//            System.out.println(re);
            for (Name name : list) {       
                if(name.getViettat().matches(re))
                    System.out.println(name.getName());
            }
        }
    }
}
