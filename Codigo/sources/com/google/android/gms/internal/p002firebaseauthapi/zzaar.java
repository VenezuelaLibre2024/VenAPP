package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaar extends zzacx<zzafk, Void> {
    private final zzxx zzy;

    public zzaar(String str, String str2) {
        super(10);
        s.f(str2);
        this.zzy = new zzxx(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final String zza() {
        return "getRecaptchaConfig";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zzb() {
        zzb(this.zzt);
    }
}
