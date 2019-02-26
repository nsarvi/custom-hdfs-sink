# Spring cloud stream - HDFS sink

This is a Spring cloud stream application to listen for the events in kafka topic and writes to configured HDFS directory as text files

# To build

maven clean package

# To Run

Just to test, I've set the flush timeout to 5 ms and rollover of hdfs file to 200 bytes. For production usage, set them to appropriate settings. 

java -jar hdfs-sink-0.0.1-SNAPSHOT.jar --spring.cloud.stream.bindings.input.destination=employeetopic --hdfs.fs-uri=hdfs://sandbox-hdp.hortonworks.com:8020 --hdfs.directory=/tmp/kafka/ --hdfs.flush-timeout=5 --hdfs.rollover=100
