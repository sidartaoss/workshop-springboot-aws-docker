resource "aws_instance" "instances" {

  count = 3

  ami = "ami-0de53d8956e8dcf80"
  instance_type = "t2.micro"

  subnet_id = "${element(aws_subnet.public_subnet.*.id, count.index)}"

  tags {
    Name = "hibicode_instances"
  }
}