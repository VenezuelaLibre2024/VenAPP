package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.d */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC6172d implements Executor {

    /* renamed from: a */
    static final Executor f13097a = new ExecutorC6172d();

    private ExecutorC6172d() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
