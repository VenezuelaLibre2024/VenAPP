package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 implements Continuation<c0, Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f11730a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ e f11731b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a0 f11732c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(a0 a0Var, String str, e eVar) {
        this.f11732c = a0Var;
        this.f11730a = str;
        this.f11731b = eVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<c0> task) {
        return FirebaseAuth.getInstance(this.f11732c.Q1()).V((String) com.google.android.gms.common.internal.s.j(task.getResult().g()), this.f11730a, this.f11731b);
    }
}
