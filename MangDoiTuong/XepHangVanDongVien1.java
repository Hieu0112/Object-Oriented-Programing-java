package CodeJava1.MangDoiTuong;
import java.util.*;
import java.text.*;
class InfoVanDongVien{
    private SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
    private SimpleDateFormat sdf2=new SimpleDateFormat("hh:mm:ss");
    private String ma,name;
    private int toDay=2021;
    private Date birthday,begin,end;
    private String NamSinh;
    private int STT;
    public InfoVanDongVien(int i, String name, String birthday, String begin, String end) throws ParseException{
        this.ma = "VDV"+String.format("%02d", i);
        this.name = name;
        this.birthday = sdf1.parse(birthday);
        this.begin = sdf2.parse(begin);
        this.end = sdf2.parse(end);
        this.NamSinh=birthday.substring(6);
        this.STT=1;
    }

    public String getMa() {
        return ma;
    }
    
    public int getSTT() {
        return STT;
    }
    
    public void setSTT(int STT) {
        this.STT = STT;
    }
    public Date ChuanHoa(String Times) throws ParseException{
        return sdf2.parse(Times);
    }
    public String TinhGio(Date date1,Date date2){
        long Giay=(date2.getTime()-date1.getTime())/1000;
        long Gio=(long)(Giay/3600);
        long Phut=(long)((Giay-Gio*3600)/60);
        Giay=Giay-Gio*3600-Phut*60;
        return String.format("%02d", Gio)+ ":" + String.format("%02d", Phut) + ":"+String.format("%02d", Giay);
    }

    public String ThucTe() {
        return TinhGio(begin, end);
    }
    
    public String UuTien() {
        long tuoi=toDay-Long.parseLong(NamSinh);
        if(tuoi<18) return "00:00:00";
        else if(tuoi<25) return "00:00:01";
        else if(tuoi<32)    return "00:00:02";
        else return "00:00:03";
    }
    public String TimeXepHang(){
        try{
            Date date1=ChuanHoa(ThucTe());
            Date date2=ChuanHoa(UuTien());
            return TinhGio(date2, date1);
        }
        catch(ParseException e){
        }
        return "";
    }

    public long getSapXep(){
        return Long.parseLong(TimeXepHang().substring(6))+
               Long.parseLong(TimeXepHang().substring(3,5))*60+
               Long.parseLong(TimeXepHang().substring(0,2))*3600;
    }
    @Override
    public String toString() {
        return ma+" "+name+" "+ThucTe()+" "+UuTien()+" "+TimeXepHang()+" "+STT;
    }
    
}
public class XepHangVanDongVien1 {
    public static void main(String[] args) throws ParseException{
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<InfoVanDongVien>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new InfoVanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, Comparator.comparingLong(InfoVanDongVien::getSapXep));
        for(int i=1;i<list.size();i++){
            if(list.get(i).getSapXep()==list.get(i-1).getSapXep()){
                list.get(i).setSTT(list.get(i-1).getSTT());
            }
            else{
            list.get(i).setSTT(i+1);
            }
        }
        Collections.sort(list, Comparator.comparing(InfoVanDongVien::getMa));
        for(InfoVanDongVien x:list){
            System.out.println(x);
        }
    }
}
