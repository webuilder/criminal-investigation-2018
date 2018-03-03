package webuilder.ci2018;

/**
 * 一组答案
 * 
 * @author lijian
 *
 */
public class Result {

	public static final int COUNT = 10;

	private int value;

	private static final char[] chars = new char[] { 'A', 'B', 'C', 'D' };

	public Result(int value) {
		super();
		this.value = value;
	}

	/**
	 * 获取一道题目的答案
	 * 
	 * @param question
	 *            题目编号，以0为底
	 * @return
	 */
	public char getAnswer(int question) {
		int x = (value >> ((9 - question) << 1)) & 3;
		return chars[x];
	}

	@Override
	public String toString() {
		char[] buf = new char[COUNT];
		for (int i = 0; i < COUNT; i++) {
			buf[i] = getAnswer(i);
		}
		return new String(buf);
	}
}
