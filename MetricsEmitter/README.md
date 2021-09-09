## Building & Running

### Build multi-stage docker build. 
``` bash
docker build  -t rmpaul/metrics-emitter .
```

### Build with Docker Compose file
``` bash
docker-compose build 
```

### Running via Docker CLI - Run app on port 5000 in detached mode. 
``` bash
docker run -d -p 5000:7777 rmpaul/metrics-emitter
```