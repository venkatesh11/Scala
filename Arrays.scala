import scala.collection.mutable.ArrayBuffer
object Arrays
{
	def main(args : Array[String]) : Unit = 
	{
		
		var n = scala.io.StdIn.readInt()

		var arr = new Array[Int](n)

		for(i <- 0 until n)
		{
			arr(i) = scala.io.StdIn.readInt()
		}

		for( x <- arr)
		{
			println(x)
		}
	}
}