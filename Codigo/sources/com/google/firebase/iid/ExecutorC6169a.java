package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC6169a implements Executor {

    /* renamed from: a */
    static final Executor f13092a = new ExecutorC6169a();

    private ExecutorC6169a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
