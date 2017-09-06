package com.mkyong.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.togglz.core.manager.FeatureManager;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
@ConfigurationProperties("server")
public class ServerProperties {

	@Autowired
	private FeatureManager manager;
	
    private String email;
    private List<Cluster> cluster = new ArrayList<>();

    public static class Cluster {
        private String ip;
        private String path;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        @Override
        public String toString() {
            return "Cluster{" +
                    "ip='" + ip + '\'' +
                    ", path='" + path + '\'' +
                    '}';
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cluster> getCluster() {
        return cluster;
    }

    public void setCluster(List<Cluster> cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
    	System.out.println(""+manager.getName());
    	manager.getFeatures();
    	/*if (manager.isActive(FOO)) {
            System.out.println("FOO");
       }
    	if (manager.isActive(BAR)) {
            System.out.println("FOO");
       }*/
        return "ServerProperties{" +
                "email='" + email + '\'' +
                ", cluster=" + cluster +
                '}';
    }
}
