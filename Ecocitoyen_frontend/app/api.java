interface api {

        @GET("posts/{id}")
        suspend fun getPostById(@Path("id") postId: Int): Rec

        // Add other API endpoints here



}

