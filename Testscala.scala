case class Test(a:Int,b:Int)

object Testscala
{
	def main(args : Array[String]) =
	{
		var obj = Test(10,10)

		println("a" + obj.a)
		println("b" + obj.b)
	}
}