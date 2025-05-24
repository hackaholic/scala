object testStringTwo {
    def main(args: Array[String]) = {
        val email = "(.+)@(.+)".r

        val input = "user@hackaholic.com"

        for (x <- email.findAllIn((input))) println(x)

        input match {
            case email(user, domain) =>  println(s"User: $user, Domain: $domain")
            case _ => println("Not an email")
        }
    }
}