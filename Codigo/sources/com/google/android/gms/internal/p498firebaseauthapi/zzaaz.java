package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C6083j;
import com.google.firebase.auth.InterfaceC6076i;
import p272oc.C9842d;
import p272oc.C9901w1;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaz extends zzacx<InterfaceC6076i, InterfaceC9859i1> {
    private final zzyd zzy;

    public zzaaz(C6083j c6083j, String str) {
        super(2);
        C5276s.m13325k(c6083j, "credential cannot be null or empty");
        this.zzy = new zzyd(c6083j, str);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
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
            zzb(new C9901w1(zza));
        }
    }
}
