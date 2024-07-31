package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f5;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class zzfbu implements zzequ {
    protected final zzclg zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfck zzd;
    private final zzfed zze;
    private final zzcei zzf;
    private final ViewGroup zzg;
    private final zzfnc zzh;
    private final zzfhf zzi;
    private com.google.common.util.concurrent.f zzj;

    public zzfbu(Context context, Executor executor, zzclg zzclgVar, zzfed zzfedVar, zzfck zzfckVar, zzfhf zzfhfVar, zzcei zzceiVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzclgVar;
        this.zze = zzfedVar;
        this.zzd = zzfckVar;
        this.zzi = zzfhfVar;
        this.zzf = zzceiVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzclgVar.zzz();
    }

    public final synchronized zzdad zzm(zzfeb zzfebVar) {
        zzfbt zzfbtVar = (zzfbt) zzfebVar;
        if (((Boolean) a0.c().zza(zzbgc.zzia)).booleanValue()) {
            zzcuc zzcucVar = new zzcuc(this.zzg);
            zzdaf zzdafVar = new zzdaf();
            zzdafVar.zze(this.zzb);
            zzdafVar.zzi(zzfbtVar.zza);
            zzdah zzj = zzdafVar.zzj();
            zzdgm zzdgmVar = new zzdgm();
            zzdgmVar.zzc(this.zzd, this.zzc);
            zzdgmVar.zzl(this.zzd, this.zzc);
            return zze(zzcucVar, zzj, zzdgmVar.zzn());
        }
        zzfck zzi = zzfck.zzi(this.zzd);
        zzdgm zzdgmVar2 = new zzdgm();
        zzdgmVar2.zzb(zzi, this.zzc);
        zzdgmVar2.zzg(zzi, this.zzc);
        zzdgmVar2.zzh(zzi, this.zzc);
        zzdgmVar2.zzi(zzi, this.zzc);
        zzdgmVar2.zzc(zzi, this.zzc);
        zzdgmVar2.zzl(zzi, this.zzc);
        zzdgmVar2.zzm(zzi);
        zzcuc zzcucVar2 = new zzcuc(this.zzg);
        zzdaf zzdafVar2 = new zzdaf();
        zzdafVar2.zze(this.zzb);
        zzdafVar2.zzi(zzfbtVar.zza);
        return zze(zzcucVar2, zzdafVar2.zzj(), zzdgmVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzequ
    public final boolean zza() {
        com.google.common.util.concurrent.f fVar = this.zzj;
        return (fVar == null || fVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0026, B:12:0x0045, B:16:0x0056, B:20:0x005c, B:22:0x006c, B:24:0x0074, B:25:0x0089, B:27:0x00a2, B:29:0x00a6, B:30:0x00af, B:34:0x003e), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzequ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.u4 r8, java.lang.String r9, com.google.android.gms.internal.ads.zzeqs r10, com.google.android.gms.internal.ads.zzeqt r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbu.zzb(com.google.android.gms.ads.internal.client.u4, java.lang.String, com.google.android.gms.internal.ads.zzeqs, com.google.android.gms.internal.ads.zzeqt):boolean");
    }

    protected abstract zzdad zze(zzcuc zzcucVar, zzdah zzdahVar, zzdgo zzdgoVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzbK(zzfij.zzd(6, null, null));
    }

    public final void zzl(f5 f5Var) {
        this.zzi.zzt(f5Var);
    }
}
