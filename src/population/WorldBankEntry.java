package population;

public class WorldBankEntry {
	public WorldBankEntry(String country, String code, String indicator, long toPopulation) {
		super();
		this.country = country;
		this.code = code;
		this.indicator = indicator;
		this.toPopulation = toPopulation;
	}
	//"Country Name","Country Code","Indicator Name","Indicator Code","1960","1961","1962","1963","1964",
	//"1965","1966","1967","1968","1969","1970","1971","1972","1973","1974","1975","1976","1977","1978",
	//"1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992",
	//"1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006",
	//"2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019",
	private String country;
	private String code;
	private String indicator;
	private long toPopulation;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	public long getToPopulation() {
		return toPopulation;
	}
	public void setToPopulation(long toPopulation) {
		this.toPopulation = toPopulation;
	}
	@Override
	public String toString() {
		return "WorldBankEntry [country=" + country + ", code=" + code + ", indicator=" + indicator + ", toPopulation="
				+ toPopulation + "]";
	}
}
