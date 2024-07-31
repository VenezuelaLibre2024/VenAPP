package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.l0 */
/* loaded from: classes.dex */
public final class C0642l0 {

    /* renamed from: i */
    public static final InterfaceC0649n0.a<Integer> f2875i = InterfaceC0649n0.a.m3199a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j */
    public static final InterfaceC0649n0.a<Integer> f2876j = InterfaceC0649n0.a.m3199a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<AbstractC0661r0> f2877a;

    /* renamed from: b */
    final InterfaceC0649n0 f2878b;

    /* renamed from: c */
    final int f2879c;

    /* renamed from: d */
    final Range<Integer> f2880d;

    /* renamed from: e */
    final List<AbstractC0637k> f2881e;

    /* renamed from: f */
    private final boolean f2882f;

    /* renamed from: g */
    private final C0620f2 f2883g;

    /* renamed from: h */
    private final InterfaceC0663s f2884h;

    /* renamed from: androidx.camera.core.impl.l0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<AbstractC0661r0> f2885a;

        /* renamed from: b */
        private InterfaceC0643l1 f2886b;

        /* renamed from: c */
        private int f2887c;

        /* renamed from: d */
        private Range<Integer> f2888d;

        /* renamed from: e */
        private List<AbstractC0637k> f2889e;

        /* renamed from: f */
        private boolean f2890f;

        /* renamed from: g */
        private C0650n1 f2891g;

        /* renamed from: h */
        private InterfaceC0663s f2892h;

        public a() {
            this.f2885a = new HashSet();
            this.f2886b = C0647m1.m3184a0();
            this.f2887c = -1;
            this.f2888d = AbstractC0604b2.f2766a;
            this.f2889e = new ArrayList();
            this.f2890f = false;
            this.f2891g = C0650n1.m3203g();
        }

        private a(C0642l0 c0642l0) {
            HashSet hashSet = new HashSet();
            this.f2885a = hashSet;
            this.f2886b = C0647m1.m3184a0();
            this.f2887c = -1;
            this.f2888d = AbstractC0604b2.f2766a;
            this.f2889e = new ArrayList();
            this.f2890f = false;
            this.f2891g = C0650n1.m3203g();
            hashSet.addAll(c0642l0.f2877a);
            this.f2886b = C0647m1.m3185b0(c0642l0.f2878b);
            this.f2887c = c0642l0.f2879c;
            this.f2888d = c0642l0.f2880d;
            this.f2889e.addAll(c0642l0.m3150b());
            this.f2890f = c0642l0.m3157i();
            this.f2891g = C0650n1.m3204h(c0642l0.m3155g());
        }

