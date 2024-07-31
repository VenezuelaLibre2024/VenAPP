package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements i {

    /* renamed from: a, reason: collision with root package name */
    private final d f4896a;

    public SingleGeneratedAdapterObserver(d generatedAdapter) {
        kotlin.jvm.internal.n.e(generatedAdapter, "generatedAdapter");
        this.f4896a = generatedAdapter;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        this.f4896a.a(source, event, false, null);
        this.f4896a.a(source, event, true, null);
    }
}
