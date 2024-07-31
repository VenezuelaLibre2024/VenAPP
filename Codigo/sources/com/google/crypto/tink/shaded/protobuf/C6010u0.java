package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C5961e;
import com.google.crypto.tink.shaded.protobuf.C5980k0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.u0 */
/* loaded from: classes2.dex */
public final class C6010u0<T> implements InterfaceC5969g1<T> {

    /* renamed from: r */
    private static final int[] f12746r = new int[0];

    /* renamed from: s */
    private static final Unsafe f12747s = C6002r1.m15977D();

    /* renamed from: a */
    private final int[] f12748a;

    /* renamed from: b */
    private final Object[] f12749b;

    /* renamed from: c */
    private final int f12750c;

    /* renamed from: d */
    private final int f12751d;

    /* renamed from: e */
    private final InterfaceC6001r0 f12752e;

    /* renamed from: f */
    private final boolean f12753f;

    /* renamed from: g */
    private final boolean f12754g;

    /* renamed from: h */
    private final boolean f12755h;

    /* renamed from: i */
    private final boolean f12756i;

    /* renamed from: j */
    private final int[] f12757j;

    /* renamed from: k */
    private final int f12758k;

    /* renamed from: l */
    private final int f12759l;

    /* renamed from: m */
    private final InterfaceC6015w0 f12760m;

    /* renamed from: n */
    private final AbstractC5971h0 f12761n;

    /* renamed from: o */
    private final AbstractC5990n1<?, ?> f12762o;

    /* renamed from: p */
    private final AbstractC5997q<?> f12763p;

    /* renamed from: q */
    private final InterfaceC5986m0 f12764q;

