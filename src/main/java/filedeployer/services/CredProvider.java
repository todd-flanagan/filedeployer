package filedeployer.services;

import com.amazonaws.auth.AWSCredentialsProvider;

public interface CredProvider {

  AWSCredentialsProvider credProvider();
}
