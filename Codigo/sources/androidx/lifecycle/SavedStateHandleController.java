package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f4893a;

    /* renamed from: b, reason: collision with root package name */
    private final z f4894b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4895c;

    public SavedStateHandleController(String key, z handle) {
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(handle, "handle");
        this.f4893a = key;
        this.f4894b = handle;
    }

    public final void a(androidx.savedstate.a registry, f lifecycle) {
        kotlin.jvm.internal.n.e(registry, "registry");
        kotlin.jvm.internal.n.e(lifecycle, "lifecycle");
        if (!(!this.f4895c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f4895c = true;
        lifecycle.a(this);
        registry.h(this.f4893a, this.f4894b.c());
    }

    public final z b() {
        return this.f4894b;
    }

    public final boolean c() {
        return this.f4895c;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        if (event == f.a.ON_DESTROY) {
            this.f4895c = false;
            source.getLifecycle().c(this);
        }
    }
}
