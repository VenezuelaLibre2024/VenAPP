package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i;
import com.google.firebase.auth.j;
import oc.d;
import oc.i1;
import oc.w1;

/* loaded from: classes2.dex */
public final class zzaau extends zzacx<i, i1> {
    private final j zzy;
    private final String zzz;

    public zzaau(j jVar, String str) {
        super(2);
        this.zzy = (j) s.k(jVar, "credential cannot be null");
        s.g(jVar.zzc(), "email cannot be null");
        s.g(jVar.zzd(), "password cannot be null");
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy.zzc(), s.f(this.zzy.zzd()), this.zzd.zze(), this.zzd.z1(), this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        ((i1) this.zze).a(this.zzj, zza);
        zzb(new w1(zza));
    }
}
