package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="computers")
public class Computer {	@Id @GeneratedValue
	private Long id;
	@Column(length =50)
	private String model;
	@Column(length =20)
	private int disc;
	@Column(length =50)
	private String brand;
	@Column(length =50)
	private String processor;
	public Computer(String model, int disc,String brand,String processor) {
		super();
		this.model =model;
		this.disc = disc;
		this.brand=brand;
		this.processor=processor;
	}
	
	public Computer() {
		this("",0,"","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}






	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDisc() {
		return disc;
	}

	public void setDisc(int disc) {
		this.disc = disc;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", model=" + model + ", disc=" + disc + ", brand=" + brand + ",processor=" +processor+   "]";
	}
	
}
