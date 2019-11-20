

object Solution {



    def main(args : Array[String])
    {


     var nd = scala.io.StdIn.readLine.split(" ")
      
     var n  = nd(0).toInt
     var d = nd(1).toInt

     var arr = new Array[Int](n)

     arr = scala.io.StdIn.readLine.split(" ").map(_.trim.toInt)

     for(i <- 1 to d by 1)
     {
       for(j <- 0 until n-1 by 1)
       {

         var temp = arr(j)
         arr(j) = arr(j+1)
         arr(j+1) = temp
         }
      }

    arr.foreach((x : Int) => print(x + " "))   
    }   
}

