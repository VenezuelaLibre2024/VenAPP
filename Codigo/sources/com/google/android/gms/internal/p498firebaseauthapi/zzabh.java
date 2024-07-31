package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C6060e;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabh extends zzacx<Void, InterfaceC9859i1> {
    private final zzyc zzy;
    private final String zzz;

    public zzabh(String str, C6060e c6060e, String str2, String str3, String str4) {
        super(4);
        C5276s.m13321g(str, "email cannot be null or empty");
        this.zzy = new zzyc(str, c6060e, str2, str3);
        this.zzz = str4;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        zzb(null);
    }
}
