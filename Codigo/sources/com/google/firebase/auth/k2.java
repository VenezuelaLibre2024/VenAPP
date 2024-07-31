package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.firebase.auth.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k2 extends q0.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p0 f11723a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q0.b f11724b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f11725c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(FirebaseAuth firebaseAuth, p0 p0Var, q0.b bVar) {
        this.f11725c = firebaseAuth;
        this.f11723a = p0Var;
        this.f11724b = bVar;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f11724b.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onCodeSent(String str, q0.a aVar) {
        this.f11724b.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationCompleted(o0 o0Var) {
        this.f11724b.onVerificationCompleted(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void onVerificationFailed(zb.m mVar) {
        if (zzacf.zza(mVar)) {
            this.f11723a.b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f11723a.i());
            FirebaseAuth.g0(this.f11723a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f11723a.i() + ", error - " + mVar.getMessage());
        this.f11724b.onVerificationFailed(mVar);
    }
}
