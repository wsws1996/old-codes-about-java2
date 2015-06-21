import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Send implements Runnable {
	private DatagramSocket ds;
	public Send(DatagramSocket ds) {
		// TODO Auto-generated constructor stub
		this.ds=ds;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
			String line =null;
			while ((line=bufr.readLine())!=null) {
				if("886".equals(line))
					break;
				DatagramPacket dp=new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("��ˬ"),10000);
				ds.send(dp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
