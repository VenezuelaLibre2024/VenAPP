package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ma.ThreadFactoryC9560b;
import ne.C9710b;
import ne.EnumC9711c;

/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes.dex */
class C6247n {
    /* renamed from: a */
    private static Executor m17132a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC9560b(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m17133b() {
        return m17132a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ScheduledExecutorService m17134c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC9560b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m17135d() {
        return C9710b.m29102a().mo29101a(new ThreadFactoryC9560b("Firebase-Messaging-Intent-Handle"), EnumC9711c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ExecutorService m17136e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC9560b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static ExecutorService m17137f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC9560b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static ScheduledExecutorService m17138g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC9560b("Firebase-Messaging-Topics-Io"));
    }
}
