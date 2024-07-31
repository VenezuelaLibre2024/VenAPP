package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f11727a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(a0 a0Var) {
        this.f11727a = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f11727a.Q1()).J(null, (String) com.google.android.gms.common.internal.s.j(task.getResult().g()));
    }
}
