package b0;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.view.Surface;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.utils.r;
import androidx.camera.core.impl.w1;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.x1;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.y1;
import androidx.camera.core.impl.z;
import androidx.camera.core.impl.z1;
import androidx.camera.core.n;
import androidx.camera.core.s;
import androidx.camera.core.w;
import g0.z0;
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
import w.i1;
import w.j1;
import w.o;
import w.o0;

/* loaded from: classes.dex */
public final class e implements w.i {
    private final w1 A;
    private final x1 B;

    /* renamed from: a */
    private final c0 f5977a;

    /* renamed from: b */
    private final LinkedHashSet<c0> f5978b;

    /* renamed from: c */
    private final z f5979c;

    /* renamed from: d */
    private final l2 f5980d;

    /* renamed from: e */
    private final b f5981e;

    /* renamed from: s */
    private final x.a f5984s;

    /* renamed from: y */
    private w f5990y;

    /* renamed from: z */
    private i0.d f5991z;

    /* renamed from: f */
    private final List<w> f5982f = new ArrayList();

    /* renamed from: r */
    private final List<w> f5983r = new ArrayList();

    /* renamed from: t */
    private List<w.k> f5985t = Collections.emptyList();

    /* renamed from: u */
    private u f5986u = x.a();

    /* renamed from: v */
    private final Object f5987v = new Object();

    /* renamed from: w */
    private boolean f5988w = true;

    /* renamed from: x */
    private n0 f5989x = null;

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<String> f5992a = new ArrayList();

