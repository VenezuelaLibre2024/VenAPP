package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgac {
    Object[] zza;
    int zzb;
    zzgab zzc;

    public zzgac() {
        this(4);
    }

    public zzgac(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfzu.zze(length, i11));
        }
    }

    public final zzgac zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfyx.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgac zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgad zzc() {
        zzgab zzgabVar = this.zzc;
        if (zzgabVar != null) {
            throw zzgabVar.zza();
        }
        zzgbp zzj = zzgbp.zzj(this.zzb, this.zza, this);
        zzgab zzgabVar2 = this.zzc;
        if (zzgabVar2 == null) {
            return zzj;
        }
        throw zzgabVar2.zza();
    }
}
