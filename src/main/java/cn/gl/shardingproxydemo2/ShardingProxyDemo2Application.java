package cn.gl.shardingproxydemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.gl.shardingproxydemo2.mapper")
public class ShardingProxyDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingProxyDemo2Application.class, args);
    }

}
