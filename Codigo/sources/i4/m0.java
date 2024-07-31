package i4;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class m0 extends AbstractList<i0> {

    /* renamed from: r */
    public static final b f17064r = new b(null);

    /* renamed from: s */
    private static final AtomicInteger f17065s = new AtomicInteger();

    /* renamed from: a */
    private Handler f17066a;

    /* renamed from: b */
    private int f17067b;

    /* renamed from: c */
    private final String f17068c;

    /* renamed from: d */
    private List<i0> f17069d;

    /* renamed from: e */
    private List<a> f17070e;

    /* renamed from: f */
    private String f17071f;

    /* loaded from: classes.dex */
    public interface a {
        void b(m0 m0Var);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c extends a {
        void a(m0 m0Var, long j10, long j11);
    }

    public m0(Collection<i0> requests) {
        kotlin.jvm.internal.n.e(requests, "requests");
        this.f17068c = String.valueOf(Integer.valueOf(f17065s.incrementAndGet()));
        this.f17070e = new ArrayList();
        this.f17069d = new ArrayList(requests);
    }

    public m0(i0... requests) {
        List c10;
        kotlin.jvm.internal.n.e(requests, "requests");
        this.f17068c = String.valueOf(Integer.valueOf(f17065s.incrementAndGet()));
        this.f17070e = new ArrayList();
        c10 = dk.l.c(requests);
        this.f17069d = new ArrayList(c10);
    }

    private final List<n0> l() {
        return i0.f17005n.i(this);
    }

    private final l0 n() {
        return i0.f17005n.l(this);
    }

    public i0 A(int i10) {
        return this.f17069d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: C */
    public i0 set(int i10, i0 element) {
        kotlin.jvm.internal.n.e(element, "element");
        return this.f17069d.set(i10, element);
    }

    public final void D(Handler handler) {
        this.f17066a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i10, i0 element) {
        kotlin.jvm.internal.n.e(element, "element");
        this.f17069d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f17069d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof i0) {
            return h((i0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(i0 element) {
        kotlin.jvm.internal.n.e(element, "element");
        return this.f17069d.add(element);
    }

    public final void f(a callback) {
        kotlin.jvm.internal.n.e(callback, "callback");
        if (this.f17070e.contains(callback)) {
            return;
        }
        this.f17070e.add(callback);
    }

    public /* bridge */ boolean h(i0 i0Var) {
        return super.contains(i0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof i0) {
            return w((i0) obj);
        }
        return -1;
    }

    public final List<n0> k() {
        return l();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof i0) {
            return x((i0) obj);
        }
        return -1;
    }

    public final l0 m() {
        return n();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o */
    public i0 get(int i10) {
        return this.f17069d.get(i10);
    }

    public final String p() {
        return this.f17071f;
    }

    public final Handler q() {
        return this.f17066a;
    }

    public final List<a> r() {
        return this.f17070e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof i0) {
            return z((i0) obj);
        }
        return false;
    }

    public final String s() {
        return this.f17068c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return u();
    }

    public final List<i0> t() {
        return this.f17069d;
    }

    public int u() {
        return this.f17069d.size();
    }

    public final int v() {
        return this.f17067b;
    }

    public /* bridge */ int w(i0 i0Var) {
        return super.indexOf(i0Var);
    }

    public /* bridge */ int x(i0 i0Var) {
        return super.lastIndexOf(i0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: y */
    public final /* bridge */ i0 remove(int i10) {
        return A(i10);
    }

    public /* bridge */ boolean z(i0 i0Var) {
        return super.remove(i0Var);
    }
}
