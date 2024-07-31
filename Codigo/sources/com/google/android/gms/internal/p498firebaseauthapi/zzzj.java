package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import p272oc.C9881q;

/* loaded from: classes2.dex */
final class zzzj implements zzadk<zzahd> {
    private final /* synthetic */ zzzk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzj(zzzk zzzkVar) {
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzahd zzahdVar) {
        zzahd zzahdVar2 = zzahdVar;
        if (TextUtils.isEmpty(zzahdVar2.zza()) || TextUtils.isEmpty(zzahdVar2.zzb())) {
            this.zza.zza.zza(C9881q.m29583a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzafn zzafnVar = new zzafn(zzahdVar2.zzb(), zzahdVar2.zza(), Long.valueOf(zzafp.zza(zzahdVar2.zza())), "Bearer");
        zzzk zzzkVar = this.zza;
        zzzkVar.zzb.zza(zzafnVar, null, null, Boolean.FALSE, null, zzzkVar.zza, this);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza.zza(C9881q.m29583a(str));
    }
}
