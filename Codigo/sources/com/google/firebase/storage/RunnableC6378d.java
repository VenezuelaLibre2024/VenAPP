package com.google.firebase.storage;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.TaskCompletionSource;
import gf.C7561c;
import p141hf.C7718a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.d */
/* loaded from: classes2.dex */
public class RunnableC6378d implements Runnable {

    /* renamed from: a */
    private C6401p f13800a;

    /* renamed from: b */
    private TaskCompletionSource<Void> f13801b;

    /* renamed from: c */
    private C7561c f13802c;

    public RunnableC6378d(C6401p c6401p, TaskCompletionSource<Void> taskCompletionSource) {
        C5276s.m13324j(c6401p);
        C5276s.m13324j(taskCompletionSource);
        this.f13800a = c6401p;
        this.f13801b = taskCompletionSource;
        C6382f m18009w = c6401p.m18009w();
        this.f13802c = new C7561c(m18009w.m17859a().m42630m(), m18009w.m17861c(), m18009w.m17860b(), m18009w.m17864i());
    }

    @Override // java.lang.Runnable
    public void run() {
        C7718a c7718a = new C7718a(this.f13800a.m18010x(), this.f13800a.m17999m());
        this.f13802c.m22959d(c7718a);
        c7718a.m23554a(this.f13801b, null);
    }
}
