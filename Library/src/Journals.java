
public class Journals extends Items implements CRUD {
	private String academic;
	private String longRead;
	private int pages;

	public Journals(String name, String academic, String longRead, int pages) {
		super(name);
		this.academic = academic;
		this.longRead = longRead;
		this.pages = pages;

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

	/**
	 * @return the academic
	 */
	public String getAcademic() {
		return academic;
	}

	/**
	 * @param academic
	 *            the academic to set
	 */
	public void setAcademic(String academic) {
		this.academic = academic;
	}

	/**
	 * @return the longRead
	 */
	public String getLongRead() {
		return longRead;
	}

	/**
	 * @param longRead
	 *            the longRead to set
	 */
	public void setLongRead(String longRead) {
		this.longRead = longRead;
	}

	public void setPages() {
		this.pages = pages;
	}

	public int getPages() {
		return pages;
	}

}
