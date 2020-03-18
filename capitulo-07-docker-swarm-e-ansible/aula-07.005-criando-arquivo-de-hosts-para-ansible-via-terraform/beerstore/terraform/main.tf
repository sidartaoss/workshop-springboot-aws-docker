provider "aws" {
  version = "~> 2.4"
  shared_credentials_file = "%userprofile%\\.aws\\credentials"
  profile = "terraform"
  region = "us-east-1"
}