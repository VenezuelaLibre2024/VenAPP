package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzewi implements zzexq {
    private final String zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return zzgen.zzh(new zzewj(this.zza, this.zzb));
    }
}
