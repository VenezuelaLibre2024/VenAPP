package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaby extends zzacx<Void, InterfaceC9859i1> {
    private final String zzy;

    public zzaby(String str) {
        super(2);
        this.zzy = C5276s.m13321g(str, "password cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzc(this.zzd.zze(), this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
