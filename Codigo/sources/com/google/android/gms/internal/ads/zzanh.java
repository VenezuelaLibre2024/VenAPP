package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzanh implements zzamy {
    private final zzanz zza;
    private long zze;
    private String zzg;
    private zzaea zzh;
    private zzang zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzann zzb = new zzann(7, RecognitionOptions.ITF);
    private final zzann zzc = new zzann(8, RecognitionOptions.ITF);
    private final zzann zzd = new zzann(6, RecognitionOptions.ITF);
    private long zzk = -9223372036854775807L;
    private final zzfp zzm = new zzfp();

    public zzanh(zzanz zzanzVar, boolean z10, boolean z11) {
        this.zza = zzanzVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfp r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanh.zza(com.google.android.gms.internal.ads.zzfp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzg = zzaokVar.zzb();
        zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzang(zzw, false, false);
        this.zza.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
        zzek.zzb(this.zzh);
        int i10 = zzfy.zza;
        if (z10) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        this.zzk = j10;
        int i11 = i10 & 2;
        this.zzl = (i11 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzgm.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzang zzangVar = this.zzi;
        if (zzangVar != null) {
            zzangVar.zzd();
        }
    }
}
