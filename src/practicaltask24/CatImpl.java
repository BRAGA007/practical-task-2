package practicaltask24;

public class CatImpl implements Cat{
	    private boolean hungry = true;

	    @Override
	    public void feed() {
	        hungry = false;
	    }

	    @Override
	    public void isHungry() {
	    	if (hungry)
	    	System.out.println("I’m hungry, bro!");
	    	else  System.out.println("I just want to sleep for a bit, OK?");
	    }

	}
