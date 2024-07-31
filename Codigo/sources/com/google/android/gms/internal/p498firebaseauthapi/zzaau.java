package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C6083j;
import com.google.firebase.auth.InterfaceC6076i;
import p272oc.C9842d;
import p272oc.C9901w1;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaau extends zzacx<InterfaceC6076i, InterfaceC9859i1> {
    private final C6083j zzy;
    private final String zzz;

    public zzaau(C6083j c6083j, String str) {
        super(2);
        this.zzy = (C6083j) C5276s.m13325k(c6083j, "credential cannot be null");
        C5276s.m13321g(c6083j.zzc(), "email cannot be null");
        C5276s.m13321g(c6083j.zzd(), "password cannot be null");
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy.zzc(), C5276s.m13320f(this.zzy.zzd()), this.zzd.zze(), this.zzd.mo16462z1(), this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        C9842d zza = zzaai.zza(this.zzc, this.zzk);
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zza);
        zzb(new C9901w1(zza));
    }
}
