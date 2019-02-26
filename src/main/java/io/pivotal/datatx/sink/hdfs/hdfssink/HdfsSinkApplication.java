package io.pivotal.datatx.sink.hdfs.hdfssink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.app.hdfs.sink.HdfsSinkConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(org.springframework.cloud.stream.app.hdfs.sink.HdfsSinkConfiguration.class)
public class HdfsSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfsSinkApplication.class, args);
	}
}
