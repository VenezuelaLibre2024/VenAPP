package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i0;
import oc.i1;

/* loaded from: classes2.dex */
public final class zzaan extends zzacx<Void, i1> {
    private final String zzaa;
    private final String zzab;
    private final i0 zzy;
    private final String zzz;

    public zzaan(i0 i0Var, String str, String str2, String str3) {
        super(2);
        this.zzy = (i0) s.j(i0Var);
        this.zzz = s.f(str);
        this.zzaa = str2;
        this.zzab = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        ((i1) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
