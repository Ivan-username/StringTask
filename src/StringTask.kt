package ten_to_16

import java.util.*


fun main(){
    val scan = Scanner(System.`in`)
    println("Введите исходную строку") // kkk:-)jnkjhkkjh:-khkhg:-)))))nmnbm:-(
    val stringInput = scan.nextLine()
    val mSet = mutableSetOf<Int>()
    for (i in stringInput.withIndex()){
        if (i.index >= 3){
            if (stringInput[i.index - 2].toString() + stringInput[i.index - 1].toString() + i.value.toString() == ":-)")
            {
                mSet.add(i.index - 2)
                mSet.add(i.index - 1)
                mSet.add(i.index)
                for (j in i.index until stringInput.length){
                    if (stringInput[j] == ')'){
                        mSet.add(j)
                    } else {
                        break
                    }
                }
            }
            if (stringInput[i.index - 2].toString() + stringInput[i.index - 1].toString() + i.value.toString() == ":-(")
            {
                mSet.add(i.index - 2)
                mSet.add(i.index - 1)
                mSet.add(i.index)
                for (j in i.index until stringInput.length){
                    if (stringInput[j] == '('){
                        mSet.add(j)
                    } else {
                        break
                    }
                }
            }
        }
    }
    for (i in stringInput.withIndex()){
        if (i.index !in mSet){
            print(i.value)
        }
    }
}