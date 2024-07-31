package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes2.dex */
public enum zzlx implements zzbm {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zzlx(int i10) {
        this.zzh = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbm
    public final int zza() {
        return this.zzh;
    }
}
