package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.storage.f0 */
/* loaded from: classes2.dex */
public class C6383f0 {

    /* renamed from: c */
    private static final C6383f0 f13840c = new C6383f0();

    /* renamed from: a */
    private final Map<String, WeakReference<AbstractC6381e0<?>>> f13841a = new HashMap();

    /* renamed from: b */
    private final Object f13842b = new Object();

    C6383f0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6383f0 m17874b() {
        return f13840c;
    }

    /* renamed from: a */
    public void m17875a(AbstractC6381e0<?> abstractC6381e0) {
        synchronized (this.f13842b) {
            this.f13841a.put(abstractC6381e0.mo17785I().toString(), new WeakReference<>(abstractC6381e0));
        }
    }

    /* renamed from: c */
    public void m17876c(AbstractC6381e0<?> abstractC6381e0) {
        synchronized (this.f13842b) {
            String c6401p = abstractC6381e0.mo17785I().toString();
            WeakReference<AbstractC6381e0<?>> weakReference = this.f13841a.get(c6401p);
            AbstractC6381e0<?> abstractC6381e02 = weakReference != null ? weakReference.get() : null;
            if (abstractC6381e02 == null || abstractC6381e02 == abstractC6381e0) {
                this.f13841a.remove(c6401p);
            }
        }
    }
}
