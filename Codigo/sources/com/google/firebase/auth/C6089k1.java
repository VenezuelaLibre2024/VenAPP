package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.k1 */
/* loaded from: classes.dex */
public final class C6089k1 implements Continuation<C6053c0, Task<Void>> {

    /* renamed from: a */
    private final /* synthetic */ C6060e f12936a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC6045a0 f12937b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6089k1(AbstractC6045a0 abstractC6045a0, C6060e c6060e) {
        this.f12937b = abstractC6045a0;
        this.f12936a = c6060e;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C6053c0> task) {
        return FirebaseAuth.getInstance(this.f12937b.mo16447Q1()).m16372J(this.f12936a, (String) C5276s.m13324j(task.getResult().m16477g()));
    }
}
