public class StringBufferAndBuilder {

	public static void main(String[] args) {

		int N = 77777777;
		long t;
		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}

		}
	}

}
