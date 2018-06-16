package filedeployer.services;

import org.springframework.context.annotation.*;
import com.amazonaws.auth.AWSCredentialsProvider;
import org.springframework.beans.factory.annotation.Value;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;

@Configuration
@Profile("docker")
public class CredProviderDocker implements CredProvider {

  @Bean
  public AWSCredentialsProvider credProvider() {
    return new EnvironmentVariableCredentialsProvider();
  }
}
