package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f11721a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ a0 f11722b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(a0 a0Var, e eVar) {
        this.f11722b = a0Var;
        this.f11721a = eVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f11722b.Q1()).J(this.f11721a, (String) com.google.android.gms.common.internal.s.j(task.getResult().g()));
    }
}
