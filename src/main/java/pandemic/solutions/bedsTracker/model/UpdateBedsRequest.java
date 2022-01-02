package pandemic.solutions.bedsTracker.model;

public class UpdateBedsRequest {

	private Integer bedCount;
	private String op;
	
	public Integer getBedCount() {
		return bedCount;
	}
	public void setBedCount(Integer bedCount) {
		this.bedCount = bedCount;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
}
