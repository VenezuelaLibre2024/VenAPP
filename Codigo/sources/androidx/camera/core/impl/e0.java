package androidx.camera.core.impl;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2453a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, c0> f2454b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set<c0> f2455c = new HashSet();

    public LinkedHashSet<c0> a() {
        LinkedHashSet<c0> linkedHashSet;
        synchronized (this.f2453a) {
            linkedHashSet = new LinkedHashSet<>(this.f2454b.values());
        }
        return linkedHashSet;
    }

    public void b(a0 a0Var) {
        synchronized (this.f2453a) {
            try {
                try {
                    for (String str : a0Var.b()) {
                        w.o0.a("CameraRepository", "Added camera: " + str);
                        this.f2454b.put(str, a0Var.a(str));
                    }
                } catch (w.r e10) {
                    throw new w.n0(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
