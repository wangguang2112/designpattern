
public class AVB {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
				while (true) {
					System.out.println("thread");
						Thread.sleep(6000);
				}
				} catch (InterruptedException e) {
					System.out.println("Thread:::I'm be interrupt");
				}
			}
		});
		t.start();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			System.out.println("Main:::I'm be interrupt");
		}
		if (!t.interrupted()) {
			t.interrupt();
		}
	}

}
