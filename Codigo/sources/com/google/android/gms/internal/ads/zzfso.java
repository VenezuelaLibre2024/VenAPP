package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfso extends Exception {
    private final int zza;

    public zzfso(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzfso(int i10, Throwable th2) {
        super(th2);
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }
}
