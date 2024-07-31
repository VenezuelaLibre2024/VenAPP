package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzfwp implements zzfxf {
    public static zzfwp zzc(char c10) {
        return new zzfwm(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
