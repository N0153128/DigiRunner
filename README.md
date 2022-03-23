# Alt.net - hackable game
Alt.net is a netrunning CLI game made for fun. It combines cryptocurrency concept and adds networking features in order to let people compete, communicate and build communities. Alt.net is a game that offers fully hackable client and a semi-closed-source server, that will be core of the game. The main goals of a netrunner, is to collect artifacts that can be found within the grid, collect as much Neon as possible and to climb up the leaderboard as high as possible, using their own coding and reverse engineering skills. Alt.net incorporates some features of oldschool BBSs. Unlike Bitcoin, Etherium or other cryptocurrencies - Alt.net uses relatively easy "mining operations" that does not involve blockchain. Ideally, instead of loading CPU with unnecessary, useless operations, the miner would use relatively useful operations. Apparently, I'm too dum-dum to come up with something that can be useful. Hoping to find something out in the future.

However, the project is still in development.

### Implemented
- ``Atom.hexer()`` base mining method, by default takes ``init`` parameter that defines the amount of "blocks" to be mined. Uses alternative arguments for boosts, penalties and other modifiers.
- ``Atom.benchMine()`` simple benchmarking method that demonstrates machine's capabilities. Runs ``Atom.hexer(64)`` without any additional mods.

> Implemented mods
> Divider - decreases scope of each block's value - positive ==Done==
> Multiplier - increases scope of each block's value - negative ==Done==
> Delay - increases block size ==Done==
> Accelerate - decreases block size ==Done==

### To be implemented
- More mods
- ASCII-styled intro screen
- networking capabilities

### Side notes
- If a number is greater than 0 - it acts as a multiplier
- If a number is lower than 0 - it acts as a divider
> In other words, < = > and > = < (Less is more and more is less)


Lol i should do this a bit more often...

### Glossary
- Alt - You, me, we, they, users, admins, maintainers. Everyone is an alternative to each other. This term defines users of the Alt.net.
- Block - Unit resource gathered through mining process.
- Tab - Units contained inside blocks.
- Cell - Next evolution of Blocks (tba).
- Mod - Modification, used to ease, complicate or alter mining process.
- Board - Leaderboard of the most productive Alts.
- Hack - Alternative Alt.net client, compatible with the mainframe.
- Mainframe - Main server of the Alt.net, that does everything from validation of user data and cell management to communication between Alts.
- Scene - Introduction screen of the client.