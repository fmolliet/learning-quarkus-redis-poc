package winty.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.quarkus.redis.client.RedisClient;

@Singleton
public class Repository {
    
    @Inject RedisClient client;
    
    public void set( String user ){
        client.setex("user:"+user,"1", "1000000");
    }
}
