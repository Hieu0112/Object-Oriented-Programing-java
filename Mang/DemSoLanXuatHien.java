
package CodeJava1.Mang;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (map.containsKey(a[j])) {
                    int dem = map.get(a[j]) + 1;
                    map.replace(a[j], dem);
                } 
                else map.put(a[j], 1);
            }
            System.out.println("Test " +i+": " );
            for (int j = 0; j < n; j++) {
                if (map.containsKey(a[j])) {
                    System.out.println(a[j] + " xuat hien " + map.get(a[j]) + " lan");
                    map.remove(a[j]);
                }
            }
        }
    }
}

