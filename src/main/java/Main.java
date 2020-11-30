import edu.ws.GreetingService;
import edu.ws.GreetingServiceService;

public class Main {
    public static void main(String[] args) {

        com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true;

        GreetingServiceService service = new GreetingServiceService();
        GreetingService port = service.getGreetingServicePort();

        System.out.println("Port class: " + port.getClass().getCanonicalName());

        String response = port.greeting("Jane");

        System.out.println("Response: " + response);

    }
}
