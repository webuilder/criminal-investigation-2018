package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第6题答案
 * 
 * @author lijian
 *
 */
public class Validator6 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(5);

		char r8 = r.getAnswer(7);

		if (x == 'A') {
			return r8 == r.getAnswer(1) && r8 == r.getAnswer(3);
		} else if (x == 'B') {
			return r8 == r.getAnswer(0) && r8 == r.getAnswer(5);
		} else if (x == 'C') {
			return r8 == r.getAnswer(2) && r8 == r.getAnswer(9);
		} else if (x == 'D') {
			return r8 == r.getAnswer(4) && r8 == r.getAnswer(8);
		}
		return false;
	}

}
