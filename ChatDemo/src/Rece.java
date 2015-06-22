import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Rece implements Runnable{
	private DatagramSocket ds;
	public Rece(DatagramSocket ds) {
		// TODO Auto-generated constructor stub
		this.ds=ds;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				byte []buf=new byte[1024];  
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				String ip=dp.getAddress().getHostAddress();
				String data=new String(dp.getData(),0,dp.getLength());
				int port=dp.getPort();
				System.out.println(ip+"::"+data+"::"+port);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
