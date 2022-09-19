package threading;

public class HelloThread {
	private String name;

	public HelloThread(String n) {
		name = n;
	}
	
		public void run() {
			for (int i = 0; i < 50; i++) {
				System.out.println(i+name);
				
			}
		}
	}

