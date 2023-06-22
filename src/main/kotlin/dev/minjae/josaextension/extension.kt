package dev.minjae.josaextension // ktlint-disable filename

import com.github.b1uec0in.josaformatter.KoreanUtils

fun Any.josa(vararg args: Any): String {
    val javaArgs = arrayOfNulls<Any>(args.size)
    for (i in args.indices) {
        javaArgs[i] = args[i]
    }
    return KoreanUtils.format(this.toString(), *javaArgs)
}
