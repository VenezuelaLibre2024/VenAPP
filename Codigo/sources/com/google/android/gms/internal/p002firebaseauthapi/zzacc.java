package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import oc.i1;
import oc.v1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacc extends zzacx<String, i1> {
    private final String zzy;
    private final String zzz;

    public zzacc(String str, String str2) {
        super(4);
        s.g(str, "code cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzd(this.zzy, this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        if (new v1(this.zzm).b() != 0) {
            zza(new Status(17499));
        } else {
            zzb(this.zzm.zzb());
        }
    }
}
