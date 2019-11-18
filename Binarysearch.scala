
object Binarysearch{


	def search(arr : Array[Int] , l:Int , r:Int, x : Int) : Int =
	{
		if(r >= l)
		{
			var mid = (l + (r-1) )/2

			if(arr(mid) == x)
				return mid

			if(arr(mid) > x)
				return search(arr,l,mid-1,x)
			else
				return search(arr,mid+1,r,x)
		}
		return -1
	}

	def main(args : Array[String]) =
	{
		var arr = Array(54,75,76,80,92)

		var n = arr.length

		var x = 76
		
		var result = search(arr,0,n-1,x)

		if(result == -1)
			println("Not found")
		else
			println("Found value at index : " + result)
			
		
	}



}