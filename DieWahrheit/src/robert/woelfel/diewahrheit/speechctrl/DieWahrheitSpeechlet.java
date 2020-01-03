package robert.woelfel.diewahrheit.speechctrl;

import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;

import robert.woelfel.diewahrheit.logic.DataBean;
import robert.woelfel.diewahrheit.logic.DieWahrheit;

/**
 * @author robert.woelfel
 * @version $Revision: $ $Date: $ $Author: $
 */
public class DieWahrheitSpeechlet implements Speechlet {
	@Override
	public SpeechletResponse onLaunch(final LaunchRequest request, final Session session) throws SpeechletException {
		return getWelcomeResponse();
	}

	/**
	 * Creates and returns a {@code SpeechletResponse} with a welcome message.
	 *
	 * @return SpeechletResponse spoken and visual response for the given intent
	 */
	private SpeechletResponse getWelcomeResponse() {
		DataBean theTruth = DieWahrheit.randomAnswer();

		SimpleCard card = new SimpleCard();
		card.setTitle(theTruth.getTitle());
		card.setContent(theTruth.getText());

		PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
		speech.setText(theTruth.getText());

		// Create reprompt
		Reprompt reprompt = new Reprompt();
		reprompt.setOutputSpeech(speech);

		return SpeechletResponse.newAskResponse(speech, reprompt, card);
	}

	@Override
	public SpeechletResponse onIntent(IntentRequest pArg0, Session pArg1) throws SpeechletException {
		return null;
	}

	@Override
	public void onSessionEnded(SessionEndedRequest pArg0, Session pArg1) throws SpeechletException {
	}

	@Override
	public void onSessionStarted(SessionStartedRequest pArg0, Session pArg1) throws SpeechletException {
	}
}
