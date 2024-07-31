package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.l1 */
/* loaded from: classes.dex */
public final class C6093l1 implements Continuation<C6053c0, Task<Void>> {

    /* renamed from: a */
    private final /* synthetic */ AbstractC6045a0 f12942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6093l1(AbstractC6045a0 abstractC6045a0) {
        this.f12942a = abstractC6045a0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C6053c0> task) {
        return FirebaseAuth.getInstance(this.f12942a.mo16447Q1()).m16372J(null, (String) C5276s.m13324j(task.getResult().m16477g()));
    }
}
