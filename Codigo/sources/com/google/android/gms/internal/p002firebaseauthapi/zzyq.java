package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyq implements zzadk<zzaeo> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyq(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzaeo zzaeoVar) {
        zzaeo zzaeoVar2 = zzaeoVar;
        if (zzaeoVar2.zzf()) {
            this.zza.zza(new zzyk(zzaeoVar2.zzc(), zzaeoVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafn(zzaeoVar2.zzd(), zzaeoVar2.zzb(), Long.valueOf(zzaeoVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaeoVar2.zzg()), null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }
}
