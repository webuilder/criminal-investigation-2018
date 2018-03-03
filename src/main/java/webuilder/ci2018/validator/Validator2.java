package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第2题答案
 * 
 * @author lijian
 *
 */
public class Validator2 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(1);

		if (x == 'A' && r.getAnswer(4) == 'C') {
			return true;
		} else if (x == 'B' && r.getAnswer(4) == 'D') {
			return true;
		} else if (x == 'C' && r.getAnswer(4) == 'A') {
			return true;
		} else if (x == 'D' && r.getAnswer(4) == 'B') {
			return true;
		}
		return false;
	}

}
