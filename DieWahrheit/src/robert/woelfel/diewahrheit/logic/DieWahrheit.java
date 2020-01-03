package robert.woelfel.diewahrheit.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author robert.woelfel
 * @version $Revision: $ $Date: $ $Author: $
 */
public class DieWahrheit {
	///** the logger */
	//private static final Logger LOG = LoggerFactory.getLogger(DieWahrheitSpeechlet.class);

	/** list of the "truths" to say */
	private static final List<String> TRUTH_LIST = Collections.unmodifiableList(
	        Arrays.asList(new String[] { "Jonas ist der einzige Spacko", "Jonas ist in Zeiteile" }));

	/**
	 * @return random Answer
	 */
	public static DataBean randomAnswer() {
		return new DataBean("Die Wahrheit",
		                    "Die Wahrheit ist " + TRUTH_LIST.get((int) Math.floor(Math.random() * TRUTH_LIST.size())));
	}
}
