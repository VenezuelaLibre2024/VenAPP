package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzcvk implements zzhhd {
    private final zzhhu zza;

    public zzcvk(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzdao) this.zza).zza().zza() == null) {
            if (!((Boolean) a0.c().zza(zzbgc.zzfy)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
