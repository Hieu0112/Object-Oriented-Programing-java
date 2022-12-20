package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FILE {
    public static <T>List<T> read(String fname){
        List<T>list=new ArrayList<>();
        try{
        ObjectInputStream io=new ObjectInputStream(new FileInputStream(fname));
            list=(List<T>)io.readObject();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    } 
}
