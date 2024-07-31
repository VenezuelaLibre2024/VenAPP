package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.core.v */
/* loaded from: classes.dex */
final class C0717v extends AbstractC0592e {

    /* renamed from: d */
    private final AtomicBoolean f3107d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0717v(InterfaceC0710o interfaceC0710o) {
        super(interfaceC0710o);
        this.f3107d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.AbstractC0592e, androidx.camera.core.InterfaceC0710o, java.lang.AutoCloseable
    public void close() {
        if (this.f3107d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
