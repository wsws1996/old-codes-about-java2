import java.net.DatagramSocket;


public class ChatDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket sendSocket=new DatagramSocket();
		DatagramSocket receSocket=new DatagramSocket(10000);
		Rece R=new Rece(receSocket);
		Send S=new Send(sendSocket);
		new Thread(R).start();
		new Thread(S).start();
	}

}
