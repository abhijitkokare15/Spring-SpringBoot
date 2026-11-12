public class Anime_launch {

	
	private TvTokeyo tv;
	
	
	public void telecast ()
	{
	     tv.launch();
		
	}


	public TvTokeyo getTv() {
		return tv;
	}


	public void setTv(TvTokeyo tv) {
		this.tv = tv;
	}


	public Anime_launch() {
		super();
		System.out.println("New anime is comming ");
	}
}


