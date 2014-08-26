package dto;

public class JdbcDto {

	private int userId;
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String userType;
	private String adtiveFlag;
	private int createdBy;
	private java.sql.Date createdDate;
	private int modifiedBy;
	private java.sql.Date modifiedDate;
	private java.sql.Date dob;
	private int coins;
	private int noOfBusiness;

	// Getters, Setters & Constructors are written below

	public JdbcDto() {

	}

	public JdbcDto(String userName, String email, String firstName,
			String lastName, String password, String userType,
			String adtiveFlag, int createdBy, java.sql.Date createdDate,
			int modifiedBy, java.sql.Date modifiedDate, java.sql.Date dob,
			int coins, int noOfBusiness) {
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.userType = userType;
		this.adtiveFlag = adtiveFlag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.dob = dob;
		this.coins = coins;
		this.noOfBusiness = noOfBusiness;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAdtiveFlag() {
		return adtiveFlag;
	}

	public void setAdtiveFlag(String adtiveFlag) {
		this.adtiveFlag = adtiveFlag;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public java.sql.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public java.sql.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.sql.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getNoOfBusiness() {
		return noOfBusiness;
	}

	public void setNoOfBusiness(int noOfBusiness) {
		this.noOfBusiness = noOfBusiness;
	}

	@Override
	public String toString() {
		return this.getEmail();
	}

}