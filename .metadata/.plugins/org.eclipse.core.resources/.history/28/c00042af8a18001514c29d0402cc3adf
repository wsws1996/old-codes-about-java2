import java.net.DatagramSocket;


public class ChatDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket sendSocket=new DatagramSocket();
		DatagramSocket receSocket=new DatagramSocket(10000);
		new Thread(new Send(sendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}

}
