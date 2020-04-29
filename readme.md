# Spring Vault Demo
A simple implementation of spring vault to enable access of key value pairs form the vault.

## How To
Download vault cli 
- Start vault server
    - either from hashicorps own site: https://www.vaultproject.io/
    - or use homebrew on MacOS ```brew install vault```
    
 ```vault server -dev -dev-root-token-id=12345```
 
 - Add key value pair 
 
 ```vault kv put secret/spring-vault-demo username="testname" password="testpassword"```
 
 - if you change the token, update application.properties file with the new token value
 
 ## How it works
 With the spring-vault package, you will be able to configure spring to fetch key-value pairs from the vault server, and inject it in run time to handle different run-time requirements. 
 
 By initializing the server with a root token, you can place the root token in a environment variable for the spring application to connect to the vault server. 
 
 So if you place the vault server on a private subnet, and only allow connection on port 80 from the private subnet where the springboot application runs, you should in theory be able to secure the credentials on the spring vault subnet server. In case your app server gets comprimised, it will only leak the credentials to the spring vault, which is secured on its on server. 
