package ma.ac.uiass.eia.springbootapp.formations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name="Formation_db")
public class Formation {
   
	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	
	private String title;
	
	
	private String description;
	
	private String duration;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Formation(long id, String title, String description, String duration) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
	}

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
