package com.google.android.gms.internal.p002firebaseauthapi;

import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaa implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzyj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaa(zzyj zzyjVar, zzacd zzacdVar) {
        this.zzb = zzyjVar;
        this.zza = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagh zzaghVar) {
        zzagh zzaghVar2 = zzaghVar;
        this.zzb.zza(new zzafn(zzaghVar2.zzc(), zzaghVar2.zzb(), Long.valueOf(zzaghVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }
}
