package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第8题答案
 * 
 * @author lijian
 *
 */
public class Validator8 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(7);

		char r1 = r.getAnswer(0);

		if (x == 'A') {
			return Math.abs(r1 - r.getAnswer(6)) != 1;
		} else if (x == 'B') {
			return Math.abs(r1 - r.getAnswer(4)) != 1;
		} else if (x == 'C') {
			return Math.abs(r1 - r.getAnswer(1)) != 1;
		} else if (x == 'D') {
			return Math.abs(r1 - r.getAnswer(9)) != 1;
		}
		return false;
	}

}
