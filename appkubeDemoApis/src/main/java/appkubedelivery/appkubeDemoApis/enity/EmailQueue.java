package appkubedelivery.appkubeDemoApis.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "email")
public class EmailQueue {
	@Id
	private Long id;
    private String frommsg;
    private String tomsg;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrommsg() {
		return frommsg;
	}
	public void setFrommsg(String frommsg) {
		this.frommsg = frommsg;
	}
	public String getTomsg() {
		return tomsg;
	}
	public void setTomsg(String tomsg) {
		this.tomsg = tomsg;
	}
	@Override
	public String toString() {
		return "EmailQueue [id=" + id + ", frommsg=" + frommsg + ", tomsg=" + tomsg + "]";
	}

    
	
}
