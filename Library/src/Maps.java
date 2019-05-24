
public class Maps extends Items implements CRUD {

	private int pages;
	private String regions;
	private String symbols;

	public Maps(String name, int pages, String regions, String symbols) {
		super(name);
		this.pages = pages;
		this.regions = regions;
		this.symbols = symbols;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPages(int pages) {
		return pages;

	}

	public String getRegions() {
		return regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
