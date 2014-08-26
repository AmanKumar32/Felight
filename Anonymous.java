interface Runnable {
	void run();
}

public class Anonymous implements Runnable{

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Runnable runObj = new Runnable(){
			@Override
			public void run() {
				System.out.println("run for fun");
			}
		};
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run for fun");
		
	}

}

