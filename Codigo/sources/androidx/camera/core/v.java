package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class v extends e {

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f2762d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(o oVar) {
        super(oVar);
        this.f2762d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        if (this.f2762d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