        /* renamed from: j */
        public static a m3158j(InterfaceC0640k2<?> interfaceC0640k2) {
            b m3145q = interfaceC0640k2.m3145q(null);
            if (m3145q != null) {
                a aVar = new a();
                m3145q.mo2535a(interfaceC0640k2, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC0640k2.m8926u(interfaceC0640k2.toString()));
        }

        /* renamed from: k */
        public static a m3159k(C0642l0 c0642l0) {
            return new a(c0642l0);
        }

        /* renamed from: a */
        public void m3160a(Collection<AbstractC0637k> collection) {
            Iterator<AbstractC0637k> it = collection.iterator();
            while (it.hasNext()) {
                m3162c(it.next());
            }
        }

        /* renamed from: b */
        public void m3161b(C0620f2 c0620f2) {
            this.f2891g.m3205f(c0620f2);
        }

        /* renamed from: c */
        public void m3162c(AbstractC0637k abstractC0637k) {
            if (this.f2889e.contains(abstractC0637k)) {
                return;
            }
            this.f2889e.add(abstractC0637k);
        }

        /* renamed from: d */
        public <T> void m3163d(InterfaceC0649n0.a<T> aVar, T t10) {
            this.f2886b.mo3178r(aVar, t10);
        }

        /* renamed from: e */
        public void m3164e(InterfaceC0649n0 interfaceC0649n0) {
            for (InterfaceC0649n0.a<?> aVar : interfaceC0649n0.mo3195e()) {
                Object mo3197g = this.f2886b.mo3197g(aVar, null);
                Object mo3191a = interfaceC0649n0.mo3191a(aVar);
                if (mo3197g instanceof AbstractC0639k1) {
                    ((AbstractC0639k1) mo3197g).m3135a(((AbstractC0639k1) mo3191a).m3137c());
                } else {
                    if (mo3191a instanceof AbstractC0639k1) {
                        mo3191a = ((AbstractC0639k1) mo3191a).clone();
                    }
                    this.f2886b.mo3177p(aVar, interfaceC0649n0.mo3198h(aVar), mo3191a);
                }
            }
        }

        /* renamed from: f */
        public void m3165f(AbstractC0661r0 abstractC0661r0) {
            this.f2885a.add(abstractC0661r0);
        }

        /* renamed from: g */
        public void m3166g(String str, Object obj) {
            this.f2891g.m3206i(str, obj);
        }

        /* renamed from: h */
        public C0642l0 m3167h() {
            return new C0642l0(new ArrayList(this.f2885a), C0656p1.m3211Y(this.f2886b), this.f2887c, this.f2888d, new ArrayList(this.f2889e), this.f2890f, C0620f2.m3070c(this.f2891g), this.f2892h);
        }

        /* renamed from: i */
        public void m3168i() {
            this.f2885a.clear();
        }

        /* renamed from: l */
        public Range<Integer> m3169l() {
            return this.f2888d;
        }

        /* renamed from: m */
        public Set<AbstractC0661r0> m3170m() {
            return this.f2885a;
        }

        /* renamed from: n */
        public int m3171n() {
            return this.f2887c;
        }

        /* renamed from: o */
        public void m3172o(InterfaceC0663s interfaceC0663s) {
            this.f2892h = interfaceC0663s;
        }

        /* renamed from: p */
        public void m3173p(Range<Integer> range) {
            this.f2888d = range;
        }

        /* renamed from: q */
        public void m3174q(InterfaceC0649n0 interfaceC0649n0) {
            this.f2886b = C0647m1.m3185b0(interfaceC0649n0);
        }

        /* renamed from: r */
        public void m3175r(int i10) {
            this.f2887c = i10;
        }

        /* renamed from: s */
        public void m3176s(boolean z10) {
            this.f2890f = z10;
        }
    }

    /* renamed from: androidx.camera.core.impl.l0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2535a(InterfaceC0640k2<?> interfaceC0640k2, a aVar);
    }

    C0642l0(List<AbstractC0661r0> list, InterfaceC0649n0 interfaceC0649n0, int i10, Range<Integer> range, List<AbstractC0637k> list2, boolean z10, C0620f2 c0620f2, InterfaceC0663s interfaceC0663s) {
        this.f2877a = list;
        this.f2878b = interfaceC0649n0;
        this.f2879c = i10;
        this.f2880d = range;
        this.f2881e = Collections.unmodifiableList(list2);
        this.f2882f = z10;
        this.f2883g = c0620f2;
        this.f2884h = interfaceC0663s;
    }

    /* renamed from: a */
    public static C0642l0 m3149a() {
        return new a().m3167h();
    }

    /* renamed from: b */
    public List<AbstractC0637k> m3150b() {
        return this.f2881e;
    }

    /* renamed from: c */
    public InterfaceC0663s m3151c() {
        return this.f2884h;
    }

    /* renamed from: d */
    public Range<Integer> m3152d() {
        return this.f2880d;
    }

    /* renamed from: e */
    public InterfaceC0649n0 m3153e() {
        return this.f2878b;
    }

    /* renamed from: f */
    public List<AbstractC0661r0> m3154f() {
        return Collections.unmodifiableList(this.f2877a);
    }

    /* renamed from: g */
    public C0620f2 m3155g() {
        return this.f2883g;
    }

    /* renamed from: h */
    public int m3156h() {
        return this.f2879c;
    }

    /* renamed from: i */
    public boolean m3157i() {
        return this.f2882f;
    }
}
