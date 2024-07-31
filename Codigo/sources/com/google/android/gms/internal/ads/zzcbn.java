package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.s0;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcbn implements zzcbs {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzheb zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcbp zzi;
    private final zzcbo zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbn(Context context, zzcei zzceiVar, zzcbp zzcbpVar, String str, zzcbo zzcboVar) {
        s.k(zzcbpVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcboVar;
        this.zzi = zzcbpVar;
        Iterator it = zzcbpVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzheb zza = zzhfz.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzhec zza2 = zzhed.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzhed) zza2.zzal());
        zzhfq zza3 = zzhfr.zza();
        zza3.zzc(na.e.a(this.zzh).g());
        String str3 = zzceiVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long a10 = ca.g.f().a(this.zzh);
        if (a10 > 0) {
            zza3.zzb(a10);
        }
        zza.zzf((zzhfr) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzcbp zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.f zzb(Map map) {
        zzhfo zzhfoVar;
        com.google.common.util.concurrent.f zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhfoVar = (zzhfo) this.zze.get(str);
                            }
                            if (zzhfoVar == null) {
                                zzcbr.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzhfoVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (((Boolean) zzbii.zzb.zze()).booleanValue()) {
                    zzcec.zzf("Failed to get SafeBrowsing metadata", e10);
                }
                return zzgen.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z10 = this.zza;
        if (!(z10 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z10 || !this.zzi.zzd))) {
            return zzgen.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhfp) ((zzhfo) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzcbr.zzb()) {
                StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzhfp zzhfpVar : this.zzd.zzm()) {
                    sb2.append("    [");
                    sb2.append(zzhfpVar.zza());
                    sb2.append("] ");
                    sb2.append(zzhfpVar.zze());
                }
                zzcbr.zza(sb2.toString());
            }
            com.google.common.util.concurrent.f b10 = new s0(this.zzh).b(1, this.zzi.zzb, null, ((zzhfz) this.zzd.zzal()).zzax());
            if (zzcbr.zzb()) {
                b10.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbr.zza("Pinged SB successfully.");
                    }
                }, zzcep.zza);
            }
            zzm = zzgen.zzm(b10, new zzfws() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // com.google.android.gms.internal.ads.zzfws
                public final Object apply(Object obj) {
                    int i11 = zzcbn.zzb;
                    return null;
                }
            }, zzcep.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzd(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzhfo) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhfo zzc2 = zzhfp.zzc();
            int zza = zzhfn.zza(i10);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzheo zza2 = zzher.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhem zza3 = zzhen.zza();
                        zza3.zza(zzgyl.zzw(str2));
                        zza3.zzb(zzgyl.zzw(str3));
                        zza2.zza((zzhen) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzher) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            com.google.common.util.concurrent.f zzh = zzgen.zzh(Collections.emptyMap());
            zzgdu zzgduVar = new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcbi
                @Override // com.google.android.gms.internal.ads.zzgdu
                public final com.google.common.util.concurrent.f zza(Object obj) {
                    return zzcbn.this.zzb((Map) obj);
                }
            };
            zzgey zzgeyVar = zzcep.zzf;
            com.google.common.util.concurrent.f zzn = zzgen.zzn(zzh, zzgduVar, zzgeyVar);
            com.google.common.util.concurrent.f zzo = zzgen.zzo(zzn, 10L, TimeUnit.SECONDS, zzcep.zzd);
            zzgen.zzr(zzn, new zzcbm(this, zzo), zzgeyVar);
            zzc.add(zzo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgyi zzt = zzgyl.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzheb zzhebVar = this.zzd;
            zzhfh zza = zzhfj.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzhebVar.zzi((zzhfj) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzcbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L93
            com.google.android.gms.ads.internal.t.r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcec.zzh(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcec.zzj(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcec.zzh(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcbr.zza(r8)
            return
        L75:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzcbj r8 = new com.google.android.gms.internal.ads.zzcbj
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L8e
            r8.run()
            return
        L8e:
            com.google.android.gms.internal.ads.zzgey r0 = com.google.android.gms.internal.ads.zzcep.zza
            r0.execute(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbn.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zzi() {
        return p.d() && this.zzi.zzc && !this.zzl;
    }
}
