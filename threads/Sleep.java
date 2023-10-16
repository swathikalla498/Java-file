package threads;

public class Sleep extends Thread{
	    public static void main(String args[]) {
	    	try {
	    		for(int i=0;i<=5;i++) {
	    			sleep(500);
	    			System.out.println(i);
	    		}
	    	}
	    		catch(Exception ex) {
	    			System.out.println(ex);
	    			System.out.println(ex);
	    		}
	    		}
	    	}
	    
