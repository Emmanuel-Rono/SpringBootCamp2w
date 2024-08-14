import org.example.Sim;

public class Airtel implements Sim {
    @Override
    public void data() {
            System.out.println("Airtel Data");
    }

    @Override
    public void calling() {
            System.out.println("Airtel Calling");
    }
}
