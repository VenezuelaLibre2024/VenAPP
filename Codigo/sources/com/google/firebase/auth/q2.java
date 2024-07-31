package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 implements oc.t {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f11780a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f11781b = firebaseAuth;
        this.f11780a = a0Var;
    }

    @Override // oc.t
    public final void zza() {
        a0 a0Var;
        a0 a0Var2;
        a0Var = this.f11781b.f11610f;
        if (a0Var != null) {
            a0Var2 = this.f11781b.f11610f;
            if (a0Var2.l().equalsIgnoreCase(this.f11780a.l())) {
                this.f11781b.F0();
            }
        }
    }

    @Override // oc.w
    public final void zza(Status status) {
        if (status.v1() == 17011 || status.v1() == 17021 || status.v1() == 17005) {
            this.f11781b.C();
        }
    }
}
