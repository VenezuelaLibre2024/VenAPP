package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdzd implements zzeab, zzdyo {
    private final zzdzl zza;
    private final zzeac zzb;
    private final zzdyp zzc;
    private final zzdyy zzd;
    private final zzdyn zze;
    private final zzdzx zzf;
    private final String zzg;
    private final String zzh;
    private JSONObject zzm;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private long zzn = Long.MAX_VALUE;
    private zzdyz zzo = zzdyz.NONE;
    private zzdzc zzs = zzdzc.UNKNOWN;
    private long zzt = 0;

    public zzdzd(zzdzl zzdzlVar, zzeac zzeacVar, zzdyp zzdypVar, Context context, zzcei zzceiVar, zzdyy zzdyyVar, zzdzx zzdzxVar, String str) {
        this.zza = zzdzlVar;
        this.zzb = zzeacVar;
        this.zzc = zzdypVar;
        this.zze = new zzdyn(context);
        this.zzg = zzceiVar.zza;
        this.zzh = str;
        this.zzd = zzdyyVar;
        this.zzf = zzdzxVar;
        t.u().g(this);
    }

    private final synchronized JSONObject zzs() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdyr zzdyrVar : (List) entry.getValue()) {
                if (zzdyrVar.zzg()) {
                    jSONArray.put(zzdyrVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzt() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzz(t.q().zzi().zzo());
    }

    private final void zzu() {
        t.q().zzi().o(zzd());
    }

    private final synchronized void zzv(zzdyz zzdyzVar, boolean z10) {
        if (this.zzo != zzdyzVar) {
            if (zzp()) {
                zzx();
            }
            this.zzo = zzdyzVar;
            if (zzp()) {
                zzy();
            }
            if (z10) {
                zzu();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:15:0x0026, B:17:0x0035, B:21:0x002a, B:23:0x0030), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzw(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzp     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzp = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbfu r2 = com.google.android.gms.internal.ads.zzbgc.zzjc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.util.z r2 = com.google.android.gms.ads.internal.t.u()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzp()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzx()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzu()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzd.zzw(boolean, boolean):void");
    }

    private final synchronized void zzx() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final synchronized void zzz(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzw(jSONObject.optBoolean("isTestMode", false), false);
            zzv((zzdyz) Enum.valueOf(zzdyz.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdyz zza() {
        return this.zzo;
    }

    public final synchronized com.google.common.util.concurrent.f zzb(String str) {
        zzceu zzceuVar;
        zzceuVar = new zzceu();
        if (this.zzj.containsKey(str)) {
            zzceuVar.zzc((zzdyr) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzceuVar);
        }
        return zzceuVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue() && zzp()) {
            if (this.zzn < t.b().a() / 1000) {
                this.zzl = "{}";
                this.zzn = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzl.equals("{}")) {
                return this.zzl;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > t.b().a() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzh)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzh);
            }
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) a0.c().zza(zzbgc.zzjn)).booleanValue()) {
                String zzn = t.q().zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put("plugin", zzn);
                }
            }
            if (this.zzn < t.b().a() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzs());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = t.q().zzi().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) a0.c().zza(zzbgc.zzjd)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                zzcec.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) a0.c().zza(zzbgc.zzjc)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
            jSONObject.put("isGamRegisteredTestDevice", t.u().l());
            t.r();
            x.b();
            jSONObject.put("isSimulator", zzcdv.zzr());
        } catch (JSONException e10) {
            t.q().zzv(e10, "Inspector.toJson");
            zzcec.zzk("Ad inspector encountered an error", e10);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdyr zzdyrVar) {
        if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue() && zzp()) {
            if (this.zzq >= ((Integer) a0.c().zza(zzbgc.zziP)).intValue()) {
                zzcec.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdyrVar);
            if (((Boolean) a0.c().zza(zzbgc.zzjl)).booleanValue()) {
                String zzc = zzdyrVar.zzc();
                this.zzj.put(zzc, zzdyrVar);
                if (this.zzk.containsKey(zzc)) {
                    List list = (List) this.zzk.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzceu) it.next()).zzc(zzdyrVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzjc)).booleanValue() && t.q().zzi().zzP()) {
                zzt();
                return;
            }
            String zzo = t.q().zzi().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    zzt();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(c2 c2Var, zzdzc zzdzcVar) {
        if (!zzp()) {
            try {
                c2Var.zze(zzfij.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcec.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) a0.c().zza(zzbgc.zziN)).booleanValue()) {
            this.zzs = zzdzcVar;
            this.zza.zzj(c2Var, new zzbnz(this), new zzbns(this.zzf));
            return;
        } else {
            try {
                c2Var.zze(zzfij.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcec.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzl = str;
        this.zzn = j10;
        zzu();
    }

    public final synchronized void zzj(long j10) {
        this.zzt += j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzr
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzt()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzp
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzy()
            return
        L15:
            boolean r2 = r1.zzp()
            if (r2 != 0) goto L1e
            r1.zzx()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzd.zzk(boolean):void");
    }

    public final void zzl(zzdyz zzdyzVar) {
        zzv(zzdyzVar, true);
    }

    public final synchronized void zzm(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzn(boolean z10) {
        if (!this.zzr && z10) {
            zzt();
        }
        zzw(z10, true);
    }

    public final boolean zzo() {
        return this.zzm != null;
    }

    public final synchronized boolean zzp() {
        if (((Boolean) a0.c().zza(zzbgc.zzjc)).booleanValue()) {
            return this.zzp || t.u().l();
        }
        return this.zzp;
    }

    public final synchronized boolean zzq() {
        return this.zzp;
    }

    public final boolean zzr() {
        return this.zzt < ((Long) a0.c().zza(zzbgc.zzji)).longValue();
    }
}
