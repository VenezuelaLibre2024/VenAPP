package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6077i0;
import com.google.firebase.auth.InterfaceC6076i;
import p272oc.C9842d;
import p272oc.C9901w1;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaq extends zzacx<InterfaceC6076i, InterfaceC9859i1> {
    private final String zzaa;
    private final AbstractC6077i0 zzy;
    private final String zzz;

    public zzaaq(AbstractC6077i0 abstractC6077i0, String str, String str2) {
        super(2);
        this.zzy = (AbstractC6077i0) C5276s.m13324j(abstractC6077i0);
        this.zzz = C5276s.m13320f(str);
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzz, this.zzy, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        C9842d zza = zzaai.zza(this.zzc, this.zzk);
        AbstractC6045a0 abstractC6045a0 = this.zzd;
        if (abstractC6045a0 != null && !abstractC6045a0.mo16454l().equalsIgnoreCase(zza.mo16454l())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, zza);
            zzb(new C9901w1(zza));
        }
    }
}
