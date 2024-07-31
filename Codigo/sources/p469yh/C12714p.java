package p469yh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yh.p */
/* loaded from: classes3.dex */
public class C12714p implements InterfaceC12712n {

    /* renamed from: a */
    final String f34476a;

    /* renamed from: b */
    final int f34477b;

    /* renamed from: c */
    final int f34478c;

    /* renamed from: d */
    private final LinkedList<C12709k> f34479d = new LinkedList<>();

    /* renamed from: e */
    private final Set<C12711m> f34480e = new HashSet();

    /* renamed from: f */
    private final Set<C12711m> f34481f = new HashSet();

    /* renamed from: g */
    private final Map<Integer, C12711m> f34482g = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12714p(String str, int i10, int i11) {
        this.f34476a = str;
        this.f34477b = i10;
        this.f34478c = i11;
    }

    /* renamed from: g */
    private synchronized C12709k m41947g(C12711m c12711m) {
        C12709k next;
        C12711m c12711m2;
        ListIterator<C12709k> listIterator = this.f34479d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            c12711m2 = next.m41932a() != null ? this.f34482g.get(next.m41932a()) : null;
            if (c12711m2 == null) {
                break;
            }
        } while (c12711m2 != c12711m);
        listIterator.remove();
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized void m41948h(C12711m c12711m) {
        HashSet hashSet = new HashSet(this.f34480e);
        this.f34481f.remove(c12711m);
        this.f34480e.add(c12711m);
        if (!c12711m.m41936b() && c12711m.m41937d() != null) {
            this.f34482g.remove(c12711m.m41937d());
        }
        m41950j(c12711m);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m41950j((C12711m) it.next());
        }
    }

    /* renamed from: j */
    private synchronized void m41950j(C12711m c12711m) {
        C12709k m41947g = m41947g(c12711m);
        if (m41947g != null) {
            this.f34481f.add(c12711m);
            this.f34480e.remove(c12711m);
            if (m41947g.m41932a() != null) {
                this.f34482g.put(m41947g.m41932a(), c12711m);
            }
            c12711m.m41938e(m41947g);
        }
    }

    @Override // p469yh.InterfaceC12712n
    /* renamed from: a */
    public synchronized void mo41943a(C12709k c12709k) {
        this.f34479d.add(c12709k);
        Iterator it = new HashSet(this.f34480e).iterator();
        while (it.hasNext()) {
            m41950j((C12711m) it.next());
        }
    }

    @Override // p469yh.InterfaceC12712n
    /* renamed from: d */
    public synchronized void mo41945d() {
        Iterator<C12711m> it = this.f34480e.iterator();
        while (it.hasNext()) {
            it.next().m41939f();
        }
        Iterator<C12711m> it2 = this.f34481f.iterator();
        while (it2.hasNext()) {
            it2.next().m41939f();
        }
    }

    /* renamed from: f */
    protected C12711m m41951f(String str, int i10) {
        return new C12711m(str, i10);
    }

    @Override // p469yh.InterfaceC12712n
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f34477b; i10++) {
            final C12711m m41951f = m41951f(this.f34476a + i10, this.f34478c);
            m41951f.m41940g(new Runnable() { // from class: yh.o
                @Override // java.lang.Runnable
                public final void run() {
                    C12714p.this.m41948h(m41951f);
                }
            });
            this.f34480e.add(m41951f);
        }
    }
}
