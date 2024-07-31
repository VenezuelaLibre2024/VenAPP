package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.impl.y1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface y extends w.j {

    /* renamed from: a */
    public static final y f2671a = new a();

    /* loaded from: classes.dex */
    class a implements y {
        a() {
        }

        @Override // androidx.camera.core.impl.y
        public void a(y1.b bVar) {
        }

        @Override // w.j
        public com.google.common.util.concurrent.f<Void> b(float f10) {
            return a0.f.h(null);
        }

        @Override // androidx.camera.core.impl.y
        public com.google.common.util.concurrent.f<List<Void>> c(List<l0> list, int i10, int i11) {
            return a0.f.h(Collections.emptyList());
        }

        @Override // w.j
        public com.google.common.util.concurrent.f<Void> d(float f10) {
            return a0.f.h(null);
        }

        @Override // androidx.camera.core.impl.y
        public Rect e() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.y
        public void f(int i10) {
        }

        @Override // w.j
        public com.google.common.util.concurrent.f<Void> g(boolean z10) {
            return a0.f.h(null);
        }

        @Override // androidx.camera.core.impl.y
        public n0 h() {
            return null;
        }

        @Override // androidx.camera.core.impl.y
        public void i(n0 n0Var) {
        }

        @Override // androidx.camera.core.impl.y
        public void j() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a */
        private m f2672a;

        public b(m mVar) {
            this.f2672a = mVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(List<l0> list);
    }

    void a(y1.b bVar);

    com.google.common.util.concurrent.f<List<Void>> c(List<l0> list, int i10, int i11);

    Rect e();

    void f(int i10);

    n0 h();

    void i(n0 n0Var);

    void j();
}
