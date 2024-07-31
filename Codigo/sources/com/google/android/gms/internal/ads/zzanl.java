package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzanl implements zzamy {
    private final String zza;
    private final zzfp zzb;
    private final zzfo zzc;
    private zzaea zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzanl(String str) {
        this.zza = str;
        zzfp zzfpVar = new zzfp(RecognitionOptions.UPC_E);
        this.zzb = zzfpVar;
        byte[] zzM = zzfpVar.zzM();
        this.zzc = new zzfo(zzM, zzM.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfo zzfoVar) {
        int zza = zzfoVar.zza();
        zzabr zzb = zzabs.zzb(zzfoVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfoVar.zza();
    }

    private static long zzg(zzfo zzfoVar) {
        return zzfoVar.zzd((zzfoVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        if (r14.zzl == false) goto L104;
     */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfp r15) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanl.zza(com.google.android.gms.internal.ads.zzfp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzd = zzacxVar.zzw(zzaokVar.zza(), 1);
        this.zze = zzaokVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        this.zzk = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
