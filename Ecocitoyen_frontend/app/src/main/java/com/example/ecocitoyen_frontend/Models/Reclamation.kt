package com.example.ecocitoyen_frontend.Models

import java.io.DataOutputStream
import java.net.HttpURLConnection
import java.net.URL

data class Reclamation(
    var id: Int,
    var title: String,
    var type: String,
    var description: String,
    var id_user: Int
) {

    override fun toString(): String {
        return "Reclamation(id=$id, title='$title', type='$type', description='$description')"
    }

    fun sendToServer() {
        val url = URL("https://your-server-endpoint.com/create_reclamation")
        val connection = url.openConnection() as HttpURLConnection

        try {
            connection.requestMethod = "POST"
            connection.setRequestProperty("Content-Type", "application/json; charset=utf-8")
            connection.doOutput = true

            val jsonReclamation = """
                {
                    "id": $id,
                    "title": "$title",
                    "type": "$type",
                    "description": "$description",
                    "id_user": $id_user
                }
            """.trimIndent()

            val outputStream = DataOutputStream(connection.outputStream)
            outputStream.write(jsonReclamation.toByteArray(Charsets.UTF_8))
            outputStream.flush()
            outputStream.close()

            // Check the server response
            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Successfully sent the reclamation data
            } else {
                // Handle the error
            }
        } finally {
            connection.disconnect()
        }
    }
}


