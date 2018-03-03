package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第3题答案
 * 
 * @author lijian
 *
 */
public class Validator3 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(2);

		char r3 = r.getAnswer(2);
		char r6 = r.getAnswer(5);
		char r2 = r.getAnswer(1);
		char r4 = r.getAnswer(3);

		if (x == 'A') {
			return r3 != r6 && r3 != r2 && r3 != r4;
		} else if (x == 'B') {
			return r6 != r3 && r6 != r2 && r6 != r4;
		} else if (x == 'C') {
			return r2 != r3 && r2 != r6 && r2 != r4;
		} else if (x == 'D') {
			return r4 != r3 && r4 != r6 && r4 != r2;
		}
		return false;
	}

}
