package com.google.protobuf;

import com.google.protobuf.C6633z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.h0 */
/* loaded from: classes2.dex */
abstract class AbstractC6584h0 {

    /* renamed from: a */
    private static final AbstractC6584h0 f14494a;

    /* renamed from: b */
    private static final AbstractC6584h0 f14495b;

    /* renamed from: com.google.protobuf.h0$b */
    /* loaded from: classes2.dex */
    private static final class b extends AbstractC6584h0 {

        /* renamed from: c */
        private static final Class<?> f14496c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m18621f(Object obj, long j10) {
            return (List) C6615r1.m19041C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m18622g(Object obj, long j10, int i10) {
            List<L> mo18430a;
            C6578f0 c6578f0;
            List<L> m18621f = m18621f(obj, j10);
            if (!m18621f.isEmpty()) {
                if (f14496c.isAssignableFrom(m18621f.getClass())) {
                    ArrayList arrayList = new ArrayList(m18621f.size() + i10);
                    arrayList.addAll(m18621f);
                    c6578f0 = arrayList;
                } else if (m18621f instanceof C6612q1) {
                    C6578f0 c6578f02 = new C6578f0(m18621f.size() + i10);
                    c6578f02.addAll((C6612q1) m18621f);
                    c6578f0 = c6578f02;
                } else {
                    if (!(m18621f instanceof InterfaceC6564a1) || !(m18621f instanceof C6633z.i)) {
                        return m18621f;
                    }
                    C6633z.i iVar = (C6633z.i) m18621f;
                    if (iVar.mo18413g()) {
                        return m18621f;
                    }
                    mo18430a = iVar.mo18430a(m18621f.size() + i10);
                }
                C6615r1.m19056R(obj, j10, c6578f0);
                return c6578f0;
            }
            mo18430a = m18621f instanceof InterfaceC6581g0 ? new C6578f0(i10) : ((m18621f instanceof InterfaceC6564a1) && (m18621f instanceof C6633z.i)) ? ((C6633z.i) m18621f).mo18430a(i10) : new ArrayList<>(i10);
            C6615r1.m19056R(obj, j10, mo18430a);
            return mo18430a;
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: c */
        void mo18618c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) C6615r1.m19041C(obj, j10);
            if (list instanceof InterfaceC6581g0) {
                unmodifiableList = ((InterfaceC6581g0) list).mo18460i();
            } else {
                if (f14496c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC6564a1) && (list instanceof C6633z.i)) {
                    C6633z.i iVar = (C6633z.i) list;
                    if (iVar.mo18413g()) {
                        iVar.mo18411b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C6615r1.m19056R(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: d */
        <E> void mo18619d(Object obj, Object obj2, long j10) {
            List m18621f = m18621f(obj2, j10);
            List m18622g = m18622g(obj, j10, m18621f.size());
            int size = m18622g.size();
            int size2 = m18621f.size();
            if (size > 0 && size2 > 0) {
                m18622g.addAll(m18621f);
            }
            if (size > 0) {
                m18621f = m18622g;
            }
            C6615r1.m19056R(obj, j10, m18621f);
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: e */
        <L> List<L> mo18620e(Object obj, long j10) {
            return m18622g(obj, j10, 10);
        }
    }

    /* renamed from: com.google.protobuf.h0$c */
    /* loaded from: classes2.dex */
    private static final class c extends AbstractC6584h0 {
        private c() {
            super();
        }

        /* renamed from: f */
        static <E> C6633z.i<E> m18623f(Object obj, long j10) {
            return (C6633z.i) C6615r1.m19041C(obj, j10);
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: c */
        void mo18618c(Object obj, long j10) {
            m18623f(obj, j10).mo18411b();
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: d */
        <E> void mo18619d(Object obj, Object obj2, long j10) {
            C6633z.i m18623f = m18623f(obj, j10);
            C6633z.i m18623f2 = m18623f(obj2, j10);
            int size = m18623f.size();
            int size2 = m18623f2.size();
            if (size > 0 && size2 > 0) {
                if (!m18623f.mo18413g()) {
                    m18623f = m18623f.mo18430a(size2 + size);
                }
                m18623f.addAll(m18623f2);
            }
            if (size > 0) {
                m18623f2 = m18623f;
            }
            C6615r1.m19056R(obj, j10, m18623f2);
        }

        @Override // com.google.protobuf.AbstractC6584h0
        /* renamed from: e */
        <L> List<L> mo18620e(Object obj, long j10) {
            C6633z.i m18623f = m18623f(obj, j10);
            if (m18623f.mo18413g()) {
                return m18623f;
            }
            int size = m18623f.size();
            C6633z.i mo18430a = m18623f.mo18430a(size == 0 ? 10 : size * 2);
            C6615r1.m19056R(obj, j10, mo18430a);
            return mo18430a;
        }
    }

    static {
        f14494a = new b();
        f14495b = new c();
    }

    private AbstractC6584h0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC6584h0 m18616a() {
        return f14494a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC6584h0 m18617b() {
        return f14495b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo18618c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo18619d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo18620e(Object obj, long j10);
}
