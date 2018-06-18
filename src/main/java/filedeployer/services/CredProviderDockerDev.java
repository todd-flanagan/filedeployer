package filedeployer.services;

import org.springframework.context.annotation.*;
import com.amazonaws.auth.AWSCredentialsProvider;
import org.springframework.beans.factory.annotation.Value;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;

@Configuration
@Profile("dockerdev")
public class CredProviderDockerDev implements CredProvider {

  @Bean
  public AWSCredentialsProvider credProvider() {
    return new EnvironmentVariableCredentialsProvider();
  }
}
