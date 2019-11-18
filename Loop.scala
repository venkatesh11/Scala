import scala.util.control.Breaks._
object Loop
{
	def main(args : Array[String]) : Unit = 
	{
		var n = scala.io.StdIn.readInt()
		breakable
		{
		for(i<- 1 to n by 2)
		{
			if(i == 7)
			{
				break
			}
			else
			{
				println(i)
			}

		}
	}
	}
}