package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f2675a;

    /* renamed from: b, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f2676b;

    /* renamed from: c, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f2677c;

    /* renamed from: d, reason: collision with root package name */
    private final List<k> f2678d;

    /* renamed from: e, reason: collision with root package name */
    private final List<c> f2679e;

    /* renamed from: f, reason: collision with root package name */
    private final l0 f2680f;

    /* renamed from: g, reason: collision with root package name */
    private InputConfiguration f2681g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Set<e> f2682a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final l0.a f2683b = new l0.a();

        /* renamed from: c, reason: collision with root package name */
        final List<CameraDevice.StateCallback> f2684c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f2685d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final List<c> f2686e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List<k> f2687f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        InputConfiguration f2688g;

        a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public static b p(k2<?> k2Var, Size size) {
            d T = k2Var.T(null);
            if (T != null) {
                b bVar = new b();
                T.a(size, k2Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + k2Var.u(k2Var.toString()));
        }

        public b a(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return this;
        }

        public b b(Collection<k> collection) {
            this.f2683b.a(collection);
            return this;
        }

        public b c(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            return this;
        }

        public b d(k kVar) {
            this.f2683b.c(kVar);
            if (!this.f2687f.contains(kVar)) {
                this.f2687f.add(kVar);
            }
            return this;
        }

        public b e(CameraDevice.StateCallback stateCallback) {
            if (this.f2684c.contains(stateCallback)) {
                return this;
            }
            this.f2684c.add(stateCallback);
            return this;
        }

        public b f(c cVar) {
            this.f2686e.add(cVar);
            return this;
        }

        public b g(n0 n0Var) {
            this.f2683b.e(n0Var);
            return this;
        }

        public b h(r0 r0Var) {
            return i(r0Var, w.y.f29577d);
        }

        public b i(r0 r0Var, w.y yVar) {
            this.f2682a.add(e.a(r0Var).b(yVar).a());
            return this;
        }

        public b j(k kVar) {
            this.f2683b.c(kVar);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f2685d.contains(stateCallback)) {
                return this;
            }
            this.f2685d.add(stateCallback);
            return this;
        }

        public b l(r0 r0Var) {
            return m(r0Var, w.y.f29577d);
        }

        public b m(r0 r0Var, w.y yVar) {
            this.f2682a.add(e.a(r0Var).b(yVar).a());
            this.f2683b.f(r0Var);
            return this;
        }

        public b n(String str, Object obj) {
            this.f2683b.g(str, obj);
            return this;
        }

        public y1 o() {
            return new y1(new ArrayList(this.f2682a), new ArrayList(this.f2684c), new ArrayList(this.f2685d), new ArrayList(this.f2687f), new ArrayList(this.f2686e), this.f2683b.h(), this.f2688g);
        }

        public b q(Range<Integer> range) {
            this.f2683b.p(range);
            return this;
        }

        public b r(n0 n0Var) {
            this.f2683b.q(n0Var);
            return this;
        }

        public b s(InputConfiguration inputConfiguration) {
            this.f2688g = inputConfiguration;
            return this;
        }

        public b t(int i10) {
            this.f2683b.r(i10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(y1 y1Var, f fVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Size size, k2<?> k2Var, b bVar);
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract e a();

            public abstract a b(w.y yVar);

            public abstract a c(String str);

            public abstract a d(List<r0> list);

            public abstract a e(int i10);
        }

        public static a a(r0 r0Var) {
            return new g.b().f(r0Var).d(Collections.emptyList()).c(null).e(-1).b(w.y.f29577d);
        }

        public abstract w.y b();

        public abstract String c();

        public abstract List<r0> d();

        public abstract r0 e();

        public abstract int f();
    }

    /* loaded from: classes.dex */
    public enum f {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes.dex */
    public static final class g extends a {

        /* renamed from: k, reason: collision with root package name */
        private static final List<Integer> f2689k = Arrays.asList(1, 5, 3);

        /* renamed from: h, reason: collision with root package name */
        private final e0.e f2690h = new e0.e();

        /* renamed from: i, reason: collision with root package name */
        private boolean f2691i = true;

        /* renamed from: j, reason: collision with root package name */
        private boolean f2692j = false;

        private List<r0> d() {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f2682a) {
                arrayList.add(eVar.e());
                Iterator<r0> it = eVar.d().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        private int f(int i10, int i11) {
            List<Integer> list = f2689k;
            return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
        }

        private void g(Range<Integer> range) {
            Range<Integer> range2 = b2.f2445a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f2683b.l().equals(range2)) {
                this.f2683b.p(range);
            } else {
                if (this.f2683b.l().equals(range)) {
                    return;
                }
                this.f2691i = false;
                w.o0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        public void a(y1 y1Var) {
            l0 h10 = y1Var.h();
            if (h10.h() != -1) {
                this.f2692j = true;
                this.f2683b.r(f(h10.h(), this.f2683b.n()));
            }
            g(h10.d());
            this.f2683b.b(y1Var.h().g());
            this.f2684c.addAll(y1Var.b());
            this.f2685d.addAll(y1Var.i());
            this.f2683b.a(y1Var.g());
            this.f2687f.addAll(y1Var.j());
            this.f2686e.addAll(y1Var.c());
            if (y1Var.e() != null) {
                this.f2688g = y1Var.e();
            }
            this.f2682a.addAll(y1Var.f());
            this.f2683b.m().addAll(h10.f());
            if (!d().containsAll(this.f2683b.m())) {
                w.o0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f2691i = false;
            }
            this.f2683b.e(h10.e());
        }

        public y1 b() {
            if (!this.f2691i) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f2682a);
            this.f2690h.d(arrayList);
            return new y1(arrayList, new ArrayList(this.f2684c), new ArrayList(this.f2685d), new ArrayList(this.f2687f), new ArrayList(this.f2686e), this.f2683b.h(), this.f2688g);
        }

        public void c() {
            this.f2682a.clear();
            this.f2683b.i();
        }

        public boolean e() {
            return this.f2692j && this.f2691i;
        }
    }

    y1(List<e> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<k> list4, List<c> list5, l0 l0Var, InputConfiguration inputConfiguration) {
        this.f2675a = list;
        this.f2676b = Collections.unmodifiableList(list2);
        this.f2677c = Collections.unmodifiableList(list3);
        this.f2678d = Collections.unmodifiableList(list4);
        this.f2679e = Collections.unmodifiableList(list5);
        this.f2680f = l0Var;
        this.f2681g = inputConfiguration;
    }

    public static y1 a() {
        return new y1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new l0.a().h(), null);
    }

    public List<CameraDevice.StateCallback> b() {
        return this.f2676b;
    }

    public List<c> c() {
        return this.f2679e;
    }

    public n0 d() {
        return this.f2680f.e();
    }

    public InputConfiguration e() {
        return this.f2681g;
    }

    public List<e> f() {
        return this.f2675a;
    }

    public List<k> g() {
        return this.f2680f.b();
    }

    public l0 h() {
        return this.f2680f;
    }

    public List<CameraCaptureSession.StateCallback> i() {
        return this.f2677c;
    }

    public List<k> j() {
        return this.f2678d;
    }

    public List<r0> k() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f2675a) {
            arrayList.add(eVar.e());
            Iterator<r0> it = eVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int l() {
        return this.f2680f.h();
    }
}
