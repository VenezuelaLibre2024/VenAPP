package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.c */
/* loaded from: classes.dex */
final class C0605c extends AbstractC0630i0 {

    /* renamed from: a */
    private final Executor f2767a;

    /* renamed from: b */
    private final Handler f2768b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0605c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f2767a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f2768b = handler;
    }

    @Override // androidx.camera.core.impl.AbstractC0630i0
    /* renamed from: b */
    public Executor mo2996b() {
        return this.f2767a;
    }

    @Override // androidx.camera.core.impl.AbstractC0630i0
    /* renamed from: c */
    public Handler mo2997c() {
        return this.f2768b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0630i0)) {
            return false;
        }
        AbstractC0630i0 abstractC0630i0 = (AbstractC0630i0) obj;
        return this.f2767a.equals(abstractC0630i0.mo2996b()) && this.f2768b.equals(abstractC0630i0.mo2997c());
    }

    public int hashCode() {
        return ((this.f2767a.hashCode() ^ 1000003) * 1000003) ^ this.f2768b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2767a + ", schedulerHandler=" + this.f2768b + "}";
    }
}
