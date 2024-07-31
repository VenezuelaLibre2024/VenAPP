package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzafp implements zzacx {
    private final long zzb;
    private final zzacx zzc;

    public zzafp(long j10, zzacx zzacxVar) {
        this.zzb = j10;
        this.zzc = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzO(zzadu zzaduVar) {
        this.zzc.zzO(new zzafo(this, zzaduVar, zzaduVar));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaea zzw(int i10, int i11) {
        return this.zzc.zzw(i10, i11);
    }
}
