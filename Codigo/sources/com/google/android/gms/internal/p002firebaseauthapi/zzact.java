package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ec.d;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import jc.b;
import od.i;
import zb.g;

/* loaded from: classes2.dex */
public final class zzact {
    private Context zza;
    private zzadp zzb;
    private String zzc;
    private final g zzd;
    private boolean zze;
    private String zzf;

    public zzact(Context context, g gVar, String str) {
        this.zze = false;
        this.zza = (Context) s.j(context);
        this.zzd = (g) s.j(gVar);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public zzact(g gVar, String str) {
        this(gVar.m(), gVar, str);
    }

    private static String zza(g gVar) {
        b bVar = FirebaseAuth.getInstance(gVar).u0().get();
        if (bVar == null) {
            return null;
        }
        try {
            d dVar = (d) Tasks.await(bVar.a(false));
            if (dVar.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(dVar.a()));
            }
            return dVar.b();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(g gVar) {
        i iVar = FirebaseAuth.getInstance(gVar).w0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder sb2;
        String str;
        if (this.zze) {
            String str2 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (this.zzb == null) {
            this.zzb = new zzadp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacw.zza());
        uRLConnection.setRequestProperty("X-Client-Version", sb3);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.r().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }
}
