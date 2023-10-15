package appointment;

import java.time.LocalDateTime;

public class Appointment {
	
	private LocalDateTime startTime;
	

	public Appointment(LocalDateTime startTime, LocalDateTime endTime, String serviceProvider, User user) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.serviceProvider = serviceProvider;
		this.user = user;
	}

	private LocalDateTime endTime;
    private String serviceProvider;
    private User user;
    
  

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Appointment [startTime=" + startTime + ", endTime=" + endTime + ", serviceProvider=" + serviceProvider
				+ ", user=" + user + "]";
	}
	

	
    

}
