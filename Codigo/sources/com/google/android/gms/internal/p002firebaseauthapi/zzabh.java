package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
import oc.i1;

/* loaded from: classes2.dex */
final class zzabh extends zzacx<Void, i1> {
    private final zzyc zzy;
    private final String zzz;

    public zzabh(String str, e eVar, String str2, String str3, String str4) {
        super(4);
        s.g(str, "email cannot be null or empty");
        this.zzy = new zzyc(str, eVar, str2, str3);
        this.zzz = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        zzb(null);
    }
}
