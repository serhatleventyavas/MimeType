package com.serhatleventyavas

import com.serhatleventyavas.mimetype.MimeType
import org.junit.Test
import com.google.common.truth.Truth.assertThat


internal class MimeTypeTest {

    @Test
    fun given_jpeg_extension_return_image_jpeg_mimetype() {
        val result = MimeType.getMimeTypeFromExtension("jpeg")
        assertThat(result).matches("image/jpeg")
    }

    @Test
    fun given_pdf_extension_return_application_pdf_mimetype() {
        val result = MimeType.getMimeTypeFromExtension("pdf")
        assertThat(result).matches("application/pdf")
    }
}