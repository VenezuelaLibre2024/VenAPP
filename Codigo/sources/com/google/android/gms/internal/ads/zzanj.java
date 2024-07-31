package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzanj implements zzamy {
    private final zzanz zza;
    private String zzb;
    private zzaea zzc;
    private zzani zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzann zzg = new zzann(32, RecognitionOptions.ITF);
    private final zzann zzh = new zzann(33, RecognitionOptions.ITF);
    private final zzann zzi = new zzann(34, RecognitionOptions.ITF);
    private final zzann zzj = new zzann(39, RecognitionOptions.ITF);
    private final zzann zzk = new zzann(40, RecognitionOptions.ITF);
    private long zzm = -9223372036854775807L;
    private final zzfp zzn = new zzfp();

    public zzanj(zzanz zzanzVar) {
        this.zza = zzanzVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfp r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanj.zza(com.google.android.gms.internal.ads.zzfp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzb = zzaokVar.zzb();
        zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzani(zzw);
        this.zza.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
        zzek.zzb(this.zzc);
        int i10 = zzfy.zza;
        if (z10) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzani zzaniVar = this.zzd;
        if (zzaniVar != null) {
            zzaniVar.zzd();
        }
    }
}
