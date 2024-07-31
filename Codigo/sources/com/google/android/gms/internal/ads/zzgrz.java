package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzgrz {
    private ArrayList zza = new ArrayList();
    private zzgrw zzb = zzgrw.zza;
    private Integer zzc = null;

    public final zzgrz zza(zzgge zzggeVar, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzgsb(zzggeVar, i10, str, str2, null));
        return this;
    }

    public final zzgrz zzb(zzgrw zzgrwVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgrwVar;
        return this;
    }

    public final zzgrz zzc(int i10) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zzgsd zzd() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int zza = ((zzgsb) arrayList.get(i10)).zza();
                i10++;
                if (zza == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzgsd zzgsdVar = new zzgsd(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgsdVar;
    }
}
