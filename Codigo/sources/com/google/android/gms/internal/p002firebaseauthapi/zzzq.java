package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzq implements zzadk<zzaes> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzq(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzaes zzaesVar) {
        zzaes zzaesVar2 = zzaesVar;
        this.zzb.zza(new zzafn(zzaesVar2.zzb(), zzaesVar2.zza(), Long.valueOf(zzafp.zza(zzaesVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }
}
