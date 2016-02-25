# LeapMotion Proxy - Updated for school project

LeapMotion Proxy is a simple routing web socket server which transfer all message 
receive from local LeapMotion websocket server to a non-localhost locked LeapMotion 
websocket server.

Created by Vincent Saluzzo.
Original - https://github.com/Itelios/LeapMotion-Proxy

Copyright 2013 ITELIOS SAS. All rights reserved.

I used this proxy for a project, and tuned it up a bit to send only relevant frames for our project.

# How to Use

    node leapmotion-proxy
    
By default, the websocket server port is `8889`. If you need to change this port 
you could do this directly in the leapmotion-proxy.js file.

