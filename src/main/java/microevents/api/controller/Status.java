package microevents.api.controller;

public class Status {

	private String status;
	private String version;
	private String buildTimestamp;
	private String startTimestamp;

	public static Status newInstance() {
		return new Status();
	}
	
	public String getStatus() {
		return status;
	}

	public Status setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getVersion() {
		return version;
	}

	public Status setVersion(String version) {
		this.version = version;
		return this;
	}

	public String getBuildTimestamp() {
		return buildTimestamp;
	}

	public Status setBuildTimestamp(String buildTimestamp) {
		this.buildTimestamp = buildTimestamp;
		return this;
	}

	public String getStartTimestamp() {
		return startTimestamp;
	}

	public Status setStartTimestamp(String startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}
	
	

}
