package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f11878a = a.f11877a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return f11878a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ma.b("firebase-iid-executor"));
    }
}
