package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0621g;
import androidx.camera.core.impl.C0642l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p071e0.C7090e;
import p407w.C12029o0;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.y1 */
/* loaded from: classes.dex */
public final class C0701y1 {

    /* renamed from: a */
    private final List<e> f3020a;

    /* renamed from: b */
    private final List<CameraDevice.StateCallback> f3021b;

    /* renamed from: c */
    private final List<CameraCaptureSession.StateCallback> f3022c;

    /* renamed from: d */
    private final List<AbstractC0637k> f3023d;

    /* renamed from: e */
    private final List<c> f3024e;

    /* renamed from: f */
    private final C0642l0 f3025f;

    /* renamed from: g */
    private InputConfiguration f3026g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.y1$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Set<e> f3027a = new LinkedHashSet();

        /* renamed from: b */
        final C0642l0.a f3028b = new C0642l0.a();

        /* renamed from: c */
        final List<CameraDevice.StateCallback> f3029c = new ArrayList();

        /* renamed from: d */
        final List<CameraCaptureSession.StateCallback> f3030d = new ArrayList();

        /* renamed from: e */
        final List<c> f3031e = new ArrayList();

        /* renamed from: f */
        final List<AbstractC0637k> f3032f = new ArrayList();

        /* renamed from: g */
        InputConfiguration f3033g;

