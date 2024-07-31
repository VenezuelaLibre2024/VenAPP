package com.google.android.gms.internal.p498firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C6053c0;
import p272oc.C9855h0;
import p272oc.InterfaceC9859i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaap extends zzacx<C6053c0, InterfaceC9859i1> {
    private final String zzy;

    public zzaap(String str) {
        super(1);
        C5276s.m13321g(str, "refresh token cannot be null");
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zzb(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzacx
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzy);
        }
        ((InterfaceC9859i1) this.zze).mo16427a(this.zzj, this.zzd);
        zzb(C9855h0.m29540a(this.zzj.zzc()));
    }
}
