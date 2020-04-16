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