import java.util.Scanner;
public class Main
{


    static Scanner in = new Scanner( System.in );

    static void opcjaPierwsza()
    {
        System.out.println( "Wybrano "+Jezyki.j1);
    }

    static void opcjaDruga()
    {
        System.out.println( "Wybrano "+Jezyki.j2);
    }

    static void pokazMenu()
    {
        System.out.print( "Dostepne jezyki to: "+Jezyki.j1+","+Jezyki.j2+"\n");
        System.out.print( "Wybierz opcje:\n1."+Jezyki.j1+"\n2."+Jezyki.j2+"\n>> " );

    }

    static void menu()
    {
        int nrOpcji;
        do
        {
            pokazMenu();
            nrOpcji = in.nextInt();
            switch( nrOpcji )
            {
                case 1 : opcjaPierwsza();
                    if (nrOpcji == 1)
                    {
                        Singleton s1 = Singleton.getInstance();
                        s1.konfiguracja1 = Jezyki.j1;
                    }
                    return;
                case 2 : opcjaDruga();
                    if (nrOpcji == 2)
                    {
                        Singleton s1 = Singleton.getInstance();
                        s1.konfiguracja1 = Jezyki.j2;
                    }
                    return;
            }
        }
        while( nrOpcji != 3 );
    }

    static Scanner in2 = new Scanner( System.in );
    static void opcjaPierwsza2()
    {
        System.out.println( "Wybrano "+lvl.l1);
    }

    static void opcjaDruga2()
    {
        System.out.println( "Wybrano "+lvl.l2);
    }

    static void opcjaTrzecia()
    {
        System.out.println( "Wybrano "+lvl.l3);
    }

    static void pokazMenu2()
    {
        System.out.print( "Dostepne poziomy trudnosci to: "+lvl.l1+","+lvl.l2+","+lvl.l3+"\n");
        System.out.print( "Wybierz opcje:\n1."+lvl.l1+"\n2."+lvl.l2+"\n3."+lvl.l3+"\n>> " );

    }


    static void menu2()
    {
        int nrOpcji;
        do
        {
            pokazMenu2();
            nrOpcji = in2.nextInt();
            switch( nrOpcji )
            {
                case 1 : opcjaPierwsza2();
                    if (nrOpcji == 1)
                    {
                        Singleton s2 = Singleton.getInstance();
                        s2.konfiguracja2 = lvl.l1;
                    }
                    return;
                case 2 : opcjaDruga2();
                    if (nrOpcji == 2)
                    {
                        Singleton s2 = Singleton.getInstance();
                        s2.konfiguracja2 = lvl.l2;
                    }
                    return;
                case 3 : opcjaTrzecia();
                    if (nrOpcji == 3)
                    {
                        Singleton s2 = Singleton.getInstance();
                        s2.konfiguracja2 = lvl.l3;
                    }
                    return;
            }
        }
        while( nrOpcji != 4 );
    }


    static Scanner in3 = new Scanner( System.in );



    static void opcjaPierwsza3()
    {
        System.out.println( "Wybrano "+Tryb.t1);
    }

    static void opcjaDruga3()
    {
        System.out.println( "Wybrano "+Tryb.t2);
    }

    static void pokazMenu3()
    {
        System.out.print( "Dostepne tryby to: "+Tryb.t1+","+Tryb.t2+"\n");
        System.out.print( "Wybierz opcje:\n1."+Tryb.t1+"\n2."+Tryb.t2+"\n>> " );

    }

    static void menu3()
    {
        int nrOpcji;
        do
        {
            pokazMenu3();
            nrOpcji = in3.nextInt();
            switch( nrOpcji )
            {
                case 1 : opcjaPierwsza3() ;
                    if (nrOpcji == 1)
                    {
                        Singleton s3 = Singleton.getInstance();
                        s3.konfiguracja3 = Tryb.t1;
                    }
                    return;

                case 2 : opcjaDruga3();
                    if (nrOpcji == 2)
                    {
                        Singleton s3 = Singleton.getInstance();
                        s3.konfiguracja3 = Tryb.t2;
                    }
                    return;

            }

        }

        while( nrOpcji != 3 );
    }


    static void podsumowanie() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print( "------------------------------------------"+"\n");
        System.out.print( "Podsumowanie: "+s1.konfiguracja1+" "+s2.konfiguracja2+" "+s3.konfiguracja3+"\n");
        System.out.print( "------------------------------------------"+"\n");
        int x;

        if (s3.konfiguracja3 == Tryb.t2) {
            System.out.print("\n");
            System.out.print("Wybierz typ zadania \n 1.Tlumaczenie slow \n 2.Quizy");
            System.out.print("\n");
            Scanner spr = new Scanner(System.in);
            x = spr.nextInt();
            Zadania zadania = ZadaniaFactory.getInstance(x);
            System.out.println(zadania.getType());
        }
    }




    public static void main(String[] args)
    {

        menu();
        menu2();
        menu3();
        podsumowanie();
    }
}