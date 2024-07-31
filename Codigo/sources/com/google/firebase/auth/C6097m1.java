package com.google.firebase.auth;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.m1 */
/* loaded from: classes.dex */
public final class C6097m1 implements Continuation<C6053c0, Task<Void>> {

    /* renamed from: a */
    private final /* synthetic */ String f12945a;

    /* renamed from: b */
    private final /* synthetic */ C6060e f12946b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC6045a0 f12947c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6097m1(AbstractC6045a0 abstractC6045a0, String str, C6060e c6060e) {
        this.f12947c = abstractC6045a0;
        this.f12945a = str;
        this.f12946b = c6060e;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<C6053c0> task) {
        return FirebaseAuth.getInstance(this.f12947c.mo16447Q1()).m16382V((String) C5276s.m13324j(task.getResult().m16477g()), this.f12945a, this.f12946b);
    }
}
