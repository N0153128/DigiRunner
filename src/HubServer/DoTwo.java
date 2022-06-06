public class DoTwo implements Request {
	private Command abcCom;

	public DoTwo(Command abcCom) {
		this.abcCom = abcCom;
	}

	public void execute() {
		abcCom.Two();
	}
}
