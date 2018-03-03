package webuilder.ci2018.validator;

import webuilder.ci2018.Result;
import webuilder.ci2018.Validator;

/**
 * 验证第10题答案
 * 
 * @author lijian
 *
 */
public class Validator10 implements Validator {

	@Override
	public boolean validate(Result r) {
		final char x = r.getAnswer(9);

		int a = 0, b = 0, c = 0, d = 0;
		for (int i = 0; i < Result.COUNT; i++) {
			char ch = r.getAnswer(i);
			if (ch == 'A') {
				a++;
			} else if (ch == 'B') {
				b++;
			} else if (ch == 'C') {
				c++;
			} else if (ch == 'D') {
				d++;
			} else {
				throw new RuntimeException("unknown");
			}
		}

		int max = Math.max(Math.max(a, b), Math.max(c, d));
		int min = Math.min(Math.min(a, b), Math.min(c, d));
		int diff = max - min;

		if (x == 'A') {
			return diff == 3;
		}
		if (x == 'B') {
			return diff == 2;
		}
		if (x == 'C') {
			return diff == 4;
		}
		if (x == 'D') {
			return diff == 1;
		}
		return false;
	}
}
