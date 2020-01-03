package robert.woelfel.diewahrheit.logic;

/**
 * @author robert.woelfel
 * @version $Revision: $ $Date: $ $Author: $
 */
public class DataBean {
	/** title */
	private String title;
	/** text */
	private String text;

	/**
	 * @param pTitle title
	 * @param pText text
	 */
	public DataBean(String pTitle, String pText) {
		title = pTitle;
		text = pText;
	}

	/**
	 * @return title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param pTitle neuer Wert für Property title
	 */
	public void setTitle(String pTitle) {
		title = pTitle;
	}

	/**
	 * @return text.
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param pText neuer Wert für Property text
	 */
	public void setText(String pText) {
		text = pText;
	}
}
