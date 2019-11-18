object Anonymous
{
	def main(args : Array[String])  =
	{
		var result1 = (a:Int,b:Int)=>a+b
		var result2= (_:Int) + (_:Int)
		print(result1(10,10))
		print(result2(10,10))

	}
}