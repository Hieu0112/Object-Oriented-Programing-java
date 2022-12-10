
package MangDoiTuong;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

class InfoNV{
    private String ma;
    private String name;
    private String gt;
    private Date date;
    private String address;
    private String maso;
    private Date date2;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
    public InfoNV(int so,String name,String gt,String date,String address,String maso ,String date2)  throws ParseException{
        this.ma=String.format("%05d",so);
        this.name=name;
        this.gt=gt;
        this.date=sdf.parse(date);
        this.address=address;
        this.maso=maso;
        this.date2=sdf.parse(date2);
    }

    public Date getDate() {
        return date;
    }
    public String ChuanHoa(){
        String s=name;
        s=s.trim().toLowerCase();
        s=s.replaceAll("\\s+"," ");
        String[] str=s.split(" ");
        s="";
        for(int i=0;i<str.length;i++){
            s+=String.valueOf(str[i].charAt(0)).toUpperCase()+str[i].substring(1);
            s+=" ";
        }
        return s;
    }
    public String toTring(){
        return ma + " " + ChuanHoa() +" "+ gt + " " + sdf.format(date)+ " " +address + " "+maso+" "+sdf.format(date2) ;
    }
}
public class SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args)  throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<InfoNV> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            InfoNV nv=new InfoNV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(nv);
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((a.get(i).getDate()).after((a.get(j).getDate()))==true){
                    InfoNV tmp=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
            }
        }
        for(InfoNV x:a){
            System.out.println(x.toTring());
        }
    }
}

