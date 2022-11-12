import java.util.Scanner ;
public class dairealan {
    public static void main(String[] args) {
        double pi=3.14 , alan;
        int yaricap , aci ;
        Scanner scan = new Scanner(System.in) ;
        System.out.print("Yaricap Giriniz:");
        yaricap= scan.nextInt();

        System.out.print("Aci Giriniz: ");
        aci=scan.nextInt();

        alan=(pi*yaricap*yaricap*aci) / 360;

        System.out.println("Alan= "+alan);

            }
}
