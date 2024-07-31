package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import p140he.AbstractC7717d;

/* renamed from: com.google.firebase.installations.f */
/* loaded from: classes.dex */
class C6199f implements InterfaceC6201h {

    /* renamed from: a */
    final TaskCompletionSource<String> f13207a;

    public C6199f(TaskCompletionSource<String> taskCompletionSource) {
        this.f13207a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC6201h
    /* renamed from: a */
    public boolean mo16859a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC6201h
    /* renamed from: b */
    public boolean mo16860b(AbstractC7717d abstractC7717d) {
        if (!abstractC7717d.m23530l() && !abstractC7717d.m23529k() && !abstractC7717d.m23527i()) {
            return false;
        }
        this.f13207a.trySetResult(abstractC7717d.mo23499d());
        return true;
    }
}
