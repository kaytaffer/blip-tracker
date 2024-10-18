#!/usr/bin/env bash

echo "Compiling and running Bliptracker application"
echo "Make sure that your data server is running on localhost:5463 before running this application."

javac -d bin -sourcepath src -cp bin src/bliptracker/*.java src/bliptracker/controller/*.java src/bliptracker/integration/*.java src/bliptracker/model/*.java src/bliptracker/view/*.java && java -cp bin bliptracker.Bliptracker

