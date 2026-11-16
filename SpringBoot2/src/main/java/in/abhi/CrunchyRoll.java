package in.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrunchyRoll {
	
	public CrunchyRoll() {
		super();
		System.out.println("Something new is comming ...");
	}

	@Autowired
	Tvtokeyo tv;
	
	public void telecast()
	{
		tv.animeDetailes();
	}

}
