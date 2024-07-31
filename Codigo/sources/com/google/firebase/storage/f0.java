package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: c */
    private static final f0 f12608c = new f0();

    /* renamed from: a */
    private final Map<String, WeakReference<e0<?>>> f12609a = new HashMap();

    /* renamed from: b */
    private final Object f12610b = new Object();

    f0() {
    }

    public static f0 b() {
        return f12608c;
    }

    public void a(e0<?> e0Var) {
        synchronized (this.f12610b) {
            this.f12609a.put(e0Var.I().toString(), new WeakReference<>(e0Var));
        }
    }

    public void c(e0<?> e0Var) {
        synchronized (this.f12610b) {
            String pVar = e0Var.I().toString();
            WeakReference<e0<?>> weakReference = this.f12609a.get(pVar);
            e0<?> e0Var2 = weakReference != null ? weakReference.get() : null;
            if (e0Var2 == null || e0Var2 == e0Var) {
                this.f12609a.remove(pVar);
            }
        }
    }
}
