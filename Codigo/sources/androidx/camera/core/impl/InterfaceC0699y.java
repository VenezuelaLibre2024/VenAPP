package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.impl.C0701y1;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Collections;
import java.util.List;
import p002a0.C0009f;
import p407w.InterfaceC12016j;

/* renamed from: androidx.camera.core.impl.y */
/* loaded from: classes.dex */
public interface InterfaceC0699y extends InterfaceC12016j {

    /* renamed from: a */
    public static final InterfaceC0699y f3016a = new a();

    /* renamed from: androidx.camera.core.impl.y$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0699y {
        a() {
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: a */
        public void mo2720a(C0701y1.b bVar) {
        }

        @Override // p407w.InterfaceC12016j
        /* renamed from: b */
        public InterfaceFutureC5920f<Void> mo2722b(float f10) {
            return C0009f.m22h(null);
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: c */
        public InterfaceFutureC5920f<List<Void>> mo2724c(List<C0642l0> list, int i10, int i11) {
            return C0009f.m22h(Collections.emptyList());
        }

        @Override // p407w.InterfaceC12016j
        /* renamed from: d */
        public InterfaceFutureC5920f<Void> mo2726d(float f10) {
            return C0009f.m22h(null);
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: e */
        public Rect mo2728e() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: f */
        public void mo2730f(int i10) {
        }

        @Override // p407w.InterfaceC12016j
        /* renamed from: g */
        public InterfaceFutureC5920f<Void> mo2732g(boolean z10) {
            return C0009f.m22h(null);
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: h */
        public InterfaceC0649n0 mo2733h() {
            return null;
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: i */
        public void mo2734i(InterfaceC0649n0 interfaceC0649n0) {
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y
        /* renamed from: j */
        public void mo2735j() {
        }
    }

    /* renamed from: androidx.camera.core.impl.y$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a */
        private C0645m f3017a;

        public b(C0645m c0645m) {
            this.f3017a = c0645m;
        }
    }

    /* renamed from: androidx.camera.core.impl.y$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo2515a();

        /* renamed from: b */
        void mo2516b(List<C0642l0> list);
    }

    /* renamed from: a */
    void mo2720a(C0701y1.b bVar);

    /* renamed from: c */
    InterfaceFutureC5920f<List<Void>> mo2724c(List<C0642l0> list, int i10, int i11);

    /* renamed from: e */
    Rect mo2728e();

    /* renamed from: f */
    void mo2730f(int i10);

    /* renamed from: h */
    InterfaceC0649n0 mo2733h();

    /* renamed from: i */
    void mo2734i(InterfaceC0649n0 interfaceC0649n0);

    /* renamed from: j */
    void mo2735j();
}
