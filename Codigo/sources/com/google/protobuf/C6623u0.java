package com.google.protobuf;

import com.google.protobuf.AbstractC6580g;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6624u1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.u0 */
/* loaded from: classes2.dex */
final class C6623u0<T> implements InterfaceC6582g1<T> {

    /* renamed from: r */
    private static final int[] f14630r = new int[0];

    /* renamed from: s */
    private static final Unsafe f14631s = C6615r1.m19042D();

    /* renamed from: a */
    private final int[] f14632a;

    /* renamed from: b */
    private final Object[] f14633b;

    /* renamed from: c */
    private final int f14634c;

    /* renamed from: d */
    private final int f14635d;

    /* renamed from: e */
    private final InterfaceC6614r0 f14636e;

    /* renamed from: f */
    private final boolean f14637f;

    /* renamed from: g */
    private final boolean f14638g;

    /* renamed from: h */
    private final boolean f14639h;

    /* renamed from: i */
    private final boolean f14640i;

    /* renamed from: j */
    private final int[] f14641j;

    /* renamed from: k */
    private final int f14642k;

    /* renamed from: l */
    private final int f14643l;

    /* renamed from: m */
    private final InterfaceC6628w0 f14644m;

    /* renamed from: n */
    private final AbstractC6584h0 f14645n;

    /* renamed from: o */
    private final AbstractC6603n1<?, ?> f14646o;

    /* renamed from: p */
    private final AbstractC6607p<?> f14647p;

    /* renamed from: q */
    private final InterfaceC6599m0 f14648q;

