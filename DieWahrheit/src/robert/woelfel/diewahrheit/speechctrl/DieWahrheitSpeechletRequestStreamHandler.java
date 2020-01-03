package robert.woelfel.diewahrheit.speechctrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/**
 * Handler for an AWS Lambda function powering an Alexa Skill. Set the handler field in the AWS Lambda console to
 * "robert.woelfel.diewahrheit.DieWahrheitSpeechletRequestStreamHandler". Build this project using the
 * {@code lambda-compile} Ant task and upload the resulting zip file to power your function.
 * 
 * @author robert.woelfel
 * @version $Revision: $ $Date: $ $Author: $
 */
public class DieWahrheitSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	/**
	 * Id can be found on https://developer.amazon.com/edw/home.html#/ Edit the Alexa Skill "SagDieWahrheit" and get the
	 * id from there
	 */
	private static final Set<String> SUPPORTED_APP_IDS = Collections.unmodifiableSet(
	        new HashSet<String>(Arrays.asList(
	                new String[] { "amzn1.ask.skill.0a4ec800-7aa2-427c-8806-0c2737aa1541" })));

	/**
	 * constructor
	 */
	public DieWahrheitSpeechletRequestStreamHandler() {
		super(new DieWahrheitSpeechlet(), SUPPORTED_APP_IDS);
	}

	/**
	 * @param speechlet the speechlet tu use
	 * @param supportedApplicationIds the app ids
	 */
	public DieWahrheitSpeechletRequestStreamHandler(Speechlet speechlet, Set<String> supportedApplicationIds) {
		super(speechlet, supportedApplicationIds);
	}
}
