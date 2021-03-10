import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
//		InputStreamReader
		OutputStream os = new FileOutputStream("src/d.txt");
		String test = "æ»≥Á«œººø‰";
		byte[] atest_byte = test.getBytes();
		os.write(atest_byte);
		os.close();
	}
}
