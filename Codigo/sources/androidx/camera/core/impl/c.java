package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends i0 {

    /* renamed from: a */
    private final Executor f2446a;

    /* renamed from: b */
    private final Handler f2447b;

    public c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f2446a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f2447b = handler;
    }

    @Override // androidx.camera.core.impl.i0
    public Executor b() {
        return this.f2446a;
    }

    @Override // androidx.camera.core.impl.i0
    public Handler c() {
        return this.f2447b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f2446a.equals(i0Var.b()) && this.f2447b.equals(i0Var.c());
    }

    public int hashCode() {
        return ((this.f2446a.hashCode() ^ 1000003) * 1000003) ^ this.f2447b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2446a + ", schedulerHandler=" + this.f2447b + "}";
    }
}
