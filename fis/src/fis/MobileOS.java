package fis;

public abstract class MobileOS {

	
	public String version;
	private int passcode;
	public MobileOS(String version, int passcode) {
		super();
		this.version = version;
		this.passcode = passcode;
	}
	public MobileOS(int passcode) {
		super();
		this.passcode = passcode;
	}
	
	
	
	public String getVersion() {
		return version;
	}
	public int getPasscode() {
		return passcode;
	}
	public abstract boolean unlock(int passcode);
	
	public int getCameraSound()
	{
		return 1;
	}
	
	
}
