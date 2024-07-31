package com.google.firebase.storage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private p f12568a;

    /* renamed from: b, reason: collision with root package name */
    private TaskCompletionSource<Void> f12569b;

    /* renamed from: c, reason: collision with root package name */
    private gf.c f12570c;

    public d(p pVar, TaskCompletionSource<Void> taskCompletionSource) {
        com.google.android.gms.common.internal.s.j(pVar);
        com.google.android.gms.common.internal.s.j(taskCompletionSource);
        this.f12568a = pVar;
        this.f12569b = taskCompletionSource;
        f w10 = pVar.w();
        this.f12570c = new gf.c(w10.a().m(), w10.c(), w10.b(), w10.i());
    }

    @Override // java.lang.Runnable
    public void run() {
        hf.a aVar = new hf.a(this.f12568a.x(), this.f12568a.m());
        this.f12570c.d(aVar);
        aVar.a(this.f12569b, null);
    }
}
