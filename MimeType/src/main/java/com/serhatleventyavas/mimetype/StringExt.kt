package com.serhatleventyavas.mimetype

fun String.getExtension(): String {
    val path = this
    val pathSplit = path.split(".")
    return MimeType.getMimeTypeFromExtension(pathSplit[pathSplit.size - 1])
}