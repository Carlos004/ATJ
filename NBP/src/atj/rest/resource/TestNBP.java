package atj.rest.resource;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import atj.rest.model.ExchangeRatesSeries;

public class TestNBP {

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub


		JAXBContext jaxbContext = JAXBContext.newInstance(ExchangeRatesSeries.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/C/USD/last/1/");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "application/xml");
		connection.connect();

		ExchangeRatesSeries exch= (ExchangeRatesSeries) jaxbUnmarshaller.unmarshal(connection.getInputStream());
		System.out.println(exch.getCode());
		System.out.println(exch.getCurrency());
		

	}

}

