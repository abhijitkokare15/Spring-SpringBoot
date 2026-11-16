package in.abhi;

import org.springframework.stereotype.Component;

@Component
public class NarutoShippuden implements Tvtokeyo {

	public NarutoShippuden() {
		super();
		System.out.println("I am comming ....");
	}

	@Override
	public void animeDetailes() {
		System.out.println("""
			    ========== NARUTO SHIPPUDEN ==========
			    Anime Name : Naruto Shippuden
			    Creator    : Masashi Kishimoto
			    Genre      : Action/Adventure/Adult/Comedy/Emotional
			    Episodes   : 500
			    Studio     : Pierrot
			    Main Hero  : Naruto Uzumaki
			    Status     : Completed
			    ======================================
			    """);

	}

}
