package com.georgeeduardtp.cronoautotfgback.payload.request;


import java.util.Set;


public record SignupRequest(String username, String email, String password ,  Set<String> roles) {
   
}
