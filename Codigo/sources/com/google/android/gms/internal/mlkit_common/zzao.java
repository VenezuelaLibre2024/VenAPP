package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzao extends zzal {
    public zzao() {
        super(4);
    }

    public final zzao zzb(Object obj) {
        obj.getClass();
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        this.zza = Arrays.copyOf(objArr, zzam.zza(length, i10));
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }

    public final zzar zzc() {
        this.zzc = true;
        return zzar.zzg(this.zza, this.zzb);
    }
}
