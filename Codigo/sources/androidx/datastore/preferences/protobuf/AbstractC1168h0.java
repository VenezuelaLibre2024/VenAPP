package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h0 */
/* loaded from: classes.dex */
abstract class AbstractC1168h0 {

    /* renamed from: a */
    private static final AbstractC1168h0 f4843a;

    /* renamed from: b */
    private static final AbstractC1168h0 f4844b;

    /* renamed from: androidx.datastore.preferences.protobuf.h0$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC1168h0 {

        /* renamed from: c */
        private static final Class<?> f4845c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m5838f(Object obj, long j10) {
            return (List) C1199r1.m6314A(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m5839g(Object obj, long j10, int i10) {
            List<L> mo5656a;
            C1162f0 c1162f0;
            List<L> m5838f = m5838f(obj, j10);
            if (!m5838f.isEmpty()) {
                if (f4845c.isAssignableFrom(m5838f.getClass())) {
                    ArrayList arrayList = new ArrayList(m5838f.size() + i10);
                    arrayList.addAll(m5838f);
                    c1162f0 = arrayList;
                } else if (m5838f instanceof C1196q1) {
                    C1162f0 c1162f02 = new C1162f0(m5838f.size() + i10);
                    c1162f02.addAll((C1196q1) m5838f);
                    c1162f0 = c1162f02;
                } else {
                    if (!(m5838f instanceof InterfaceC1148a1) || !(m5838f instanceof C1147a0.i)) {
                        return m5838f;
                    }
                    C1147a0.i iVar = (C1147a0.i) m5838f;
                    if (iVar.mo5658g()) {
                        return m5838f;
                    }
                    mo5656a = iVar.mo5656a(m5838f.size() + i10);
                }
                C1199r1.m6328O(obj, j10, c1162f0);
                return c1162f0;
            }
            mo5656a = m5838f instanceof InterfaceC1165g0 ? new C1162f0(i10) : ((m5838f instanceof InterfaceC1148a1) && (m5838f instanceof C1147a0.i)) ? ((C1147a0.i) m5838f).mo5656a(i10) : new ArrayList<>(i10);
            C1199r1.m6328O(obj, j10, mo5656a);
            return mo5656a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: c */
        void mo5835c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) C1199r1.m6314A(obj, j10);
            if (list instanceof InterfaceC1165g0) {
                unmodifiableList = ((InterfaceC1165g0) list).mo5786i();
            } else {
                if (f4845c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC1148a1) && (list instanceof C1147a0.i)) {
                    C1147a0.i iVar = (C1147a0.i) list;
                    if (iVar.mo5658g()) {
                        iVar.mo5657b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C1199r1.m6328O(obj, j10, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: d */
        <E> void mo5836d(Object obj, Object obj2, long j10) {
            List m5838f = m5838f(obj2, j10);
            List m5839g = m5839g(obj, j10, m5838f.size());
            int size = m5839g.size();
            int size2 = m5838f.size();
            if (size > 0 && size2 > 0) {
                m5839g.addAll(m5838f);
            }
            if (size > 0) {
                m5838f = m5839g;
            }
            C1199r1.m6328O(obj, j10, m5838f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: e */
        <L> List<L> mo5837e(Object obj, long j10) {
            return m5839g(obj, j10, 10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h0$c */
    /* loaded from: classes.dex */
    private static final class c extends AbstractC1168h0 {
        private c() {
            super();
        }

        /* renamed from: f */
        static <E> C1147a0.i<E> m5840f(Object obj, long j10) {
            return (C1147a0.i) C1199r1.m6314A(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: c */
        void mo5835c(Object obj, long j10) {
            m5840f(obj, j10).mo5657b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: d */
        <E> void mo5836d(Object obj, Object obj2, long j10) {
            C1147a0.i m5840f = m5840f(obj, j10);
            C1147a0.i m5840f2 = m5840f(obj2, j10);
            int size = m5840f.size();
            int size2 = m5840f2.size();
            if (size > 0 && size2 > 0) {
                if (!m5840f.mo5658g()) {
                    m5840f = m5840f.mo5656a(size2 + size);
                }
                m5840f.addAll(m5840f2);
            }
            if (size > 0) {
                m5840f2 = m5840f;
            }
            C1199r1.m6328O(obj, j10, m5840f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1168h0
        /* renamed from: e */
        <L> List<L> mo5837e(Object obj, long j10) {
            C1147a0.i m5840f = m5840f(obj, j10);
            if (m5840f.mo5658g()) {
                return m5840f;
            }
            int size = m5840f.size();
            C1147a0.i mo5656a = m5840f.mo5656a(size == 0 ? 10 : size * 2);
            C1199r1.m6328O(obj, j10, mo5656a);
            return mo5656a;
        }
    }

    static {
        f4843a = new b();
        f4844b = new c();
    }

    private AbstractC1168h0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC1168h0 m5833a() {
        return f4843a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC1168h0 m5834b() {
        return f4844b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo5835c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo5836d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo5837e(Object obj, long j10);
}
