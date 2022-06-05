public class DoTwo implements Command {
	private Request abcReq;

	public DoTwo (Request abcReq) {
		this.abcReq = abcReq;

	}

	public void execute() {
		abcReq.Two();
	}
}
