# GolfersStats
The backend of golfers stats
Uses Eclipse Jee 2018-12

1) Create a new empty Workspace in Eclipse
2) Type cmd into Cortana Search and start the command prompt
3) Change directory in command prompt to the new workspace directory
4) Then use the clone command:   git clone https://github.com/MattBell-SA/GolfersStats.git
5) In Eclipse, go to File -> Import and in the Wizard select General/Projects from Folder or Archive.
6) Select all and click Finish.
7) Build and run on Tomcat 8.0 server.
8) Go to http://localhost:8084/GolfersStats/rest/golfer

Json should appear:

[{"golferId":1,"golferTitle":"Mr","golferName":"Sam Newman","golferAddress":"22 Waterfall Gully","golferHomeCourse":"Royal Adelaide"},{"golferId":2,"golferTitle":"Mr","golferName":"Barry Newman","golferAddress":"666 Waterford Court","golferHomeCourse":"North Adelaide"},{"golferId":3,"golferTitle":"Mrs","golferName":"Annika Sorenstam","golferAddress":"Sandiago","golferHomeCourse":"Hollywood Golf Course"},{"golferId":4,"golferTitle":"Mrs","golferName":"Annika Sorenstam","golferAddress":"Sandiago","golferHomeCourse":"Hollywood Golf Course"},{"golferId":8,"golferTitle":"Mr","golferName":"Tiger Woods","golferAddress":"Los Angeles","golferHomeCourse":"Royal Los Angeles "},{"golferId":9,"golferTitle":"Mr","golferName":"Phil Mickelson","golferAddress":"New York","golferHomeCourse":"Royal New York"},{"golferId":10,"golferTitle":"Mr","golferName":"Phil Mickelson","golferAddress":"New York","golferHomeCourse":"Royal New York"},{"golferId":7,"golferTitle":"Mr","golferName":"Ted William","golferAddress":"Adelaide","golferHomeCourse":"Kooyonga Golf course"}]