    private C6623u0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC6614r0 interfaceC6614r0, boolean z10, boolean z11, int[] iArr2, int i12, int i13, InterfaceC6628w0 interfaceC6628w0, AbstractC6584h0 abstractC6584h0, AbstractC6603n1<?, ?> abstractC6603n1, AbstractC6607p<?> abstractC6607p, InterfaceC6599m0 interfaceC6599m0) {
        this.f14632a = iArr;
        this.f14633b = objArr;
        this.f14634c = i10;
        this.f14635d = i11;
        this.f14638g = interfaceC6614r0 instanceof AbstractC6629x;
        this.f14639h = z10;
        this.f14637f = abstractC6607p != null && abstractC6607p.mo19000e(interfaceC6614r0);
        this.f14640i = z11;
        this.f14641j = iArr2;
        this.f14642k = i12;
        this.f14643l = i13;
        this.f14644m = interfaceC6628w0;
        this.f14645n = abstractC6584h0;
        this.f14646o = abstractC6603n1;
        this.f14647p = abstractC6607p;
        this.f14636e = interfaceC6614r0;
        this.f14648q = interfaceC6599m0;
    }

    /* renamed from: A */
    private boolean m19198A(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m19261z(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    private static boolean m19199B(Object obj, int i10, InterfaceC6582g1 interfaceC6582g1) {
        return interfaceC6582g1.mo18542c(C6615r1.m19041C(obj, m19219V(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    private <N> boolean m19200C(Object obj, int i10, int i11) {
        List list = (List) C6615r1.m19041C(obj, m19219V(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC6582g1 m19253t = m19253t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!m19253t.mo18542c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.g1] */
    /* renamed from: D */
    private boolean m19201D(T t10, int i10, int i11) {
        Map<?, ?> mo18943e = this.f14648q.mo18943e(C6615r1.m19041C(t10, m19219V(i10)));
        if (mo18943e.isEmpty()) {
            return true;
        }
        if (this.f14648q.mo18940b(m19251s(i11)).f14553c.m19192h() != C6621t1.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : mo18943e.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = C6570c1.m18416a().m18418c(obj.getClass());
            }
            if (!r52.mo18542c(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    private static boolean m19202E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC6629x) {
            return ((AbstractC6629x) obj).m19301N();
        }
        return true;
    }

    /* renamed from: F */
    private boolean m19203F(T t10, T t11, int i10) {
        long m19226c0 = m19226c0(i10) & 1048575;
        return C6615r1.m19084z(t10, m19226c0) == C6615r1.m19084z(t11, m19226c0);
    }

    /* renamed from: G */
    private boolean m19204G(T t10, int i10, int i11) {
        return C6615r1.m19084z(t10, (long) (m19226c0(i11) & 1048575)) == i10;
    }

    /* renamed from: H */
    private static boolean m19205H(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* renamed from: I */
    private static List<?> m19206I(Object obj, long j10) {
        return (List) C6615r1.m19041C(obj, j10);
    }

    /* renamed from: J */
    private static <T> long m19207J(T t10, long j10) {
        return C6615r1.m19039A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x008d, code lost:
    
        r0 = r18.f14642k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0092, code lost:
    
        if (r0 >= r18.f14643l) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0094, code lost:
    
        r4 = m19243o(r21, r18.f14641j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00aa, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00ab, code lost:
    
        if (r4 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00ad, code lost:
    
        r7.mo18967o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05bd A[Catch: all -> 0x0615, TRY_LEAVE, TryCatch #7 {all -> 0x0615, blocks: (B:16:0x058e, B:34:0x05b7, B:36:0x05bd, B:49:0x05e5, B:50:0x05ea), top: B:15:0x058e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0627 A[LOOP:4: B:64:0x0623->B:66:0x0627, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x063c  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.C6619t.b<ET>> void m19208K(com.google.protobuf.AbstractC6603n1<UT, UB> r19, com.google.protobuf.AbstractC6607p<ET> r20, T r21, com.google.protobuf.InterfaceC6579f1 r22, com.google.protobuf.C6604o r23) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19208K(com.google.protobuf.n1, com.google.protobuf.p, java.lang.Object, com.google.protobuf.f1, com.google.protobuf.o):void");
    }

    /* renamed from: L */
    private final <K, V> void m19209L(Object obj, int i10, Object obj2, C6604o c6604o, InterfaceC6579f1 interfaceC6579f1) {
        long m19219V = m19219V(m19244o0(i10));
        Object m19041C = C6615r1.m19041C(obj, m19219V);
        if (m19041C == null) {
            m19041C = this.f14648q.mo18942d(obj2);
            C6615r1.m19056R(obj, m19219V, m19041C);
        } else if (this.f14648q.mo18946h(m19041C)) {
            Object mo18942d = this.f14648q.mo18942d(obj2);
            this.f14648q.mo18939a(mo18942d, m19041C);
            C6615r1.m19056R(obj, m19219V, mo18942d);
            m19041C = mo18942d;
        }
        interfaceC6579f1.mo18477M(this.f14648q.mo18941c(m19041C), this.f14648q.mo18940b(obj2), c6604o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    private void m19210M(T t10, T t11, int i10) {
        if (m19261z(t11, i10)) {
            long m19219V = m19219V(m19244o0(i10));
            Unsafe unsafe = f14631s;
            Object object = unsafe.getObject(t11, m19219V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m19218U(i10) + " is present but null: " + t11);
            }
            InterfaceC6582g1 m19253t = m19253t(i10);
            if (!m19261z(t10, i10)) {
                if (m19202E(object)) {
                    Object mo18544e = m19253t.mo18544e();
                    m19253t.mo18540a(mo18544e, object);
                    unsafe.putObject(t10, m19219V, mo18544e);
                } else {
                    unsafe.putObject(t10, m19219V, object);
                }
                m19232i0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, m19219V);
            if (!m19202E(object2)) {
                Object mo18544e2 = m19253t.mo18544e();
                m19253t.mo18540a(mo18544e2, object2);
                unsafe.putObject(t10, m19219V, mo18544e2);
                object2 = mo18544e2;
            }
            m19253t.mo18540a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m19211N(T t10, T t11, int i10) {
        int m19218U = m19218U(i10);
        if (m19204G(t11, m19218U, i10)) {
            long m19219V = m19219V(m19244o0(i10));
            Unsafe unsafe = f14631s;
            Object object = unsafe.getObject(t11, m19219V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m19218U(i10) + " is present but null: " + t11);
            }
            InterfaceC6582g1 m19253t = m19253t(i10);
            if (!m19204G(t10, m19218U, i10)) {
                if (m19202E(object)) {
                    Object mo18544e = m19253t.mo18544e();
                    m19253t.mo18540a(mo18544e, object);
                    unsafe.putObject(t10, m19219V, mo18544e);
                } else {
                    unsafe.putObject(t10, m19219V, object);
                }
                m19234j0(t10, m19218U, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, m19219V);
            if (!m19202E(object2)) {
                Object mo18544e2 = m19253t.mo18544e();
                m19253t.mo18540a(mo18544e2, object2);
                unsafe.putObject(t10, m19219V, mo18544e2);
                object2 = mo18544e2;
            }
            m19253t.mo18540a(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* renamed from: O */
    private void m19212O(T t10, T t11, int i10) {
        int m19244o0 = m19244o0(i10);
        long m19219V = m19219V(m19244o0);
        int m19218U = m19218U(i10);
        switch (m19242n0(m19244o0)) {
            case 0:
                if (m19261z(t11, i10)) {
                    C6615r1.m19052N(t10, m19219V, C6615r1.m19082x(t11, m19219V));
                    m19232i0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (m19261z(t11, i10)) {
                    C6615r1.m19053O(t10, m19219V, C6615r1.m19083y(t11, m19219V));
                    m19232i0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19055Q(t10, m19219V, C6615r1.m19039A(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 3:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19055Q(t10, m19219V, C6615r1.m19039A(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 4:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 5:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19055Q(t10, m19219V, C6615r1.m19039A(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 6:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 7:
                if (m19261z(t11, i10)) {
                    C6615r1.m19046H(t10, m19219V, C6615r1.m19076r(t11, m19219V));
                    m19232i0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19056R(t10, m19219V, C6615r1.m19041C(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 9:
            case 17:
                m19210M(t10, t11, i10);
                return;
            case 10:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19056R(t10, m19219V, C6615r1.m19041C(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 11:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 12:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 13:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 14:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19055Q(t10, m19219V, C6615r1.m19039A(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 15:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19054P(t10, m19219V, C6615r1.m19084z(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 16:
                if (!m19261z(t11, i10)) {
                    return;
                }
                C6615r1.m19055Q(t10, m19219V, C6615r1.m19039A(t11, m19219V));
                m19232i0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f14645n.mo18619d(t10, t11, m19219V);
                return;
            case 50:
                C6588i1.m18653F(this.f14648q, t10, t11, m19219V);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!m19204G(t11, m19218U, i10)) {
                    return;
                }
                C6615r1.m19056R(t10, m19219V, C6615r1.m19041C(t11, m19219V));
                m19234j0(t10, m19218U, i10);
                return;
            case 60:
            case 68:
                m19211N(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!m19204G(t11, m19218U, i10)) {
                    return;
                }
                C6615r1.m19056R(t10, m19219V, C6615r1.m19041C(t11, m19219V));
                m19234j0(t10, m19218U, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    private Object m19213P(T t10, int i10) {
        InterfaceC6582g1 m19253t = m19253t(i10);
        long m19219V = m19219V(m19244o0(i10));
        if (!m19261z(t10, i10)) {
            return m19253t.mo18544e();
        }
        Object object = f14631s.getObject(t10, m19219V);
        if (m19202E(object)) {
            return object;
        }
        Object mo18544e = m19253t.mo18544e();
        if (object != null) {
            m19253t.mo18540a(mo18544e, object);
        }
        return mo18544e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    private Object m19214Q(T t10, int i10, int i11) {
        InterfaceC6582g1 m19253t = m19253t(i11);
        if (!m19204G(t10, i10, i11)) {
            return m19253t.mo18544e();
        }
        Object object = f14631s.getObject(t10, m19219V(m19244o0(i11)));
        if (m19202E(object)) {
            return object;
        }
        Object mo18544e = m19253t.mo18544e();
        if (object != null) {
            m19253t.mo18540a(mo18544e, object);
        }
        return mo18544e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static <T> C6623u0<T> m19215R(Class<T> cls, InterfaceC6608p0 interfaceC6608p0, InterfaceC6628w0 interfaceC6628w0, AbstractC6584h0 abstractC6584h0, AbstractC6603n1<?, ?> abstractC6603n1, AbstractC6607p<?> abstractC6607p, InterfaceC6599m0 interfaceC6599m0) {
        return interfaceC6608p0 instanceof C6576e1 ? m19217T((C6576e1) interfaceC6608p0, interfaceC6628w0, abstractC6584h0, abstractC6603n1, abstractC6607p, interfaceC6599m0) : m19216S((C6594k1) interfaceC6608p0, interfaceC6628w0, abstractC6584h0, abstractC6603n1, abstractC6607p, interfaceC6599m0);
    }

    /* renamed from: S */
    static <T> C6623u0<T> m19216S(C6594k1 c6594k1, InterfaceC6628w0 interfaceC6628w0, AbstractC6584h0 abstractC6584h0, AbstractC6603n1<?, ?> abstractC6603n1, AbstractC6607p<?> abstractC6607p, InterfaceC6599m0 interfaceC6599m0) {
        boolean z10 = c6594k1.mo18451c() == EnumC6567b1.PROTO3;
        C6616s[] m18911e = c6594k1.m18911e();
        if (m18911e.length != 0) {
            C6616s c6616s = m18911e[0];
            throw null;
        }
        int length = m18911e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (m18911e.length > 0) {
            C6616s c6616s2 = m18911e[0];
            throw null;
        }
        int[] m18910d = c6594k1.m18910d();
        if (m18910d == null) {
            m18910d = f14630r;
        }
        if (m18911e.length > 0) {
            C6616s c6616s3 = m18911e[0];
            throw null;
        }
        int[] iArr2 = f14630r;
        int[] iArr3 = f14630r;
        int[] iArr4 = new int[m18910d.length + iArr2.length + iArr3.length];
        System.arraycopy(m18910d, 0, iArr4, 0, m18910d.length);
        System.arraycopy(iArr2, 0, iArr4, m18910d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, m18910d.length + iArr2.length, iArr3.length);
        return new C6623u0<>(iArr, objArr, 0, 0, c6594k1.mo18450b(), z10, true, iArr4, m18910d.length, m18910d.length + iArr2.length, interfaceC6628w0, abstractC6584h0, abstractC6603n1, abstractC6607p, interfaceC6599m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.protobuf.C6623u0<T> m19217T(com.google.protobuf.C6576e1 r34, com.google.protobuf.InterfaceC6628w0 r35, com.google.protobuf.AbstractC6584h0 r36, com.google.protobuf.AbstractC6603n1<?, ?> r37, com.google.protobuf.AbstractC6607p<?> r38, com.google.protobuf.InterfaceC6599m0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19217T(com.google.protobuf.e1, com.google.protobuf.w0, com.google.protobuf.h0, com.google.protobuf.n1, com.google.protobuf.p, com.google.protobuf.m0):com.google.protobuf.u0");
    }

    /* renamed from: U */
    private int m19218U(int i10) {
        return this.f14632a[i10];
    }

    /* renamed from: V */
    private static long m19219V(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: W */
    private static <T> boolean m19220W(T t10, long j10) {
        return ((Boolean) C6615r1.m19041C(t10, j10)).booleanValue();
    }

    /* renamed from: X */
    private static <T> double m19221X(T t10, long j10) {
        return ((Double) C6615r1.m19041C(t10, j10)).doubleValue();
    }

    /* renamed from: Y */
    private static <T> float m19222Y(T t10, long j10) {
        return ((Float) C6615r1.m19041C(t10, j10)).floatValue();
    }

    /* renamed from: Z */
    private static <T> int m19223Z(T t10, long j10) {
        return ((Integer) C6615r1.m19041C(t10, j10)).intValue();
    }

    /* renamed from: a0 */
    private static <T> long m19224a0(T t10, long j10) {
        return ((Long) C6615r1.m19041C(t10, j10)).longValue();
    }

    /* renamed from: b0 */
    private int m19225b0(int i10) {
        if (i10 < this.f14634c || i10 > this.f14635d) {
            return -1;
        }
        return m19236k0(i10, 0);
    }

    /* renamed from: c0 */
    private int m19226c0(int i10) {
        return this.f14632a[i10 + 2];
    }

    /* renamed from: d0 */
    private <E> void m19227d0(Object obj, long j10, InterfaceC6579f1 interfaceC6579f1, InterfaceC6582g1<E> interfaceC6582g1, C6604o c6604o) {
        interfaceC6579f1.mo18474J(this.f14645n.mo18620e(obj, j10), interfaceC6582g1, c6604o);
    }

    /* renamed from: e0 */
    private <E> void m19228e0(Object obj, int i10, InterfaceC6579f1 interfaceC6579f1, InterfaceC6582g1<E> interfaceC6582g1, C6604o c6604o) {
        interfaceC6579f1.mo18475K(this.f14645n.mo18620e(obj, m19219V(i10)), interfaceC6582g1, c6604o);
    }

    /* renamed from: f0 */
    private void m19229f0(Object obj, int i10, InterfaceC6579f1 interfaceC6579f1) {
        long m19219V;
        Object mo18495o;
        if (m19260y(i10)) {
            m19219V = m19219V(i10);
            mo18495o = interfaceC6579f1.mo18473I();
        } else if (this.f14638g) {
            m19219V = m19219V(i10);
            mo18495o = interfaceC6579f1.mo18506z();
        } else {
            m19219V = m19219V(i10);
            mo18495o = interfaceC6579f1.mo18495o();
        }
        C6615r1.m19056R(obj, m19219V, mo18495o);
    }

    /* renamed from: g0 */
    private void m19230g0(Object obj, int i10, InterfaceC6579f1 interfaceC6579f1) {
        if (m19260y(i10)) {
            interfaceC6579f1.mo18494n(this.f14645n.mo18620e(obj, m19219V(i10)));
        } else {
            interfaceC6579f1.mo18466B(this.f14645n.mo18620e(obj, m19219V(i10)));
        }
    }

    /* renamed from: h0 */
    private static Field m19231h0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: i0 */
    private void m19232i0(T t10, int i10) {
        int m19226c0 = m19226c0(i10);
        long j10 = 1048575 & m19226c0;
        if (j10 == 1048575) {
            return;
        }
        C6615r1.m19054P(t10, j10, (1 << (m19226c0 >>> 20)) | C6615r1.m19084z(t10, j10));
    }

    /* renamed from: j */
    private boolean m19233j(T t10, T t11, int i10) {
        return m19261z(t10, i10) == m19261z(t11, i10);
    }

    /* renamed from: j0 */
    private void m19234j0(T t10, int i10, int i11) {
        C6615r1.m19054P(t10, m19226c0(i11) & 1048575, i10);
    }

    /* renamed from: k */
    private static <T> boolean m19235k(T t10, long j10) {
        return C6615r1.m19076r(t10, j10);
    }

    /* renamed from: k0 */
    private int m19236k0(int i10, int i11) {
        int length = (this.f14632a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int m19218U = m19218U(i13);
            if (i10 == m19218U) {
                return i13;
            }
            if (i10 < m19218U) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: l */
    private static void m19237l(Object obj) {
        if (m19202E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: l0 */
    private void m19238l0(T t10, int i10, Object obj) {
        f14631s.putObject(t10, m19219V(m19244o0(i10)), obj);
        m19232i0(t10, i10);
    }

    /* renamed from: m */
    private static <T> double m19239m(T t10, long j10) {
        return C6615r1.m19082x(t10, j10);
    }

    /* renamed from: m0 */
    private void m19240m0(T t10, int i10, int i11, Object obj) {
        f14631s.putObject(t10, m19219V(m19244o0(i11)), obj);
        m19234j0(t10, i10, i11);
    }

    /* renamed from: n */
    private boolean m19241n(T t10, T t11, int i10) {
        int m19244o0 = m19244o0(i10);
        long m19219V = m19219V(m19244o0);
        switch (m19242n0(m19244o0)) {
            case 0:
                return m19233j(t10, t11, i10) && Double.doubleToLongBits(C6615r1.m19082x(t10, m19219V)) == Double.doubleToLongBits(C6615r1.m19082x(t11, m19219V));
            case 1:
                return m19233j(t10, t11, i10) && Float.floatToIntBits(C6615r1.m19083y(t10, m19219V)) == Float.floatToIntBits(C6615r1.m19083y(t11, m19219V));
            case 2:
                return m19233j(t10, t11, i10) && C6615r1.m19039A(t10, m19219V) == C6615r1.m19039A(t11, m19219V);
            case 3:
                return m19233j(t10, t11, i10) && C6615r1.m19039A(t10, m19219V) == C6615r1.m19039A(t11, m19219V);
            case 4:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 5:
                return m19233j(t10, t11, i10) && C6615r1.m19039A(t10, m19219V) == C6615r1.m19039A(t11, m19219V);
            case 6:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 7:
                return m19233j(t10, t11, i10) && C6615r1.m19076r(t10, m19219V) == C6615r1.m19076r(t11, m19219V);
            case 8:
                return m19233j(t10, t11, i10) && C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            case 9:
                return m19233j(t10, t11, i10) && C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            case 10:
                return m19233j(t10, t11, i10) && C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            case 11:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 12:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 13:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 14:
                return m19233j(t10, t11, i10) && C6615r1.m19039A(t10, m19219V) == C6615r1.m19039A(t11, m19219V);
            case 15:
                return m19233j(t10, t11, i10) && C6615r1.m19084z(t10, m19219V) == C6615r1.m19084z(t11, m19219V);
            case 16:
                return m19233j(t10, t11, i10) && C6615r1.m19039A(t10, m19219V) == C6615r1.m19039A(t11, m19219V);
            case 17:
                return m19233j(t10, t11, i10) && C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return m19203F(t10, t11, i10) && C6588i1.m18658K(C6615r1.m19041C(t10, m19219V), C6615r1.m19041C(t11, m19219V));
            default:
                return true;
        }
    }

    /* renamed from: n0 */
    private static int m19242n0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* renamed from: o */
    private <UT, UB> UB m19243o(Object obj, int i10, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1, Object obj2) {
        C6633z.e m19249r;
        int m19218U = m19218U(i10);
        Object m19041C = C6615r1.m19041C(obj, m19219V(m19244o0(i10)));
        return (m19041C == null || (m19249r = m19249r(i10)) == null) ? ub2 : (UB) m19245p(i10, m19218U, this.f14648q.mo18941c(m19041C), m19249r, ub2, abstractC6603n1, obj2);
    }

    /* renamed from: o0 */
    private int m19244o0(int i10) {
        return this.f14632a[i10 + 1];
    }

    /* renamed from: p */
    private <K, V, UT, UB> UB m19245p(int i10, int i11, Map<K, V> map, C6633z.e eVar, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1, Object obj) {
        C6593k0.a<?, ?> mo18940b = this.f14648q.mo18940b(m19251s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.mo19359a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = abstractC6603n1.mo18958f(obj);
                }
                AbstractC6580g.h m18516r = AbstractC6580g.m18516r(C6593k0.m18905b(mo18940b, next.getKey(), next.getValue()));
                try {
                    C6593k0.m18907e(m18516r.m18538b(), mo18940b, next.getKey(), next.getValue());
                    abstractC6603n1.mo18956d(ub2, i11, m18516r.m18537a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m19246p0(T r18, com.google.protobuf.InterfaceC6624u1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19246p0(java.lang.Object, com.google.protobuf.u1):void");
    }

    /* renamed from: q */
    private static <T> float m19247q(T t10, long j10) {
        return C6615r1.m19083y(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m19248q0(T r13, com.google.protobuf.InterfaceC6624u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19248q0(java.lang.Object, com.google.protobuf.u1):void");
    }

    /* renamed from: r */
    private C6633z.e m19249r(int i10) {
        return (C6633z.e) this.f14633b[((i10 / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m19250r0(T r11, com.google.protobuf.InterfaceC6624u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19250r0(java.lang.Object, com.google.protobuf.u1):void");
    }

    /* renamed from: s */
    private Object m19251s(int i10) {
        return this.f14633b[(i10 / 3) * 2];
    }

    /* renamed from: s0 */
    private <K, V> void m19252s0(InterfaceC6624u1 interfaceC6624u1, int i10, Object obj, int i11) {
        if (obj != null) {
            interfaceC6624u1.mo18878O(i10, this.f14648q.mo18940b(m19251s(i11)), this.f14648q.mo18943e(obj));
        }
    }

    /* renamed from: t */
    private InterfaceC6582g1 m19253t(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC6582g1 interfaceC6582g1 = (InterfaceC6582g1) this.f14633b[i11];
        if (interfaceC6582g1 != null) {
            return interfaceC6582g1;
        }
        InterfaceC6582g1<T> m18418c = C6570c1.m18416a().m18418c((Class) this.f14633b[i11 + 1]);
        this.f14633b[i11] = m18418c;
        return m18418c;
    }

    /* renamed from: t0 */
    private void m19254t0(int i10, Object obj, InterfaceC6624u1 interfaceC6624u1) {
        if (obj instanceof String) {
            interfaceC6624u1.mo18883e(i10, (String) obj);
        } else {
            interfaceC6624u1.mo18875L(i10, (AbstractC6580g) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ef, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0200, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0211, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0244, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x031f, code lost:
    
        r3 = com.google.protobuf.AbstractC6589j.m18751s(r10, (com.google.protobuf.InterfaceC6614r0) r2.getObject(r17, r13), m19253t(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031d, code lost:
    
        if ((r8 & r15) != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x034a, code lost:
    
        if ((r8 & r15) != 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0353, code lost:
    
        if ((r8 & r15) != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0378, code lost:
    
        if ((r8 & r15) != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0387, code lost:
    
        if ((r8 & r15) != 0) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b4, code lost:
    
        if ((r8 & r15) != 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x034c, code lost:
    
        r3 = com.google.protobuf.AbstractC6589j.m18717M(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0355, code lost:
    
        r4 = com.google.protobuf.AbstractC6589j.m18715K(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x037a, code lost:
    
        r3 = com.google.protobuf.AbstractC6589j.m18738g(r10, (com.google.protobuf.AbstractC6580g) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0389, code lost:
    
        r3 = com.google.protobuf.C6588i1.m18693o(r10, r2.getObject(r17, r13), m19253t(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (m19204G(r17, r10, r5) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03b6, code lost:
    
        r3 = com.google.protobuf.AbstractC6589j.m18733d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025b, code lost:
    
        r4 = (com.google.protobuf.AbstractC6589j.m18725U(r10) + com.google.protobuf.AbstractC6589j.m18727W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r16.f14640i != false) goto L150;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005d. Please report as an issue. */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m19255u(T r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19255u(java.lang.Object):int");
    }

    /* renamed from: u0 */
    private <UT, UB> void m19256u0(AbstractC6603n1<UT, UB> abstractC6603n1, T t10, InterfaceC6624u1 interfaceC6624u1) {
        abstractC6603n1.mo18972t(abstractC6603n1.mo18959g(t10), interfaceC6624u1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.protobuf.AbstractC6589j.m18725U(r8) + com.google.protobuf.AbstractC6589j.m18727W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f14640i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.protobuf.AbstractC6580g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.protobuf.AbstractC6580g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.protobuf.AbstractC6589j.m18723S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m19257v(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.m19257v(java.lang.Object):int");
    }

    /* renamed from: w */
    private <UT, UB> int m19258w(AbstractC6603n1<UT, UB> abstractC6603n1, T t10) {
        return abstractC6603n1.mo18960h(abstractC6603n1.mo18959g(t10));
    }

    /* renamed from: x */
    private static <T> int m19259x(T t10, long j10) {
        return C6615r1.m19084z(t10, j10);
    }

    /* renamed from: y */
    private static boolean m19260y(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* renamed from: z */
    private boolean m19261z(T t10, int i10) {
        int m19226c0 = m19226c0(i10);
        long j10 = 1048575 & m19226c0;
        if (j10 != 1048575) {
            return (C6615r1.m19084z(t10, j10) & (1 << (m19226c0 >>> 20))) != 0;
        }
        int m19244o0 = m19244o0(i10);
        long m19219V = m19219V(m19244o0);
        switch (m19242n0(m19244o0)) {
            case 0:
                return Double.doubleToRawLongBits(C6615r1.m19082x(t10, m19219V)) != 0;
            case 1:
                return Float.floatToRawIntBits(C6615r1.m19083y(t10, m19219V)) != 0;
            case 2:
                return C6615r1.m19039A(t10, m19219V) != 0;
            case 3:
                return C6615r1.m19039A(t10, m19219V) != 0;
            case 4:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 5:
                return C6615r1.m19039A(t10, m19219V) != 0;
            case 6:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 7:
                return C6615r1.m19076r(t10, m19219V);
            case 8:
                Object m19041C = C6615r1.m19041C(t10, m19219V);
                if (m19041C instanceof String) {
                    return !((String) m19041C).isEmpty();
                }
                if (m19041C instanceof AbstractC6580g) {
                    return !AbstractC6580g.f14459b.equals(m19041C);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6615r1.m19041C(t10, m19219V) != null;
            case 10:
                return !AbstractC6580g.f14459b.equals(C6615r1.m19041C(t10, m19219V));
            case 11:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 12:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 13:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 14:
                return C6615r1.m19039A(t10, m19219V) != 0;
            case 15:
                return C6615r1.m19084z(t10, m19219V) != 0;
            case 16:
                return C6615r1.m19039A(t10, m19219V) != 0;
            case 17:
                return C6615r1.m19041C(t10, m19219V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: a */
    public void mo18540a(T t10, T t11) {
        m19237l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f14632a.length; i10 += 3) {
            m19212O(t10, t11, i10);
        }
        C6588i1.m18654G(this.f14646o, t10, t11);
        if (this.f14637f) {
            C6588i1.m18652E(this.f14647p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: b */
    public void mo18541b(T t10) {
        if (m19202E(t10)) {
            if (t10 instanceof AbstractC6629x) {
                AbstractC6629x abstractC6629x = (AbstractC6629x) t10;
                abstractC6629x.m19310x();
                abstractC6629x.m19309w();
                abstractC6629x.m19303P();
            }
            int length = this.f14632a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int m19244o0 = m19244o0(i10);
                long m19219V = m19219V(m19244o0);
                int m19242n0 = m19242n0(m19244o0);
                if (m19242n0 != 9) {
                    switch (m19242n0) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f14645n.mo18618c(t10, m19219V);
                            break;
                        case 50:
                            Unsafe unsafe = f14631s;
                            Object object = unsafe.getObject(t10, m19219V);
                            if (object != null) {
                                unsafe.putObject(t10, m19219V, this.f14648q.mo18944f(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (m19261z(t10, i10)) {
                    m19253t(i10).mo18541b(f14631s.getObject(t10, m19219V));
                }
            }
            this.f14646o.mo18962j(t10);
            if (this.f14637f) {
                this.f14647p.mo19001f(t10);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: c */
    public final boolean mo18542c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f14642k) {
            int i15 = this.f14641j[i14];
            int m19218U = m19218U(i15);
            int m19244o0 = m19244o0(i15);
            int i16 = this.f14632a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f14631s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (m19205H(m19244o0) && !m19198A(t10, i15, i10, i11, i18)) {
                return false;
            }
            int m19242n0 = m19242n0(m19244o0);
            if (m19242n0 != 9 && m19242n0 != 17) {
                if (m19242n0 != 27) {
                    if (m19242n0 == 60 || m19242n0 == 68) {
                        if (m19204G(t10, m19218U, i15) && !m19199B(t10, m19244o0, m19253t(i15))) {
                            return false;
                        }
                    } else if (m19242n0 != 49) {
                        if (m19242n0 == 50 && !m19201D(t10, m19244o0, i15)) {
                            return false;
                        }
                    }
                }
                if (!m19200C(t10, m19244o0, i15)) {
                    return false;
                }
            } else if (m19198A(t10, i15, i10, i11, i18) && !m19199B(t10, m19244o0, m19253t(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f14637f || this.f14647p.mo18998c(t10).m19171p();
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: d */
    public int mo18543d(T t10) {
        return this.f14639h ? m19257v(t10) : m19255u(t10);
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: e */
    public T mo18544e() {
        return (T) this.f14644m.mo19281a(this.f14636e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo18545f(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6623u0.mo18545f(java.lang.Object):int");
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: g */
    public boolean mo18546g(T t10, T t11) {
        int length = this.f14632a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m19241n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f14646o.mo18959g(t10).equals(this.f14646o.mo18959g(t11))) {
            return false;
        }
        if (this.f14637f) {
            return this.f14647p.mo18998c(t10).equals(this.f14647p.mo18998c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: h */
    public void mo18547h(T t10, InterfaceC6624u1 interfaceC6624u1) {
        if (interfaceC6624u1.mo18898t() == InterfaceC6624u1.a.DESCENDING) {
            m19250r0(t10, interfaceC6624u1);
        } else if (this.f14639h) {
            m19248q0(t10, interfaceC6624u1);
        } else {
            m19246p0(t10, interfaceC6624u1);
        }
    }

    @Override // com.google.protobuf.InterfaceC6582g1
    /* renamed from: i */
    public void mo18548i(T t10, InterfaceC6579f1 interfaceC6579f1, C6604o c6604o) {
        c6604o.getClass();
        m19237l(t10);
        m19208K(this.f14646o, this.f14647p, t10, interfaceC6579f1, c6604o);
    }
}
