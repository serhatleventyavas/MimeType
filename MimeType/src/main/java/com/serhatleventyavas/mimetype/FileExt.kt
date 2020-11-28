package com.serhatleventyavas.mimetype

import java.io.File

fun File.getExtension(): String {
    val path = this.path
    val pathSplit = path.split(".")
    return MimeType.getMimeTypeFromExtension(pathSplit[pathSplit.size - 1])
}