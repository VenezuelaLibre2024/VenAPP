package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzctz extends zzcwh {
    private final zzcjk zzc;
    private final int zzd;
    private final Context zze;
    private final zzcto zzf;
    private final zzdkw zzg;
    private final zzdhy zzh;
    private final zzdbk zzi;
    private final boolean zzj;
    private final zzcdp zzk;
    private boolean zzl;

    public zzctz(zzcwg zzcwgVar, Context context, zzcjk zzcjkVar, int i10, zzcto zzctoVar, zzdkw zzdkwVar, zzdhy zzdhyVar, zzdbk zzdbkVar, zzcdp zzcdpVar) {
        super(zzcwgVar);
        this.zzl = false;
        this.zzc = zzcjkVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzctoVar;
        this.zzg = zzdkwVar;
        this.zzh = zzdhyVar;
        this.zzi = zzdbkVar;
        this.zzj = ((Boolean) a0.c().zza(zzbgc.zzfk)).booleanValue();
        this.zzk = zzcdpVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzb() {
        super.zzb();
        zzcjk zzcjkVar = this.zzc;
        if (zzcjkVar != null) {
            zzcjkVar.destroy();
        }
    }

    public final void zzc(zzbad zzbadVar) {
        zzcjk zzcjkVar = this.zzc;
        if (zzcjkVar != null) {
            zzcjkVar.zzai(zzbadVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzbaq r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdhy r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbfu r4 = com.google.android.gms.internal.ads.zzbgc.zzaB
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.t.r()
            boolean r4 = com.google.android.gms.ads.internal.util.j2.f(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcec.zzj(r4)
            com.google.android.gms.internal.ads.zzdbk r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbfu r4 = com.google.android.gms.internal.ads.zzbgc.zzaC
            com.google.android.gms.internal.ads.zzbga r5 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzfrc r4 = new com.google.android.gms.internal.ads.zzfrc
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.z0 r5 = com.google.android.gms.ads.internal.t.v()
            android.os.Looper r5 = r5.b()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzfgy r3 = r2.zza
            com.google.android.gms.internal.ads.zzfgx r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfgp r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            com.google.android.gms.internal.ads.zzbfu r4 = com.google.android.gms.internal.ads.zzbgc.zzll
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzcjk r4 = r2.zzc
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.zzfgm r4 = r4.zzD()
            if (r4 == 0) goto La0
            boolean r1 = r4.zzar
            if (r1 == 0) goto La0
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzcdp r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L8d
            goto La0
        L8d:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.internal.ads.zzcec.zzj(r3)
            com.google.android.gms.internal.ads.zzdbk r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.c3 r4 = com.google.android.gms.internal.ads.zzfij.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        La0:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Lb4
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcec.zzj(r4)
            com.google.android.gms.internal.ads.zzdbk r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzfij.zzd(r1, r0, r0)
            r4.zza(r0)
        Lb4:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzdkw r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
            com.google.android.gms.internal.ads.zzdbk r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
            if (r3 == 0) goto Lc8
            com.google.android.gms.internal.ads.zzdhy r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdkv -> Lcc
        Lc8:
            r3 = 1
            r2.zzl = r3
            return
        Lcc:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzdbk r4 = r2.zzi
            r4.zzc(r3)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzctz.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzbaq, boolean):void");
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
