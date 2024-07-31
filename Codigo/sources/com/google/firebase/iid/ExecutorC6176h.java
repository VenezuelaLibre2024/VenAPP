package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.h */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC6176h implements Executor {

    /* renamed from: a */
    static final Executor f13108a = new ExecutorC6176h();

    private ExecutorC6176h() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
