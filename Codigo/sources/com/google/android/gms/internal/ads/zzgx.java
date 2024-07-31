package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgx extends IOException {
    public final int zza;

    public zzgx(int i10) {
        this.zza = i10;
    }

    public zzgx(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzgx(String str, Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzgx(Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
