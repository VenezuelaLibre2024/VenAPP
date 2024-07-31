package p152i4;

import android.os.Handler;
import dk.C7019l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: i4.m0 */
/* loaded from: classes.dex */
public final class C7815m0 extends AbstractList<C7807i0> {

    /* renamed from: r */
    public static final b f18723r = new b(null);

    /* renamed from: s */
    private static final AtomicInteger f18724s = new AtomicInteger();

    /* renamed from: a */
    private Handler f18725a;

    /* renamed from: b */
    private int f18726b;

    /* renamed from: c */
    private final String f18727c;

    /* renamed from: d */
    private List<C7807i0> f18728d;

    /* renamed from: e */
    private List<a> f18729e;

    /* renamed from: f */
    private String f18730f;

    /* renamed from: i4.m0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo23876b(C7815m0 c7815m0);
    }

    /* renamed from: i4.m0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: i4.m0$c */
    /* loaded from: classes.dex */
    public interface c extends a {
        /* renamed from: a */
        void m24059a(C7815m0 c7815m0, long j10, long j11);
    }

    public C7815m0(Collection<C7807i0> requests) {
        C9322n.m27781e(requests, "requests");
        this.f18727c = String.valueOf(Integer.valueOf(f18724s.incrementAndGet()));
        this.f18729e = new ArrayList();
        this.f18728d = new ArrayList(requests);
    }

    public C7815m0(C7807i0... requests) {
        List m20435c;
        C9322n.m27781e(requests, "requests");
        this.f18727c = String.valueOf(Integer.valueOf(f18724s.incrementAndGet()));
        this.f18729e = new ArrayList();
        m20435c = C7019l.m20435c(requests);
        this.f18728d = new ArrayList(m20435c);
    }

    /* renamed from: l */
    private final List<C7817n0> m24036l() {
        return C7807i0.f18658n.m23994i(this);
    }

    /* renamed from: n */
    private final AsyncTaskC7813l0 m24037n() {
        return C7807i0.f18658n.m23997l(this);
    }

    /* renamed from: A */
    public C7807i0 m24038A(int i10) {
        return this.f18728d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C7807i0 set(int i10, C7807i0 element) {
        C9322n.m27781e(element, "element");
        return this.f18728d.set(i10, element);
    }

    /* renamed from: D */
    public final void m24040D(Handler handler) {
        this.f18725a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, C7807i0 element) {
        C9322n.m27781e(element, "element");
        this.f18728d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f18728d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C7807i0) {
            return m24044h((C7807i0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(C7807i0 element) {
        C9322n.m27781e(element, "element");
        return this.f18728d.add(element);
    }

    /* renamed from: f */
    public final void m24043f(a callback) {
        C9322n.m27781e(callback, "callback");
        if (this.f18729e.contains(callback)) {
            return;
        }
        this.f18729e.add(callback);
    }

    /* renamed from: h */
    public /* bridge */ boolean m24044h(C7807i0 c7807i0) {
        return super.contains(c7807i0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof C7807i0) {
            return m24055w((C7807i0) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public final List<C7817n0> m24045k() {
        return m24036l();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof C7807i0) {
            return m24056x((C7807i0) obj);
        }
        return -1;
    }

    /* renamed from: m */
    public final AsyncTaskC7813l0 m24046m() {
        return m24037n();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C7807i0 get(int i10) {
        return this.f18728d.get(i10);
    }

    /* renamed from: p */
    public final String m24048p() {
        return this.f18730f;
    }

    /* renamed from: q */
    public final Handler m24049q() {
        return this.f18725a;
    }

    /* renamed from: r */
    public final List<a> m24050r() {
        return this.f18729e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof C7807i0) {
            return m24058z((C7807i0) obj);
        }
        return false;
    }

    /* renamed from: s */
    public final String m24051s() {
        return this.f18727c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m24053u();
    }

    /* renamed from: t */
    public final List<C7807i0> m24052t() {
        return this.f18728d;
    }

    /* renamed from: u */
    public int m24053u() {
        return this.f18728d.size();
    }

    /* renamed from: v */
    public final int m24054v() {
        return this.f18726b;
    }

    /* renamed from: w */
    public /* bridge */ int m24055w(C7807i0 c7807i0) {
        return super.indexOf(c7807i0);
    }

    /* renamed from: x */
    public /* bridge */ int m24056x(C7807i0 c7807i0) {
        return super.lastIndexOf(c7807i0);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ C7807i0 remove(int i10) {
        return m24038A(i10);
    }

    /* renamed from: z */
    public /* bridge */ boolean m24058z(C7807i0 c7807i0) {
        return super.remove(c7807i0);
    }
}
