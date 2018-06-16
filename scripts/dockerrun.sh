PATH=${PATH}:/Users/toddflanagan/Library/Python/2.7/bin
AWS_ACCESS_KEY_ID=$(aws --profile api-user configure get aws_access_key_id)
AWS_SECRET_ACCESS_KEY=$(aws --profile api-user configure get aws_secret_access_key)
docker run -p 8090:8090 -t springio/filedeployer
   -e AWS_ACCESS_KEY_ID=$AWS_ACCESS_KEY_ID \
   -e AWS_SECRET_ACCESS_KEY=$AWS_SECRET_ACCESS_KEY
