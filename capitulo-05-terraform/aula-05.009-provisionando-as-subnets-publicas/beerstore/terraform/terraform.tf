terraform {
  backend "s3" {
    bucket = "hibicode-terraform-state-sidarta"
    key = "beerstore-curso-online"
    region = "us-east-1"
    profile = "terraform"
  }
}