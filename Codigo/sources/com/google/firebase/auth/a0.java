package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a0 extends ea.a implements c1 {
    public abstract boolean A1();

    public Task<i> B1(h hVar) {
        com.google.android.gms.common.internal.s.j(hVar);
        return FirebaseAuth.getInstance(Q1()).M(this, hVar);
    }

    public Task<i> C1(h hVar) {
        com.google.android.gms.common.internal.s.j(hVar);
        return FirebaseAuth.getInstance(Q1()).s0(this, hVar);
    }

    public Task<Void> D1() {
        return FirebaseAuth.getInstance(Q1()).l0(this);
    }

    @Override // com.google.firebase.auth.c1
    public abstract String E();

    public Task<Void> E1() {
        return FirebaseAuth.getInstance(Q1()).S(this, false).continueWithTask(new l1(this));
    }

    public Task<Void> F1(e eVar) {
        return FirebaseAuth.getInstance(Q1()).S(this, false).continueWithTask(new k1(this, eVar));
    }

    public Task<i> G1(Activity activity, n nVar) {
        com.google.android.gms.common.internal.s.j(activity);
        com.google.android.gms.common.internal.s.j(nVar);
        return FirebaseAuth.getInstance(Q1()).I(activity, nVar, this);
    }

    public Task<i> H1(Activity activity, n nVar) {
        com.google.android.gms.common.internal.s.j(activity);
        com.google.android.gms.common.internal.s.j(nVar);
        return FirebaseAuth.getInstance(Q1()).k0(activity, nVar, this);
    }

    public Task<i> I1(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return FirebaseAuth.getInstance(Q1()).m0(this, str);
    }

    @Deprecated
    public Task<Void> J1(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return FirebaseAuth.getInstance(Q1()).t0(this, str);
    }

    public Task<Void> K1(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return FirebaseAuth.getInstance(Q1()).v0(this, str);
    }

    public Task<Void> L1(o0 o0Var) {
        return FirebaseAuth.getInstance(Q1()).O(this, o0Var);
    }

    public Task<Void> M1(d1 d1Var) {
        com.google.android.gms.common.internal.s.j(d1Var);
        return FirebaseAuth.getInstance(Q1()).P(this, d1Var);
    }

    public Task<Void> N1(String str) {
        return O1(str, null);
    }

    public Task<Void> O1(String str, e eVar) {
        return FirebaseAuth.getInstance(Q1()).S(this, false).continueWithTask(new m1(this, str, eVar));
    }

    public abstract a0 P1(List<? extends c1> list);

    public abstract zb.g Q1();

    @Override // com.google.firebase.auth.c1
    public abstract String R();

    public abstract void R1(zzafn zzafnVar);

    public abstract a0 S1();

    public abstract void T1(List<j0> list);

    public abstract zzafn U1();

    public abstract List<String> V1();

    @Override // com.google.firebase.auth.c1
    public abstract String l();

    @Override // com.google.firebase.auth.c1
    public abstract String r();

    public Task<Void> u1() {
        return FirebaseAuth.getInstance(Q1()).L(this);
    }

    @Override // com.google.firebase.auth.c1
    public abstract Uri v0();

    public Task<c0> v1(boolean z10) {
        return FirebaseAuth.getInstance(Q1()).S(this, z10);
    }

    public abstract b0 w1();

    public abstract h0 x1();

    public abstract List<? extends c1> y1();

    public abstract String z1();

    public abstract String zzd();

    public abstract String zze();
}
