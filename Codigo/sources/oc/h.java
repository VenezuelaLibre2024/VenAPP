package oc;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends com.google.firebase.auth.h0 {

    /* renamed from: a, reason: collision with root package name */
    private final d f22392a;

    public h(d dVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        this.f22392a = dVar;
    }

    @Override // com.google.firebase.auth.h0
    public final Task<Void> a(com.google.firebase.auth.i0 i0Var, String str) {
        com.google.android.gms.common.internal.s.j(i0Var);
        d dVar = this.f22392a;
        return FirebaseAuth.getInstance(dVar.Q1()).N(dVar, i0Var, str);
    }

    @Override // com.google.firebase.auth.h0
    public final List<com.google.firebase.auth.j0> b() {
        return this.f22392a.zzh();
    }

    @Override // com.google.firebase.auth.h0
    public final Task<com.google.firebase.auth.l0> c() {
        return this.f22392a.v1(false).continueWithTask(new k(this));
    }

    @Override // com.google.firebase.auth.h0
    public final Task<Void> d(String str) {
        com.google.android.gms.common.internal.s.f(str);
        d dVar = this.f22392a;
        return FirebaseAuth.getInstance(dVar.Q1()).Q(dVar, str);
    }
}
