package com.google.android.recaptcha.internal;

/* loaded from: classes2.dex */
public final class zzcq {
    public static final zzcp zza = new zzcp(null);
    private int zzb;

    public zzcq(short s10, short s11) {
        this.zzb = Math.abs((int) s10);
    }

    public final short zza() {
        int i10 = ((this.zzb * 4391) + 277) % 32779;
        this.zzb = i10;
        return (short) (i10 % 255);
    }
}