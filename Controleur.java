public class Controleur 
{	
	private IHMGUI ihm;
	private Metier metier;
	
	public Controleur ()
	{
		this.metier = new Metier ();
		this.ihm    = new IHMGUI (this);
	}
}
