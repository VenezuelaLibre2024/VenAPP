package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f11882a = new d();

    private d() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
