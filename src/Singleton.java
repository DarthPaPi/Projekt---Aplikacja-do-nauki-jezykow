public class Singleton {
    private static Singleton instance = null;
    public String konfiguracja1;
    public String konfiguracja2;
    public String konfiguracja3;

    private Singleton()
    {
        System.out.println("Singleton created");
    }

    public static synchronized Singleton getInstance()
    {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }
}
