package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwn {
    private int zza;
    private final SparseArray zzb;
    private final zzep zzc;

    public zzwn() {
        zzwm zzwmVar = new zzep() { // from class: com.google.android.gms.internal.ads.zzwm
            @Override // com.google.android.gms.internal.ads.zzep
            public final void zza(Object obj) {
            }
        };
        throw null;
    }

    public zzwn(zzep zzepVar) {
        this.zzb = new SparseArray();
        this.zzc = zzepVar;
        this.zza = -1;
    }

    public final Object zza(int i10) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i11 = this.zza;
            if (i11 > 0 && i10 < this.zzb.keyAt(i11)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i10 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i10, Object obj) {
        if (this.zza == -1) {
            zzek.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            zzek.zzd(i10 >= keyAt);
            if (keyAt == i10) {
                zzwg.zzm((zzwe) this.zzb.valueAt(r0.size() - 1));
            }
        }
        this.zzb.append(i10, obj);
    }

    public final void zzd() {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzwg.zzm((zzwe) this.zzb.valueAt(i10));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i10) {
        int i11 = 0;
        while (i11 < this.zzb.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.zzb.keyAt(i12)) {
                return;
            }
            zzwg.zzm((zzwe) this.zzb.valueAt(i11));
            this.zzb.removeAt(i11);
            int i13 = this.zza;
            if (i13 > 0) {
                this.zza = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }
}
