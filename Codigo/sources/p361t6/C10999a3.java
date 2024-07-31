package p361t6;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10834m0;
import p361t6.C10999a3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.InterfaceC11165o;
import p376u6.C11391m3;
import p376u6.InterfaceC11327a;
import p397v7.C11731u;
import p397v7.C11733v;
import p397v7.C11735w;
import p397v7.C11737x;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11705h0;
import p397v7.InterfaceC11738x0;
import p397v7.InterfaceC11739y;
import p436x6.InterfaceC12329u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.a3 */
/* loaded from: classes.dex */
public final class C10999a3 {

    /* renamed from: a */
    private final C11391m3 f27977a;

    /* renamed from: e */
    private final d f27981e;

    /* renamed from: h */
    private final InterfaceC11327a f27984h;

    /* renamed from: i */
    private final InterfaceC11165o f27985i;

    /* renamed from: k */
    private boolean f27987k;

    /* renamed from: l */
    private InterfaceC10834m0 f27988l;

    /* renamed from: j */
    private InterfaceC11738x0 f27986j = new InterfaceC11738x0.a(0);

    /* renamed from: c */
    private final IdentityHashMap<InterfaceC11739y, c> f27979c = new IdentityHashMap<>();

    /* renamed from: d */
    private final Map<Object, c> f27980d = new HashMap();

    /* renamed from: b */
    private final List<c> f27978b = new ArrayList();

    /* renamed from: f */
    private final HashMap<c, b> f27982f = new HashMap<>();

