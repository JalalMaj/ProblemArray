import kotlin.coroutines.ContinuationInterceptor

fun main(args: Array<String>) {

    var queries = listOf<String>("ab","ed","cd","ab","fe","bc","bc","ef","ab")
    var strings = listOf<String>("ab","bc","ab","ef")

    var queries1 = arrayOf("ab","ed","cd","ab","fe","bc","bc","ef","ab")
    var strings1 = arrayOf("ab","bc","ab","ef")

    matchesArray(strings,queries)
    matchingStrings(strings1,queries1)
    matchingStrings1(strings1,queries1)

}

fun matchesArray (queries: List<String>, strings: List<String>){
    var count = 0
    var assP = 0
    var results = mutableListOf<Int>()

    for ((i, v) in strings.withIndex()) {

        for(j in queries){
            if(j== v){
                count =count +1
            }

        }
        assP=count
        count =0
        results.add(assP)
    }
    println(results)
}

fun matchingStrings(strings: Array<String>, queries: Array<String>) {
    var count = 0
    var assP = 0
    var results = mutableListOf<Int>()
    for ((i, v) in queries.withIndex()) {

        for(j in strings){
            if(j== v){
                count =count +1
            }

        }
        assP=count
        count =0
        results.add(assP)
    }
    println(results)
}

//int start=0;
//int end = arr1.length;
//int temp;
//while(start<end) {
//    temp=arr1[start];
//    arr1[start]=arr1[end];
//    arr1[end]=temp;
//    start++;
//    end--;


fun matchingStrings1(strings: Array<String>, queries: Array<String>) {

    var count = 0
    var assP = 0
    var results = arrayOf<Int>()
    var start = 0
    var end = results.size

    for ((i, v) in queries.withIndex()) {


        for(j in strings){
            if(j== v){
                count =count +1
            }

        }
        assP=count
        count =0
        results =results.plus(assP)


    }

    println(results.contentToString())

}


//        while (start<=end){
//            results[start]=assP
//            assP = results[end]
//            results[end] =results[start]
//            end--
//            start++
//
//        }
