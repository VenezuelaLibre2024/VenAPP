package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.j;
import oc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyn implements zzadk<zzafn> {
    private final /* synthetic */ j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacd zzc;
    private final /* synthetic */ zzyj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyn(zzyj zzyjVar, j jVar, String str, zzacd zzacdVar) {
        this.zzd = zzyjVar;
        this.zza = jVar;
        this.zzb = str;
        this.zzc = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        this.zzd.zza(new zzaep(this.zza, zzafnVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzc.zza(q.a(str));
    }
}
