import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<Command> comList = new ArrayList<Command>();

	public Command commandResolver(String query) {
		
	}

	public void serveCommand(Command command) {
		comList.add(command);
	}

	public void collectCommand(Command command, int num) {
		command.execute(num);
	}
}
