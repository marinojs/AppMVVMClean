package com.example.appmvvm


import java.util.Locale
import java.util.Random
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val countriesList = listOf("Venezuela", "Colombia", "Ecuador", "Peru", "Chile", "Uruguay")
val languagesList = listOf("Java", "Koltin", "C#", " C++", "Ruby", "Go")

fun main() {
    flows()
}

fun flows() {
    // coldFlow()
    // cancelFlow()
    //   flowsOperators()
    //  flowsWithFilter()
    //take is another operator that help us to get a limited flow list, for example
    // flowWithTransform()
    //  flowWithListOperator()
    //channels()
    pipelines()

}

fun pipelines() {
    runBlocking {
        println("Working with pipelines")
        val countries = getCountries()
        val languages = getLanguages(countries)
        val anyNumber = getNumber()

        //consuming new channels

        while (!anyNumber.isClosedForReceive) {
            anyNumber.consumeEach {
                println(it)
            }
        }
        /*      anyNumber.consumeEach {
                  println(it)
              }*/

        languages.consumeEach {
            println(it)
        }
        anyNumber.cancel()
        languages.cancel()
        countries.cancel()
        println("Finishing all the flows!")
    }
}

fun CoroutineScope.getNumber(): ReceiveChannel<String> = produce {
    (0 until 50).forEach {
        send("number is $it")
    }
}

fun CoroutineScope.getCountries(): ReceiveChannel<String> = produce {
    countriesList.forEach {
        send(it)
    }
}

fun CoroutineScope.getLanguages(countries: ReceiveChannel<String>): ReceiveChannel<String> =
    produce {
        countries.consumeEach { country ->
            val language = when (country) {
                "Venezuela" -> "Java"
                "Colombia" -> "Kotlin"
                "Ecuador" -> "C#"
                "Peru" -> "C++"
                "Chile" -> "Ruby"
                "Uruguay" -> "Go"
                else -> "Not data Found"
            }
            send("This Language $language belongs to this  $country")
        }
    }

fun channels() {
    // basicChannels()
}

fun basicChannels() {
    runBlocking {
        println("Basic Channel")
        val channel = Channel<String>()
        launch {
            countriesList.forEach {
                channel.send(it)
                /*  if (it == "Ecuador") {
                      channel.cancel()
                      return@launch
                  }*/
            }
            channel.cancel()
        }
        /*  channel.consumeEach {
              println(it)
          }*/

        while (!channel.isClosedForReceive) {
            println(channel.receive())
        }
        /* repeat(5){
             println(channel.receive())
         }*/
        /* for (countries in channel){
             println(countries)
         }*/
    }
}

fun flowWithTransform() {
    println("working flows with transform operators")
    runBlocking {
        launch {
            getDataByFlow()
                .transform {
                    emit(it)
                    emit(it * 2)
                }
                .collect {
                    println("this is the current transform result $it")
                }


        }
    }

}

fun flowWithListOperator() {
    println("working flows with ListOperator ")
    runBlocking {
        val result = getDataByFlow().toList()
        println(result)
    }

}

fun flowsWithFilter() {
    println("working flows with filters operators")
    runBlocking {
        val job = launch(Dispatchers.IO) {
            getDataByFlow()
                .filter {
                    it > 46
                }
                .collect {
                    println("this is the current result $it")
                }
        }
    }
}

fun flowsOperators() {
    println("working flow with map operator")
    runBlocking {
        launch {
            getDataByFlow()
                .map {
                    convertResultToString(it)
                }
                .collect {
                    println(it)
                }
        }
    }
}

fun convertResultToString(temp: Float): String =
    String.format(Locale.getDefault(), "%.2f ª", temp)

fun cancelFlow() {
    //flow are cancelled with their coroutine's cancellation
    runBlocking {
        val job = launch {
            getDataByFlow().collect {
                println("is : $it")
            }
        }
        delay(3000L)
        job.cancel()
    }
}

fun coldFlow() {
    println("FLOWS ARE COLD")
    //this above means a code block doesnt get execute their method intern until the collects methods is triggered
    runBlocking {
        val dataFlow = getDataByFlow()
        println("Procesando")
        delay(3000L)
        dataFlow.collect {
            println("datos : $it")
        }
    }

}

fun getDataByFlow(): kotlinx.coroutines.flow.Flow<Float> {
    return flow {
        (1..5).forEach {
            println("procesando Datos")
            delay(2000L)
            emit(20 + it + kotlin.random.Random.nextFloat())
        }
    }

}
