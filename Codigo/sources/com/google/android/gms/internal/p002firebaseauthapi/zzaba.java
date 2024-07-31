package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.j;
import oc.d;
import oc.i1;

/* loaded from: classes2.dex */
final class zzaba extends zzacx<Void, i1> {
    private final zzyd zzy;

    public zzaba(j jVar, String str) {
        super(2);
        s.k(jVar, "Credential cannot be null");
        this.zzy = new zzyd(jVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        if (!this.zzd.l().equalsIgnoreCase(zza.l())) {
            zza(new Status(17024));
        } else {
            ((i1) this.zze).a(this.zzj, zza);
            zzb(null);
        }
    }
}
