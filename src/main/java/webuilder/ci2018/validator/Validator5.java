package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第5题答案
 * 
 * @author lijian
 *
 */
public class Validator5 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(4);

		if (x == 'A' && r.getAnswer(7) == 'A') {
			return true;
		} else if (x == 'B' && r.getAnswer(3) == 'B') {
			return true;
		} else if (x == 'C' && r.getAnswer(8) == 'C') {
			return true;
		} else if (x == 'D' && r.getAnswer(6) == 'D') {
			return true;
		}
		return false;
	}

}
