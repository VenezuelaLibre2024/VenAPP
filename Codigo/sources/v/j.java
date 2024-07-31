package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.u1;
import v.j;
import w.z;

/* loaded from: classes.dex */
public class j implements u1 {
    private final n0 G;

    /* loaded from: classes.dex */
    public static final class a implements z<j> {

        /* renamed from: a */
        private final m1 f27852a = m1.a0();

        public static a e(n0 n0Var) {
            a aVar = new a();
            n0Var.c("camera2.captureRequest.option.", new n0.b() { // from class: v.i

                /* renamed from: b */
                public final /* synthetic */ n0 f27851b;

                public /* synthetic */ i(n0 n0Var2) {
                    r2 = n0Var2;
                }

                @Override // androidx.camera.core.impl.n0.b
                public final boolean a(n0.a aVar2) {
                    boolean f10;
                    f10 = j.a.f(j.a.this, r2, aVar2);
                    return f10;
                }
            });
            return aVar;
        }

        public static /* synthetic */ boolean f(a aVar, n0 n0Var, n0.a aVar2) {
            aVar.a().p(aVar2, n0Var.h(aVar2), n0Var.a(aVar2));
            return true;
        }

        @Override // w.z
        public l1 a() {
            return this.f27852a;
        }

        public j d() {
            return new j(p1.Y(this.f27852a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f27852a.r(q.a.W(key), valuet);
            return this;
        }
    }

    public j(n0 n0Var) {
        this.G = n0Var;
    }

    @Override // androidx.camera.core.impl.u1
    public n0 m() {
        return this.G;
    }
}
