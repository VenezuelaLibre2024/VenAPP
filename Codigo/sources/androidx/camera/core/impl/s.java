package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.utils.j;

/* loaded from: classes.dex */
public interface s {

    /* loaded from: classes.dex */
    public static final class a implements s {
        public static s i() {
            return new a();
        }

        @Override // androidx.camera.core.impl.s
        public f2 b() {
            return f2.b();
        }

        @Override // androidx.camera.core.impl.s
        public long c() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.s
        public r d() {
            return r.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.s
        public p f() {
            return p.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.s
        public q g() {
            return q.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.s
        public n h() {
            return n.UNKNOWN;
        }
    }

    default void a(j.b bVar) {
        bVar.g(d());
    }

    f2 b();

    long c();

    r d();

    default CaptureResult e() {
        return a.i().e();
    }

    p f();

    q g();

    n h();
}
