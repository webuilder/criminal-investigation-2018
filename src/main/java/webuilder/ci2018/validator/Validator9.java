package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第9题答案
 * 
 * @author lijian
 *
 */
public class Validator9 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(8);

		if (x == 'A') {
			return test(r, 5);
		} else if (x == 'B') {
			return test(r, 9);
		} else if (x == 'C') {
			return test(r, 1);
		} else if (x == 'D') {
			return test(r, 8);
		}
		return false;
	}

	private boolean test(Result r, int x) {
		return (r.getAnswer(0) == r.getAnswer(5)) ^ (r.getAnswer(x) == r.getAnswer(4));
	}
}
