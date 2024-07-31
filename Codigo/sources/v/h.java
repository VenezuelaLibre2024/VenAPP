package v;

import androidx.camera.camera2.internal.n0;
import androidx.camera.core.impl.b0;
import w.o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f27849a;

    public h(n0 n0Var) {
        this.f27849a = n0Var;
    }

    public static h a(o oVar) {
        b0 h10 = ((b0) oVar).h();
        androidx.core.util.h.b(h10 instanceof n0, "CameraInfo doesn't contain Camera2 implementation.");
        return ((n0) h10).k();
    }

    public String b() {
        return this.f27849a.b();
    }
}
