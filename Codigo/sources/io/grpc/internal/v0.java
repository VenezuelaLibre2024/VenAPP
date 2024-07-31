package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class v0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<T> f19176a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f19176a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f19176a.isEmpty();
    }

    public final void e(T t10, boolean z10) {
        int size = this.f19176a.size();
        if (z10) {
            this.f19176a.add(t10);
            if (size == 0) {
                b();
                return;
            }
            return;
        }
        if (this.f19176a.remove(t10) && size == 1) {
            c();
        }
    }
}