        a() {
        }
    }

    /* renamed from: androidx.camera.core.impl.y1$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        /* renamed from: p */
        public static b m3391p(InterfaceC0640k2<?> interfaceC0640k2, Size size) {
            d m3143T = interfaceC0640k2.m3143T(null);
            if (m3143T != null) {
                b bVar = new b();
                m3143T.mo2534a(size, interfaceC0640k2, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC0640k2.m8926u(interfaceC0640k2.toString()));
        }

        /* renamed from: a */
        public b m3392a(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                m3396e(it.next());
            }
            return this;
        }

        /* renamed from: b */
        public b m3393b(Collection<AbstractC0637k> collection) {
            this.f3028b.m3160a(collection);
            return this;
        }

        /* renamed from: c */
        public b m3394c(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                m3402k(it.next());
            }
            return this;
        }

        /* renamed from: d */
        public b m3395d(AbstractC0637k abstractC0637k) {
            this.f3028b.m3162c(abstractC0637k);
            if (!this.f3032f.contains(abstractC0637k)) {
                this.f3032f.add(abstractC0637k);
            }
            return this;
        }

        /* renamed from: e */
        public b m3396e(CameraDevice.StateCallback stateCallback) {
            if (this.f3029c.contains(stateCallback)) {
                return this;
            }
            this.f3029c.add(stateCallback);
            return this;
        }

        /* renamed from: f */
        public b m3397f(c cVar) {
            this.f3031e.add(cVar);
            return this;
        }

        /* renamed from: g */
        public b m3398g(InterfaceC0649n0 interfaceC0649n0) {
            this.f3028b.m3164e(interfaceC0649n0);
            return this;
        }

        /* renamed from: h */
        public b m3399h(AbstractC0661r0 abstractC0661r0) {
            return m3400i(abstractC0661r0, C12048y.f32040d);
        }

        /* renamed from: i */
        public b m3400i(AbstractC0661r0 abstractC0661r0, C12048y c12048y) {
            this.f3027a.add(e.m3411a(abstractC0661r0).mo3079b(c12048y).mo3078a());
            return this;
        }

        /* renamed from: j */
        public b m3401j(AbstractC0637k abstractC0637k) {
            this.f3028b.m3162c(abstractC0637k);
            return this;
        }

        /* renamed from: k */
        public b m3402k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f3030d.contains(stateCallback)) {
                return this;
            }
            this.f3030d.add(stateCallback);
            return this;
        }

        /* renamed from: l */
        public b m3403l(AbstractC0661r0 abstractC0661r0) {
            return m3404m(abstractC0661r0, C12048y.f32040d);
        }

        /* renamed from: m */
        public b m3404m(AbstractC0661r0 abstractC0661r0, C12048y c12048y) {
            this.f3027a.add(e.m3411a(abstractC0661r0).mo3079b(c12048y).mo3078a());
            this.f3028b.m3165f(abstractC0661r0);
            return this;
        }

        /* renamed from: n */
        public b m3405n(String str, Object obj) {
            this.f3028b.m3166g(str, obj);
            return this;
        }

        /* renamed from: o */
        public C0701y1 m3406o() {
            return new C0701y1(new ArrayList(this.f3027a), new ArrayList(this.f3029c), new ArrayList(this.f3030d), new ArrayList(this.f3032f), new ArrayList(this.f3031e), this.f3028b.m3167h(), this.f3033g);
        }

        /* renamed from: q */
        public b m3407q(Range<Integer> range) {
            this.f3028b.m3173p(range);
            return this;
        }

        /* renamed from: r */
        public b m3408r(InterfaceC0649n0 interfaceC0649n0) {
            this.f3028b.m3174q(interfaceC0649n0);
            return this;
        }

        /* renamed from: s */
        public b m3409s(InputConfiguration inputConfiguration) {
            this.f3033g = inputConfiguration;
            return this;
        }

        /* renamed from: t */
        public b m3410t(int i10) {
            this.f3028b.m3175r(i10);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.impl.y1$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo2550a(C0701y1 c0701y1, f fVar);
    }

    /* renamed from: androidx.camera.core.impl.y1$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo2534a(Size size, InterfaceC0640k2<?> interfaceC0640k2, b bVar);
    }

    /* renamed from: androidx.camera.core.impl.y1$e */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: androidx.camera.core.impl.y1$e$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract e mo3078a();

            /* renamed from: b */
            public abstract a mo3079b(C12048y c12048y);

            /* renamed from: c */
            public abstract a mo3080c(String str);

            /* renamed from: d */
            public abstract a mo3081d(List<AbstractC0661r0> list);

            /* renamed from: e */
            public abstract a mo3082e(int i10);
        }

        /* renamed from: a */
        public static a m3411a(AbstractC0661r0 abstractC0661r0) {
            return new C0621g.b().m3083f(abstractC0661r0).mo3081d(Collections.emptyList()).mo3080c(null).mo3082e(-1).mo3079b(C12048y.f32040d);
        }

        /* renamed from: b */
        public abstract C12048y mo3073b();

        /* renamed from: c */
        public abstract String mo3074c();

        /* renamed from: d */
        public abstract List<AbstractC0661r0> mo3075d();

        /* renamed from: e */
        public abstract AbstractC0661r0 mo3076e();

        /* renamed from: f */
        public abstract int mo3077f();
    }

    /* renamed from: androidx.camera.core.impl.y1$f */
    /* loaded from: classes.dex */
    public enum f {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.y1$g */
    /* loaded from: classes.dex */
    public static final class g extends a {

        /* renamed from: k */
        private static final List<Integer> f3034k = Arrays.asList(1, 5, 3);

        /* renamed from: h */
        private final C7090e f3035h = new C7090e();

        /* renamed from: i */
        private boolean f3036i = true;

        /* renamed from: j */
        private boolean f3037j = false;

        /* renamed from: d */
        private List<AbstractC0661r0> m3413d() {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f3027a) {
                arrayList.add(eVar.mo3076e());
                Iterator<AbstractC0661r0> it = eVar.mo3075d().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        /* renamed from: f */
        private int m3414f(int i10, int i11) {
            List<Integer> list = f3034k;
            return list.indexOf(Integer.valueOf(i10)) >= list.indexOf(Integer.valueOf(i11)) ? i10 : i11;
        }

        /* renamed from: g */
        private void m3415g(Range<Integer> range) {
            Range<Integer> range2 = AbstractC0604b2.f2766a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f3028b.m3169l().equals(range2)) {
                this.f3028b.m3173p(range);
            } else {
                if (this.f3028b.m3169l().equals(range)) {
                    return;
                }
                this.f3036i = false;
                C12029o0.m38638a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        /* renamed from: a */
        public void m3416a(C0701y1 c0701y1) {
            C0642l0 m3386h = c0701y1.m3386h();
            if (m3386h.m3156h() != -1) {
                this.f3037j = true;
                this.f3028b.m3175r(m3414f(m3386h.m3156h(), this.f3028b.m3171n()));
            }
            m3415g(m3386h.m3152d());
            this.f3028b.m3161b(c0701y1.m3386h().m3155g());
            this.f3029c.addAll(c0701y1.m3380b());
            this.f3030d.addAll(c0701y1.m3387i());
            this.f3028b.m3160a(c0701y1.m3385g());
            this.f3032f.addAll(c0701y1.m3388j());
            this.f3031e.addAll(c0701y1.m3381c());
            if (c0701y1.m3383e() != null) {
                this.f3033g = c0701y1.m3383e();
            }
            this.f3027a.addAll(c0701y1.m3384f());
            this.f3028b.m3170m().addAll(m3386h.m3154f());
            if (!m3413d().containsAll(this.f3028b.m3170m())) {
                C12029o0.m38638a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f3036i = false;
            }
            this.f3028b.m3164e(m3386h.m3153e());
        }

        /* renamed from: b */
        public C0701y1 m3417b() {
            if (!this.f3036i) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f3027a);
            this.f3035h.m20862d(arrayList);
            return new C0701y1(arrayList, new ArrayList(this.f3029c), new ArrayList(this.f3030d), new ArrayList(this.f3032f), new ArrayList(this.f3031e), this.f3028b.m3167h(), this.f3033g);
        }

        /* renamed from: c */
        public void m3418c() {
            this.f3027a.clear();
            this.f3028b.m3168i();
        }

        /* renamed from: e */
        public boolean m3419e() {
            return this.f3037j && this.f3036i;
        }
    }

    C0701y1(List<e> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<AbstractC0637k> list4, List<c> list5, C0642l0 c0642l0, InputConfiguration inputConfiguration) {
        this.f3020a = list;
        this.f3021b = Collections.unmodifiableList(list2);
        this.f3022c = Collections.unmodifiableList(list3);
        this.f3023d = Collections.unmodifiableList(list4);
        this.f3024e = Collections.unmodifiableList(list5);
        this.f3025f = c0642l0;
        this.f3026g = inputConfiguration;
    }

    /* renamed from: a */
    public static C0701y1 m3379a() {
        return new C0701y1(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C0642l0.a().m3167h(), null);
    }

    /* renamed from: b */
    public List<CameraDevice.StateCallback> m3380b() {
        return this.f3021b;
    }

    /* renamed from: c */
    public List<c> m3381c() {
        return this.f3024e;
    }

    /* renamed from: d */
    public InterfaceC0649n0 m3382d() {
        return this.f3025f.m3153e();
    }

    /* renamed from: e */
    public InputConfiguration m3383e() {
        return this.f3026g;
    }

    /* renamed from: f */
    public List<e> m3384f() {
        return this.f3020a;
    }

    /* renamed from: g */
    public List<AbstractC0637k> m3385g() {
        return this.f3025f.m3150b();
    }

    /* renamed from: h */
    public C0642l0 m3386h() {
        return this.f3025f;
    }

    /* renamed from: i */
    public List<CameraCaptureSession.StateCallback> m3387i() {
        return this.f3022c;
    }

    /* renamed from: j */
    public List<AbstractC0637k> m3388j() {
        return this.f3023d;
    }

    /* renamed from: k */
    public List<AbstractC0661r0> m3389k() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f3020a) {
            arrayList.add(eVar.mo3076e());
            Iterator<AbstractC0661r0> it = eVar.mo3075d().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    public int m3390l() {
        return this.f3025f.m3156h();
    }
}
