import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class BinaryQueries {

		public PrintWriter mOut;
		public FasterScanner mFScanner;
		public static String EVEN = "EVEN";
		public static String ODD = "ODD";
		
		public BinaryQueries(){
			mOut = new PrintWriter(System.out);
			mFScanner = new FasterScanner();
		}
		
		public void flush() {
			mOut.flush();
		}

		public void close() {
			mOut.close();
		}
		
		public void solveProblem(){
			
			int N = mFScanner.nextInt();
	        int Q = mFScanner.nextInt();
			
			int in[] = new int[N];
			for (int j = 0; j < in.length; j++) {
				in[j] = mFScanner.nextInt();
			}
			int temp,y,z,x;
			for(int i=0; i<Q; i++){
				x = mFScanner.nextInt();
				if(x == 0){
					y = mFScanner.nextInt();
					z = mFScanner.nextInt();
					temp = y+(z-y)-1;
					if(in[temp] == 1)
						mOut.println(ODD);
					else
						mOut.println(EVEN);	
				}
				else{
					y = mFScanner.nextInt();
					in[y-1] ^= 1;
				}
			}
		}

	    public static void main(String args[] ) throws Exception {
	    	BinaryQueries bq = new BinaryQueries();
	    	bq.solveProblem();
			bq.flush();
			bq.close();
	    }

}


class FasterScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;

	public FasterScanner() {
		this(System.in);
	}

	public FasterScanner(InputStream is) {
		mIs = is;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = mIs.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public String nextString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}

}
