package p018b0;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.C0709n;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0597a;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.C0695w1;
import androidx.camera.core.impl.C0696x;
import androidx.camera.core.impl.C0698x1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0669u;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.camera.core.impl.InterfaceC0702z;
import androidx.camera.core.impl.InterfaceC0704z1;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import androidx.core.util.InterfaceC0977a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p112g0.C7438z0;
import p148i0.C7762d;
import p407w.AbstractC12019k;
import p407w.C12015i1;
import p407w.C12018j1;
import p407w.C12029o0;
import p407w.InterfaceC12013i;
import p407w.InterfaceC12016j;
import p407w.InterfaceC12028o;
import p429x.InterfaceC12249a;
import p474z.C12747a;

/* renamed from: b0.e */
/* loaded from: classes.dex */
public final class C1597e implements InterfaceC12013i {

    /* renamed from: A */
    private final C0695w1 f6832A;

    /* renamed from: B */
    private final C0698x1 f6833B;

    /* renamed from: a */
    private final InterfaceC0606c0 f6834a;

    /* renamed from: b */
    private final LinkedHashSet<InterfaceC0606c0> f6835b;

    /* renamed from: c */
    private final InterfaceC0702z f6836c;

    /* renamed from: d */
    private final InterfaceC0644l2 f6837d;

    /* renamed from: e */
    private final b f6838e;

    /* renamed from: s */
    private final InterfaceC12249a f6841s;

    /* renamed from: y */
    private AbstractC0718w f6847y;

    /* renamed from: z */
    private C7762d f6848z;

    /* renamed from: f */
    private final List<AbstractC0718w> f6839f = new ArrayList();

    /* renamed from: r */
    private final List<AbstractC0718w> f6840r = new ArrayList();

    /* renamed from: t */
    private List<AbstractC12019k> f6842t = Collections.emptyList();

    /* renamed from: u */
    private InterfaceC0669u f6843u = C0696x.m3377a();

    /* renamed from: v */
    private final Object f6844v = new Object();

    /* renamed from: w */
    private boolean f6845w = true;

    /* renamed from: x */
    private InterfaceC0649n0 f6846x = null;

    /* renamed from: b0.e$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: b0.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<String> f6849a = new ArrayList();

        b(LinkedHashSet<InterfaceC0606c0> linkedHashSet) {
            Iterator<InterfaceC0606c0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f6849a.add(it.next().mo2495i().mo2559b());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6849a.equals(((b) obj).f6849a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6849a.hashCode() * 53;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        InterfaceC0640k2<?> f6850a;

        /* renamed from: b */
        InterfaceC0640k2<?> f6851b;

