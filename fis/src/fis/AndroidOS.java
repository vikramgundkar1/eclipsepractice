package fis;

public class AndroidOS extends MobileOS {

	public AndroidOS(int passcode, String version) {
		super(passcode);
		this.version = version;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean unlock(int passcode) {
		if (super.getPasscode() == passcode)
			return true;
		return false;
	}
	
	

	public int getCameraSound() {
		return 20;

	}

	
}
