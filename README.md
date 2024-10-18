# Bliptracker
An application that tracks "blips" of three different types on a map. Implemented with Java Swing library.

Connects by way of TCP/IP to a separate Server expected to be hosted locally on port 5463. It expects data delivered in text formatted `ID=<LONG>;X=<INT>;Y=<INT>;TYPE=<INT>`.

## Project Structure
```
src/
└── bliptracker/
    ├── controller/
    │   └── Controller
    ├── integration/
    │   ├── BlipDTO
    │   ├── DataParser
    │   └── DataParserObserver
    ├── model/
    │   ├── BlipLocationModel
    │   └── BlipLocationModelObserver
    ├── view/
    │   ├── InfoPanel
    │   ├── MapPanel
    │   ├── OptionPanel
    │   └── TrackerFrame
    └── Bliptracker (main method)
```

## How to install and run
- Make sure to have java installed on your computer.
- Fork or download the contents of the Github repository at https://github.com/kaytaffer/bliptracker
- Make sure your data server this application should read from is running on localhost:5463. 
- From your terminal/command line, navigate to the directory of the contents, e.g. D:/MyDownloads/bliptracker/.
- (Optional) In this same directory, place a 300 by 300 pixel file called `map.gif` to act as background.
- Enter the command `javac -d bin -sourcepath src -cp bin src/bliptracker/*.java src/bliptracker/controller/*.java src/bliptracker/integration/*.java src/bliptracker/model/*.java src/bliptracker/view/*.java && java -cp bin bliptracker.Bliptracker` or run `bliptracker.sh` to compile and run the application.

