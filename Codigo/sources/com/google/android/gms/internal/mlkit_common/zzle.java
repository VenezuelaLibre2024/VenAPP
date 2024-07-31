package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes2.dex */
public enum zzle implements zzbm {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzle(int i10) {
        this.zzd = i10;
    }

    public static zzle zzb(int i10) {
        for (zzle zzleVar : values()) {
            if (zzleVar.zzd == i10) {
                return zzleVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbm
    public final int zza() {
        return this.zzd;
    }
}
