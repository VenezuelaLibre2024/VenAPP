package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f13009a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f13010b = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.google.mlkit.common.sdkinternal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0186a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.q
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f13009a;
        final Set set = aVar.f13010b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC0186a b(Object obj, Runnable runnable) {
        s sVar = new s(obj, this.f13009a, this.f13010b, runnable, null);
        this.f13010b.add(sVar);
        return sVar;
    }
}
