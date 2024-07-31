package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzd;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    private final Object f9084a = new Object();

    /* renamed from: b */
    private String f9085b = "";

    /* renamed from: c */
    private String f9086c = "";

    /* renamed from: d */
    private boolean f9087d = false;

    /* renamed from: e */
    private boolean f9088e = false;

    /* renamed from: f */
    protected String f9089f = "";

    /* renamed from: g */
    private zzdzd f9090g;

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String o(Context context, String str, String str2) {
        String valueOf;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.t.r().E(context, str2));
        com.google.common.util.concurrent.f b10 = new s0(context).b(0, str, hashMap, null);
        try {
            return (String) b10.get(((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeG)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            valueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            zzcec.zzh(str3.concat(valueOf), e);
            b10.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            e = e11;
            valueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            zzcec.zzh(str3.concat(valueOf), e);
            b10.cancel(true);
            return null;
        } catch (Exception e12) {
            zzcec.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    private final Uri p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f9084a) {
            if (TextUtils.isEmpty(this.f9085b)) {
                com.google.android.gms.ads.internal.t.r();
                try {
                    str5 = new String(la.l.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzcec.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.f9085b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.t.r();
                    this.f9085b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.t.r();
                    String str6 = this.f9085b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        zzcec.zzh("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f9085b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzdzd a() {
        return this.f9090g;
    }

    public final String b() {
        String str;
        synchronized (this.f9084a) {
            str = this.f9086c;
        }
        return str;
    }

    public final void c(Context context) {
        zzdzd zzdzdVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue() || (zzdzdVar = this.f9090g) == null) {
            return;
        }
        zzdzdVar.zzh(new w(this, context), zzdzc.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.t.r();
        j2.t(context, p(context, (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeC), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeF), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.t.r();
        j2.k(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z10) {
        synchronized (this.f9084a) {
            this.f9088e = z10;
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue()) {
                com.google.android.gms.ads.internal.t.q().zzi().zzB(z10);
                zzdzd zzdzdVar = this.f9090g;
                if (zzdzdVar != null) {
                    zzdzdVar.zzk(z10);
                }
            }
        }
    }

    public final void g(zzdzd zzdzdVar) {
        this.f9090g = zzdzdVar;
    }

    public final void h(boolean z10) {
        synchronized (this.f9084a) {
            this.f9087d = z10;
        }
    }

    public final void i(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            j2.f8993l.post(new y(this, context, str, z10, z11));
        } else {
            zzcec.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String o10 = o(context, p(context, (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeE), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o10)) {
            zzcec.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o10.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzjc)).booleanValue()) {
                w1 zzi = com.google.android.gms.ads.internal.t.q().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzA(str);
            }
            return equals;
        } catch (JSONException e10) {
            zzcec.zzk("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzeD
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.zzcec.zze(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.f9089f = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbfu r6 = com.google.android.gms.internal.ads.zzbgc.zzjc     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zza(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f9089f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f9089f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r0
            goto L67
        L66:
            r6 = r1
        L67:
            r3.f(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.t.q()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.w1 r2 = r2.zzi()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzA(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.f9084a
            monitor-enter(r5)
            r3.f9086c = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.zzcec.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.z.k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f9084a) {
            z10 = this.f9088e;
        }
        return z10;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f9084a) {
            z10 = this.f9087d;
        }
        return z10;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        zzcec.zze("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
