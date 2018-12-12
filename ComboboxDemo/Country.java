class Country
{
	String name;
	double area;
	String country_ndata[] = {"Nepal","India","China","China2"};
	String country_odata[] = {"Repubic of Nepal(maybe) :)","Something Something india "," bla bla china","chaina china"};
	double country_adata[] = {127000,1270000,500000,5000000};
	public Country(String name)
	{	
		int i=0;
		boolean error=true;
		while(i<4)
		{if(name.equals(country_ndata[i]))
		{
		this.name=country_odata[i];
		this.area=country_adata[i];
		error=false; 
		break;
		} 
		i++;
	}
	if(error)
	System.out.println("ERRRORRRR");
}
}