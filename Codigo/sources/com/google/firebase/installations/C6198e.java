package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p140he.AbstractC7717d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes.dex */
public class C6198e implements InterfaceC6201h {

    /* renamed from: a */
    private final C6202i f13205a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC6200g> f13206b;

    public C6198e(C6202i c6202i, TaskCompletionSource<AbstractC6200g> taskCompletionSource) {
        this.f13205a = c6202i;
        this.f13206b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC6201h
    /* renamed from: a */
    public boolean mo16859a(Exception exc) {
        this.f13206b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC6201h
    /* renamed from: b */
    public boolean mo16860b(AbstractC7717d abstractC7717d) {
        if (!abstractC7717d.m23529k() || this.f13205a.m16869f(abstractC7717d)) {
            return false;
        }
        this.f13206b.setResult(AbstractC6200g.m16861a().mo16818b(abstractC7717d.mo23497b()).mo16820d(abstractC7717d.mo23498c()).mo16819c(abstractC7717d.mo23503h()).mo16817a());
        return true;
    }
}
