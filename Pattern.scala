object Pattern
{
	def main(args : Array[String]) : Unit =
	{
		var result = search("hello")
		print(result)
	}

	def search(a : Any):Any = 
		a match {
			case 1 => println("one")
			case "two" => println("two")
			case "hello" => println("hello")
			case _ => println("none")	
		}
}