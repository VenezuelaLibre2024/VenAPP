package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements i {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f4892a;

    public SavedStateHandleAttacher(b0 provider) {
        kotlin.jvm.internal.n.e(provider, "provider");
        this.f4892a = provider;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        if (event == f.a.ON_CREATE) {
            source.getLifecycle().c(this);
            this.f4892a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
