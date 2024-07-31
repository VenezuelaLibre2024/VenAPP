package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public final class zzeat implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeat(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return na.e.a((Context) this.zza.zzb()).f(((zzeap) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
