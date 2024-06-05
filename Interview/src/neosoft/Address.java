package neosoft;

public class Address {

	int id;
	String StrretName;
	String area;
	String district;
	int picCode;
	String type;
	
	public Address() {
		super();
	}
	public Address(String strretName, String area, String district, int picCode, String type) {
		super();
		
		StrretName = strretName;
		this.area = area;
		this.district = district;
		this.picCode = picCode;
		this.type = type;
	}
	public String getStrretName() {
		return StrretName;
	}
	public void setStrretName(String strretName) {
		StrretName = strretName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public double getPicCode() {
		return picCode;
	}
	public void setPicCode(int picCode) {
		this.picCode = picCode;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", StrretName=" + StrretName + ", area=" + area + ", district=" + district
				+ ", picCode=" + picCode + ", type=" + type + "]";
	}
	public void setType(String type) {
		this.type = type;
	}

	
	

}
