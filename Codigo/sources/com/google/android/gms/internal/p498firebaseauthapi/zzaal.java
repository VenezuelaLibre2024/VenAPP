package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p272oc.InterfaceC9890t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaal extends zzacx<Void, InterfaceC9890t> {
    public zzaal() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzd.zze(), this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        ((InterfaceC9890t) this.zze).zza();
        zzb(null);
    }
}
