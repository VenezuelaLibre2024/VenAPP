package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h0 */
/* loaded from: classes2.dex */
abstract class AbstractC5971h0 {

    /* renamed from: a */
    private static final AbstractC5971h0 f12603a;

    /* renamed from: b */
    private static final AbstractC5971h0 f12604b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h0$b */
    /* loaded from: classes2.dex */
    private static final class b extends AbstractC5971h0 {

        /* renamed from: c */
        private static final Class<?> f12605c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m15518f(Object obj, long j10) {
            return (List) C6002r1.m15976C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m15519g(Object obj, long j10, int i10) {
            List<L> mo15315a;
            C5965f0 c5965f0;
            List<L> m15518f = m15518f(obj, j10);
            if (!m15518f.isEmpty()) {
                if (f12605c.isAssignableFrom(m15518f.getClass())) {
                    ArrayList arrayList = new ArrayList(m15518f.size() + i10);
                    arrayList.addAll(m15518f);
                    c5965f0 = arrayList;
                } else if (m15518f instanceof C5999q1) {
                    C5965f0 c5965f02 = new C5965f0(m15518f.size() + i10);
                    c5965f02.addAll((C5999q1) m15518f);
                    c5965f0 = c5965f02;
                } else {
                    if (!(m15518f instanceof InterfaceC5951a1) || !(m15518f instanceof C5950a0.i)) {
                        return m15518f;
                    }
                    C5950a0.i iVar = (C5950a0.i) m15518f;
                    if (iVar.mo15317g()) {
                        return m15518f;
                    }
                    mo15315a = iVar.mo15315a(m15518f.size() + i10);
                }
                C6002r1.m15991R(obj, j10, c5965f0);
                return c5965f0;
            }
            mo15315a = m15518f instanceof InterfaceC5968g0 ? new C5965f0(i10) : ((m15518f instanceof InterfaceC5951a1) && (m15518f instanceof C5950a0.i)) ? ((C5950a0.i) m15518f).mo15315a(i10) : new ArrayList<>(i10);
            C6002r1.m15991R(obj, j10, mo15315a);
            return mo15315a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: c */
        void mo15515c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) C6002r1.m15976C(obj, j10);
            if (list instanceof InterfaceC5968g0) {
                unmodifiableList = ((InterfaceC5968g0) list).mo15421i();
            } else {
                if (f12605c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC5951a1) && (list instanceof C5950a0.i)) {
                    C5950a0.i iVar = (C5950a0.i) list;
                    if (iVar.mo15317g()) {
                        iVar.mo15316b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C6002r1.m15991R(obj, j10, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: d */
        <E> void mo15516d(Object obj, Object obj2, long j10) {
            List m15518f = m15518f(obj2, j10);
            List m15519g = m15519g(obj, j10, m15518f.size());
            int size = m15519g.size();
            int size2 = m15518f.size();
            if (size > 0 && size2 > 0) {
                m15519g.addAll(m15518f);
            }
            if (size > 0) {
                m15518f = m15519g;
            }
            C6002r1.m15991R(obj, j10, m15518f);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: e */
        <L> List<L> mo15517e(Object obj, long j10) {
            return m15519g(obj, j10, 10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h0$c */
    /* loaded from: classes2.dex */
    private static final class c extends AbstractC5971h0 {
        private c() {
            super();
        }

        /* renamed from: f */
        static <E> C5950a0.i<E> m15520f(Object obj, long j10) {
            return (C5950a0.i) C6002r1.m15976C(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: c */
        void mo15515c(Object obj, long j10) {
            m15520f(obj, j10).mo15316b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: d */
        <E> void mo15516d(Object obj, Object obj2, long j10) {
            C5950a0.i m15520f = m15520f(obj, j10);
            C5950a0.i m15520f2 = m15520f(obj2, j10);
            int size = m15520f.size();
            int size2 = m15520f2.size();
            if (size > 0 && size2 > 0) {
                if (!m15520f.mo15317g()) {
                    m15520f = m15520f.mo15315a(size2 + size);
                }
                m15520f.addAll(m15520f2);
            }
            if (size > 0) {
                m15520f2 = m15520f;
            }
            C6002r1.m15991R(obj, j10, m15520f2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5971h0
        /* renamed from: e */
        <L> List<L> mo15517e(Object obj, long j10) {
            C5950a0.i m15520f = m15520f(obj, j10);
            if (m15520f.mo15317g()) {
                return m15520f;
            }
            int size = m15520f.size();
            C5950a0.i mo15315a = m15520f.mo15315a(size == 0 ? 10 : size * 2);
            C6002r1.m15991R(obj, j10, mo15315a);
            return mo15315a;
        }
    }

    static {
        f12603a = new b();
        f12604b = new c();
    }

    private AbstractC5971h0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5971h0 m15513a() {
        return f12603a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC5971h0 m15514b() {
        return f12604b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo15515c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo15516d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo15517e(Object obj, long j10);
}
