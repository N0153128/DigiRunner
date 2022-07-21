# Alt.net - hackable game

### Implemented
- ``Atom.hexer()`` base mining method, by default takes ``init`` parameter that defines the amount of "blocks" to be mined. Uses alternative arguments for boosts, penalties and other modifiers.
- ``Atom.benchMine()`` simple benchmarking method that demonstrates machine's capabilities. Runs ``Atom.hexer(64)`` without any additional mods.

> Implemented mods
> Divider - decreases scope of each block's value - positive ==Done==
> Multiplier - increases scope of each block's value - negative ==Done==
> Delay - increases block size ==Done==
> Accelerate - decreases block size ==Done==
> Net: Magnet - increases the amount of tabs in a block at a cost of other user's tabs, makinng them less valuable.
> Net:Decay - decreases the amount of tabs in a block, populating other users' blocks with new tabs.

### To be implemented
- More mods
- ANSI-styled intro screen
- networking capabilities
- client-side leaderboard
- rules command
- storage support

### Side notes
>Temporary list of parameters for the Server.requestResolver()
>A String refers to the parameter.
>- "socket" = DatagramSocket
>- "packet" = DatagramPacket
>- "message" = String - message text
>- "command" = String encoded message - reserved for user commands

> Invoker#requestResolver must be rewritten in the future without if-else statements.


#### network
Alt.net will be using public STUN/TURN servers in order to enable client/server and p2p connection, which will make an IP of the user publicly accessible.

All data must be sent in one packet per iteration. Maximum packet size for the UDP implementation is 8192 bytes, this value can be altered, but should not exceed 8192.

Lol i should do this a bit more often...

### Glossary
- Alt - You, me, we, they, users, admins, maintainers. Everyone is an alternative to each other. This term defines users of the Alt.net.
- Block - Unit resource gathered through mining process.
- Tab - Units contained inside blocks.
- Cell - Next evolution of Blocks (tba).
- Mod - Modification, used to ease, complicate or alter mining process.
- Board - Leaderboard of the most productive Alts.
- Hack - Alternative Alt.net client, compatible with the mainframe.
- Mainframe, master-server - Main server of the Alt.net, that does everything from validation of user data and cell management to communication between Alts.
- Scene - Introduction screen of the client.
- Hub - A representation of a single node that connects several Homes.
- Home - A hardware representation of a single user node that serves as an entry point to the network for other Alts.

### News and updates
- *25.04.2022* Robot class now has all features of the Atom class with improved hierarchy and Effective Builder Pattern implementation. Atom class becomes deprecated.
- *30.05.2022* Added abstract UDP client and server, added auto-port selection for the client, added Fetcher daemon for the client, added shortcuts, for easy input parsing. 

### API (kinda)
*Robot getters*
- `Robot.getInit()`  returns Init parameter if specified.
- `Robot.getDivider()` returns Divider parameter if specified.
- `Robot.getMultiplier()`returns Multiplier parameter if specified.
- `Robot.getDelay()`returns Delay parameter if specified.
- `Robot.getAccel()`returns Accel parameter if specified.

### Commit messages
- README changes - README.md File was changed
- Playground changes - code that contains experimental features