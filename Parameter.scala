object Parameter
{
	def main(args : Array[String])=
	{
		functionExample(25,multiplyBy2)
	}
	def functionExample(a:Int, f:Int => AnyVal):Unit = 
	{
		println(f(a))
	}
	def multiplyBy2(a :Int) :Int =
	{
		a*2
	}
}