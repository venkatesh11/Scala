trait printable
{
	def Print() :Unit
}

trait showable
{
	def Show() : Unit
}

class A extends printable with showable
{
	def Print() : Unit =
	{
		println("hello")
	}

	def Show() : Unit =
	{
		println("Show")
	}

}

object Testrait
{
	def main(args : Array[String]) = 
	{
		var obj = new A()

		obj.Print()
		obj.Show()

	}
}