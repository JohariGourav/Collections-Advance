// class ParkedCarOwnerDetails having details of parked car's owner 
package com.cg.carParkingApp;

public class ParkedCarOwnerDetails {

	private String ownerName;
	private String carModel;
	private String carNo;
	private long ownerMobileNo;
	private String ownerAddress;

	// Arg Ctor..
	public ParkedCarOwnerDetails(String ownerName, String carModel, String carNo, long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	// ToString method
	@Override
	public String toString() {
		return "ParkedCarOwnerDetails [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

	// getters & setters
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(int ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

}
