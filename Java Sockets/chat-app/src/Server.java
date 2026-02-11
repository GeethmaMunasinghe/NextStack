import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static List<Handler> clients=new ArrayList<Handler>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8000);
            System.out.println("Server started on port 8000");

            while (true){
                Socket acceptedSocket=serverSocket.accept();
                System.out.println("Client connected : "+acceptedSocket.getInetAddress().getAddress());
                Handler handler =new Handler(acceptedSocket);
                clients.add(handler);
                new Thread(handler).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    static void broadcast(String message,Handler handler){
        for (Handler client: clients){
            if (client!=handler){
                client.sendMessage(handler.getClientName()+" : "+message);
            }
        }
    }
}

class Handler implements Runnable{
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private Socket socket;
    private String clientName;
    public Handler(Socket socket){
        this.socket=socket;
    }
    public String getClientName(){
        return clientName;
    }
    public void sendMessage(String message){
        printWriter.println(message);
    }
    @Override
    public void run() {
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter=new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("Hello what is your name? ");
            clientName=bufferedReader.readLine();
            printWriter.println("Connected ..."+clientName);

            Server.broadcast("has joined: ",this);
            String message;
            while ((message=bufferedReader.readLine())!=null){
                Server.broadcast(message,this);
            }
            Server.broadcast("User left: ",this);
            bufferedReader.close();
            printWriter.close();
            socket.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
