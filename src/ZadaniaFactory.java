public class ZadaniaFactory {

    public static Zadania getInstance(int typy) {
        Zadania zadania = null;

        switch (typy) {
            case 2:
          zadania = new Quizy();
          break;
            case 1:
          zadania = new Tlumaczenia();
          break;

            default:
                break;
        }
        return zadania;
    }
}