        c(InterfaceC0640k2<?> interfaceC0640k2, InterfaceC0640k2<?> interfaceC0640k22) {
            this.f6850a = interfaceC0640k2;
            this.f6851b = interfaceC0640k22;
        }
    }

    public C1597e(LinkedHashSet<InterfaceC0606c0> linkedHashSet, InterfaceC12249a interfaceC12249a, InterfaceC0702z interfaceC0702z, InterfaceC0644l2 interfaceC0644l2) {
        InterfaceC0606c0 next = linkedHashSet.iterator().next();
        this.f6834a = next;
        LinkedHashSet<InterfaceC0606c0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f6835b = linkedHashSet2;
        this.f6838e = new b(linkedHashSet2);
        this.f6841s = interfaceC12249a;
        this.f6836c = interfaceC0702z;
        this.f6837d = interfaceC0644l2;
        C0695w1 c0695w1 = new C0695w1(next.mo2489d());
        this.f6832A = c0695w1;
        this.f6833B = new C0698x1(next.mo2495i(), c0695w1);
    }

    /* renamed from: A */
    private static List<InterfaceC0644l2.b> m8856A(AbstractC0718w abstractC0718w) {
        ArrayList arrayList = new ArrayList();
        if (m8867M(abstractC0718w)) {
            Iterator<AbstractC0718w> it = ((C7762d) abstractC0718w).m23692a0().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m3556i().mo2588N());
            }
        } else {
            arrayList.add(abstractC0718w.m3556i().mo2588N());
        }
        return arrayList;
    }

    /* renamed from: B */
    private Map<AbstractC0718w, c> m8857B(Collection<AbstractC0718w> collection, InterfaceC0644l2 interfaceC0644l2, InterfaceC0644l2 interfaceC0644l22) {
        HashMap hashMap = new HashMap();
        for (AbstractC0718w abstractC0718w : collection) {
            hashMap.put(abstractC0718w, new c(abstractC0718w.mo2926j(false, interfaceC0644l2), abstractC0718w.mo2926j(true, interfaceC0644l22)));
        }
        return hashMap;
    }

    /* renamed from: C */
    private int m8858C(boolean z10) {
        int i10;
        synchronized (this.f6844v) {
            Iterator<AbstractC12019k> it = this.f6842t.iterator();
            AbstractC12019k abstractC12019k = null;
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC12019k next = it.next();
                if (C7438z0.m22437a(next.m38628f()) > 1) {
                    C0984h.m4836n(abstractC12019k == null, "Can only have one sharing effect.");
                    abstractC12019k = next;
                }
            }
            if (abstractC12019k != null) {
                i10 = abstractC12019k.m38628f();
            }
            if (z10) {
                i10 |= 3;
            }
        }
        return i10;
    }

    /* renamed from: D */
    private Set<AbstractC0718w> m8859D(Collection<AbstractC0718w> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int m8858C = m8858C(z10);
        for (AbstractC0718w abstractC0718w : collection) {
            C0984h.m4824b(!m8867M(abstractC0718w), "Only support one level of sharing for now.");
            if (abstractC0718w.m3568y(m8858C)) {
                hashSet.add(abstractC0718w);
            }
        }
        return hashSet;
    }

    /* renamed from: F */
    private static boolean m8860F(AbstractC0604b2 abstractC0604b2, C0701y1 c0701y1) {
        InterfaceC0649n0 mo2988d = abstractC0604b2.mo2988d();
        InterfaceC0649n0 m3382d = c0701y1.m3382d();
        if (mo2988d.mo3195e().size() != c0701y1.m3382d().mo3195e().size()) {
            return true;
        }
        for (InterfaceC0649n0.a<?> aVar : mo2988d.mo3195e()) {
            if (!m3382d.mo3192b(aVar) || !Objects.equals(m3382d.mo3191a(aVar), mo2988d.mo3191a(aVar))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    private boolean m8861G() {
        boolean z10;
        synchronized (this.f6844v) {
            z10 = this.f6843u == C0696x.m3377a();
        }
        return z10;
    }

    /* renamed from: H */
    private boolean m8862H() {
        boolean z10;
        synchronized (this.f6844v) {
            z10 = true;
            if (this.f6843u.m3242v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: I */
    private boolean m8863I(Collection<AbstractC0718w> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC0718w abstractC0718w : collection) {
            if (m8866L(abstractC0718w)) {
                z10 = true;
            } else if (m8865K(abstractC0718w)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    /* renamed from: J */
    private boolean m8864J(Collection<AbstractC0718w> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC0718w abstractC0718w : collection) {
            if (m8866L(abstractC0718w)) {
                z11 = true;
            } else if (m8865K(abstractC0718w)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    /* renamed from: K */
    private static boolean m8865K(AbstractC0718w abstractC0718w) {
        return abstractC0718w instanceof C0709n;
    }

    /* renamed from: L */
    private static boolean m8866L(AbstractC0718w abstractC0718w) {
        return abstractC0718w instanceof C0714s;
    }

    /* renamed from: M */
    private static boolean m8867M(AbstractC0718w abstractC0718w) {
        return abstractC0718w instanceof C7762d;
    }

    /* renamed from: N */
    static boolean m8868N(Collection<AbstractC0718w> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (AbstractC0718w abstractC0718w : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (abstractC0718w.m3568y(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static /* synthetic */ void m8869O(Surface surface, SurfaceTexture surfaceTexture, C12015i1.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ void m8870P(C12015i1 c12015i1) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c12015i1.m38612k().getWidth(), c12015i1.m38612k().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        c12015i1.m38613v(surface, C12747a.m42280a(), new InterfaceC0977a() { // from class: b0.d
            @Override // androidx.core.util.InterfaceC0977a
            public final void accept(Object obj) {
                C1597e.m8869O(surface, surfaceTexture, (C12015i1.g) obj);
            }
        });
    }

    /* renamed from: R */
    private void m8871R() {
        synchronized (this.f6844v) {
            if (this.f6846x != null) {
                this.f6834a.mo2489d().mo2734i(this.f6846x);
            }
        }
    }

    /* renamed from: T */
    private static List<AbstractC12019k> m8872T(List<AbstractC12019k> list, Collection<AbstractC0718w> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (AbstractC0718w abstractC0718w : collection) {
            abstractC0718w.m3544O(null);
            for (AbstractC12019k abstractC12019k : list) {
                if (abstractC0718w.m3568y(abstractC12019k.m38628f())) {
                    C0984h.m4836n(abstractC0718w.m3557k() == null, abstractC0718w + " already has effect" + abstractC0718w.m3557k());
                    abstractC0718w.m3544O(abstractC12019k);
                    arrayList.remove(abstractC12019k);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    static void m8873V(List<AbstractC12019k> list, Collection<AbstractC0718w> collection, Collection<AbstractC0718w> collection2) {
        List<AbstractC12019k> m8872T = m8872T(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC12019k> m8872T2 = m8872T(m8872T, arrayList);
        if (m8872T2.size() > 0) {
            C12029o0.m38648k("CameraUseCaseAdapter", "Unused effects: " + m8872T2);
        }
    }

    /* renamed from: Y */
    private void m8874Y(Map<AbstractC0718w, AbstractC0604b2> map, Collection<AbstractC0718w> collection) {
        synchronized (this.f6844v) {
        }
    }

    /* renamed from: p */
    private void m8877p() {
        synchronized (this.f6844v) {
            InterfaceC0699y mo2489d = this.f6834a.mo2489d();
            this.f6846x = mo2489d.mo2733h();
            mo2489d.mo2735j();
        }
    }

    /* renamed from: q */
    static Collection<AbstractC0718w> m8878q(Collection<AbstractC0718w> collection, AbstractC0718w abstractC0718w, C7762d c7762d) {
        ArrayList arrayList = new ArrayList(collection);
        if (abstractC0718w != null) {
            arrayList.add(abstractC0718w);
        }
        if (c7762d != null) {
            arrayList.add(c7762d);
            arrayList.removeAll(c7762d.m23692a0());
        }
        return arrayList;
    }

    /* renamed from: s */
    private Map<AbstractC0718w, AbstractC0604b2> m8879s(int i10, InterfaceC0602b0 interfaceC0602b0, Collection<AbstractC0718w> collection, Collection<AbstractC0718w> collection2, Map<AbstractC0718w, c> map) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String mo2559b = interfaceC0602b0.mo2559b();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<AbstractC0718w> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0718w next = it.next();
            AbstractC0597a m2971a = AbstractC0597a.m2971a(this.f6836c.mo2389b(i10, mo2559b, next.m3558l(), next.m3552e()), next.m3558l(), next.m3552e(), ((AbstractC0604b2) C0984h.m4833k(next.m3551d())).mo2986b(), m8856A(next), next.m3551d().mo2988d(), next.m3556i().m3147x(null));
            arrayList.add(m2971a);
            hashMap2.put(m2971a, next);
            hashMap.put(next, next.m3551d());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f6834a.mo2489d().mo2728e();
            } catch (NullPointerException unused) {
                rect = null;
            }
            C1600h c1600h = new C1600h(interfaceC0602b0, rect != null ? C0689r.m3351i(rect) : null);
            for (AbstractC0718w abstractC0718w : collection) {
                c cVar = map.get(abstractC0718w);
                InterfaceC0640k2<?> m3538A = abstractC0718w.m3538A(interfaceC0602b0, cVar.f6850a, cVar.f6851b);
                hashMap3.put(m3538A, abstractC0718w);
                hashMap4.put(m3538A, c1600h.m8918m(m3538A));
            }
            Pair<Map<InterfaceC0640k2<?>, AbstractC0604b2>, Map<AbstractC0597a, AbstractC0604b2>> mo2388a = this.f6836c.mo2388a(i10, mo2559b, arrayList, hashMap4);
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((AbstractC0718w) entry.getValue(), (AbstractC0604b2) ((Map) mo2388a.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) mo2388a.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((AbstractC0718w) hashMap2.get(entry2.getKey()), (AbstractC0604b2) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: t */
    private C0709n m8880t() {
        return new C0709n.b().m3473l("ImageCapture-Extra").m3465c();
    }

    /* renamed from: u */
    private C0714s m8881u() {
        C0714s m3518c = new C0714s.a().m3525k("Preview-Extra").m3518c();
        m3518c.m3514j0(new C0714s.c() { // from class: b0.c
            @Override // androidx.camera.core.C0714s.c
            /* renamed from: a */
            public final void mo3527a(C12015i1 c12015i1) {
                C1597e.m8870P(c12015i1);
            }
        });
        return m3518c;
    }

    /* renamed from: v */
    private C7762d m8882v(Collection<AbstractC0718w> collection, boolean z10) {
        synchronized (this.f6844v) {
            Set<AbstractC0718w> m8859D = m8859D(collection, z10);
            if (m8859D.size() < 2) {
                return null;
            }
            C7762d c7762d = this.f6848z;
            if (c7762d != null && c7762d.m23692a0().equals(m8859D)) {
                C7762d c7762d2 = this.f6848z;
                Objects.requireNonNull(c7762d2);
                return c7762d2;
            }
            if (!m8868N(m8859D)) {
                return null;
            }
            return new C7762d(this.f6834a, m8859D, this.f6837d);
        }
    }

    /* renamed from: x */
    public static b m8883x(LinkedHashSet<InterfaceC0606c0> linkedHashSet) {
        return new b(linkedHashSet);
    }

    /* renamed from: z */
    private int m8884z() {
        synchronized (this.f6844v) {
            return this.f6841s.mo35289b() == 2 ? 1 : 0;
        }
    }

    /* renamed from: E */
    public List<AbstractC0718w> m8885E() {
        ArrayList arrayList;
        synchronized (this.f6844v) {
            arrayList = new ArrayList(this.f6839f);
        }
        return arrayList;
    }

    /* renamed from: Q */
    public void m8886Q(Collection<AbstractC0718w> collection) {
        synchronized (this.f6844v) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f6839f);
            linkedHashSet.removeAll(collection);
            m8889W(linkedHashSet);
        }
    }

    /* renamed from: S */
    public void m8887S(List<AbstractC12019k> list) {
        synchronized (this.f6844v) {
            this.f6842t = list;
        }
    }

    /* renamed from: U */
    public void m8888U(C12018j1 c12018j1) {
        synchronized (this.f6844v) {
        }
    }

    /* renamed from: W */
    void m8889W(Collection<AbstractC0718w> collection) {
        m8890X(collection, false);
    }

    /* renamed from: X */
    void m8890X(Collection<AbstractC0718w> collection, boolean z10) {
        AbstractC0604b2 abstractC0604b2;
        InterfaceC0649n0 mo2988d;
        synchronized (this.f6844v) {
            AbstractC0718w m8895r = m8895r(collection);
            C7762d m8882v = m8882v(collection, z10);
            Collection<AbstractC0718w> m8878q = m8878q(collection, m8895r, m8882v);
            ArrayList<AbstractC0718w> arrayList = new ArrayList(m8878q);
            arrayList.removeAll(this.f6840r);
            ArrayList<AbstractC0718w> arrayList2 = new ArrayList(m8878q);
            arrayList2.retainAll(this.f6840r);
            ArrayList arrayList3 = new ArrayList(this.f6840r);
            arrayList3.removeAll(m8878q);
            Map<AbstractC0718w, c> m8857B = m8857B(arrayList, this.f6843u.m3241j(), this.f6837d);
            try {
                Map<AbstractC0718w, AbstractC0604b2> m8879s = m8879s(m8884z(), this.f6834a.mo2495i(), arrayList, arrayList2, m8857B);
                m8874Y(m8879s, m8878q);
                m8873V(this.f6842t, m8878q, collection);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((AbstractC0718w) it.next()).m3545R(this.f6834a);
                }
                this.f6834a.mo2493h(arrayList3);
                if (!arrayList3.isEmpty()) {
                    for (AbstractC0718w abstractC0718w : arrayList2) {
                        if (m8879s.containsKey(abstractC0718w) && (mo2988d = (abstractC0604b2 = m8879s.get(abstractC0718w)).mo2988d()) != null && m8860F(abstractC0604b2, abstractC0718w.m3564s())) {
                            abstractC0718w.m3548U(mo2988d);
                        }
                    }
                }
                for (AbstractC0718w abstractC0718w2 : arrayList) {
                    c cVar = m8857B.get(abstractC0718w2);
                    Objects.requireNonNull(cVar);
                    abstractC0718w2.m3549b(this.f6834a, cVar.f6850a, cVar.f6851b);
                    abstractC0718w2.m3547T((AbstractC0604b2) C0984h.m4833k(m8879s.get(abstractC0718w2)));
                }
                if (this.f6845w) {
                    this.f6834a.mo2492g(arrayList);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC0718w) it2.next()).m3542E();
                }
                this.f6839f.clear();
                this.f6839f.addAll(collection);
                this.f6840r.clear();
                this.f6840r.addAll(m8878q);
                this.f6847y = m8895r;
                this.f6848z = m8882v;
            } catch (IllegalArgumentException e10) {
                if (z10 || !m8861G() || this.f6841s.mo35289b() == 2) {
                    throw e10;
                }
                m8890X(collection, true);
            }
        }
    }

    @Override // p407w.InterfaceC12013i
    /* renamed from: a */
    public InterfaceC12016j mo2998a() {
        return this.f6832A;
    }

    @Override // p407w.InterfaceC12013i
    /* renamed from: b */
    public InterfaceC12028o mo2999b() {
        return this.f6833B;
    }

    /* renamed from: f */
    public void m8891f(boolean z10) {
        this.f6834a.mo2491f(z10);
    }

    /* renamed from: l */
    public void m8892l(InterfaceC0669u interfaceC0669u) {
        synchronized (this.f6844v) {
            if (interfaceC0669u == null) {
                interfaceC0669u = C0696x.m3377a();
            }
            if (!this.f6839f.isEmpty() && !this.f6843u.mo3239Q().equals(interfaceC0669u.mo3239Q())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f6843u = interfaceC0669u;
            InterfaceC0704z1 m3240V = interfaceC0669u.m3240V(null);
            if (m3240V != null) {
                this.f6832A.m3375k(true, m3240V.m3425e());
            } else {
                this.f6832A.m3375k(false, null);
            }
            this.f6834a.mo2499l(this.f6843u);
        }
    }

    /* renamed from: n */
    public void m8893n(Collection<AbstractC0718w> collection) {
        synchronized (this.f6844v) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f6839f);
            linkedHashSet.addAll(collection);
            try {
                m8889W(linkedHashSet);
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    /* renamed from: o */
    public void m8894o() {
        synchronized (this.f6844v) {
            if (!this.f6845w) {
                this.f6834a.mo2492g(this.f6840r);
                m8871R();
                Iterator<AbstractC0718w> it = this.f6840r.iterator();
                while (it.hasNext()) {
                    it.next().m3542E();
                }
                this.f6845w = true;
            }
        }
    }

    /* renamed from: r */
    AbstractC0718w m8895r(Collection<AbstractC0718w> collection) {
        AbstractC0718w abstractC0718w;
        synchronized (this.f6844v) {
            if (m8862H()) {
                if (m8864J(collection)) {
                    if (!m8866L(this.f6847y)) {
                        abstractC0718w = m8881u();
                    }
                } else if (m8863I(collection)) {
                    abstractC0718w = m8865K(this.f6847y) ? this.f6847y : m8880t();
                }
            }
            abstractC0718w = null;
        }
        return abstractC0718w;
    }

    /* renamed from: w */
    public void m8896w() {
        synchronized (this.f6844v) {
            if (this.f6845w) {
                this.f6834a.mo2493h(new ArrayList(this.f6840r));
                m8877p();
                this.f6845w = false;
            }
        }
    }

    /* renamed from: y */
    public b m8897y() {
        return this.f6838e;
    }
}
