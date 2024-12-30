package com.example.Kotlin_The_While





fun main( ) {

 	println("Task 1 ")
 	fun factorial(num: Int): Int {
 		while (num > 1) {
 			num * factorial(num - 1)
 		}
 		return 1
 	}
 	println("Enter an integer number: ")
 	val num = readLine()!!.toInt()
 	val result = factorial(num)
    println("$num  is $result")

 	println("  ")
 	println("Task 2 ")
  	println("Enter an integer number 1 to display the entire list of prices starting from 1 kg: ")
 	var f = readLine()!!.toInt()// <<< Инициализация
 	val x = 200
 	while(f <= 10) {
 	println("Price pay for $f kg: " + (x * f++))}


  	println("  ")
  	println("Task 3 ")
 	println("Enter A: ")
	var A = readLine()!!.toInt()
	println("Enter B>A: ")
	var B = readLine()!!.toInt()
	var a = 1
    while (a in A.. B ) println(a++)

 	println("  ")
 	println("Task 4 ")
	println("Enter int number: ")
	val n  = readLine()!!.toInt()
	while (n  != 0  )  {
	println(n  % 10)
	println(n /10)
	break
	}


	println("  ")
 	println("Task 5 ")

	var counter = 1
	while (counter <= 20) {
		if (counter % 2 == 0)
			println("counter is $counter")
		counter += 1
	}
	var counter2 = 1
	while (counter2 <= 20) {
		if (counter2 % 4 == 0)
			println("counter is " + counter2 * 2)
		counter2 += 1
	}

	var counter3 = 1
	while (counter3 <= 20) {
		if (counter3 == 19)
			break
			println( "counter is " + counter3)
		counter3 += 1
	}
	println("  ")
 	println("Task 6 ")
	val   sum =  350000.0
    var sum2 = 0.0
	var i = 9



	while (i > 0){
		val s = sum * 0.07
    	sum2 += sum  + s
		i--
	}
	println("The final amount of the deposit, including interest accrual for each month  $sum2")


}




























