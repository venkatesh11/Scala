object Linearsearch
{
	def main(args : Array[String]): Unit =
	{
		var size = scala.io.StdIn.readInt()

		var arr = new Array[Int](size)

		for(x <- 0 until size)
		{
			arr(x) = scala.io.StdIn.readInt()
		}

		println("Enter  a value to find :")

		var find = scala.io.StdIn.readInt()

		for(z <- arr)
		{
			if(find == z)
			{
				println("yes")
			}
		}
	}
}