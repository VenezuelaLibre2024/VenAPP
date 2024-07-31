package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import ee.InterfaceC7183b;
import ga.C7533a;
import java.net.HttpURLConnection;
import java.net.URL;
import p180jc.InterfaceC9036b;

/* loaded from: classes2.dex */
public interface zzack {
    public static final C7533a zza = new C7533a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC7183b<InterfaceC9036b> interfaceC7183b);

    void zza(String str, Status status);
}
