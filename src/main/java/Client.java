import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", Server.SERVER_PORT);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Write your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        out.write(name);
        out.flush();

        out.close();
        in.close();
        scanner.close();
    }
}
