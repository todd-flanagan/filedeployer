package filedeployer.services;

import org.springframework.context.annotation.*;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@Profile("dev")
public class CredProviderDevelopment implements CredProvider {

  @Value("${aws.user}")
  protected String awsUsername;

  @Bean
  public AWSCredentialsProvider credProvider() {
    return new ProfileCredentialsProvider(awsUsername);
  }
}
