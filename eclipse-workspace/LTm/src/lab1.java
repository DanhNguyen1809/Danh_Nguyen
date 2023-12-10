import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class lab1 {
	public static void main(String[] args) {
		Socket socket = new Socket();
		InputStream is = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
