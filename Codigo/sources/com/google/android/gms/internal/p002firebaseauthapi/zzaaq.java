package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i;
import com.google.firebase.auth.i0;
import oc.d;
import oc.i1;
import oc.w1;

/* loaded from: classes2.dex */
public final class zzaaq extends zzacx<i, i1> {
    private final String zzaa;
    private final i0 zzy;
    private final String zzz;

    public zzaaq(i0 i0Var, String str, String str2) {
        super(2);
        this.zzy = (i0) s.j(i0Var);
        this.zzz = s.f(str);
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzz, this.zzy, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        a0 a0Var = this.zzd;
        if (a0Var != null && !a0Var.l().equalsIgnoreCase(zza.l())) {
            zza(new Status(17024));
        } else {
            ((i1) this.zze).a(this.zzj, zza);
            zzb(new w1(zza));
        }
    }
}
