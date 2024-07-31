package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.o0;
import oc.i1;

/* loaded from: classes2.dex */
public final class zzabx extends zzacx<Void, i1> {
    private final o0 zzy;

    public zzabx(o0 o0Var) {
        super(2);
        this.zzy = (o0) s.j(o0Var);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(new zzya(this.zzd.zze(), this.zzy), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
