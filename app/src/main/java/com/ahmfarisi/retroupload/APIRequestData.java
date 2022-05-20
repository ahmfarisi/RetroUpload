package com.ahmfarisi.retroupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface APIRequestData {

    @Multipart
    @POST("upload.php")
    Call<RequestBody> uploadGambar(@Part MultipartBody.Part body);
}
