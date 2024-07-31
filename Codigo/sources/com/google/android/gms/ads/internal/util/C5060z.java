package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import la.C9467l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.z */
/* loaded from: classes.dex */
public final class C5060z {

    /* renamed from: a */
    private final Object f10183a = new Object();

    /* renamed from: b */
    private String f10184b = "";

    /* renamed from: c */
    private String f10185c = "";

    /* renamed from: d */
    private boolean f10186d = false;

    /* renamed from: e */
    private boolean f10187e = false;

    /* renamed from: f */
    protected String f10188f = "";

    /* renamed from: g */
    private zzdzd f10189g;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    protected static final String m12780o(Context context, String str, String str2) {
        String valueOf;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C4965t.m12581r().m12689E(context, str2));
        InterfaceFutureC5920f m12716b = new C5039s0(context).m12716b(0, str, hashMap, null);
        try {
            return (String) m12716b.get(((Integer) C4784a0.m12365c().zza(zzbgc.zzeG)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            valueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            zzcec.zzh(str3.concat(valueOf), e);
            m12716b.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            e = e11;
            valueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            zzcec.zzh(str3.concat(valueOf), e);
            m12716b.cancel(true);
            return null;
        } catch (Exception e12) {
            zzcec.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    /* renamed from: p */
    private final Uri m12781p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f10183a) {
            if (TextUtils.isEmpty(this.f10184b)) {
                C4965t.m12581r();
                try {
                    str5 = new String(C9467l.m28160d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzcec.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.f10184b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C4965t.m12581r();
                    this.f10184b = UUID.randomUUID().toString();
                    C4965t.m12581r();
                    String str6 = this.f10184b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e10) {
                        zzcec.zzh("Error writing to file in internal storage.", e10);
                    }
                }
            }
            str4 = this.f10184b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    public final zzdzd m12782a() {
        return this.f10189g;
    }

    /* renamed from: b */
    public final String m12783b() {
        String str;
        synchronized (this.f10183a) {
            str = this.f10185c;
        }
        return str;
    }

    /* renamed from: c */
    public final void m12784c(Context context) {
        zzdzd zzdzdVar;
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue() || (zzdzdVar = this.f10189g) == null) {
            return;
        }
        zzdzdVar.zzh(new BinderC5051w(this, context), zzdzc.DEBUG_MENU);
    }

    /* renamed from: d */
    public final void m12785d(Context context, String str, String str2) {
        C4965t.m12581r();
        C5005j2.m12681t(context, m12781p(context, (String) C4784a0.m12365c().zza(zzbgc.zzeC), str, str2));
    }

    /* renamed from: e */
    public final void m12786e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m12781p(context, (String) C4784a0.m12365c().zza(zzbgc.zzeF), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C4965t.m12581r();
        C5005j2.m12672k(context, str, buildUpon.build().toString());
    }

    /* renamed from: f */
    public final void m12787f(boolean z10) {
        synchronized (this.f10183a) {
            this.f10187e = z10;
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue()) {
                C4965t.m12580q().zzi().zzB(z10);
                zzdzd zzdzdVar = this.f10189g;
                if (zzdzdVar != null) {
                    zzdzdVar.zzk(z10);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m12788g(zzdzd zzdzdVar) {
        this.f10189g = zzdzdVar;
    }

    /* renamed from: h */
    public final void m12789h(boolean z10) {
        synchronized (this.f10183a) {
            this.f10186d = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m12790i(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            C5005j2.f10092l.post(new RunnableC5057y(this, context, str, z10, z11));
        } else {
            zzcec.zzi("Can not create dialog without Activity Context");
        }
    }

    /* renamed from: j */
    public final boolean m12791j(Context context, String str, String str2) {
        String m12780o = m12780o(context, m12781p(context, (String) C4784a0.m12365c().zza(zzbgc.zzeE), str, str2).toString(), str2);
        if (TextUtils.isEmpty(m12780o)) {
            zzcec.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(m12780o.trim()).optString("debug_mode"));
            m12787f(equals);
            if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjc)).booleanValue()) {
                InterfaceC5053w1 zzi = C4965t.m12580q().zzi();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12792k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzeD
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m12781p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m12780o(r4, r0, r6)
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
            r3.f10188f = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbfu r6 = com.google.android.gms.internal.ads.zzbgc.zzjc     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.C4784a0.m12365c()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zza(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f10188f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f10188f     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r0
            goto L67
        L66:
            r6 = r1
        L67:
            r3.m12787f(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.C4965t.m12580q()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.w1 r2 = r2.zzi()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzA(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.f10183a
            monitor-enter(r5)
            r3.f10185c = r4     // Catch: java.lang.Throwable -> L80
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C5060z.m12792k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public final boolean m12793l() {
        boolean z10;
        synchronized (this.f10183a) {
            z10 = this.f10187e;
        }
        return z10;
    }

    /* renamed from: m */
    public final boolean m12794m() {
        boolean z10;
        synchronized (this.f10183a) {
            z10 = this.f10186d;
        }
        return z10;
    }

    /* renamed from: n */
    public final boolean m12795n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m12794m()) {
            return false;
        }
        zzcec.zze("Sending troubleshooting signals to the server.");
        m12786e(context, str, str2, str3);
        return true;
    }
}
