package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.a */
/* loaded from: classes2.dex */
public class C6508a {

    /* renamed from: a */
    private final ReferenceQueue f14283a = new ReferenceQueue();

    /* renamed from: b */
    private final Set f14284b = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.google.mlkit.common.sdkinternal.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo18302a();
    }

    private C6508a() {
    }

    /* renamed from: a */
    public static C6508a m18300a() {
        C6508a c6508a = new C6508a();
        c6508a.m18301b(c6508a, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.q
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c6508a.f14283a;
        final Set set = c6508a.f14284b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C6537s) referenceQueue2.remove()).mo18302a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c6508a;
    }

    /* renamed from: b */
    public a m18301b(Object obj, Runnable runnable) {
        C6537s c6537s = new C6537s(obj, this.f14283a, this.f14284b, runnable, null);
        this.f14284b.add(c6537s);
        return c6537s;
    }
}
