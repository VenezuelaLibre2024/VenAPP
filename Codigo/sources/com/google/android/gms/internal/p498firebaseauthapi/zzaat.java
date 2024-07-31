package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.InterfaceC6076i;
import p272oc.C9842d;
import p272oc.C9868l1;
import p272oc.C9901w1;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaat extends zzacx<InterfaceC6076i, InterfaceC9859i1> {
    private final zzagt zzy;

    public zzaat(AbstractC6072h abstractC6072h) {
        super(2);
        C5276s.m13325k(abstractC6072h, "credential cannot be null");
        this.zzy = C9868l1.m29554a(abstractC6072h, null);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzd.zze(), this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        C9842d zza = zzaai.zza(this.zzc, this.zzk);
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zza);
        zzb(new C9901w1(zza));
    }
}