    private C6010u0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC6001r0 interfaceC6001r0, boolean z10, boolean z11, int[] iArr2, int i12, int i13, InterfaceC6015w0 interfaceC6015w0, AbstractC5971h0 abstractC5971h0, AbstractC5990n1<?, ?> abstractC5990n1, AbstractC5997q<?> abstractC5997q, InterfaceC5986m0 interfaceC5986m0) {
        this.f12748a = iArr;
        this.f12749b = objArr;
        this.f12750c = i10;
        this.f12751d = i11;
        this.f12754g = interfaceC6001r0 instanceof AbstractC6018y;
        this.f12755h = z10;
        this.f12753f = abstractC5997q != null && abstractC5997q.mo15954e(interfaceC6001r0);
        this.f12756i = z11;
        this.f12757j = iArr2;
        this.f12758k = i12;
        this.f12759l = i13;
        this.f12760m = interfaceC6015w0;
        this.f12761n = abstractC5971h0;
        this.f12762o = abstractC5990n1;
        this.f12763p = abstractC5997q;
        this.f12752e = interfaceC6001r0;
        this.f12764q = interfaceC5986m0;
    }

    /* renamed from: A */
    private static <T> int m16127A(T t10, long j10) {
        return C6002r1.m16019z(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16128A0(T r11, com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16128A0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    /* renamed from: B */
    private static boolean m16129B(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* renamed from: B0 */
    private <K, V> void m16130B0(InterfaceC6011u1 interfaceC6011u1, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f12764q.mo15878b(m16186u(i11));
            interfaceC6011u1.mo15818J(i10, null, this.f12764q.mo15881e(obj));
        }
    }

    /* renamed from: C */
    private boolean m16131C(T t10, int i10) {
        int m16169l0 = m16169l0(i10);
        long j10 = 1048575 & m16169l0;
        if (j10 != 1048575) {
            return (C6002r1.m16019z(t10, j10) & (1 << (m16169l0 >>> 20))) != 0;
        }
        int m16193x0 = m16193x0(i10);
        long m16155Y = m16155Y(m16193x0);
        switch (m16191w0(m16193x0)) {
            case 0:
                return Double.doubleToRawLongBits(C6002r1.m16017x(t10, m16155Y)) != 0;
            case 1:
                return Float.floatToRawIntBits(C6002r1.m16018y(t10, m16155Y)) != 0;
            case 2:
                return C6002r1.m15974A(t10, m16155Y) != 0;
            case 3:
                return C6002r1.m15974A(t10, m16155Y) != 0;
            case 4:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 5:
                return C6002r1.m15974A(t10, m16155Y) != 0;
            case 6:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 7:
                return C6002r1.m16011r(t10, m16155Y);
            case 8:
                Object m15976C = C6002r1.m15976C(t10, m16155Y);
                if (m15976C instanceof String) {
                    return !((String) m15976C).isEmpty();
                }
                if (m15976C instanceof AbstractC5970h) {
                    return !AbstractC5970h.f12591b.equals(m15976C);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6002r1.m15976C(t10, m16155Y) != null;
            case 10:
                return !AbstractC5970h.f12591b.equals(C6002r1.m15976C(t10, m16155Y));
            case 11:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 12:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 13:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 14:
                return C6002r1.m15974A(t10, m16155Y) != 0;
            case 15:
                return C6002r1.m16019z(t10, m16155Y) != 0;
            case 16:
                return C6002r1.m15974A(t10, m16155Y) != 0;
            case 17:
                return C6002r1.m15976C(t10, m16155Y) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: C0 */
    private void m16132C0(int i10, Object obj, InterfaceC6011u1 interfaceC6011u1) {
        if (obj instanceof String) {
            interfaceC6011u1.mo15828e(i10, (String) obj);
        } else {
            interfaceC6011u1.mo15821M(i10, (AbstractC5970h) obj);
        }
    }

    /* renamed from: D */
    private boolean m16133D(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m16131C(t10, i10) : (i12 & i13) != 0;
    }

    /* renamed from: D0 */
    private <UT, UB> void m16134D0(AbstractC5990n1<UT, UB> abstractC5990n1, T t10, InterfaceC6011u1 interfaceC6011u1) {
        abstractC5990n1.mo15907t(abstractC5990n1.mo15894g(t10), interfaceC6011u1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private static boolean m16135E(Object obj, int i10, InterfaceC5969g1 interfaceC5969g1) {
        return interfaceC5969g1.mo15472c(C6002r1.m15976C(obj, m16155Y(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    private <N> boolean m16136F(Object obj, int i10, int i11) {
        List list = (List) C6002r1.m15976C(obj, m16155Y(i10));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC5969g1 m16188v = m16188v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!m16188v.mo15472c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private boolean m16137G(T t10, int i10, int i11) {
        if (this.f12764q.mo15881e(C6002r1.m15976C(t10, m16155Y(i10))).isEmpty()) {
            return true;
        }
        this.f12764q.mo15878b(m16186u(i11));
        throw null;
    }

    /* renamed from: H */
    private static boolean m16138H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC6018y) {
            return ((AbstractC6018y) obj).m16237F();
        }
        return true;
    }

    /* renamed from: I */
    private boolean m16139I(T t10, T t11, int i10) {
        long m16169l0 = m16169l0(i10) & 1048575;
        return C6002r1.m16019z(t10, m16169l0) == C6002r1.m16019z(t11, m16169l0);
    }

    /* renamed from: J */
    private boolean m16140J(T t10, int i10, int i11) {
        return C6002r1.m16019z(t10, (long) (m16169l0(i11) & 1048575)) == i10;
    }

    /* renamed from: K */
    private static boolean m16141K(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* renamed from: L */
    private static List<?> m16142L(Object obj, long j10) {
        return (List) C6002r1.m15976C(obj, j10);
    }

    /* renamed from: M */
    private static <T> long m16143M(T t10, long j10) {
        return C6002r1.m15974A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x008d, code lost:
    
        r0 = r18.f12758k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0092, code lost:
    
        if (r0 >= r18.f12759l) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0094, code lost:
    
        r4 = m16178q(r21, r18.f12757j[r0], r4, r19, r21);
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
    
        r7.mo15902o(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05bd A[Catch: all -> 0x0615, TRY_LEAVE, TryCatch #8 {all -> 0x0615, blocks: (B:16:0x058e, B:34:0x05b7, B:36:0x05bd, B:49:0x05e5, B:50:0x05ea), top: B:15:0x058e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0627 A[LOOP:4: B:64:0x0623->B:66:0x0627, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x063c  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C6009u.b<ET>> void m16144N(com.google.crypto.tink.shaded.protobuf.AbstractC5990n1<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.AbstractC5997q<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.InterfaceC5966f1 r22, com.google.crypto.tink.shaded.protobuf.C5994p r23) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16144N(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    /* renamed from: O */
    private final <K, V> void m16145O(Object obj, int i10, Object obj2, C5994p c5994p, InterfaceC5966f1 interfaceC5966f1) {
        long m16155Y = m16155Y(m16193x0(i10));
        Object m15976C = C6002r1.m15976C(obj, m16155Y);
        if (m15976C == null) {
            m15976C = this.f12764q.mo15880d(obj2);
            C6002r1.m15991R(obj, m16155Y, m15976C);
        } else if (this.f12764q.mo15884h(m15976C)) {
            Object mo15880d = this.f12764q.mo15880d(obj2);
            this.f12764q.mo15877a(mo15880d, m15976C);
            C6002r1.m15991R(obj, m16155Y, mo15880d);
            m15976C = mo15880d;
        }
        Map<?, ?> mo15879c = this.f12764q.mo15879c(m15976C);
        this.f12764q.mo15878b(obj2);
        interfaceC5966f1.mo15438L(mo15879c, null, c5994p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    private void m16146P(T t10, T t11, int i10) {
        if (m16131C(t11, i10)) {
            long m16155Y = m16155Y(m16193x0(i10));
            Unsafe unsafe = f12747s;
            Object object = unsafe.getObject(t11, m16155Y);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m16154X(i10) + " is present but null: " + t11);
            }
            InterfaceC5969g1 m16188v = m16188v(i10);
            if (!m16131C(t10, i10)) {
                if (m16138H(object)) {
                    Object mo15474e = m16188v.mo15474e();
                    m16188v.mo15470a(mo15474e, object);
                    unsafe.putObject(t10, m16155Y, mo15474e);
                } else {
                    unsafe.putObject(t10, m16155Y, object);
                }
                m16181r0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, m16155Y);
            if (!m16138H(object2)) {
                Object mo15474e2 = m16188v.mo15474e();
                m16188v.mo15470a(mo15474e2, object2);
                unsafe.putObject(t10, m16155Y, mo15474e2);
                object2 = mo15474e2;
            }
            m16188v.mo15470a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    private void m16147Q(T t10, T t11, int i10) {
        int m16154X = m16154X(i10);
        if (m16140J(t11, m16154X, i10)) {
            long m16155Y = m16155Y(m16193x0(i10));
            Unsafe unsafe = f12747s;
            Object object = unsafe.getObject(t11, m16155Y);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m16154X(i10) + " is present but null: " + t11);
            }
            InterfaceC5969g1 m16188v = m16188v(i10);
            if (!m16140J(t10, m16154X, i10)) {
                if (m16138H(object)) {
                    Object mo15474e = m16188v.mo15474e();
                    m16188v.mo15470a(mo15474e, object);
                    unsafe.putObject(t10, m16155Y, mo15474e);
                } else {
                    unsafe.putObject(t10, m16155Y, object);
                }
                m16183s0(t10, m16154X, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, m16155Y);
            if (!m16138H(object2)) {
                Object mo15474e2 = m16188v.mo15474e();
                m16188v.mo15470a(mo15474e2, object2);
                unsafe.putObject(t10, m16155Y, mo15474e2);
                object2 = mo15474e2;
            }
            m16188v.mo15470a(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* renamed from: R */
    private void m16148R(T t10, T t11, int i10) {
        int m16193x0 = m16193x0(i10);
        long m16155Y = m16155Y(m16193x0);
        int m16154X = m16154X(i10);
        switch (m16191w0(m16193x0)) {
            case 0:
                if (m16131C(t11, i10)) {
                    C6002r1.m15987N(t10, m16155Y, C6002r1.m16017x(t11, m16155Y));
                    m16181r0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (m16131C(t11, i10)) {
                    C6002r1.m15988O(t10, m16155Y, C6002r1.m16018y(t11, m16155Y));
                    m16181r0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15990Q(t10, m16155Y, C6002r1.m15974A(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 3:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15990Q(t10, m16155Y, C6002r1.m15974A(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 4:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 5:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15990Q(t10, m16155Y, C6002r1.m15974A(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 6:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 7:
                if (m16131C(t11, i10)) {
                    C6002r1.m15981H(t10, m16155Y, C6002r1.m16011r(t11, m16155Y));
                    m16181r0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15991R(t10, m16155Y, C6002r1.m15976C(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 9:
            case 17:
                m16146P(t10, t11, i10);
                return;
            case 10:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15991R(t10, m16155Y, C6002r1.m15976C(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 11:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 12:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 13:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 14:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15990Q(t10, m16155Y, C6002r1.m15974A(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 15:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15989P(t10, m16155Y, C6002r1.m16019z(t11, m16155Y));
                m16181r0(t10, i10);
                return;
            case 16:
                if (!m16131C(t11, i10)) {
                    return;
                }
                C6002r1.m15990Q(t10, m16155Y, C6002r1.m15974A(t11, m16155Y));
                m16181r0(t10, i10);
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
                this.f12761n.mo15516d(t10, t11, m16155Y);
                return;
            case 50:
                C5975i1.m15605F(this.f12764q, t10, t11, m16155Y);
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
                if (!m16140J(t11, m16154X, i10)) {
                    return;
                }
                C6002r1.m15991R(t10, m16155Y, C6002r1.m15976C(t11, m16155Y));
                m16183s0(t10, m16154X, i10);
                return;
            case 60:
            case 68:
                m16147Q(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!m16140J(t11, m16154X, i10)) {
                    return;
                }
                C6002r1.m15991R(t10, m16155Y, C6002r1.m15976C(t11, m16155Y));
                m16183s0(t10, m16154X, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S */
    private Object m16149S(T t10, int i10) {
        InterfaceC5969g1 m16188v = m16188v(i10);
        long m16155Y = m16155Y(m16193x0(i10));
        if (!m16131C(t10, i10)) {
            return m16188v.mo15474e();
        }
        Object object = f12747s.getObject(t10, m16155Y);
        if (m16138H(object)) {
            return object;
        }
        Object mo15474e = m16188v.mo15474e();
        if (object != null) {
            m16188v.mo15470a(mo15474e, object);
        }
        return mo15474e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    private Object m16150T(T t10, int i10, int i11) {
        InterfaceC5969g1 m16188v = m16188v(i11);
        if (!m16140J(t10, i10, i11)) {
            return m16188v.mo15474e();
        }
        Object object = f12747s.getObject(t10, m16155Y(m16193x0(i11)));
        if (m16138H(object)) {
            return object;
        }
        Object mo15474e = m16188v.mo15474e();
        if (object != null) {
            m16188v.mo15470a(mo15474e, object);
        }
        return mo15474e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static <T> C6010u0<T> m16151U(Class<T> cls, InterfaceC5995p0 interfaceC5995p0, InterfaceC6015w0 interfaceC6015w0, AbstractC5971h0 abstractC5971h0, AbstractC5990n1<?, ?> abstractC5990n1, AbstractC5997q<?> abstractC5997q, InterfaceC5986m0 interfaceC5986m0) {
        return interfaceC5995p0 instanceof C5963e1 ? m16153W((C5963e1) interfaceC5995p0, interfaceC6015w0, abstractC5971h0, abstractC5990n1, abstractC5997q, interfaceC5986m0) : m16152V((C5981k1) interfaceC5995p0, interfaceC6015w0, abstractC5971h0, abstractC5990n1, abstractC5997q, interfaceC5986m0);
    }

    /* renamed from: V */
    static <T> C6010u0<T> m16152V(C5981k1 c5981k1, InterfaceC6015w0 interfaceC6015w0, AbstractC5971h0 abstractC5971h0, AbstractC5990n1<?, ?> abstractC5990n1, AbstractC5997q<?> abstractC5997q, InterfaceC5986m0 interfaceC5986m0) {
        boolean z10 = c5981k1.mo15402c() == EnumC5954b1.PROTO3;
        C6006t[] m15805e = c5981k1.m15805e();
        if (m15805e.length != 0) {
            C6006t c6006t = m15805e[0];
            throw null;
        }
        int length = m15805e.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (m15805e.length > 0) {
            C6006t c6006t2 = m15805e[0];
            throw null;
        }
        int[] m15804d = c5981k1.m15804d();
        if (m15804d == null) {
            m15804d = f12746r;
        }
        if (m15805e.length > 0) {
            C6006t c6006t3 = m15805e[0];
            throw null;
        }
        int[] iArr2 = f12746r;
        int[] iArr3 = f12746r;
        int[] iArr4 = new int[m15804d.length + iArr2.length + iArr3.length];
        System.arraycopy(m15804d, 0, iArr4, 0, m15804d.length);
        System.arraycopy(iArr2, 0, iArr4, m15804d.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, m15804d.length + iArr2.length, iArr3.length);
        return new C6010u0<>(iArr, objArr, 0, 0, c5981k1.mo15401b(), z10, true, iArr4, m15804d.length, m15804d.length + iArr2.length, interfaceC6015w0, abstractC5971h0, abstractC5990n1, abstractC5997q, interfaceC5986m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.crypto.tink.shaded.protobuf.C6010u0<T> m16153W(com.google.crypto.tink.shaded.protobuf.C5963e1 r34, com.google.crypto.tink.shaded.protobuf.InterfaceC6015w0 r35, com.google.crypto.tink.shaded.protobuf.AbstractC5971h0 r36, com.google.crypto.tink.shaded.protobuf.AbstractC5990n1<?, ?> r37, com.google.crypto.tink.shaded.protobuf.AbstractC5997q<?> r38, com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16153W(com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.h0, com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.m0):com.google.crypto.tink.shaded.protobuf.u0");
    }

    /* renamed from: X */
    private int m16154X(int i10) {
        return this.f12748a[i10];
    }

    /* renamed from: Y */
    private static long m16155Y(int i10) {
        return i10 & 1048575;
    }

    /* renamed from: Z */
    private static <T> boolean m16156Z(T t10, long j10) {
        return ((Boolean) C6002r1.m15976C(t10, j10)).booleanValue();
    }

    /* renamed from: a0 */
    private static <T> double m16157a0(T t10, long j10) {
        return ((Double) C6002r1.m15976C(t10, j10)).doubleValue();
    }

    /* renamed from: b0 */
    private static <T> float m16158b0(T t10, long j10) {
        return ((Float) C6002r1.m15976C(t10, j10)).floatValue();
    }

    /* renamed from: c0 */
    private static <T> int m16159c0(T t10, long j10) {
        return ((Integer) C6002r1.m15976C(t10, j10)).intValue();
    }

    /* renamed from: d0 */
    private static <T> long m16160d0(T t10, long j10) {
        return ((Long) C6002r1.m15976C(t10, j10)).longValue();
    }

    /* renamed from: e0 */
    private <K, V> int m16161e0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C5961e.b bVar) {
        Unsafe unsafe = f12747s;
        Object m16186u = m16186u(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f12764q.mo15884h(object)) {
            Object mo15880d = this.f12764q.mo15880d(m16186u);
            this.f12764q.mo15877a(mo15880d, object);
            unsafe.putObject(t10, j10, mo15880d);
            object = mo15880d;
        }
        this.f12764q.mo15878b(m16186u);
        return m16172n(bArr, i10, i11, null, this.f12764q.mo15879c(object), bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* renamed from: f0 */
    private int m16162f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C5961e.b bVar) {
        Object valueOf;
        Object valueOf2;
        int m15364L;
        long j11;
        int i18;
        Object valueOf3;
        Object m16150T;
        int m15367O;
        Unsafe unsafe = f12747s;
        long j12 = this.f12748a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    valueOf = Double.valueOf(C5961e.m15372d(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    m15364L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(C5961e.m15380l(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    m15364L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    m15364L = C5961e.m15364L(bArr, i10, bVar);
                    j11 = bVar.f12573b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    m15364L = C5961e.m15361I(bArr, i10, bVar);
                    i18 = bVar.f12572a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    valueOf = Long.valueOf(C5961e.m15378j(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    m15364L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(C5961e.m15376h(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    m15364L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    m15364L = C5961e.m15364L(bArr, i10, bVar);
                    valueOf3 = Boolean.valueOf(bVar.f12573b != 0);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    m15364L = C5961e.m15361I(bArr, i10, bVar);
                    int i19 = bVar.f12572a;
                    if (i19 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t10, j10, valueOf3);
                        unsafe.putInt(t10, j12, i13);
                        return m15364L;
                    }
                    if ((i15 & 536870912) != 0 && !C6005s1.m16057n(bArr, m15364L, m15364L + i19)) {
                        throw C5953b0.m15325d();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, m15364L, i19, C5950a0.f12550b));
                    m15364L += i19;
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    m16150T = m16150T(t10, i13, i17);
                    m15367O = C5961e.m15367O(m16150T, m16188v(i17), bArr, i10, i11, bVar);
                    m16189v0(t10, i13, i17, m16150T);
                    return m15367O;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    m15364L = C5961e.m15370b(bArr, i10, bVar);
                    valueOf3 = bVar.f12574c;
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int m15361I = C5961e.m15361I(bArr, i10, bVar);
                    int i20 = bVar.f12572a;
                    C5950a0.e m16184t = m16184t(i17);
                    if (m16184t == null || m16184t.m15314a(i20)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        m16190w(t10).m15929n(i12, Long.valueOf(i20));
                    }
                    return m15361I;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    m15364L = C5961e.m15361I(bArr, i10, bVar);
                    i18 = AbstractC5973i.m15522b(bVar.f12572a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    m15364L = C5961e.m15364L(bArr, i10, bVar);
                    j11 = AbstractC5973i.m15523c(bVar.f12573b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return m15364L;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    m16150T = m16150T(t10, i13, i17);
                    m15367O = C5961e.m15366N(m16150T, m16188v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    m16189v0(t10, i13, i17, m16150T);
                    return m15367O;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x029c, code lost:
    
        if (r0 != r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029e, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r7 = r22;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0305, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e1, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0302, code lost:
    
        if (r0 != r15) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0088. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m16163h0(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.C5961e.b r34) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16163h0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002f. Please report as an issue. */
    /* renamed from: i0 */
    private int m16164i0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C5961e.b bVar) {
        int m15362J;
        Unsafe unsafe = f12747s;
        C5950a0.i iVar = (C5950a0.i) unsafe.getObject(t10, j11);
        if (!iVar.mo15317g()) {
            int size = iVar.size();
            iVar = iVar.mo15315a(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return C5961e.m15387s(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C5961e.m15373e(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return C5961e.m15390v(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C5961e.m15381m(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return C5961e.m15394z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C5961e.m15365M(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C5961e.m15393y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C5961e.m15362J(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return C5961e.m15389u(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C5961e.m15379k(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return C5961e.m15388t(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C5961e.m15377i(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return C5961e.m15386r(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C5961e.m15369a(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    long j12 = j10 & 536870912;
                    C5950a0.i iVar2 = iVar;
                    return j12 == 0 ? C5961e.m15356D(i12, bArr, i10, i11, iVar2, bVar) : C5961e.m15357E(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return C5961e.m15385q(m16188v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return C5961e.m15371c(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        m15362J = C5961e.m15362J(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                m15362J = C5961e.m15393y(bArr, i10, iVar, bVar);
                C5975i1.m15600A(t10, i13, iVar, m16184t(i15), null, this.f12762o);
                return m15362J;
            case 33:
            case 47:
                if (i14 == 2) {
                    return C5961e.m15391w(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C5961e.m15353A(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return C5961e.m15392x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C5961e.m15354B(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return C5961e.m15383o(m16188v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    /* renamed from: j0 */
    private int m16165j0(int i10) {
        if (i10 < this.f12750c || i10 > this.f12751d) {
            return -1;
        }
        return m16185t0(i10, 0);
    }

    /* renamed from: k */
    private boolean m16166k(T t10, T t11, int i10) {
        return m16131C(t10, i10) == m16131C(t11, i10);
    }

    /* renamed from: k0 */
    private int m16167k0(int i10, int i11) {
        if (i10 < this.f12750c || i10 > this.f12751d) {
            return -1;
        }
        return m16185t0(i10, i11);
    }

    /* renamed from: l */
    private static <T> boolean m16168l(T t10, long j10) {
        return C6002r1.m16011r(t10, j10);
    }

    /* renamed from: l0 */
    private int m16169l0(int i10) {
        return this.f12748a[i10 + 2];
    }

    /* renamed from: m */
    private static void m16170m(Object obj) {
        if (m16138H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: m0 */
    private <E> void m16171m0(Object obj, long j10, InterfaceC5966f1 interfaceC5966f1, InterfaceC5969g1<E> interfaceC5969g1, C5994p c5994p) {
        interfaceC5966f1.mo15442P(this.f12761n.mo15517e(obj, j10), interfaceC5969g1, c5994p);
    }

    /* renamed from: n */
    private <K, V> int m16172n(byte[] bArr, int i10, int i11, C5980k0.a<K, V> aVar, Map<K, V> map, C5961e.b bVar) {
        int m15361I = C5961e.m15361I(bArr, i10, bVar);
        int i12 = bVar.f12572a;
        if (i12 < 0 || i12 > i11 - m15361I) {
            throw C5953b0.m15332m();
        }
        throw null;
    }

    /* renamed from: n0 */
    private <E> void m16173n0(Object obj, int i10, InterfaceC5966f1 interfaceC5966f1, InterfaceC5969g1<E> interfaceC5969g1, C5994p c5994p) {
        interfaceC5966f1.mo15440N(this.f12761n.mo15517e(obj, m16155Y(i10)), interfaceC5969g1, c5994p);
    }

    /* renamed from: o */
    private static <T> double m16174o(T t10, long j10) {
        return C6002r1.m16017x(t10, j10);
    }

    /* renamed from: o0 */
    private void m16175o0(Object obj, int i10, InterfaceC5966f1 interfaceC5966f1) {
        long m16155Y;
        Object mo15457o;
        if (m16129B(i10)) {
            m16155Y = m16155Y(i10);
            mo15457o = interfaceC5966f1.mo15435I();
        } else if (this.f12754g) {
            m16155Y = m16155Y(i10);
            mo15457o = interfaceC5966f1.mo15468z();
        } else {
            m16155Y = m16155Y(i10);
            mo15457o = interfaceC5966f1.mo15457o();
        }
        C6002r1.m15991R(obj, m16155Y, mo15457o);
    }

    /* renamed from: p */
    private boolean m16176p(T t10, T t11, int i10) {
        int m16193x0 = m16193x0(i10);
        long m16155Y = m16155Y(m16193x0);
        switch (m16191w0(m16193x0)) {
            case 0:
                return m16166k(t10, t11, i10) && Double.doubleToLongBits(C6002r1.m16017x(t10, m16155Y)) == Double.doubleToLongBits(C6002r1.m16017x(t11, m16155Y));
            case 1:
                return m16166k(t10, t11, i10) && Float.floatToIntBits(C6002r1.m16018y(t10, m16155Y)) == Float.floatToIntBits(C6002r1.m16018y(t11, m16155Y));
            case 2:
                return m16166k(t10, t11, i10) && C6002r1.m15974A(t10, m16155Y) == C6002r1.m15974A(t11, m16155Y);
            case 3:
                return m16166k(t10, t11, i10) && C6002r1.m15974A(t10, m16155Y) == C6002r1.m15974A(t11, m16155Y);
            case 4:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 5:
                return m16166k(t10, t11, i10) && C6002r1.m15974A(t10, m16155Y) == C6002r1.m15974A(t11, m16155Y);
            case 6:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 7:
                return m16166k(t10, t11, i10) && C6002r1.m16011r(t10, m16155Y) == C6002r1.m16011r(t11, m16155Y);
            case 8:
                return m16166k(t10, t11, i10) && C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
            case 9:
                return m16166k(t10, t11, i10) && C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
            case 10:
                return m16166k(t10, t11, i10) && C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
            case 11:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 12:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 13:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 14:
                return m16166k(t10, t11, i10) && C6002r1.m15974A(t10, m16155Y) == C6002r1.m15974A(t11, m16155Y);
            case 15:
                return m16166k(t10, t11, i10) && C6002r1.m16019z(t10, m16155Y) == C6002r1.m16019z(t11, m16155Y);
            case 16:
                return m16166k(t10, t11, i10) && C6002r1.m15974A(t10, m16155Y) == C6002r1.m15974A(t11, m16155Y);
            case 17:
                return m16166k(t10, t11, i10) && C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
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
                return C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
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
                return m16139I(t10, t11, i10) && C5975i1.m15610K(C6002r1.m15976C(t10, m16155Y), C6002r1.m15976C(t11, m16155Y));
            default:
                return true;
        }
    }

    /* renamed from: p0 */
    private void m16177p0(Object obj, int i10, InterfaceC5966f1 interfaceC5966f1) {
        if (m16129B(i10)) {
            interfaceC5966f1.mo15456n(this.f12761n.mo15517e(obj, m16155Y(i10)));
        } else {
            interfaceC5966f1.mo15428B(this.f12761n.mo15517e(obj, m16155Y(i10)));
        }
    }

    /* renamed from: q */
    private <UT, UB> UB m16178q(Object obj, int i10, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1, Object obj2) {
        C5950a0.e m16184t;
        int m16154X = m16154X(i10);
        Object m15976C = C6002r1.m15976C(obj, m16155Y(m16193x0(i10)));
        return (m15976C == null || (m16184t = m16184t(i10)) == null) ? ub2 : (UB) m16180r(i10, m16154X, this.f12764q.mo15879c(m15976C), m16184t, ub2, abstractC5990n1, obj2);
    }

    /* renamed from: q0 */
    private static Field m16179q0(Class<?> cls, String str) {
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

    /* renamed from: r */
    private <K, V, UT, UB> UB m16180r(int i10, int i11, Map<K, V> map, C5950a0.e eVar, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1, Object obj) {
        this.f12764q.mo15878b(m16186u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.m15314a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = abstractC5990n1.mo15893f(obj);
                }
                AbstractC5970h.h m15489r = AbstractC5970h.m15489r(C5980k0.m15800b(null, next.getKey(), next.getValue()));
                try {
                    C5980k0.m15801d(m15489r.m15511b(), null, next.getKey(), next.getValue());
                    abstractC5990n1.mo15891d(ub2, i11, m15489r.m15510a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* renamed from: r0 */
    private void m16181r0(T t10, int i10) {
        int m16169l0 = m16169l0(i10);
        long j10 = 1048575 & m16169l0;
        if (j10 == 1048575) {
            return;
        }
        C6002r1.m15989P(t10, j10, (1 << (m16169l0 >>> 20)) | C6002r1.m16019z(t10, j10));
    }

    /* renamed from: s */
    private static <T> float m16182s(T t10, long j10) {
        return C6002r1.m16018y(t10, j10);
    }

    /* renamed from: s0 */
    private void m16183s0(T t10, int i10, int i11) {
        C6002r1.m15989P(t10, m16169l0(i11) & 1048575, i10);
    }

    /* renamed from: t */
    private C5950a0.e m16184t(int i10) {
        return (C5950a0.e) this.f12749b[((i10 / 3) * 2) + 1];
    }

    /* renamed from: t0 */
    private int m16185t0(int i10, int i11) {
        int length = (this.f12748a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int m16154X = m16154X(i13);
            if (i10 == m16154X) {
                return i13;
            }
            if (i10 < m16154X) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: u */
    private Object m16186u(int i10) {
        return this.f12749b[(i10 / 3) * 2];
    }

    /* renamed from: u0 */
    private void m16187u0(T t10, int i10, Object obj) {
        f12747s.putObject(t10, m16155Y(m16193x0(i10)), obj);
        m16181r0(t10, i10);
    }

    /* renamed from: v */
    private InterfaceC5969g1 m16188v(int i10) {
        int i11 = (i10 / 3) * 2;
        InterfaceC5969g1 interfaceC5969g1 = (InterfaceC5969g1) this.f12749b[i11];
        if (interfaceC5969g1 != null) {
            return interfaceC5969g1;
        }
        InterfaceC5969g1<T> m15340c = C5957c1.m15338a().m15340c((Class) this.f12749b[i11 + 1]);
        this.f12749b[i11] = m15340c;
        return m15340c;
    }

    /* renamed from: v0 */
    private void m16189v0(T t10, int i10, int i11, Object obj) {
        f12747s.putObject(t10, m16155Y(m16193x0(i11)), obj);
        m16183s0(t10, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static C5993o1 m16190w(Object obj) {
        AbstractC6018y abstractC6018y = (AbstractC6018y) obj;
        C5993o1 c5993o1 = abstractC6018y.unknownFields;
        if (c5993o1 != C5993o1.m15915c()) {
            return c5993o1;
        }
        C5993o1 m15919k = C5993o1.m15919k();
        abstractC6018y.unknownFields = m15919k;
        return m15919k;
    }

    /* renamed from: w0 */
    private static int m16191w0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ef, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0200, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0211, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0244, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (m16140J(r17, r10, r5) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x031f, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15746s(r10, (com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0) r2.getObject(r17, r13), m16188v(r5));
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
    
        if (m16140J(r17, r10, r5) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x034c, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15713L(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (m16140J(r17, r10, r5) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0355, code lost:
    
        r4 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15711J(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (m16140J(r17, r10, r5) != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x037a, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15734g(r10, (com.google.crypto.tink.shaded.protobuf.AbstractC5970h) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (m16140J(r17, r10, r5) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0389, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.C5975i1.m15645o(r10, r2.getObject(r17, r13), m16188v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (m16140J(r17, r10, r5) != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03b6, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15730d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025b, code lost:
    
        r4 = (com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15721T(r10) + com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15723V(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r16.f12756i != false) goto L150;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005d. Please report as an issue. */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m16192x(T r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16192x(java.lang.Object):int");
    }

    /* renamed from: x0 */
    private int m16193x0(int i10) {
        return this.f12748a[i10 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15721T(r8) + com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15723V(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f12756i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC5970h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC5970h) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.crypto.tink.shaded.protobuf.AbstractC5979k.m15719R(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m16194y(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16194y(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16195y0(T r18, com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16195y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    /* renamed from: z */
    private <UT, UB> int m16196z(AbstractC5990n1<UT, UB> abstractC5990n1, T t10) {
        return abstractC5990n1.mo15895h(abstractC5990n1.mo15894g(t10));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m16197z0(T r13, com.google.crypto.tink.shaded.protobuf.InterfaceC6011u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.m16197z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: a */
    public void mo15470a(T t10, T t11) {
        m16170m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f12748a.length; i10 += 3) {
            m16148R(t10, t11, i10);
        }
        C5975i1.m15606G(this.f12762o, t10, t11);
        if (this.f12753f) {
            C5975i1.m15604E(this.f12763p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: b */
    public void mo15471b(T t10) {
        if (m16138H(t10)) {
            if (t10 instanceof AbstractC6018y) {
                AbstractC6018y abstractC6018y = (AbstractC6018y) t10;
                abstractC6018y.m16246r();
                abstractC6018y.m16245q();
                abstractC6018y.m16239H();
            }
            int length = this.f12748a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int m16193x0 = m16193x0(i10);
                long m16155Y = m16155Y(m16193x0);
                int m16191w0 = m16191w0(m16193x0);
                if (m16191w0 != 9) {
                    switch (m16191w0) {
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
                            this.f12761n.mo15515c(t10, m16155Y);
                            break;
                        case 50:
                            Unsafe unsafe = f12747s;
                            Object object = unsafe.getObject(t10, m16155Y);
                            if (object != null) {
                                unsafe.putObject(t10, m16155Y, this.f12764q.mo15882f(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (m16131C(t10, i10)) {
                    m16188v(i10).mo15471b(f12747s.getObject(t10, m16155Y));
                }
            }
            this.f12762o.mo15897j(t10);
            if (this.f12753f) {
                this.f12763p.mo15955f(t10);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: c */
    public final boolean mo15472c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f12758k) {
            int i15 = this.f12757j[i14];
            int m16154X = m16154X(i15);
            int m16193x0 = m16193x0(i15);
            int i16 = this.f12748a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f12747s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (m16141K(m16193x0) && !m16133D(t10, i15, i10, i11, i18)) {
                return false;
            }
            int m16191w0 = m16191w0(m16193x0);
            if (m16191w0 != 9 && m16191w0 != 17) {
                if (m16191w0 != 27) {
                    if (m16191w0 == 60 || m16191w0 == 68) {
                        if (m16140J(t10, m16154X, i15) && !m16135E(t10, m16193x0, m16188v(i15))) {
                            return false;
                        }
                    } else if (m16191w0 != 49) {
                        if (m16191w0 == 50 && !m16137G(t10, m16193x0, i15)) {
                            return false;
                        }
                    }
                }
                if (!m16136F(t10, m16193x0, i15)) {
                    return false;
                }
            } else if (m16133D(t10, i15, i10, i11, i18) && !m16135E(t10, m16193x0, m16188v(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f12753f || this.f12763p.mo15952c(t10).m16116o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: d */
    public int mo15473d(T t10) {
        return this.f12755h ? m16194y(t10) : m16192x(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: e */
    public T mo15474e() {
        return (T) this.f12760m.mo16217a(this.f12752e);
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
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo15475f(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6010u0.mo15475f(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: g */
    public boolean mo15476g(T t10, T t11) {
        int length = this.f12748a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m16176p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f12762o.mo15894g(t10).equals(this.f12762o.mo15894g(t11))) {
            return false;
        }
        if (this.f12753f) {
            return this.f12763p.mo15952c(t10).equals(this.f12763p.mo15952c(t11));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x008f. Please report as an issue. */
    /* renamed from: g0 */
    public int m16198g0(T t10, byte[] bArr, int i10, int i11, int i12, C5961e.b bVar) {
        Unsafe unsafe;
        int i13;
        C6010u0<T> c6010u0;
        int i14;
        int i15;
        int i16;
        int i17;
        T t11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        long j10;
        int m15364L;
        Unsafe unsafe2;
        T t12;
        long j11;
        int i29;
        long j12;
        long j13;
        int i30;
        int i31;
        C6010u0<T> c6010u02 = this;
        T t13 = t10;
        byte[] bArr3 = bArr;
        int i32 = i11;
        int i33 = i12;
        C5961e.b bVar2 = bVar;
        m16170m(t10);
        Unsafe unsafe3 = f12747s;
        int i34 = i10;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = -1;
        int i39 = 1048575;
        while (true) {
            if (i34 < i32) {
                int i40 = i34 + 1;
                byte b10 = bArr3[i34];
                if (b10 < 0) {
                    int m15360H = C5961e.m15360H(b10, bArr3, i40, bVar2);
                    i18 = bVar2.f12572a;
                    i40 = m15360H;
                } else {
                    i18 = b10;
                }
                int i41 = i18 >>> 3;
                int i42 = i18 & 7;
                int m16167k0 = i41 > i38 ? c6010u02.m16167k0(i41, i35 / 3) : c6010u02.m16165j0(i41);
                if (m16167k0 == -1) {
                    i19 = i41;
                    i20 = i40;
                    i15 = i18;
                    i21 = i37;
                    i22 = i39;
                    unsafe = unsafe3;
                    i13 = i33;
                    i23 = 0;
                } else {
                    int i43 = c6010u02.f12748a[m16167k0 + 1];
                    int m16191w0 = m16191w0(i43);
                    long m16155Y = m16155Y(i43);
                    int i44 = i18;
                    if (m16191w0 <= 17) {
                        int i45 = c6010u02.f12748a[m16167k0 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i39) {
                            if (i39 != 1048575) {
                                unsafe3.putInt(t13, i39, i37);
                            }
                            i25 = i47;
                            i24 = unsafe3.getInt(t13, i47);
                        } else {
                            i24 = i37;
                            i25 = i39;
                        }
                        switch (m16191w0) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    C6002r1.m15987N(t13, m16155Y, C5961e.m15372d(bArr2, i40));
                                    i34 = i40 + 8;
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 1:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    C6002r1.m15988O(t13, m16155Y, C5961e.m15380l(bArr2, i40));
                                    i34 = i40 + 4;
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                j10 = m16155Y;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    m15364L = C5961e.m15364L(bArr2, i40, bVar2);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    j11 = bVar2.f12573b;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i34 = m15364L;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = C5961e.m15361I(bArr2, i40, bVar2);
                                    i29 = bVar2.f12572a;
                                    j12 = m16155Y;
                                    unsafe3.putInt(t13, j12, i29);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 1) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe3.putLong(t10, m16155Y, C5961e.m15378j(bArr2, i40));
                                    i34 = i40 + 8;
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 5) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe3.putInt(t13, m16155Y, C5961e.m15376h(bArr2, i40));
                                    i34 = i40 + 4;
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 7:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = C5961e.m15364L(bArr2, i40, bVar2);
                                    C6002r1.m15981H(t13, m16155Y, bVar2.f12573b != 0);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 8:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                j13 = m16155Y;
                                if (i42 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = (536870912 & i43) == 0 ? C5961e.m15355C(bArr2, i40, bVar2) : C5961e.m15358F(bArr2, i40, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f12574c);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 9:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                if (i42 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object m16149S = c6010u02.m16149S(t13, i28);
                                    i34 = C5961e.m15367O(m16149S, c6010u02.m16188v(i28), bArr, i40, i11, bVar);
                                    c6010u02.m16187u0(t13, i28, m16149S);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 10:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                j13 = m16155Y;
                                if (i42 != 2) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = C5961e.m15370b(bArr2, i40, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f12574c);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 12:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                j12 = m16155Y;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = C5961e.m15361I(bArr2, i40, bVar2);
                                    i29 = bVar2.f12572a;
                                    C5950a0.e m16184t = c6010u02.m16184t(i28);
                                    if (m16184t != null && !m16184t.m15314a(i29)) {
                                        m16190w(t10).m15929n(i27, Long.valueOf(i29));
                                        i35 = i28;
                                        i37 = i24;
                                        i36 = i27;
                                        i38 = i19;
                                        i39 = i26;
                                        i33 = i12;
                                        bArr3 = bArr2;
                                    }
                                    unsafe3.putInt(t13, j12, i29);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                j12 = m16155Y;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = C5961e.m15361I(bArr2, i40, bVar2);
                                    i29 = AbstractC5973i.m15522b(bVar2.f12572a);
                                    unsafe3.putInt(t13, j12, i29);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 16:
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    j10 = m16155Y;
                                    m15364L = C5961e.m15364L(bArr2, i40, bVar2);
                                    j11 = AbstractC5973i.m15523c(bVar2.f12573b);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i34 = m15364L;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 17:
                                if (i42 != 3) {
                                    i19 = i41;
                                    i26 = i25;
                                    i27 = i44;
                                    i28 = m16167k0;
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object m16149S2 = c6010u02.m16149S(t13, m16167k0);
                                    i34 = C5961e.m15366N(m16149S2, c6010u02.m16188v(m16167k0), bArr, i40, i11, (i41 << 3) | 4, bVar);
                                    c6010u02.m16187u0(t13, m16167k0, m16149S2);
                                    i37 = i24 | i46;
                                    i39 = i25;
                                    i33 = i12;
                                    i35 = m16167k0;
                                    i36 = i44;
                                    i38 = i41;
                                    bArr3 = bArr;
                                }
                            default:
                                i19 = i41;
                                i28 = m16167k0;
                                i26 = i25;
                                i27 = i44;
                                i22 = i26;
                                i13 = i12;
                                i20 = i40;
                                i23 = i28;
                                unsafe = unsafe3;
                                i21 = i24;
                                i15 = i27;
                                break;
                        }
                    } else {
                        i19 = i41;
                        i22 = i39;
                        i21 = i37;
                        if (m16191w0 == 27) {
                            if (i42 == 2) {
                                C5950a0.i iVar = (C5950a0.i) unsafe3.getObject(t13, m16155Y);
                                if (!iVar.mo15317g()) {
                                    int size = iVar.size();
                                    iVar = iVar.mo15315a(size == 0 ? 10 : size * 2);
                                    unsafe3.putObject(t13, m16155Y, iVar);
                                }
                                i34 = C5961e.m15385q(c6010u02.m16188v(m16167k0), i44, bArr, i40, i11, iVar, bVar);
                                i35 = m16167k0;
                                i36 = i44;
                                i39 = i22;
                                i37 = i21;
                                i38 = i19;
                                bArr3 = bArr;
                                i33 = i12;
                            } else {
                                i30 = i40;
                                unsafe = unsafe3;
                                i23 = m16167k0;
                                i31 = i44;
                                i13 = i12;
                                i20 = i30;
                            }
                        } else if (m16191w0 <= 49) {
                            int i48 = i40;
                            unsafe = unsafe3;
                            i23 = m16167k0;
                            i31 = i44;
                            i34 = m16164i0(t10, bArr, i40, i11, i44, i19, i42, m16167k0, i43, m16191w0, m16155Y, bVar);
                            if (i34 != i48) {
                                c6010u02 = this;
                                t13 = t10;
                                bArr3 = bArr;
                                i32 = i11;
                                i33 = i12;
                                bVar2 = bVar;
                                i39 = i22;
                                i37 = i21;
                                i35 = i23;
                                i36 = i31;
                                i38 = i19;
                                unsafe3 = unsafe;
                            } else {
                                i13 = i12;
                                i20 = i34;
                            }
                        } else {
                            i30 = i40;
                            unsafe = unsafe3;
                            i23 = m16167k0;
                            i31 = i44;
                            if (m16191w0 != 50) {
                                i34 = m16162f0(t10, bArr, i30, i11, i31, i19, i42, i43, m16191w0, m16155Y, i23, bVar);
                                if (i34 != i30) {
                                    c6010u02 = this;
                                    t13 = t10;
                                    bArr3 = bArr;
                                    i32 = i11;
                                    i33 = i12;
                                    bVar2 = bVar;
                                    i39 = i22;
                                    i37 = i21;
                                    i35 = i23;
                                    i36 = i31;
                                    i38 = i19;
                                    unsafe3 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = i34;
                                }
                            } else if (i42 == 2) {
                                i34 = m16161e0(t10, bArr, i30, i11, i23, m16155Y, bVar);
                                if (i34 != i30) {
                                    c6010u02 = this;
                                    t13 = t10;
                                    bArr3 = bArr;
                                    i32 = i11;
                                    i33 = i12;
                                    bVar2 = bVar;
                                    i39 = i22;
                                    i37 = i21;
                                    i35 = i23;
                                    i36 = i31;
                                    i38 = i19;
                                    unsafe3 = unsafe;
                                } else {
                                    i13 = i12;
                                    i20 = i34;
                                }
                            } else {
                                i13 = i12;
                                i20 = i30;
                            }
                        }
                        i15 = i31;
                    }
                }
                if (i15 != i13 || i13 == 0) {
                    i34 = (!this.f12753f || bVar.f12575d == C5994p.m15932b()) ? C5961e.m15359G(i15, bArr, i20, i11, m16190w(t10), bVar) : C5961e.m15375g(i15, bArr, i20, i11, t10, this.f12752e, this.f12762o, bVar);
                    t13 = t10;
                    bArr3 = bArr;
                    i32 = i11;
                    i36 = i15;
                    c6010u02 = this;
                    bVar2 = bVar;
                    i39 = i22;
                    i37 = i21;
                    i35 = i23;
                    i38 = i19;
                    unsafe3 = unsafe;
                    i33 = i13;
                } else {
                    i17 = 1048575;
                    c6010u0 = this;
                    i14 = i20;
                    i16 = i22;
                    i37 = i21;
                }
            } else {
                int i49 = i39;
                unsafe = unsafe3;
                i13 = i33;
                c6010u0 = c6010u02;
                i14 = i34;
                i15 = i36;
                i16 = i49;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            t11 = t10;
            unsafe.putInt(t11, i16, i37);
        } else {
            t11 = t10;
        }
        C5993o1 c5993o1 = null;
        for (int i50 = c6010u0.f12758k; i50 < c6010u0.f12759l; i50++) {
            c5993o1 = (C5993o1) m16178q(t10, c6010u0.f12757j[i50], c5993o1, c6010u0.f12762o, t10);
        }
        if (c5993o1 != null) {
            c6010u0.f12762o.mo15902o(t11, c5993o1);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw C5953b0.m15329h();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw C5953b0.m15329h();
        }
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: h */
    public void mo15477h(T t10, byte[] bArr, int i10, int i11, C5961e.b bVar) {
        if (this.f12755h) {
            m16163h0(t10, bArr, i10, i11, bVar);
        } else {
            m16198g0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: i */
    public void mo15478i(T t10, InterfaceC5966f1 interfaceC5966f1, C5994p c5994p) {
        c5994p.getClass();
        m16170m(t10);
        m16144N(this.f12762o, this.f12763p, t10, interfaceC5966f1, c5994p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: j */
    public void mo15479j(T t10, InterfaceC6011u1 interfaceC6011u1) {
        if (interfaceC6011u1.mo15843t() == InterfaceC6011u1.a.DESCENDING) {
            m16128A0(t10, interfaceC6011u1);
        } else if (this.f12755h) {
            m16197z0(t10, interfaceC6011u1);
        } else {
            m16195y0(t10, interfaceC6011u1);
        }
    }
}
