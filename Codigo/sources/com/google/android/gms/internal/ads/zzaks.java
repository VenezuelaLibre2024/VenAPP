package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzaks implements zzacx {
    private final zzacx zzb;
    private final zzakp zzc;
    private final SparseArray zzd = new SparseArray();

    public zzaks(zzacx zzacxVar, zzakp zzakpVar) {
        this.zzb = zzacxVar;
        this.zzc = zzakpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzO(zzadu zzaduVar) {
        this.zzb.zzO(zzaduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaea zzw(int i10, int i11) {
        if (i11 != 3) {
            return this.zzb.zzw(i10, i11);
        }
        zzaku zzakuVar = (zzaku) this.zzd.get(i10);
        if (zzakuVar != null) {
            return zzakuVar;
        }
        zzaku zzakuVar2 = new zzaku(this.zzb.zzw(i10, 3), this.zzc);
        this.zzd.put(i10, zzakuVar2);
        return zzakuVar2;
    }
}
