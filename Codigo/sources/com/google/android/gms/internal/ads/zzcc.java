package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzcc extends IOException {
    public final boolean zza;
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcc(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzcc zza(String str, Throwable th2) {
        return new zzcc(str, th2, true, 1);
    }

    public static zzcc zzb(String str, Throwable th2) {
        return new zzcc(str, th2, true, 0);
    }

    public static zzcc zzc(String str) {
        return new zzcc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
