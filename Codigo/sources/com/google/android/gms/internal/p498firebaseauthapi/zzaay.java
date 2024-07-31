package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6072h;
import p272oc.C9842d;
import p272oc.C9868l1;
import p272oc.InterfaceC9859i1;

/* loaded from: classes2.dex */
final class zzaay extends zzacx<Void, InterfaceC9859i1> {
    private final zzagt zzy;

    public zzaay(AbstractC6072h abstractC6072h, String str) {
        super(2);
        C5276s.m13325k(abstractC6072h, "credential cannot be null");
        this.zzy = C9868l1.m29554a(abstractC6072h, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        C9842d zza = zzaai.zza(this.zzc, this.zzk);
        if (!this.zzd.mo16454l().equalsIgnoreCase(zza.mo16454l())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zza);
            zzb(null);
        }
    }
}
