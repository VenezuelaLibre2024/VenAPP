package yh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class p implements n {

    /* renamed from: a */
    final String f31940a;

    /* renamed from: b */
    final int f31941b;

    /* renamed from: c */
    final int f31942c;

    /* renamed from: d */
    private final LinkedList<k> f31943d = new LinkedList<>();

    /* renamed from: e */
    private final Set<m> f31944e = new HashSet();

    /* renamed from: f */
    private final Set<m> f31945f = new HashSet();

    /* renamed from: g */
    private final Map<Integer, m> f31946g = new HashMap();

    public p(String str, int i10, int i11) {
        this.f31940a = str;
        this.f31941b = i10;
        this.f31942c = i11;
    }

    private synchronized k g(m mVar) {
        k next;
        m mVar2;
        ListIterator<k> listIterator = this.f31943d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            mVar2 = next.a() != null ? this.f31946g.get(next.a()) : null;
            if (mVar2 == null) {
                break;
            }
        } while (mVar2 != mVar);
        listIterator.remove();
        return next;
    }

    /* renamed from: i */
    public synchronized void h(m mVar) {
        HashSet hashSet = new HashSet(this.f31944e);
        this.f31945f.remove(mVar);
        this.f31944e.add(mVar);
        if (!mVar.b() && mVar.d() != null) {
            this.f31946g.remove(mVar.d());
        }
        j(mVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    private synchronized void j(m mVar) {
        k g10 = g(mVar);
        if (g10 != null) {
            this.f31945f.add(mVar);
            this.f31944e.remove(mVar);
            if (g10.a() != null) {
                this.f31946g.put(g10.a(), mVar);
            }
            mVar.e(g10);
        }
    }

    @Override // yh.n
    public synchronized void a(k kVar) {
        this.f31943d.add(kVar);
        Iterator it = new HashSet(this.f31944e).iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    @Override // yh.n
    public synchronized void d() {
        Iterator<m> it = this.f31944e.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        Iterator<m> it2 = this.f31945f.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }

    protected m f(String str, int i10) {
        return new m(str, i10);
    }

    @Override // yh.n
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f31941b; i10++) {
            m f10 = f(this.f31940a + i10, this.f31942c);
            f10.g(new Runnable() { // from class: yh.o

                /* renamed from: b */
                public final /* synthetic */ m f31939b;

                public /* synthetic */ o(m f102) {
                    r2 = f102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    p.this.h(r2);
                }
            });
            this.f31944e.add(f102);
        }
    }
}
