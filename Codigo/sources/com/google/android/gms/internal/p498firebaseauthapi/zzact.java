package com.google.android.gms.internal.p498firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import ec.AbstractC7174d;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p180jc.InterfaceC9036b;
import p273od.InterfaceC9919i;
import p485zb.C12867g;

/* loaded from: classes2.dex */
public final class zzact {
    private Context zza;
    private zzadp zzb;
    private String zzc;
    private final C12867g zzd;
    private boolean zze;
    private String zzf;

    public zzact(Context context, C12867g c12867g, String str) {
        this.zze = false;
        this.zza = (Context) C5276s.m13324j(context);
        this.zzd = (C12867g) C5276s.m13324j(c12867g);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public zzact(C12867g c12867g, String str) {
        this(c12867g.m42630m(), c12867g, str);
    }

    private static String zza(C12867g c12867g) {
        InterfaceC9036b interfaceC9036b = FirebaseAuth.getInstance(c12867g).m16416u0().get();
        if (interfaceC9036b == null) {
            return null;
        }
        try {
            AbstractC7174d abstractC7174d = (AbstractC7174d) Tasks.await(interfaceC9036b.mo23457a(false));
            if (abstractC7174d.mo21369a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC7174d.mo21369a()));
            }
            return abstractC7174d.mo21370b();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(C12867g c12867g) {
        InterfaceC9919i interfaceC9919i = FirebaseAuth.getInstance(c12867g).m16420w0().get();
        if (interfaceC9919i != null) {
            try {
                return (String) Tasks.await(interfaceC9919i.mo29636a());
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
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.m42632r().m42644c());
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
