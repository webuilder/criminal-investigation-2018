package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第4题答案
 * 
 * @author lijian
 *
 */
public class Validator4 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(3);

		if (x == 'A') {
			return r.getAnswer(0) == r.getAnswer(4);
		} else if (x == 'B') {
			return r.getAnswer(1) == r.getAnswer(6);
		} else if (x == 'C') {
			return r.getAnswer(0) == r.getAnswer(8);
		} else if (x == 'D') {
			return r.getAnswer(5) == r.getAnswer(9);
		}
		return false;
	}

}
