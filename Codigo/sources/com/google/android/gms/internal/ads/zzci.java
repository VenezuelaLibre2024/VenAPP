package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzci {
    private final zzaf zza = new zzaf();

    public final zzci zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzci zzb(zzck zzckVar) {
        zzah zzahVar;
        zzahVar = zzckVar.zzd;
        for (int i10 = 0; i10 < zzahVar.zzb(); i10++) {
            this.zza.zza(zzahVar.zza(i10));
        }
        return this;
    }

    public final zzci zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzci zzd(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzck zze() {
        return new zzck(this.zza.zzb(), null);
    }
}
