package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabg extends zzacx<Void, InterfaceC9859i1> {
    public zzabg() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "reload";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzc(this.zzd.zze(), this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
