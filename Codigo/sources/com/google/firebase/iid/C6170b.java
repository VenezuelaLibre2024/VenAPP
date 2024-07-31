package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ma.ThreadFactoryC9560b;

/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes.dex */
class C6170b {

    /* renamed from: a */
    private static final Executor f13093a = ExecutorC6169a.f13092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m16750a() {
        return f13093a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ExecutorService m16751b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC9560b("firebase-iid-executor"));
    }
}
