package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzead extends Exception {
    private final int zza;

    public zzead(int i10) {
        this.zza = i10;
    }

    public zzead(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzead(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }

    public final int zza() {
        return this.zza;
    }
}
