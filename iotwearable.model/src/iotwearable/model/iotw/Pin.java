package iotwearable.model.iotw;

public class Pin {
	private String name;
	private TypePin  type;
	private String idConnect;
	
	public Pin(String name, TypePin type) {
		this.name = name;
		this.type = type;
		this.idConnect = "";
	}
	
	@Override
	public String toString() {
		if(this.idConnect.isEmpty()){
			return this.name + "," + this.type.toString();
		}
		return  this.name + "," + this.type.toString()  + "," + this.idConnect;
	}
	
	public String getIdConnect() {
		return idConnect;
	}

	public void setIdConnect(String idConnect) {
		this.idConnect = idConnect;
	}

	public String getName() {
		return name;
	}

	public TypePin getType() {
		return type;
	}

	/**
	 * 
	 * Type of pin
	 *
	 */
	public enum TypePin{
		Input,
		Output,
		IO,
		Passive,
		Power,
//		Open,
//		Collector,
//		HiZ,
//		Emitter,
	}
}
