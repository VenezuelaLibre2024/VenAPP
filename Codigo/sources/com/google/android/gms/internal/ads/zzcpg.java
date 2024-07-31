package com.google.android.gms.internal.ads;

import l9.a0;
import l9.z;

/* loaded from: classes2.dex */
final class zzcpg implements z {
    private final zzcnc zza;
    private zzdah zzb;
    private l9.g zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpg(zzcnc zzcncVar, zzcpf zzcpfVar) {
        this.zza = zzcncVar;
    }

    @Override // l9.z
    public final /* synthetic */ z zza(zzdah zzdahVar) {
        this.zzb = zzdahVar;
        return this;
    }

    @Override // l9.z
    public final /* synthetic */ z zzb(l9.g gVar) {
        this.zzc = gVar;
        return this;
    }

    @Override // l9.z
    public final a0 zzc() {
        zzhhl.zzc(this.zzb, zzdah.class);
        zzhhl.zzc(this.zzc, l9.g.class);
        return new zzcpi(this.zza, this.zzc, new zzcxr(), new zzdwt(), this.zzb, null, null, null);
    }
}
