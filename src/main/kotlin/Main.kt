fun main(){
 println("Hello")
    println("Prueba de multiplicacion paso? :" + testProduct())
    println("Prueba de sumarProducts paso? :" + testSumaTotal())

//llamado a todas las funciones tests
}

fun product (coefficient: Int, digit: Int): Int{
 val multiplicacion= coefficient * digit

    if(multiplicacion > 9){
        return multiplicacion - 9
    }else{
        return multiplicacion
    }
// recibe dos parametros y obtiene el resultado.
// esta funcion devuelve el resultado, si este resultado es mayor a 9 se le resta 9
}

val array = arrayListOf<Int>(0,1,5,0,6,8,2,3,3)

fun sumProducts (array: ArrayList<Int>): Int{


    var resultado = 0
    for ((i, v) in array.withIndex()) {

        if(i % 2 == 0){
            resultado = resultado + product(v,2)
        }else{
            resultado = resultado + product(v,1)
        }
    }
    return resultado
// recibe un array tipo Int de nueve elementos y recorre cada uno de los elementos
// en cada iteracion llama a la funcion product  y almacena los resultados en una variable
// Considerar que la funcion product requiere un coeficiente que es 2 el indice es par y 1 si es impar.
// Sumar cada resultado que devuelve product y guardarlo en una variable
// al final devuelve la variable que contiene la suma
}

fun differenceOfTen (number: Int): Int {

    val residuo= number / 10

    if(residuo == 0){
        return 0
    }else{
        return 10 - residuo
    }

// esta funcion recibe un parametro que se divide para 10 y se obtiene el residuo
// Si el residuo es 0 se devuelve 0
// Si el residuo es diferente de 0 se devuelve la diferencia con 10.
}

fun IsValidNuiNumber (nui:String): Boolean {
 val nui = "0150682334"
 val array = arrayOf(0,1,5,0,6,8,2,3,3)
 val lastDigit = 4

 val resultado = sumProducts(array)

 val difference = differenceOfTen(resultado)

 return (difference == lastDigit)
// Esta funcion recibe un String con los 10 digitos de un numero de cedula.
// Separa los 9 primero digitos y los almacena en un array de enteros. El decimo digito lo almacena en una variable
// Llama a la funcion sumProducts y le pasa el array de los 9 primeros digitos
// Llama a la funcion differenceOfTen y le pasa el valor devuelto por la funcion sumProducts
// Compara el valor devuelto de la funcion differenceOfTen con el decimo digito, si son iguales devuelve true, caso contrario devuelve false
}



// T E S T S //

fun testProduct(): Boolean{
    val res=product(2,6)
    val esp= 3
    return (res == esp)
}

fun testSumaTotal(): Boolean{
    val esp= 26
    return (sumProducts(array) == esp)
}

