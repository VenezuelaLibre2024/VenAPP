package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c2;
import com.google.android.gms.ads.internal.client.i4;
import com.google.android.gms.ads.internal.client.o1;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.v;
import com.google.android.gms.common.internal.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpv extends o1 {
    private final Context zza;
    private final zzcei zzb;
    private final zzdua zzc;
    private final zzeip zzd;
    private final zzepa zze;
    private final zzdyi zzf;
    private final zzcch zzg;
    private final zzduf zzh;
    private final zzdzd zzi;
    private final zzbiu zzj;
    private final zzfnc zzk;
    private final zzfid zzl;
    private final zzbgd zzm;
    private boolean zzn = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpv(Context context, zzcei zzceiVar, zzdua zzduaVar, zzeip zzeipVar, zzepa zzepaVar, zzdyi zzdyiVar, zzcch zzcchVar, zzduf zzdufVar, zzdzd zzdzdVar, zzbiu zzbiuVar, zzfnc zzfncVar, zzfid zzfidVar, zzbgd zzbgdVar) {
        this.zza = context;
        this.zzb = zzceiVar;
        this.zzc = zzduaVar;
        this.zzd = zzeipVar;
        this.zze = zzepaVar;
        this.zzf = zzdyiVar;
        this.zzg = zzcchVar;
        this.zzh = zzdufVar;
        this.zzi = zzdzdVar;
        this.zzj = zzbiuVar;
        this.zzk = zzfncVar;
        this.zzl = zzfidVar;
        this.zzm = zzbgdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (t.q().zzi().zzP()) {
            String zzl = t.q().zzi().zzl();
            if (t.u().j(this.zza, zzl, this.zzb.zza)) {
                return;
            }
            t.q().zzi().zzB(false);
            t.q().zzi().zzA("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        s.e("Adapters must be initialized on the main thread.");
        Map zze = t.q().zzi().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                zzcec.zzk("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            Iterator it = zze.values().iterator();
            while (it.hasNext()) {
                for (zzbso zzbsoVar : ((zzbsp) it.next()).zza) {
                    String str = zzbsoVar.zzk;
                    for (String str2 : zzbsoVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeiq zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfif zzfifVar = (zzfif) zza.zzb;
                        if (!zzfifVar.zzC() && zzfifVar.zzB()) {
                            zzfifVar.zzj(this.zza, (zzekk) zza.zzc, (List) entry.getValue());
                            zzcec.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfho e10) {
                    zzcec.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfim.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized float zze() {
        return t.t().a();
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzj(boolean z10) {
        try {
            zzfuf.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized void zzk() {
        if (this.zzn) {
            zzcec.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbgc.zza(this.zza);
        this.zzm.zza();
        t.q().zzu(this.zza, this.zzb);
        t.e().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) a0.c().zza(zzbgc.zzdT)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) a0.c().zza(zzbgc.zzjc)).booleanValue()) {
            zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcpv.this.zzb();
                }
            });
        }
        if (((Boolean) a0.c().zza(zzbgc.zzkt)).booleanValue()) {
            zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcps
                @Override // java.lang.Runnable
                public final void run() {
                    zzcpv.this.zzw();
                }
            });
        }
        if (((Boolean) a0.c().zza(zzbgc.zzcG)).booleanValue()) {
            zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcpv.this.zzd();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.google.android.gms.ads.internal.client.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(java.lang.String r10, com.google.android.gms.dynamic.b r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.zza
            com.google.android.gms.internal.ads.zzbgc.zza(r0)
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzdX
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            com.google.android.gms.ads.internal.t.r()     // Catch: android.os.RemoteException -> L21
            android.content.Context r0 = r9.zza     // Catch: android.os.RemoteException -> L21
            java.lang.String r0 = com.google.android.gms.ads.internal.util.j2.R(r0)     // Catch: android.os.RemoteException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzcdl r2 = com.google.android.gms.ads.internal.t.q()
            r2.zzw(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r10
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 == 0) goto L3e
            goto L8d
        L3e:
            com.google.android.gms.internal.ads.zzbfu r10 = com.google.android.gms.internal.ads.zzbgc.zzdR
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r10 = r0.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzaQ
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r10 = r10 | r1
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            java.lang.Object r10 = com.google.android.gms.dynamic.d.g2(r11)
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            com.google.android.gms.internal.ads.zzcpt r11 = new com.google.android.gms.internal.ads.zzcpt
            r11.<init>()
            goto L7d
        L7b:
            r11 = 0
            r2 = r10
        L7d:
            r7 = r11
            if (r2 == 0) goto L8d
            android.content.Context r4 = r9.zza
            com.google.android.gms.internal.ads.zzcei r5 = r9.zzb
            com.google.android.gms.internal.ads.zzfnc r8 = r9.zzk
            com.google.android.gms.ads.internal.e r3 = com.google.android.gms.ads.internal.t.c()
            r3.a(r4, r5, r6, r7, r8)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpv.zzl(java.lang.String, com.google.android.gms.dynamic.b):void");
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzm(c2 c2Var) {
        this.zzi.zzh(c2Var, zzdzc.API);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzn(com.google.android.gms.dynamic.b bVar, String str) {
        if (bVar == null) {
            zzcec.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) com.google.android.gms.dynamic.d.g2(bVar);
        if (context == null) {
            zzcec.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        v vVar = new v(context);
        vVar.n(str);
        vVar.o(this.zzb.zza);
        vVar.r();
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzo(zzbsv zzbsvVar) {
        this.zzl.zzf(zzbsvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized void zzp(boolean z10) {
        t.t().c(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized void zzq(float f10) {
        t.t().d(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized void zzr(String str) {
        zzbgc.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) a0.c().zza(zzbgc.zzdR)).booleanValue()) {
                t.c().a(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzs(zzbpk zzbpkVar) {
        this.zzf.zzs(zzbpkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzt(String str) {
        if (((Boolean) a0.c().zza(zzbgc.zzjn)).booleanValue()) {
            t.q().zzy(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final void zzu(i4 i4Var) {
        this.zzg.zzn(this.zza, i4Var);
    }

    @Override // com.google.android.gms.ads.internal.client.p1
    public final synchronized boolean zzv() {
        return t.t().e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbyb());
    }
}
