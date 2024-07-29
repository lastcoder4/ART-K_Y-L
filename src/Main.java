import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int yil;
        System.out.println("lutfen sorgulamak ıstedıgınız yılı gırınız :");
        yil = inp.nextInt();
        if(yil % 4 == 0)
        {
            if(yil %100 == 0 && yil %400 == 0)
            {
                System.out.println("Girdiginiz yıl bir ARTIK YIL dır");
            }
            else if( yil % 100 != 0 && yil % 4 == 0)
            {
                System.out.println("Girdiginiz yıl bir ARTIK YIL dır");
            }
            else
            {
                System.out.println("Girdiginiz yıl bir ARTIK YIL DEĞİL dır");
            }

        }
    }
}