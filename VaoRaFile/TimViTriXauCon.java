package VaoRaFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimViTriXauCon {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("STRING.in"));
            int t = Integer.parseInt(sc.nextLine());
            while(t-->0){
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                for(int i = 0; i <= s1.length()-s2.length(); i++)
                    if(s1.charAt(i) == s2.charAt(0)){
                        if(s1.substring(i, i+s2.length()).equals(s2))
                            System.out.print((i+1) + " ");
                    }
                System.out.println();
            }           
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }
    }
}
