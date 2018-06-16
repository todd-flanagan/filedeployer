package filedeployer.services;

import org.springframework.context.annotation.*;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import org.springframework.beans.factory.annotation.Value;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;

@Configuration
@Profile("docker")
public class CredProviderDocker {

  @Bean
  AWSCredentialsProvider credProvider() {
    return new EnvironmentVariableCredentialsProvider();
  }
}
