package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabu extends zzacx<Void, InterfaceC9859i1> {
    private final String zzaa;
    private final String zzy;
    private final String zzz;

    public zzabu(String str, String str2, String str3) {
        super(2);
        this.zzy = C5276s.m13320f(str);
        this.zzz = C5276s.m13320f(str2);
        this.zzaa = str3;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzz, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
