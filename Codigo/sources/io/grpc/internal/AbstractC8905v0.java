package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: io.grpc.internal.v0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8905v0<T> {

    /* renamed from: a */
    private final Set<T> f20923a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public final boolean m25863a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f20923a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected abstract void mo25542b();

    /* renamed from: c */
    protected abstract void mo25543c();

    /* renamed from: d */
    public final boolean m25864d() {
        return !this.f20923a.isEmpty();
    }

    /* renamed from: e */
    public final void m25865e(T t10, boolean z10) {
        int size = this.f20923a.size();
        if (z10) {
            this.f20923a.add(t10);
            if (size == 0) {
                mo25542b();
                return;
            }
            return;
        }
        if (this.f20923a.remove(t10) && size == 1) {
            mo25543c();
        }
    }
}
