package BankPackage;

public class BankClient implements Client{
	String clientName = "";
	int clientType = 0; 	//1=eventual, 2=fijo, 3=especial
	int clientPriority = 0;		//eventual -> 1, fijo -> 3, especial -> 5
	int clientTime;
	
	public BankClient(String name, int type) {
		super();
		this.clientName = name;
		this.clientType = type;
		if(clientType == 1 ) {
			clientPriority = 1;
		}
		if(clientType == 2) {
			clientPriority = 3;
		}
		if(clientType ==3) {
			clientPriority = 5;
		}
		this.clientTime = (int) Math.floor(Math.random()*(0.2-0.005+1)+5);
		
	}
	//Interface methods
	public String getName() {
		return clientName;
	}
	
	public void setName(String name) {
		this.clientName = name;
	}
	
	public int getType() {
		return clientType;
	}
	
	public void setType(int type) {
		this.clientType = type;
		if(clientType == 1 ) {
			clientPriority = 1;
		}
		if(clientType == 2) {
			clientPriority = 3;
		}
		if(clientType ==3) {
			clientPriority = 5;
		}
	}
	
	public int getPriority() {
		return clientPriority;
	}
	//
//	public void setPriority() {
//		//this.clientPriority = priority;
//		if(clientType == 1 ) {
//			clientPriority = 1;
//		}
//		if(clientType == 2) {
//			clientPriority = 3;
//		}
//		else
//			clientPriority = 5;
//	}
	
	public int getTime() {
		return clientTime;
	}
	
	
	
	

}
