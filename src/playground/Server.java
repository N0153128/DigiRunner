import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<Command> comList = new ArrayList<Command>();

	public void serveCommand(Command command) {
		comList.add(command);
	}

	public void collectCommand() {
		for(Command command : comList) {
			command.execute();
		}
		comList.clear();
	}
}
