package untitlePro;

import java.util.UUID;

public class PassWord {
	
	private UUID passID; 
	private String passProgram;
	private String passUsername;
	private String passWord; 
	
	public PassWord(String passProgram, String passUsername, String passWord){
		this.passProgram = passProgram;
		this.passUsername = passUsername;
		this.passWord = passWord;
	}
	
	public PassWord(UUID passID){
		this.passID = passID;
	}

	public UUID getPassID() {
		return passID;
	}

	public void setPassID(UUID passID) {
		this.passID = passID;
	}

	public String getPassProgram() {
		return passProgram;
	}

	public void setPassProgram(String passProgram) {
		this.passProgram = passProgram;
	}

	public String getPassUsername() {
		return passUsername;
	}

	public void setPassUsername(String passUsername) {
		this.passUsername = passUsername;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
