package atj.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Rates {

	@XmlElement(name="Rate")
	private List<Rate> rate;

	public Rates() {

	}

	public Rates(List<Rate> rate) {
		super();
		this.rate = rate;
	}

	public List<Rate> getRate() {
		return rate;
	}

	public void setRate(List<Rate> rate) {
		this.rate = rate;
	}

}

