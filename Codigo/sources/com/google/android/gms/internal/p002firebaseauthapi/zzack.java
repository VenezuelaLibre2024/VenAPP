package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import ee.b;
import ga.a;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public interface zzack {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, b<jc.b> bVar);

    void zza(String str, Status status);
}