        b(LinkedHashSet<c0> linkedHashSet) {
            Iterator<c0> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f5992a.add(it.next().i().b());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5992a.equals(((b) obj).f5992a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5992a.hashCode() * 53;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        k2<?> f5993a;

        /* renamed from: b */
        k2<?> f5994b;

        c(k2<?> k2Var, k2<?> k2Var2) {
            this.f5993a = k2Var;
            this.f5994b = k2Var2;
        }
    }

    public e(LinkedHashSet<c0> linkedHashSet, x.a aVar, z zVar, l2 l2Var) {
        c0 next = linkedHashSet.iterator().next();
        this.f5977a = next;
        LinkedHashSet<c0> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f5978b = linkedHashSet2;
        this.f5981e = new b(linkedHashSet2);
        this.f5984s = aVar;
        this.f5979c = zVar;
        this.f5980d = l2Var;
        w1 w1Var = new w1(next.d());
        this.A = w1Var;
        this.B = new x1(next.i(), w1Var);
    }

    private static List<l2.b> A(w wVar) {
        ArrayList arrayList = new ArrayList();
        if (M(wVar)) {
            Iterator<w> it = ((i0.d) wVar).a0().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().i().N());
            }
        } else {
            arrayList.add(wVar.i().N());
        }
        return arrayList;
    }

    private Map<w, c> B(Collection<w> collection, l2 l2Var, l2 l2Var2) {
        HashMap hashMap = new HashMap();
        for (w wVar : collection) {
            hashMap.put(wVar, new c(wVar.j(false, l2Var), wVar.j(true, l2Var2)));
        }
        return hashMap;
    }

    private int C(boolean z10) {
        int i10;
        synchronized (this.f5987v) {
            Iterator<w.k> it = this.f5985t.iterator();
            w.k kVar = null;
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                w.k next = it.next();
                if (z0.a(next.f()) > 1) {
                    androidx.core.util.h.n(kVar == null, "Can only have one sharing effect.");
                    kVar = next;
                }
            }
            if (kVar != null) {
                i10 = kVar.f();
            }
            if (z10) {
                i10 |= 3;
            }
        }
        return i10;
    }

    private Set<w> D(Collection<w> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int C = C(z10);
        for (w wVar : collection) {
            androidx.core.util.h.b(!M(wVar), "Only support one level of sharing for now.");
            if (wVar.y(C)) {
                hashSet.add(wVar);
            }
        }
        return hashSet;
    }

    private static boolean F(b2 b2Var, y1 y1Var) {
        n0 d10 = b2Var.d();
        n0 d11 = y1Var.d();
        if (d10.e().size() != y1Var.d().e().size()) {
            return true;
        }
        for (n0.a<?> aVar : d10.e()) {
            if (!d11.b(aVar) || !Objects.equals(d11.a(aVar), d10.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    private boolean G() {
        boolean z10;
        synchronized (this.f5987v) {
            z10 = this.f5986u == x.a();
        }
        return z10;
    }

    private boolean H() {
        boolean z10;
        synchronized (this.f5987v) {
            z10 = true;
            if (this.f5986u.v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private boolean I(Collection<w> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w wVar : collection) {
            if (L(wVar)) {
                z10 = true;
            } else if (K(wVar)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    private boolean J(Collection<w> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (w wVar : collection) {
            if (L(wVar)) {
                z11 = true;
            } else if (K(wVar)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean K(w wVar) {
        return wVar instanceof n;
    }

    private static boolean L(w wVar) {
        return wVar instanceof s;
    }

    private static boolean M(w wVar) {
        return wVar instanceof i0.d;
    }

    static boolean N(Collection<w> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (w wVar : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (wVar.y(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    public static /* synthetic */ void O(Surface surface, SurfaceTexture surfaceTexture, i1.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void P(i1 i1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(i1Var.k().getWidth(), i1Var.k().getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        i1Var.v(surface, z.a.a(), new androidx.core.util.a() { // from class: b0.d

            /* renamed from: a */
            public final /* synthetic */ Surface f5975a;

            /* renamed from: b */
            public final /* synthetic */ SurfaceTexture f5976b;

            public /* synthetic */ d(Surface surface2, SurfaceTexture surfaceTexture2) {
                r1 = surface2;
                r2 = surfaceTexture2;
            }

            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                e.O(r1, r2, (i1.g) obj);
            }
        });
    }

    private void R() {
        synchronized (this.f5987v) {
            if (this.f5989x != null) {
                this.f5977a.d().i(this.f5989x);
            }
        }
    }

    private static List<w.k> T(List<w.k> list, Collection<w> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (w wVar : collection) {
            wVar.O(null);
            for (w.k kVar : list) {
                if (wVar.y(kVar.f())) {
                    androidx.core.util.h.n(wVar.k() == null, wVar + " already has effect" + wVar.k());
                    wVar.O(kVar);
                    arrayList.remove(kVar);
                }
            }
        }
        return arrayList;
    }

    static void V(List<w.k> list, Collection<w> collection, Collection<w> collection2) {
        List<w.k> T = T(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<w.k> T2 = T(T, arrayList);
        if (T2.size() > 0) {
            o0.k("CameraUseCaseAdapter", "Unused effects: " + T2);
        }
    }

    private void Y(Map<w, b2> map, Collection<w> collection) {
        synchronized (this.f5987v) {
        }
    }

    private void p() {
        synchronized (this.f5987v) {
            y d10 = this.f5977a.d();
            this.f5989x = d10.h();
            d10.j();
        }
    }

    static Collection<w> q(Collection<w> collection, w wVar, i0.d dVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (wVar != null) {
            arrayList.add(wVar);
        }
        if (dVar != null) {
            arrayList.add(dVar);
            arrayList.removeAll(dVar.a0());
        }
        return arrayList;
    }

    private Map<w, b2> s(int i10, b0 b0Var, Collection<w> collection, Collection<w> collection2, Map<w, c> map) {
        Rect rect;
        ArrayList arrayList = new ArrayList();
        String b10 = b0Var.b();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<w> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w next = it.next();
            androidx.camera.core.impl.a a10 = androidx.camera.core.impl.a.a(this.f5979c.b(i10, b10, next.l(), next.e()), next.l(), next.e(), ((b2) androidx.core.util.h.k(next.d())).b(), A(next), next.d().d(), next.i().x(null));
            arrayList.add(a10);
            hashMap2.put(a10, next);
            hashMap.put(next, next.d());
        }
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f5977a.d().e();
            } catch (NullPointerException unused) {
                rect = null;
            }
            h hVar = new h(b0Var, rect != null ? r.i(rect) : null);
            for (w wVar : collection) {
                c cVar = map.get(wVar);
                k2<?> A = wVar.A(b0Var, cVar.f5993a, cVar.f5994b);
                hashMap3.put(A, wVar);
                hashMap4.put(A, hVar.m(A));
            }
            Pair<Map<k2<?>, b2>, Map<androidx.camera.core.impl.a, b2>> a11 = this.f5979c.a(i10, b10, arrayList, hashMap4);
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((w) entry.getValue(), (b2) ((Map) a11.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) a11.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((w) hashMap2.get(entry2.getKey()), (b2) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    private n t() {
        return new n.b().l("ImageCapture-Extra").c();
    }

    private s u() {
        s c10 = new s.a().k("Preview-Extra").c();
        c10.j0(new s.c() { // from class: b0.c
            @Override // androidx.camera.core.s.c
            public final void a(i1 i1Var) {
                e.P(i1Var);
            }
        });
        return c10;
    }

    private i0.d v(Collection<w> collection, boolean z10) {
        synchronized (this.f5987v) {
            Set<w> D = D(collection, z10);
            if (D.size() < 2) {
                return null;
            }
            i0.d dVar = this.f5991z;
            if (dVar != null && dVar.a0().equals(D)) {
                i0.d dVar2 = this.f5991z;
                Objects.requireNonNull(dVar2);
                return dVar2;
            }
            if (!N(D)) {
                return null;
            }
            return new i0.d(this.f5977a, D, this.f5980d);
        }
    }

    public static b x(LinkedHashSet<c0> linkedHashSet) {
        return new b(linkedHashSet);
    }

    private int z() {
        synchronized (this.f5987v) {
            return this.f5984s.b() == 2 ? 1 : 0;
        }
    }

    public List<w> E() {
        ArrayList arrayList;
        synchronized (this.f5987v) {
            arrayList = new ArrayList(this.f5982f);
        }
        return arrayList;
    }

    public void Q(Collection<w> collection) {
        synchronized (this.f5987v) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f5982f);
            linkedHashSet.removeAll(collection);
            W(linkedHashSet);
        }
    }

    public void S(List<w.k> list) {
        synchronized (this.f5987v) {
            this.f5985t = list;
        }
    }

    public void U(j1 j1Var) {
        synchronized (this.f5987v) {
        }
    }

    void W(Collection<w> collection) {
        X(collection, false);
    }

    void X(Collection<w> collection, boolean z10) {
        b2 b2Var;
        n0 d10;
        synchronized (this.f5987v) {
            w r10 = r(collection);
            i0.d v10 = v(collection, z10);
            Collection<w> q10 = q(collection, r10, v10);
            ArrayList<w> arrayList = new ArrayList(q10);
            arrayList.removeAll(this.f5983r);
            ArrayList<w> arrayList2 = new ArrayList(q10);
            arrayList2.retainAll(this.f5983r);
            ArrayList arrayList3 = new ArrayList(this.f5983r);
            arrayList3.removeAll(q10);
            Map<w, c> B = B(arrayList, this.f5986u.j(), this.f5980d);
            try {
                Map<w, b2> s10 = s(z(), this.f5977a.i(), arrayList, arrayList2, B);
                Y(s10, q10);
                V(this.f5985t, q10, collection);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).R(this.f5977a);
                }
                this.f5977a.h(arrayList3);
                if (!arrayList3.isEmpty()) {
                    for (w wVar : arrayList2) {
                        if (s10.containsKey(wVar) && (d10 = (b2Var = s10.get(wVar)).d()) != null && F(b2Var, wVar.s())) {
                            wVar.U(d10);
                        }
                    }
                }
                for (w wVar2 : arrayList) {
                    c cVar = B.get(wVar2);
                    Objects.requireNonNull(cVar);
                    wVar2.b(this.f5977a, cVar.f5993a, cVar.f5994b);
                    wVar2.T((b2) androidx.core.util.h.k(s10.get(wVar2)));
                }
                if (this.f5988w) {
                    this.f5977a.g(arrayList);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((w) it2.next()).E();
                }
                this.f5982f.clear();
                this.f5982f.addAll(collection);
                this.f5983r.clear();
                this.f5983r.addAll(q10);
                this.f5990y = r10;
                this.f5991z = v10;
            } catch (IllegalArgumentException e10) {
                if (z10 || !G() || this.f5984s.b() == 2) {
                    throw e10;
                }
                X(collection, true);
            }
        }
    }

    @Override // w.i
    public w.j a() {
        return this.A;
    }

    @Override // w.i
    public o b() {
        return this.B;
    }

    public void f(boolean z10) {
        this.f5977a.f(z10);
    }

    public void l(u uVar) {
        synchronized (this.f5987v) {
            if (uVar == null) {
                uVar = x.a();
            }
            if (!this.f5982f.isEmpty() && !this.f5986u.Q().equals(uVar.Q())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f5986u = uVar;
            z1 V = uVar.V(null);
            if (V != null) {
                this.A.k(true, V.e());
            } else {
                this.A.k(false, null);
            }
            this.f5977a.l(this.f5986u);
        }
    }

    public void n(Collection<w> collection) {
        synchronized (this.f5987v) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f5982f);
            linkedHashSet.addAll(collection);
            try {
                W(linkedHashSet);
            } catch (IllegalArgumentException e10) {
                throw new a(e10.getMessage());
            }
        }
    }

    public void o() {
        synchronized (this.f5987v) {
            if (!this.f5988w) {
                this.f5977a.g(this.f5983r);
                R();
                Iterator<w> it = this.f5983r.iterator();
                while (it.hasNext()) {
                    it.next().E();
                }
                this.f5988w = true;
            }
        }
    }

    w r(Collection<w> collection) {
        w wVar;
        synchronized (this.f5987v) {
            if (H()) {
                if (J(collection)) {
                    if (!L(this.f5990y)) {
                        wVar = u();
                    }
                } else if (I(collection)) {
                    wVar = K(this.f5990y) ? this.f5990y : t();
                }
            }
            wVar = null;
        }
        return wVar;
    }

    public void w() {
        synchronized (this.f5987v) {
            if (this.f5988w) {
                this.f5977a.h(new ArrayList(this.f5983r));
                p();
                this.f5988w = false;
            }
        }
    }

    public b y() {
        return this.f5981e;
    }
}
