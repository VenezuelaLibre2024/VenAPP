package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: a, reason: collision with root package name */
    private final d[] f4873a;

    public CompositeGeneratedAdaptersObserver(d[] generatedAdapters) {
        kotlin.jvm.internal.n.e(generatedAdapters, "generatedAdapters");
        this.f4873a = generatedAdapters;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        q qVar = new q();
        for (d dVar : this.f4873a) {
            dVar.a(source, event, false, qVar);
        }
        for (d dVar2 : this.f4873a) {
            dVar2.a(source, event, true, qVar);
        }
    }
}
