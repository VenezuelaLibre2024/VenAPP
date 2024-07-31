package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.List;
import p272oc.C9881q;

/* loaded from: classes2.dex */
final class zzzh implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzi zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzh(zzzi zzziVar, zzadk zzadkVar, zzafn zzafnVar) {
        this.zzc = zzziVar;
        this.zza = zzadkVar;
        this.zzb = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        List<zzafc> zza = zzafdVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzafc zzafcVar = zza.get(0);
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(this.zzb.zzc()).zza(this.zzc.zza);
        zzzi zzziVar = this.zzc;
        zzyj.zza(zzziVar.zzc, zzziVar.zzb, this.zzb, zzafcVar, zzagcVar, this.zza);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzc.zzb.zza(C9881q.m29583a(str));
    }
}
