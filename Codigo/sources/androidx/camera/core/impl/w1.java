package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public class w1 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    private final y f2665c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f2666d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Set<Integer> f2667e;

    public w1(y yVar) {
        super(yVar);
        this.f2666d = false;
        this.f2665c = yVar;
    }

    @Override // androidx.camera.core.impl.z0, w.j
    public com.google.common.util.concurrent.f<Void> b(float f10) {
        return !l(0) ? a0.f.f(new IllegalStateException("Zoom is not supported")) : this.f2665c.b(f10);
    }

    @Override // androidx.camera.core.impl.z0, w.j
    public com.google.common.util.concurrent.f<Void> d(float f10) {
        return !l(0) ? a0.f.f(new IllegalStateException("Zoom is not supported")) : this.f2665c.d(f10);
    }

    @Override // androidx.camera.core.impl.z0, w.j
    public com.google.common.util.concurrent.f<Void> g(boolean z10) {
        return !l(6) ? a0.f.f(new IllegalStateException("Torch is not supported")) : this.f2665c.g(z10);
    }

    public void k(boolean z10, Set<Integer> set) {
        this.f2666d = z10;
        this.f2667e = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(int... iArr) {
        if (!this.f2666d || this.f2667e == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return this.f2667e.containsAll(arrayList);
    }
}
