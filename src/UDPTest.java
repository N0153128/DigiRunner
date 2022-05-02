public class UDPTest {
	Client client;

	@Before
	public void setup() {
		new Net().start();
		client = new Client();
	}

	@Test
	public void snr() {
		String echo = client.sendEcho("Hello suka");
		assertEquals("Hello suka", echo);
		echo = client.sendEcho("Server is oke");
		assertFalse(echo.equals("Hello server"));
	}

	@After
	public void td() {
		client.sendEcho("end");
		client.close();
	}
}