    /* renamed from: g */
    private final Set<c> f27983g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.a3$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC11705h0, InterfaceC12329u {

        /* renamed from: a */
        private final c f27989a;

        public a(c cVar) {
            this.f27989a = cVar;
        }

        /* renamed from: V */
        private Pair<Integer, InterfaceC11684a0.b> m33682V(int i10, InterfaceC11684a0.b bVar) {
            InterfaceC11684a0.b bVar2 = null;
            if (bVar != null) {
                InterfaceC11684a0.b m33652n = C10999a3.m33652n(this.f27989a, bVar);
                if (m33652n == null) {
                    return null;
                }
                bVar2 = m33652n;
            }
            return Pair.create(Integer.valueOf(C10999a3.m33655r(this.f27989a, i10)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m33683W(Pair pair, C11737x c11737x) {
            C10999a3.this.f27984h.mo33704v(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public /* synthetic */ void m33684X(Pair pair) {
            C10999a3.this.f27984h.mo33703u(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public /* synthetic */ void m33685Y(Pair pair) {
            C10999a3.this.f27984h.mo33696B(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z */
        public /* synthetic */ void m33686Z(Pair pair) {
            C10999a3.this.f27984h.mo33697C(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public /* synthetic */ void m33687a0(Pair pair, int i10) {
            C10999a3.this.f27984h.mo33702J(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public /* synthetic */ void m33688b0(Pair pair, Exception exc) {
            C10999a3.this.f27984h.mo33701I(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public /* synthetic */ void m33689c0(Pair pair) {
            C10999a3.this.f27984h.mo33707y(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public /* synthetic */ void m33690d0(Pair pair, C11731u c11731u, C11737x c11737x) {
            C10999a3.this.f27984h.mo33698D(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public /* synthetic */ void m33691e0(Pair pair, C11731u c11731u, C11737x c11737x) {
            C10999a3.this.f27984h.mo33706x(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public /* synthetic */ void m33692f0(Pair pair, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
            C10999a3.this.f27984h.mo33699F(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, c11731u, c11737x, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public /* synthetic */ void m33693g0(Pair pair, C11731u c11731u, C11737x c11737x) {
            C10999a3.this.f27984h.mo33700G(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) pair.second, c11731u, c11737x);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public /* synthetic */ void m33694h0(Pair pair, C11737x c11737x) {
            C10999a3.this.f27984h.mo33705w(((Integer) pair.first).intValue(), (InterfaceC11684a0.b) C11137a.m34603e((InterfaceC11684a0.b) pair.second), c11737x);
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: B */
        public void mo33696B(int i10, InterfaceC11684a0.b bVar) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.z2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33685Y(m33682V);
                    }
                });
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: C */
        public void mo33697C(int i10, InterfaceC11684a0.b bVar) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33686Z(m33682V);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: D */
        public void mo33698D(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33690d0(m33682V, c11731u, c11737x);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: F */
        public void mo33699F(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x, final IOException iOException, final boolean z10) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33692f0(m33682V, c11731u, c11737x, iOException, z10);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: G */
        public void mo33700G(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33693g0(m33682V, c11731u, c11737x);
                    }
                });
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: I */
        public void mo33701I(int i10, InterfaceC11684a0.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33688b0(m33682V, exc);
                    }
                });
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: J */
        public void mo33702J(int i10, InterfaceC11684a0.b bVar, final int i11) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33687a0(m33682V, i11);
                    }
                });
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: u */
        public void mo33703u(int i10, InterfaceC11684a0.b bVar) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33684X(m33682V);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: v */
        public void mo33704v(int i10, InterfaceC11684a0.b bVar, final C11737x c11737x) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33683W(m33682V, c11737x);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: w */
        public void mo33705w(int i10, InterfaceC11684a0.b bVar, final C11737x c11737x) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33694h0(m33682V, c11737x);
                    }
                });
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: x */
        public void mo33706x(int i10, InterfaceC11684a0.b bVar, final C11731u c11731u, final C11737x c11737x) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.y2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33691e0(m33682V, c11731u, c11737x);
                    }
                });
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: y */
        public void mo33707y(int i10, InterfaceC11684a0.b bVar) {
            final Pair<Integer, InterfaceC11684a0.b> m33682V = m33682V(i10, bVar);
            if (m33682V != null) {
                C10999a3.this.f27985i.mo34778h(new Runnable() { // from class: t6.w2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10999a3.a.this.m33689c0(m33682V);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.a3$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC11684a0 f27991a;

        /* renamed from: b */
        public final InterfaceC11684a0.c f27992b;

        /* renamed from: c */
        public final a f27993c;

        public b(InterfaceC11684a0 interfaceC11684a0, InterfaceC11684a0.c cVar, a aVar) {
            this.f27991a = interfaceC11684a0;
            this.f27992b = cVar;
            this.f27993c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t6.a3$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC11069m2 {

        /* renamed from: a */
        public final C11735w f27994a;

        /* renamed from: d */
        public int f27997d;

        /* renamed from: e */
        public boolean f27998e;

        /* renamed from: c */
        public final List<InterfaceC11684a0.b> f27996c = new ArrayList();

        /* renamed from: b */
        public final Object f27995b = new Object();

        public c(InterfaceC11684a0 interfaceC11684a0, boolean z10) {
            this.f27994a = new C11735w(interfaceC11684a0, z10);
        }

        @Override // p361t6.InterfaceC11069m2
        /* renamed from: a */
        public AbstractC11018d4 mo33708a() {
            return this.f27994a.m37092Z();
        }

        /* renamed from: b */
        public void m33709b(int i10) {
            this.f27997d = i10;
            this.f27998e = false;
            this.f27996c.clear();
        }

        @Override // p361t6.InterfaceC11069m2
        /* renamed from: l */
        public Object mo33710l() {
            return this.f27995b;
        }
    }

    /* renamed from: t6.a3$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: c */
        void mo33711c();
    }

    public C10999a3(d dVar, InterfaceC11327a interfaceC11327a, InterfaceC11165o interfaceC11165o, C11391m3 c11391m3) {
        this.f27977a = c11391m3;
        this.f27981e = dVar;
        this.f27984h = interfaceC11327a;
        this.f27985i = interfaceC11165o;
    }

    /* renamed from: B */
    private void m33641B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f27978b.remove(i12);
            this.f27980d.remove(remove.f27995b);
            m33647g(i12, -remove.f27994a.m37092Z().mo11861u());
            remove.f27998e = true;
            if (this.f27987k) {
                m33657u(remove);
            }
        }
    }

    /* renamed from: g */
    private void m33647g(int i10, int i11) {
        while (i10 < this.f27978b.size()) {
            this.f27978b.get(i10).f27997d += i11;
            i10++;
        }
    }

    /* renamed from: j */
    private void m33648j(c cVar) {
        b bVar = this.f27982f.get(cVar);
        if (bVar != null) {
            bVar.f27991a.mo36805c(bVar.f27992b);
        }
    }

    /* renamed from: k */
    private void m33649k() {
        Iterator<c> it = this.f27983g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f27996c.isEmpty()) {
                m33648j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    private void m33650l(c cVar) {
        this.f27983g.add(cVar);
        b bVar = this.f27982f.get(cVar);
        if (bVar != null) {
            bVar.f27991a.mo36806f(bVar.f27992b);
        }
    }

    /* renamed from: m */
    private static Object m33651m(Object obj) {
        return AbstractC10995a.m33616A(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static InterfaceC11684a0.b m33652n(c cVar, InterfaceC11684a0.b bVar) {
        for (int i10 = 0; i10 < cVar.f27996c.size(); i10++) {
            if (cVar.f27996c.get(i10).f30977d == bVar.f30977d) {
                return bVar.m36820c(m33654p(cVar, bVar.f30974a));
            }
        }
        return null;
    }

    /* renamed from: o */
    private static Object m33653o(Object obj) {
        return AbstractC10995a.m33617B(obj);
    }

    /* renamed from: p */
    private static Object m33654p(c cVar, Object obj) {
        return AbstractC10995a.m33618D(cVar.f27995b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static int m33655r(c cVar, int i10) {
        return i10 + cVar.f27997d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m33656t(InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4) {
        this.f27981e.mo33711c();
    }

    /* renamed from: u */
    private void m33657u(c cVar) {
        if (cVar.f27998e && cVar.f27996c.isEmpty()) {
            b bVar = (b) C11137a.m34603e(this.f27982f.remove(cVar));
            bVar.f27991a.mo36804b(bVar.f27992b);
            bVar.f27991a.mo36807g(bVar.f27993c);
            bVar.f27991a.mo36809q(bVar.f27993c);
            this.f27983g.remove(cVar);
        }
    }

    /* renamed from: x */
    private void m33658x(c cVar) {
        C11735w c11735w = cVar.f27994a;
        InterfaceC11684a0.c cVar2 = new InterfaceC11684a0.c() { // from class: t6.n2
            @Override // p397v7.InterfaceC11684a0.c
            /* renamed from: a */
            public final void mo34304a(InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4) {
                C10999a3.this.m33656t(interfaceC11684a0, abstractC11018d4);
            }
        };
        a aVar = new a(cVar);
        this.f27982f.put(cVar, new b(c11735w, cVar2, aVar));
        c11735w.mo36808j(C11172r0.m34958y(), aVar);
        c11735w.mo36810s(C11172r0.m34958y(), aVar);
        c11735w.mo36803a(cVar2, this.f27988l, this.f27977a);
    }

    /* renamed from: A */
    public AbstractC11018d4 m33659A(int i10, int i11, InterfaceC11738x0 interfaceC11738x0) {
        C11137a.m34599a(i10 >= 0 && i10 <= i11 && i11 <= m33665q());
        this.f27986j = interfaceC11738x0;
        m33641B(i10, i11);
        return m33664i();
    }

    /* renamed from: C */
    public AbstractC11018d4 m33660C(List<c> list, InterfaceC11738x0 interfaceC11738x0) {
        m33641B(0, this.f27978b.size());
        return m33662f(this.f27978b.size(), list, interfaceC11738x0);
    }

    /* renamed from: D */
    public AbstractC11018d4 m33661D(InterfaceC11738x0 interfaceC11738x0) {
        int m33665q = m33665q();
        if (interfaceC11738x0.getLength() != m33665q) {
            interfaceC11738x0 = interfaceC11738x0.mo37101e().mo37103g(0, m33665q);
        }
        this.f27986j = interfaceC11738x0;
        return m33664i();
    }

    /* renamed from: f */
    public AbstractC11018d4 m33662f(int i10, List<c> list, InterfaceC11738x0 interfaceC11738x0) {
        int i11;
        if (!list.isEmpty()) {
            this.f27986j = interfaceC11738x0;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f27978b.get(i12 - 1);
                    i11 = cVar2.f27997d + cVar2.f27994a.m37092Z().mo11861u();
                } else {
                    i11 = 0;
                }
                cVar.m33709b(i11);
                m33647g(i12, cVar.f27994a.m37092Z().mo11861u());
                this.f27978b.add(i12, cVar);
                this.f27980d.put(cVar.f27995b, cVar);
                if (this.f27987k) {
                    m33658x(cVar);
                    if (this.f27979c.isEmpty()) {
                        this.f27983g.add(cVar);
                    } else {
                        m33648j(cVar);
                    }
                }
            }
        }
        return m33664i();
    }

    /* renamed from: h */
    public InterfaceC11739y m33663h(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        Object m33653o = m33653o(bVar.f30974a);
        InterfaceC11684a0.b m36820c = bVar.m36820c(m33651m(bVar.f30974a));
        c cVar = (c) C11137a.m34603e(this.f27980d.get(m33653o));
        m33650l(cVar);
        cVar.f27996c.add(m36820c);
        C11733v mo11843e = cVar.f27994a.mo11843e(m36820c, interfaceC10811b, j10);
        this.f27979c.put(mo11843e, cVar);
        m33649k();
        return mo11843e;
    }

    /* renamed from: i */
    public AbstractC11018d4 m33664i() {
        if (this.f27978b.isEmpty()) {
            return AbstractC11018d4.f28214a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27978b.size(); i11++) {
            c cVar = this.f27978b.get(i11);
            cVar.f27997d = i10;
            i10 += cVar.f27994a.m37092Z().mo11861u();
        }
        return new C11075n3(this.f27978b, this.f27986j);
    }

    /* renamed from: q */
    public int m33665q() {
        return this.f27978b.size();
    }

    /* renamed from: s */
    public boolean m33666s() {
        return this.f27987k;
    }

    /* renamed from: v */
    public AbstractC11018d4 m33667v(int i10, int i11, int i12, InterfaceC11738x0 interfaceC11738x0) {
        C11137a.m34599a(i10 >= 0 && i10 <= i11 && i11 <= m33665q() && i12 >= 0);
        this.f27986j = interfaceC11738x0;
        if (i10 == i11 || i10 == i12) {
            return m33664i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f27978b.get(min).f27997d;
        C11172r0.m34859B0(this.f27978b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f27978b.get(min);
            cVar.f27997d = i13;
            i13 += cVar.f27994a.m37092Z().mo11861u();
            min++;
        }
        return m33664i();
    }

    /* renamed from: w */
    public void m33668w(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34605g(!this.f27987k);
        this.f27988l = interfaceC10834m0;
        for (int i10 = 0; i10 < this.f27978b.size(); i10++) {
            c cVar = this.f27978b.get(i10);
            m33658x(cVar);
            this.f27983g.add(cVar);
        }
        this.f27987k = true;
    }

    /* renamed from: y */
    public void m33669y() {
        for (b bVar : this.f27982f.values()) {
            try {
                bVar.f27991a.mo36804b(bVar.f27992b);
            } catch (RuntimeException e10) {
                C11173s.m34965d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f27991a.mo36807g(bVar.f27993c);
            bVar.f27991a.mo36809q(bVar.f27993c);
        }
        this.f27982f.clear();
        this.f27983g.clear();
        this.f27987k = false;
    }

    /* renamed from: z */
    public void m33670z(InterfaceC11739y interfaceC11739y) {
        c cVar = (c) C11137a.m34603e(this.f27979c.remove(interfaceC11739y));
        cVar.f27994a.mo11844l(interfaceC11739y);
        cVar.f27996c.remove(((C11733v) interfaceC11739y).f30928a);
        if (!this.f27979c.isEmpty()) {
            m33649k();
        }
        m33657u(cVar);
    }
}
