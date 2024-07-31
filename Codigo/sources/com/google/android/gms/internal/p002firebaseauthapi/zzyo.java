package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyo implements zzadk<zzagz> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyo(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagz zzagzVar) {
        zzagz zzagzVar2 = zzagzVar;
        if (zzagzVar2.zzf()) {
            this.zza.zza(new zzyk(zzagzVar2.zzc(), zzagzVar2.zze(), null));
        } else {
            this.zzb.zza(new zzafn(zzagzVar2.zzd(), zzagzVar2.zzb(), Long.valueOf(zzagzVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }
}
