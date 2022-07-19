package HubServer;

public class Master {
	public static void main (String[] args) {
		Command command = new Command();

		Share share = new Share(command);
		share.text = "pizda rulyu...";
		Invoker invoker = new Invoker();
		invoker.serveRequest(share);
	}
}
