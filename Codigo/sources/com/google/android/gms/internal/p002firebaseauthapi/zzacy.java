package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.q0;

/* loaded from: classes2.dex */
final class zzacy implements zzadf {
    private final /* synthetic */ String zza;

    public zzacy(zzacz zzaczVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(q0.b bVar, Object... objArr) {
        bVar.onCodeSent(this.zza, q0.a.u1());
    }
}
