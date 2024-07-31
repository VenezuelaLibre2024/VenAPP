package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.u1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class u0<T> implements g1<T> {

    /* renamed from: r */
    private static final int[] f11531r = new int[0];

    /* renamed from: s */
    private static final Unsafe f11532s = r1.D();

    /* renamed from: a */
    private final int[] f11533a;

    /* renamed from: b */
    private final Object[] f11534b;

    /* renamed from: c */
    private final int f11535c;

    /* renamed from: d */
    private final int f11536d;

    /* renamed from: e */
    private final r0 f11537e;

    /* renamed from: f */
    private final boolean f11538f;

    /* renamed from: g */
    private final boolean f11539g;

    /* renamed from: h */
    private final boolean f11540h;

    /* renamed from: i */
    private final boolean f11541i;

    /* renamed from: j */
    private final int[] f11542j;

    /* renamed from: k */
    private final int f11543k;

    /* renamed from: l */
    private final int f11544l;

    /* renamed from: m */
    private final w0 f11545m;

    /* renamed from: n */
    private final h0 f11546n;

    /* renamed from: o */
    private final n1<?, ?> f11547o;

    /* renamed from: p */
    private final q<?> f11548p;

    /* renamed from: q */
    private final m0 f11549q;

    private u0(int[] iArr, Object[] objArr, int i10, int i11, r0 r0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        this.f11533a = iArr;
        this.f11534b = objArr;
        this.f11535c = i10;
        this.f11536d = i11;
        this.f11539g = r0Var instanceof y;
        this.f11540h = z10;
        this.f11538f = qVar != null && qVar.e(r0Var);
        this.f11541i = z11;
        this.f11542j = iArr2;
        this.f11543k = i12;
        this.f11544l = i13;
        this.f11545m = w0Var;
        this.f11546n = h0Var;
        this.f11547o = n1Var;
        this.f11548p = qVar;
        this.f11537e = r0Var;
        this.f11549q = m0Var;
    }

    private static <T> int A(T t10, long j10) {
        return r1.z(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0(T r11, com.google.crypto.tink.shaded.protobuf.u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.A0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    private static boolean B(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <K, V> void B0(u1 u1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f11549q.b(u(i11));
            u1Var.J(i10, null, this.f11549q.e(obj));
        }
    }

    private boolean C(T t10, int i10) {
        int l02 = l0(i10);
        long j10 = 1048575 & l02;
        if (j10 != 1048575) {
            return (r1.z(t10, j10) & (1 << (l02 >>> 20))) != 0;
        }
        int x02 = x0(i10);
        long Y = Y(x02);
        switch (w0(x02)) {
            case 0:
                return Double.doubleToRawLongBits(r1.x(t10, Y)) != 0;
            case 1:
                return Float.floatToRawIntBits(r1.y(t10, Y)) != 0;
            case 2:
                return r1.A(t10, Y) != 0;
            case 3:
                return r1.A(t10, Y) != 0;
            case 4:
                return r1.z(t10, Y) != 0;
            case 5:
                return r1.A(t10, Y) != 0;
            case 6:
                return r1.z(t10, Y) != 0;
            case 7:
                return r1.r(t10, Y);
            case 8:
                Object C = r1.C(t10, Y);
                if (C instanceof String) {
                    return !((String) C).isEmpty();
                }
                if (C instanceof h) {
                    return !h.f11376b.equals(C);
                }
                throw new IllegalArgumentException();
            case 9:
                return r1.C(t10, Y) != null;
            case 10:
                return !h.f11376b.equals(r1.C(t10, Y));
            case 11:
                return r1.z(t10, Y) != 0;
            case 12:
                return r1.z(t10, Y) != 0;
            case 13:
                return r1.z(t10, Y) != 0;
            case 14:
                return r1.A(t10, Y) != 0;
            case 15:
                return r1.z(t10, Y) != 0;
            case 16:
                return r1.A(t10, Y) != 0;
            case 17:
                return r1.C(t10, Y) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void C0(int i10, Object obj, u1 u1Var) {
        if (obj instanceof String) {
            u1Var.e(i10, (String) obj);
        } else {
            u1Var.M(i10, (h) obj);
        }
    }

    private boolean D(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(t10, i10) : (i12 & i13) != 0;
    }

    private <UT, UB> void D0(n1<UT, UB> n1Var, T t10, u1 u1Var) {
        n1Var.t(n1Var.g(t10), u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object obj, int i10, g1 g1Var) {
        return g1Var.c(r1.C(obj, Y(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean F(Object obj, int i10, int i11) {
        List list = (List) r1.C(obj, Y(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 v10 = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!v10.c(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t10, int i10, int i11) {
        if (this.f11549q.e(r1.C(t10, Y(i10))).isEmpty()) {
            return true;
        }
        this.f11549q.b(u(i11));
        throw null;
    }

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y) {
            return ((y) obj).F();
        }
        return true;
    }

    private boolean I(T t10, T t11, int i10) {
        long l02 = l0(i10) & 1048575;
        return r1.z(t10, l02) == r1.z(t11, l02);
    }

    private boolean J(T t10, int i10, int i11) {
        return r1.z(t10, (long) (l0(i11) & 1048575)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> L(Object obj, long j10) {
        return (List) r1.C(obj, j10);
    }

    private static <T> long M(T t10, long j10) {
        return r1.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x008d, code lost:
    
        r0 = r18.f11543k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0092, code lost:
    
        if (r0 >= r18.f11544l) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0094, code lost:
    
        r4 = q(r21, r18.f11542j[r0], r4, r19, r21);
        r0 = r0 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00aa, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00ab, code lost:
    
        if (r4 == null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00ad, code lost:
    
        r7.o(r10, r4);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void N(com.google.crypto.tink.shaded.protobuf.n1<UT, UB> r19, com.google.crypto.tink.shaded.protobuf.q<ET> r20, T r21, com.google.crypto.tink.shaded.protobuf.f1 r22, com.google.crypto.tink.shaded.protobuf.p r23) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.N(com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.f1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final <K, V> void O(Object obj, int i10, Object obj2, p pVar, f1 f1Var) {
        long Y = Y(x0(i10));
        Object C = r1.C(obj, Y);
        if (C == null) {
            C = this.f11549q.d(obj2);
            r1.R(obj, Y, C);
        } else if (this.f11549q.h(C)) {
            Object d10 = this.f11549q.d(obj2);
            this.f11549q.a(d10, C);
            r1.R(obj, Y, d10);
            C = d10;
        }
        Map<?, ?> c10 = this.f11549q.c(C);
        this.f11549q.b(obj2);
        f1Var.L(c10, null, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(T t10, T t11, int i10) {
        if (C(t11, i10)) {
            long Y = Y(x0(i10));
            Unsafe unsafe = f11532s;
            Object object = unsafe.getObject(t11, Y);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
            }
            g1 v10 = v(i10);
            if (!C(t10, i10)) {
                if (H(object)) {
                    Object e10 = v10.e();
                    v10.a(e10, object);
                    unsafe.putObject(t10, Y, e10);
                } else {
                    unsafe.putObject(t10, Y, object);
                }
                r0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, Y);
            if (!H(object2)) {
                Object e11 = v10.e();
                v10.a(e11, object2);
                unsafe.putObject(t10, Y, e11);
                object2 = e11;
            }
            v10.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(T t10, T t11, int i10) {
        int X = X(i10);
        if (J(t11, X, i10)) {
            long Y = Y(x0(i10));
            Unsafe unsafe = f11532s;
            Object object = unsafe.getObject(t11, Y);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + X(i10) + " is present but null: " + t11);
            }
            g1 v10 = v(i10);
            if (!J(t10, X, i10)) {
                if (H(object)) {
                    Object e10 = v10.e();
                    v10.a(e10, object);
                    unsafe.putObject(t10, Y, e10);
                } else {
                    unsafe.putObject(t10, Y, object);
                }
                s0(t10, X, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, Y);
            if (!H(object2)) {
                Object e11 = v10.e();
                v10.a(e11, object2);
                unsafe.putObject(t10, Y, e11);
                object2 = e11;
            }
            v10.a(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    private void R(T t10, T t11, int i10) {
        int x02 = x0(i10);
        long Y = Y(x02);
        int X = X(i10);
        switch (w0(x02)) {
            case 0:
                if (C(t11, i10)) {
                    r1.N(t10, Y, r1.x(t11, Y));
                    r0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (C(t11, i10)) {
                    r1.O(t10, Y, r1.y(t11, Y));
                    r0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!C(t11, i10)) {
                    return;
                }
                r1.Q(t10, Y, r1.A(t11, Y));
                r0(t10, i10);
                return;
            case 3:
                if (!C(t11, i10)) {
                    return;
                }
                r1.Q(t10, Y, r1.A(t11, Y));
                r0(t10, i10);
                return;
            case 4:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 5:
                if (!C(t11, i10)) {
                    return;
                }
                r1.Q(t10, Y, r1.A(t11, Y));
                r0(t10, i10);
                return;
            case 6:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 7:
                if (C(t11, i10)) {
                    r1.H(t10, Y, r1.r(t11, Y));
                    r0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!C(t11, i10)) {
                    return;
                }
                r1.R(t10, Y, r1.C(t11, Y));
                r0(t10, i10);
                return;
            case 9:
            case 17:
                P(t10, t11, i10);
                return;
            case 10:
                if (!C(t11, i10)) {
                    return;
                }
                r1.R(t10, Y, r1.C(t11, Y));
                r0(t10, i10);
                return;
            case 11:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 12:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 13:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 14:
                if (!C(t11, i10)) {
                    return;
                }
                r1.Q(t10, Y, r1.A(t11, Y));
                r0(t10, i10);
                return;
            case 15:
                if (!C(t11, i10)) {
                    return;
                }
                r1.P(t10, Y, r1.z(t11, Y));
                r0(t10, i10);
                return;
            case 16:
                if (!C(t11, i10)) {
                    return;
                }
                r1.Q(t10, Y, r1.A(t11, Y));
                r0(t10, i10);
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
                this.f11546n.d(t10, t11, Y);
                return;
            case 50:
                i1.F(this.f11549q, t10, t11, Y);
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
                if (!J(t11, X, i10)) {
                    return;
                }
                r1.R(t10, Y, r1.C(t11, Y));
                s0(t10, X, i10);
                return;
            case 60:
            case 68:
                Q(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!J(t11, X, i10)) {
                    return;
                }
                r1.R(t10, Y, r1.C(t11, Y));
                s0(t10, X, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object S(T t10, int i10) {
        g1 v10 = v(i10);
        long Y = Y(x0(i10));
        if (!C(t10, i10)) {
            return v10.e();
        }
        Object object = f11532s.getObject(t10, Y);
        if (H(object)) {
            return object;
        }
        Object e10 = v10.e();
        if (object != null) {
            v10.a(e10, object);
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object T(T t10, int i10, int i11) {
        g1 v10 = v(i11);
        if (!J(t10, i10, i11)) {
            return v10.e();
        }
        Object object = f11532s.getObject(t10, Y(x0(i11)));
        if (H(object)) {
            return object;
        }
        Object e10 = v10.e();
        if (object != null) {
            v10.a(e10, object);
        }
        return e10;
    }

    public static <T> u0<T> U(Class<T> cls, p0 p0Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        return p0Var instanceof e1 ? W((e1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var) : V((k1) p0Var, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    static <T> u0<T> V(k1 k1Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, q<?> qVar, m0 m0Var) {
        boolean z10 = k1Var.c() == b1.PROTO3;
        t[] e10 = k1Var.e();
        if (e10.length != 0) {
            t tVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            t tVar2 = e10[0];
            throw null;
        }
        int[] d10 = k1Var.d();
        if (d10 == null) {
            d10 = f11531r;
        }
        if (e10.length > 0) {
            t tVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f11531r;
        int[] iArr3 = f11531r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, w0Var, h0Var, n1Var, qVar, m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.crypto.tink.shaded.protobuf.u0<T> W(com.google.crypto.tink.shaded.protobuf.e1 r34, com.google.crypto.tink.shaded.protobuf.w0 r35, com.google.crypto.tink.shaded.protobuf.h0 r36, com.google.crypto.tink.shaded.protobuf.n1<?, ?> r37, com.google.crypto.tink.shaded.protobuf.q<?> r38, com.google.crypto.tink.shaded.protobuf.m0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.W(com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.w0, com.google.crypto.tink.shaded.protobuf.h0, com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.m0):com.google.crypto.tink.shaded.protobuf.u0");
    }

    private int X(int i10) {
        return this.f11533a[i10];
    }

    private static long Y(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean Z(T t10, long j10) {
        return ((Boolean) r1.C(t10, j10)).booleanValue();
    }

    private static <T> double a0(T t10, long j10) {
        return ((Double) r1.C(t10, j10)).doubleValue();
    }

    private static <T> float b0(T t10, long j10) {
        return ((Float) r1.C(t10, j10)).floatValue();
    }

    private static <T> int c0(T t10, long j10) {
        return ((Integer) r1.C(t10, j10)).intValue();
    }

    private static <T> long d0(T t10, long j10) {
        return ((Long) r1.C(t10, j10)).longValue();
    }

    private <K, V> int e0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.b bVar) {
        Unsafe unsafe = f11532s;
        Object u10 = u(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f11549q.h(object)) {
            Object d10 = this.f11549q.d(u10);
            this.f11549q.a(d10, object);
            unsafe.putObject(t10, j10, d10);
            object = d10;
        }
        this.f11549q.b(u10);
        return n(bArr, i10, i11, null, this.f11549q.c(object), bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private int f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.b bVar) {
        Object valueOf;
        Object valueOf2;
        int L;
        long j11;
        int i18;
        Object valueOf3;
        Object T;
        int O;
        Unsafe unsafe = f11532s;
        long j12 = this.f11533a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    valueOf = Double.valueOf(e.d(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    valueOf2 = Float.valueOf(e.l(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    j11 = bVar.f11358b;
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    L = e.I(bArr, i10, bVar);
                    i18 = bVar.f11357a;
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    valueOf = Long.valueOf(e.j(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf);
                    L = i10 + 8;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    valueOf2 = Integer.valueOf(e.h(bArr, i10));
                    unsafe.putObject(t10, j10, valueOf2);
                    L = i10 + 4;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    valueOf3 = Boolean.valueOf(bVar.f11358b != 0);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    L = e.I(bArr, i10, bVar);
                    int i19 = bVar.f11357a;
                    if (i19 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t10, j10, valueOf3);
                        unsafe.putInt(t10, j12, i13);
                        return L;
                    }
                    if ((i15 & 536870912) != 0 && !s1.n(bArr, L, L + i19)) {
                        throw b0.d();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, L, i19, a0.f11335b));
                    L += i19;
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    T = T(t10, i13, i17);
                    O = e.O(T, v(i17), bArr, i10, i11, bVar);
                    v0(t10, i13, i17, T);
                    return O;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    L = e.b(bArr, i10, bVar);
                    valueOf3 = bVar.f11359c;
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int I = e.I(bArr, i10, bVar);
                    int i20 = bVar.f11357a;
                    a0.e t11 = t(i17);
                    if (t11 == null || t11.a(i20)) {
                        unsafe.putObject(t10, j10, Integer.valueOf(i20));
                        unsafe.putInt(t10, j12, i13);
                    } else {
                        w(t10).n(i12, Long.valueOf(i20));
                    }
                    return I;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    L = e.I(bArr, i10, bVar);
                    i18 = i.b(bVar.f11357a);
                    valueOf3 = Integer.valueOf(i18);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    L = e.L(bArr, i10, bVar);
                    j11 = i.c(bVar.f11358b);
                    valueOf3 = Long.valueOf(j11);
                    unsafe.putObject(t10, j10, valueOf3);
                    unsafe.putInt(t10, j12, i13);
                    return L;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    T = T(t10, i13, i17);
                    O = e.N(T, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    v0(t10, i13, i17, T);
                    return O;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x029c, code lost:
    
        if (r0 != r10) goto L257;
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
    
        if (r0 != r15) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0302, code lost:
    
        if (r0 != r15) goto L257;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0088. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h0(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.e.b r34) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.h0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002f. Please report as an issue. */
    private int i0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.b bVar) {
        int J;
        Unsafe unsafe = f11532s;
        a0.i iVar = (a0.i) unsafe.getObject(t10, j11);
        if (!iVar.g()) {
            int size = iVar.size();
            iVar = iVar.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return e.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.e(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return e.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.m(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return e.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.M(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return e.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return e.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return e.k(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return e.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return e.i(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return e.r(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.a(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    long j12 = j10 & 536870912;
                    a0.i iVar2 = iVar;
                    return j12 == 0 ? e.D(i12, bArr, i10, i11, iVar2, bVar) : e.E(i12, bArr, i10, i11, iVar2, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e.q(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return e.c(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        J = e.J(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                J = e.y(bArr, i10, iVar, bVar);
                i1.A(t10, i13, iVar, t(i15), null, this.f11547o);
                return J;
            case 33:
            case 47:
                if (i14 == 2) {
                    return e.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.A(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return e.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return e.o(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int j0(int i10) {
        if (i10 < this.f11535c || i10 > this.f11536d) {
            return -1;
        }
        return t0(i10, 0);
    }

    private boolean k(T t10, T t11, int i10) {
        return C(t10, i10) == C(t11, i10);
    }

    private int k0(int i10, int i11) {
        if (i10 < this.f11535c || i10 > this.f11536d) {
            return -1;
        }
        return t0(i10, i11);
    }

    private static <T> boolean l(T t10, long j10) {
        return r1.r(t10, j10);
    }

    private int l0(int i10) {
        return this.f11533a[i10 + 2];
    }

    private static void m(Object obj) {
        if (H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private <E> void m0(Object obj, long j10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.P(this.f11546n.e(obj, j10), g1Var, pVar);
    }

    private <K, V> int n(byte[] bArr, int i10, int i11, k0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int I = e.I(bArr, i10, bVar);
        int i12 = bVar.f11357a;
        if (i12 < 0 || i12 > i11 - I) {
            throw b0.m();
        }
        throw null;
    }

    private <E> void n0(Object obj, int i10, f1 f1Var, g1<E> g1Var, p pVar) {
        f1Var.N(this.f11546n.e(obj, Y(i10)), g1Var, pVar);
    }

    private static <T> double o(T t10, long j10) {
        return r1.x(t10, j10);
    }

    private void o0(Object obj, int i10, f1 f1Var) {
        long Y;
        Object o10;
        if (B(i10)) {
            Y = Y(i10);
            o10 = f1Var.I();
        } else if (this.f11539g) {
            Y = Y(i10);
            o10 = f1Var.z();
        } else {
            Y = Y(i10);
            o10 = f1Var.o();
        }
        r1.R(obj, Y, o10);
    }

    private boolean p(T t10, T t11, int i10) {
        int x02 = x0(i10);
        long Y = Y(x02);
        switch (w0(x02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(r1.x(t10, Y)) == Double.doubleToLongBits(r1.x(t11, Y));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(r1.y(t10, Y)) == Float.floatToIntBits(r1.y(t11, Y));
            case 2:
                return k(t10, t11, i10) && r1.A(t10, Y) == r1.A(t11, Y);
            case 3:
                return k(t10, t11, i10) && r1.A(t10, Y) == r1.A(t11, Y);
            case 4:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 5:
                return k(t10, t11, i10) && r1.A(t10, Y) == r1.A(t11, Y);
            case 6:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 7:
                return k(t10, t11, i10) && r1.r(t10, Y) == r1.r(t11, Y);
            case 8:
                return k(t10, t11, i10) && i1.K(r1.C(t10, Y), r1.C(t11, Y));
            case 9:
                return k(t10, t11, i10) && i1.K(r1.C(t10, Y), r1.C(t11, Y));
            case 10:
                return k(t10, t11, i10) && i1.K(r1.C(t10, Y), r1.C(t11, Y));
            case 11:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 12:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 13:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 14:
                return k(t10, t11, i10) && r1.A(t10, Y) == r1.A(t11, Y);
            case 15:
                return k(t10, t11, i10) && r1.z(t10, Y) == r1.z(t11, Y);
            case 16:
                return k(t10, t11, i10) && r1.A(t10, Y) == r1.A(t11, Y);
            case 17:
                return k(t10, t11, i10) && i1.K(r1.C(t10, Y), r1.C(t11, Y));
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
                return i1.K(r1.C(t10, Y), r1.C(t11, Y));
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
                return I(t10, t11, i10) && i1.K(r1.C(t10, Y), r1.C(t11, Y));
            default:
                return true;
        }
    }

    private void p0(Object obj, int i10, f1 f1Var) {
        if (B(i10)) {
            f1Var.n(this.f11546n.e(obj, Y(i10)));
        } else {
            f1Var.B(this.f11546n.e(obj, Y(i10)));
        }
    }

    private <UT, UB> UB q(Object obj, int i10, UB ub2, n1<UT, UB> n1Var, Object obj2) {
        a0.e t10;
        int X = X(i10);
        Object C = r1.C(obj, Y(x0(i10)));
        return (C == null || (t10 = t(i10)) == null) ? ub2 : (UB) r(i10, X, this.f11549q.c(C), t10, ub2, n1Var, obj2);
    }

    private static Field q0(Class<?> cls, String str) {
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

    private <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub2, n1<UT, UB> n1Var, Object obj) {
        this.f11549q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = n1Var.f(obj);
                }
                h.C0172h r10 = h.r(k0.b(null, next.getKey(), next.getValue()));
                try {
                    k0.d(r10.b(), null, next.getKey(), next.getValue());
                    n1Var.d(ub2, i11, r10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void r0(T t10, int i10) {
        int l02 = l0(i10);
        long j10 = 1048575 & l02;
        if (j10 == 1048575) {
            return;
        }
        r1.P(t10, j10, (1 << (l02 >>> 20)) | r1.z(t10, j10));
    }

    private static <T> float s(T t10, long j10) {
        return r1.y(t10, j10);
    }

    private void s0(T t10, int i10, int i11) {
        r1.P(t10, l0(i11) & 1048575, i10);
    }

    private a0.e t(int i10) {
        return (a0.e) this.f11534b[((i10 / 3) * 2) + 1];
    }

    private int t0(int i10, int i11) {
        int length = (this.f11533a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int X = X(i13);
            if (i10 == X) {
                return i13;
            }
            if (i10 < X) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object u(int i10) {
        return this.f11534b[(i10 / 3) * 2];
    }

    private void u0(T t10, int i10, Object obj) {
        f11532s.putObject(t10, Y(x0(i10)), obj);
        r0(t10, i10);
    }

    private g1 v(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.f11534b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> c10 = c1.a().c((Class) this.f11534b[i11 + 1]);
        this.f11534b[i11] = c10;
        return c10;
    }

    private void v0(T t10, int i10, int i11, Object obj) {
        f11532s.putObject(t10, Y(x0(i11)), obj);
        s0(t10, i10, i11);
    }

    public static o1 w(Object obj) {
        y yVar = (y) obj;
        o1 o1Var = yVar.unknownFields;
        if (o1Var != o1.c()) {
            return o1Var;
        }
        o1 k10 = o1.k();
        yVar.unknownFields = k10;
        return k10;
    }

    private static int w0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ef, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0200, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0211, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0244, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (J(r17, r10, r5) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x031f, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.s(r10, (com.google.crypto.tink.shaded.protobuf.r0) r2.getObject(r17, r13), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031d, code lost:
    
        if ((r8 & r15) != 0) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x034a, code lost:
    
        if ((r8 & r15) != 0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0353, code lost:
    
        if ((r8 & r15) != 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0378, code lost:
    
        if ((r8 & r15) != 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0387, code lost:
    
        if ((r8 & r15) != 0) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b4, code lost:
    
        if ((r8 & r15) != 0) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (J(r17, r10, r5) != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x034c, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.L(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (J(r17, r10, r5) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0355, code lost:
    
        r4 = com.google.crypto.tink.shaded.protobuf.k.J(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (J(r17, r10, r5) != false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x037a, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.g(r10, (com.google.crypto.tink.shaded.protobuf.h) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (J(r17, r10, r5) != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0389, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.i1.o(r10, r2.getObject(r17, r13), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (J(r17, r10, r5) != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03b6, code lost:
    
        r3 = com.google.crypto.tink.shaded.protobuf.k.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025b, code lost:
    
        r4 = (com.google.crypto.tink.shaded.protobuf.k.T(r10) + com.google.crypto.tink.shaded.protobuf.k.V(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r16.f11541i != false) goto L398;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int x(T r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.x(java.lang.Object):int");
    }

    private int x0(int i10) {
        return this.f11533a[i10 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.crypto.tink.shaded.protobuf.k.T(r8) + com.google.crypto.tink.shaded.protobuf.k.V(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f11541i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.crypto.tink.shaded.protobuf.h) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.crypto.tink.shaded.protobuf.k.R(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int y(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.y(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y0(T r18, com.google.crypto.tink.shaded.protobuf.u1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    private <UT, UB> int z(n1<UT, UB> n1Var, T t10) {
        return n1Var.h(n1Var.g(t10));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void z0(T r13, com.google.crypto.tink.shaded.protobuf.u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.u1):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t10, T t11) {
        m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f11533a.length; i10 += 3) {
            R(t10, t11, i10);
        }
        i1.G(this.f11547o, t10, t11);
        if (this.f11538f) {
            i1.E(this.f11548p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t10) {
        if (H(t10)) {
            if (t10 instanceof y) {
                y yVar = (y) t10;
                yVar.r();
                yVar.q();
                yVar.H();
            }
            int length = this.f11533a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int x02 = x0(i10);
                long Y = Y(x02);
                int w02 = w0(x02);
                if (w02 != 9) {
                    switch (w02) {
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
                            this.f11546n.c(t10, Y);
                            break;
                        case 50:
                            Unsafe unsafe = f11532s;
                            Object object = unsafe.getObject(t10, Y);
                            if (object != null) {
                                unsafe.putObject(t10, Y, this.f11549q.f(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (C(t10, i10)) {
                    v(i10).b(f11532s.getObject(t10, Y));
                }
            }
            this.f11547o.j(t10);
            if (this.f11538f) {
                this.f11548p.f(t10);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f11543k) {
            int i15 = this.f11542j[i14];
            int X = X(i15);
            int x02 = x0(i15);
            int i16 = this.f11533a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f11532s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (K(x02) && !D(t10, i15, i10, i11, i18)) {
                return false;
            }
            int w02 = w0(x02);
            if (w02 != 9 && w02 != 17) {
                if (w02 != 27) {
                    if (w02 == 60 || w02 == 68) {
                        if (J(t10, X, i15) && !E(t10, x02, v(i15))) {
                            return false;
                        }
                    } else if (w02 != 49) {
                        if (w02 == 50 && !G(t10, x02, i15)) {
                            return false;
                        }
                    }
                }
                if (!F(t10, x02, i15)) {
                    return false;
                }
            } else if (D(t10, i15, i10, i11, i18) && !E(t10, x02, v(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f11538f || this.f11548p.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t10) {
        return this.f11540h ? y(t10) : x(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        return (T) this.f11545m.a(this.f11537e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L177;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.f(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t10, T t11) {
        int length = this.f11533a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f11547o.g(t10).equals(this.f11547o.g(t11))) {
            return false;
        }
        if (this.f11538f) {
            return this.f11548p.c(t10).equals(this.f11548p.c(t11));
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x008f. Please report as an issue. */
    public int g0(T t10, byte[] bArr, int i10, int i11, int i12, e.b bVar) {
        Unsafe unsafe;
        int i13;
        u0<T> u0Var;
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
        int L;
        Unsafe unsafe2;
        T t12;
        long j11;
        int i29;
        long j12;
        long j13;
        int i30;
        int i31;
        u0<T> u0Var2 = this;
        T t13 = t10;
        byte[] bArr3 = bArr;
        int i32 = i11;
        int i33 = i12;
        e.b bVar2 = bVar;
        m(t10);
        Unsafe unsafe3 = f11532s;
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
                    int H = e.H(b10, bArr3, i40, bVar2);
                    i18 = bVar2.f11357a;
                    i40 = H;
                } else {
                    i18 = b10;
                }
                int i41 = i18 >>> 3;
                int i42 = i18 & 7;
                int k02 = i41 > i38 ? u0Var2.k0(i41, i35 / 3) : u0Var2.j0(i41);
                if (k02 == -1) {
                    i19 = i41;
                    i20 = i40;
                    i15 = i18;
                    i21 = i37;
                    i22 = i39;
                    unsafe = unsafe3;
                    i13 = i33;
                    i23 = 0;
                } else {
                    int i43 = u0Var2.f11533a[k02 + 1];
                    int w02 = w0(i43);
                    long Y = Y(i43);
                    int i44 = i18;
                    if (w02 <= 17) {
                        int i45 = u0Var2.f11533a[k02 + 2];
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
                        switch (w02) {
                            case 0:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = k02;
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
                                    r1.N(t13, Y, e.d(bArr2, i40));
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
                                i28 = k02;
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
                                    r1.O(t13, Y, e.l(bArr2, i40));
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
                                i28 = k02;
                                i26 = i25;
                                i27 = i44;
                                j10 = Y;
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
                                    L = e.L(bArr2, i40, bVar2);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    j11 = bVar2.f11358b;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i34 = L;
                                    i36 = i27;
                                    i38 = i19;
                                    i39 = i26;
                                    bArr3 = bArr2;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i19 = i41;
                                i28 = k02;
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
                                    i34 = e.I(bArr2, i40, bVar2);
                                    i29 = bVar2.f11357a;
                                    j12 = Y;
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
                                i28 = k02;
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
                                    unsafe3.putLong(t10, Y, e.j(bArr2, i40));
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
                                i28 = k02;
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
                                    unsafe3.putInt(t13, Y, e.h(bArr2, i40));
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
                                i28 = k02;
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
                                    i34 = e.L(bArr2, i40, bVar2);
                                    r1.H(t13, Y, bVar2.f11358b != 0);
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
                                i28 = k02;
                                i26 = i25;
                                i27 = i44;
                                j13 = Y;
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
                                    i34 = (536870912 & i43) == 0 ? e.C(bArr2, i40, bVar2) : e.F(bArr2, i40, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f11359c);
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
                                i28 = k02;
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
                                    Object S = u0Var2.S(t13, i28);
                                    i34 = e.O(S, u0Var2.v(i28), bArr, i40, i11, bVar);
                                    u0Var2.u0(t13, i28, S);
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
                                i28 = k02;
                                i26 = i25;
                                i27 = i44;
                                j13 = Y;
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
                                    i34 = e.b(bArr2, i40, bVar2);
                                    unsafe3.putObject(t13, j13, bVar2.f11359c);
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
                                i28 = k02;
                                i26 = i25;
                                i27 = i44;
                                j12 = Y;
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
                                    i34 = e.I(bArr2, i40, bVar2);
                                    i29 = bVar2.f11357a;
                                    a0.e t14 = u0Var2.t(i28);
                                    if (t14 != null && !t14.a(i29)) {
                                        w(t10).n(i27, Long.valueOf(i29));
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
                                i28 = k02;
                                i26 = i25;
                                i27 = i44;
                                j12 = Y;
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
                                    i34 = e.I(bArr2, i40, bVar2);
                                    i29 = i.b(bVar2.f11357a);
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
                                i28 = k02;
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
                                    j10 = Y;
                                    L = e.L(bArr2, i40, bVar2);
                                    j11 = i.c(bVar2.f11358b);
                                    unsafe2 = unsafe3;
                                    t12 = t10;
                                    unsafe2.putLong(t12, j10, j11);
                                    i37 = i24 | i46;
                                    i33 = i12;
                                    i35 = i28;
                                    i34 = L;
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
                                    i28 = k02;
                                    i22 = i26;
                                    i13 = i12;
                                    i20 = i40;
                                    i23 = i28;
                                    unsafe = unsafe3;
                                    i21 = i24;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object S2 = u0Var2.S(t13, k02);
                                    i34 = e.N(S2, u0Var2.v(k02), bArr, i40, i11, (i41 << 3) | 4, bVar);
                                    u0Var2.u0(t13, k02, S2);
                                    i37 = i24 | i46;
                                    i39 = i25;
                                    i33 = i12;
                                    i35 = k02;
                                    i36 = i44;
                                    i38 = i41;
                                    bArr3 = bArr;
                                }
                            default:
                                i19 = i41;
                                i28 = k02;
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
                        if (w02 == 27) {
                            if (i42 == 2) {
                                a0.i iVar = (a0.i) unsafe3.getObject(t13, Y);
                                if (!iVar.g()) {
                                    int size = iVar.size();
                                    iVar = iVar.a(size == 0 ? 10 : size * 2);
                                    unsafe3.putObject(t13, Y, iVar);
                                }
                                i34 = e.q(u0Var2.v(k02), i44, bArr, i40, i11, iVar, bVar);
                                i35 = k02;
                                i36 = i44;
                                i39 = i22;
                                i37 = i21;
                                i38 = i19;
                                bArr3 = bArr;
                                i33 = i12;
                            } else {
                                i30 = i40;
                                unsafe = unsafe3;
                                i23 = k02;
                                i31 = i44;
                                i13 = i12;
                                i20 = i30;
                            }
                        } else if (w02 <= 49) {
                            int i48 = i40;
                            unsafe = unsafe3;
                            i23 = k02;
                            i31 = i44;
                            i34 = i0(t10, bArr, i40, i11, i44, i19, i42, k02, i43, w02, Y, bVar);
                            if (i34 != i48) {
                                u0Var2 = this;
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
                            i23 = k02;
                            i31 = i44;
                            if (w02 != 50) {
                                i34 = f0(t10, bArr, i30, i11, i31, i19, i42, i43, w02, Y, i23, bVar);
                                if (i34 != i30) {
                                    u0Var2 = this;
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
                                i34 = e0(t10, bArr, i30, i11, i23, Y, bVar);
                                if (i34 != i30) {
                                    u0Var2 = this;
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
                    i34 = (!this.f11538f || bVar.f11360d == p.b()) ? e.G(i15, bArr, i20, i11, w(t10), bVar) : e.g(i15, bArr, i20, i11, t10, this.f11537e, this.f11547o, bVar);
                    t13 = t10;
                    bArr3 = bArr;
                    i32 = i11;
                    i36 = i15;
                    u0Var2 = this;
                    bVar2 = bVar;
                    i39 = i22;
                    i37 = i21;
                    i35 = i23;
                    i38 = i19;
                    unsafe3 = unsafe;
                    i33 = i13;
                } else {
                    i17 = 1048575;
                    u0Var = this;
                    i14 = i20;
                    i16 = i22;
                    i37 = i21;
                }
            } else {
                int i49 = i39;
                unsafe = unsafe3;
                i13 = i33;
                u0Var = u0Var2;
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
        o1 o1Var = null;
        for (int i50 = u0Var.f11543k; i50 < u0Var.f11544l; i50++) {
            o1Var = (o1) q(t10, u0Var.f11542j[i50], o1Var, u0Var.f11547o, t10);
        }
        if (o1Var != null) {
            u0Var.f11547o.o(t11, o1Var);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw b0.h();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw b0.h();
        }
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void h(T t10, byte[] bArr, int i10, int i11, e.b bVar) {
        if (this.f11540h) {
            h0(t10, bArr, i10, i11, bVar);
        } else {
            g0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t10, f1 f1Var, p pVar) {
        pVar.getClass();
        m(t10);
        N(this.f11547o, this.f11548p, t10, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t10, u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            A0(t10, u1Var);
        } else if (this.f11540h) {
            z0(t10, u1Var);
        } else {
            y0(t10, u1Var);
        }
    }
}
