package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f11893a = new h();

    private h() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
