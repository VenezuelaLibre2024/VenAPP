package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.firebase.auth.C6083j;
import p272oc.C9881q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyn implements zzadk<zzafn> {
    private final /* synthetic */ C6083j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacd zzc;
    private final /* synthetic */ zzyj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyn(zzyj zzyjVar, C6083j c6083j, String str, zzacd zzacdVar) {
        this.zzd = zzyjVar;
        this.zza = c6083j;
        this.zzb = str;
        this.zzc = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        this.zzd.zza(new zzaep(this.zza, zzafnVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzc.zza(C9881q.m29583a(str));
    }
}
