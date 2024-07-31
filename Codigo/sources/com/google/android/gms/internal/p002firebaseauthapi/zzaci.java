package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.auth.FirebaseAuth;
import ga.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import oc.q;
import zb.g;

/* loaded from: classes2.dex */
public final class zzaci extends AsyncTask<Void, Void, zzach> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzack> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final g zzg;

    public zzaci(String str, String str2, Intent intent, g gVar, zzack zzackVar) {
        this.zzb = s.f(str);
        this.zzg = (g) s.j(gVar);
        s.f(str2);
        s.j(intent);
        String f10 = s.f(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzackVar.zza(f10)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(Constants.KEY, f10).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) s.j(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzackVar);
        this.zze = zzackVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final zzach doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzack zzackVar = this.zzd.get();
            HttpURLConnection zza2 = zzackVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzact(zzackVar.zza(), this.zzg, zzacr.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzach.zzb(zza3);
            }
            zzafi zzafiVar = new zzafi();
            zzafiVar.zza(new String(zza(zza2.getInputStream(), RecognitionOptions.ITF)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzafiVar.zza().contains(this.zzf) ? zzach.zzb("UNAUTHORIZED_DOMAIN") : zzach.zza(this.zzf);
            }
            for (String str : zzafiVar.zza()) {
                if (zza(str)) {
                    return zzach.zza(str);
                }
            }
            return null;
        } catch (zzaaf e10) {
            zza.c("ConversionException encountered: " + e10.getMessage(), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c("IOException occurred: " + e11.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c("Null pointer encountered: " + e12.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzacq.zza(new String(zza(errorStream, RecognitionOptions.ITF)), String.class);
            }
            return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e10) {
            zza.h("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e10), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(zzach zzachVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzack zzackVar = this.zzd.get();
        if (zzachVar != null) {
            str = zzachVar.zza();
            str2 = zzachVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzackVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str) || (builder = this.zze) == null) {
            zzackVar.zza(this.zzb, q.a(str2));
        } else {
            builder.authority(str);
            zzackVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).u0());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[RecognitionOptions.ITF];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzach zzachVar) {
        onPostExecute((zzach) null);
    }
}
