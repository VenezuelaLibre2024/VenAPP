package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzrt {
    private ArrayList<zzrs> zza = new ArrayList<>();
    private zzrn zzb = zzrn.zza;
    private Integer zzc = null;

    public final zzrq zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList<zzrs> arrayList = this.zza;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zzrs zzrsVar = arrayList.get(i10);
                i10++;
                if (zzrsVar.zza() == intValue) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
        }
        zzrq zzrqVar = new zzrq(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zzrqVar;
    }

    public final zzrt zza(int i10) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zzrt zza(zzbv zzbvVar, int i10, String str, String str2) {
        ArrayList<zzrs> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzrs(zzbvVar, i10, str, str2));
        return this;
    }

    public final zzrt zza(zzrn zzrnVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrnVar;
        return this;
    }
}
