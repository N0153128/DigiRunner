public class DoOne implements Command {
	private Request abcReq;

	public DoOne(Request abcReq) {
		this.abcReq = abcReq;
	}

	public void execute() {
		abcReq.One();
	}
}
