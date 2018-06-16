#!/bin/bash
PATH=${PATH}:/Users/toddflanagan/Library/Python/2.7/bin
AWS_ACCESS_KEY_ID=$(aws --profile api-user configure get aws_access_key_id)
AWS_SECRET_KEY=$(aws --profile api-user configure get aws_secret_access_key)
echo $AWS_ACCESS_KEY_ID
docker run --env AWS_ACCESS_KEY_ID=$AWS_ACCESS_KEY_ID --env AWS_SECRET_ACCESS_KEY=$AWS_SECRET_KEY -it debian 
