package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v2 implements oc.w, oc.i1 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11794a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(FirebaseAuth firebaseAuth) {
        this.f11794a = firebaseAuth;
    }

    @Override // oc.i1
    public final void a(zzafn zzafnVar, a0 a0Var) {
        this.f11794a.f0(a0Var, zzafnVar, true, true);
    }

    @Override // oc.w
    public final void zza(Status status) {
        int v12 = status.v1();
        if (v12 == 17011 || v12 == 17021 || v12 == 17005) {
            this.f11794a.C();
        }
    }
}
