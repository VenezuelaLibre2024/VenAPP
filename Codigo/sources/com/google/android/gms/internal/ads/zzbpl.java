package com.google.android.gms.internal.ads;

import e9.a;

/* loaded from: classes2.dex */
public final class zzbpl implements e9.a {
    private final a.EnumC0222a zza;
    private final String zzb;
    private final int zzc;

    public zzbpl(a.EnumC0222a enumC0222a, String str, int i10) {
        this.zza = enumC0222a;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // e9.a
    public final String getDescription() {
        return this.zzb;
    }

    @Override // e9.a
    public final a.EnumC0222a getInitializationState() {
        return this.zza;
    }

    @Override // e9.a
    public final int getLatency() {
        return this.zzc;
    }
}
