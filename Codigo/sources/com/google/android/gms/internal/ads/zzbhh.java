package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x8.h;

/* loaded from: classes2.dex */
public final class zzbhh {
    private final ScheduledExecutorService zza;
    private Runnable zzb;
    private zzbhe zzc;
    private androidx.browser.customtabs.i zzd;
    private String zze;
    private long zzf = 0;
    private long zzg;
    private JSONArray zzh;
    private Context zzi;

    public zzbhh(ScheduledExecutorService scheduledExecutorService) {
        this.zza = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzjB)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbhe r0 = r5.zzc
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.internal.ads.zzcec.zzg(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.zze
            if (r0 == 0) goto L70
            androidx.browser.customtabs.i r0 = r5.zzd
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L70
            long r0 = r5.zzf
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            la.f r0 = com.google.android.gms.ads.internal.t.b()
            long r0 = r0.b()
            long r2 = r5.zzf
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzjB
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.i r0 = r5.zzd
            java.lang.String r1 = r5.zze
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.k(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            java.lang.Runnable r1 = r5.zzb
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzjC
            com.google.android.gms.internal.ads.zzbga r3 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.u1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhh.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzh == null) {
                this.zzh = new JSONArray((String) a0.c().zza(zzbgc.zzjE));
            }
            jSONObject.put("eids", this.zzh);
        } catch (JSONException e10) {
            zzcec.zzh("Error fetching the PACT active eids JSON: ", e10);
        }
    }

    public final androidx.browser.customtabs.i zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzc(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        zzk(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject zzd(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        zzk(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        this.zzf = t.b().b() + ((Integer) a0.c().zza(zzbgc.zzjA)).intValue();
        if (this.zzb == null) {
            this.zzb = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhf
                @Override // java.lang.Runnable
                public final void run() {
                    zzbhh.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, androidx.browser.customtabs.c cVar, String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzi = context;
        this.zze = str;
        zzbhe zzbheVar = new zzbhe(this, bVar);
        this.zzc = zzbheVar;
        androidx.browser.customtabs.i f10 = cVar.f(zzbheVar);
        this.zzd = f10;
        if (f10 == null) {
            zzcec.zzg("CustomTabsClient failed to create new session.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(String str) {
        try {
            androidx.browser.customtabs.i iVar = this.zzd;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzg).toString());
            zzk(jSONObject);
            iVar.j(jSONObject.toString(), null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            m9.a.a(this.zzi, x8.c.BANNER, new h.a().b(AdMobAdapter.class, bundle).k(), new zzbhg(this, str));
        } catch (JSONException e10) {
            zzcec.zzh("Error creating JSON: ", e10);
        }
    }

    public final void zzi(long j10) {
        this.zzg = j10;
    }
}
