object Main extends App {
	// Help
	println("This app calculates the minimum scalar product of two vectors")
	println("Please enter the size of the vectors")
  	
  	// Read input
  	val size = readInt()
	val input1 = Console.readLine
  	val input2 = Console.readLine
	
  	// STEP BY STEP
  	// split the input
	val stringVector1 = input1.split(" ")
	val stringVector2 = input2.split(" ")
	
	// Convert to array[Int]
	val vector1 = input1.split(" ").map(_.toInt)
	val vector2 = input2.split(" ").map(_.toInt)

	// Combine vectors
	val vector = vector1.zip(vector2)
	
	// Do the calculation
	val result = vector.foldLeft(0) { (total, n) => total + n._1*n._2}	
	
	// Print the result
	println("result = " + result)
	
	
	// READABLE
	val vector3 = input1.split(" ").map(_.toInt)
	val vector4 = input2.split(" ").map(_.toInt)
	val vector5 = vector3.zip(vector4)
	println("result = " + vector.foldLeft(0) { (total, n) => total + n._1*n._2})
	

	// SINGLE LINE
	println("result = " 
	    + input1.split(" ").map(_.toInt)
	    .zip(input2.split(" ").map(_.toInt))
	    .foldLeft(0) { (total, n) => total + n._1*n._2})


	    
	// NOW THE PERMUTATIONS
	println
	println("Available permutations of the first vector")
	for (permutation <- vector1.permutations) {
	  println("Permutation ")
	  print("vector 1: ")
	  permutation.map({p => print(p + " ")})
	  println
	  print("vector 2: ")
	  vector2.map({p => print(p + " ")})
	  println
	  println("Scalar Product = " + scalarProduct(permutation, vector2))
	  println
	}
	    
	def scalarProduct(vector1 : Array[Int], vector2: Array[Int] ) : Int = {
	  vector1
	    .zip(vector2)
	    .foldLeft(0) { (total, n) => total + n._1*n._2}
	}
}