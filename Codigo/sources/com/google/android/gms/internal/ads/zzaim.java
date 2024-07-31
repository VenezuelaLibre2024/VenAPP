package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaim extends zzaio {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaim(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final String toString() {
        List list = this.zzb;
        return zzaio.zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzaim zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzaim zzaimVar = (zzaim) this.zzc.get(i11);
            if (zzaimVar.zzd == i10) {
                return zzaimVar;
            }
        }
        return null;
    }

    public final zzain zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzain zzainVar = (zzain) this.zzb.get(i11);
            if (zzainVar.zzd == i10) {
                return zzainVar;
            }
        }
        return null;
    }

    public final void zzc(zzaim zzaimVar) {
        this.zzc.add(zzaimVar);
    }

    public final void zzd(zzain zzainVar) {
        this.zzb.add(zzainVar);
    }
}
