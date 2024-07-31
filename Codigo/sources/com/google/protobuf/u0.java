package com.google.protobuf;

import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.t1;
import com.google.protobuf.u1;
import com.google.protobuf.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u0<T> implements g1<T> {

    /* renamed from: r */
    private static final int[] f13356r = new int[0];

    /* renamed from: s */
    private static final Unsafe f13357s = r1.D();

    /* renamed from: a */
    private final int[] f13358a;

    /* renamed from: b */
    private final Object[] f13359b;

    /* renamed from: c */
    private final int f13360c;

    /* renamed from: d */
    private final int f13361d;

    /* renamed from: e */
    private final r0 f13362e;

    /* renamed from: f */
    private final boolean f13363f;

    /* renamed from: g */
    private final boolean f13364g;

    /* renamed from: h */
    private final boolean f13365h;

    /* renamed from: i */
    private final boolean f13366i;

    /* renamed from: j */
    private final int[] f13367j;

    /* renamed from: k */
    private final int f13368k;

    /* renamed from: l */
    private final int f13369l;

    /* renamed from: m */
    private final w0 f13370m;

    /* renamed from: n */
    private final h0 f13371n;

    /* renamed from: o */
    private final n1<?, ?> f13372o;

    /* renamed from: p */
    private final p<?> f13373p;

    /* renamed from: q */
    private final m0 f13374q;

    private u0(int[] iArr, Object[] objArr, int i10, int i11, r0 r0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        this.f13358a = iArr;
        this.f13359b = objArr;
        this.f13360c = i10;
        this.f13361d = i11;
        this.f13364g = r0Var instanceof x;
        this.f13365h = z10;
        this.f13363f = pVar != null && pVar.e(r0Var);
        this.f13366i = z11;
        this.f13367j = iArr2;
        this.f13368k = i12;
        this.f13369l = i13;
        this.f13370m = w0Var;
        this.f13371n = h0Var;
        this.f13372o = n1Var;
        this.f13373p = pVar;
        this.f13362e = r0Var;
        this.f13374q = m0Var;
    }

    private boolean A(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? z(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean B(Object obj, int i10, g1 g1Var) {
        return g1Var.c(r1.C(obj, V(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean C(Object obj, int i10, int i11) {
        List list = (List) r1.C(obj, V(i10));
        if (list.isEmpty()) {
            return true;
        }
        g1 t10 = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!t10.c(list.get(i12))) {
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
    private boolean D(T t10, int i10, int i11) {
        Map<?, ?> e10 = this.f13374q.e(r1.C(t10, V(i10)));
        if (e10.isEmpty()) {
            return true;
        }
        if (this.f13374q.b(s(i11)).f13279c.h() != t1.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : e10.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = c1.a().c(obj.getClass());
            }
            if (!r52.c(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).N();
        }
        return true;
    }

    private boolean F(T t10, T t11, int i10) {
        long c02 = c0(i10) & 1048575;
        return r1.z(t10, c02) == r1.z(t11, c02);
    }

    private boolean G(T t10, int i10, int i11) {
        return r1.z(t10, (long) (c0(i11) & 1048575)) == i10;
    }

    private static boolean H(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> I(Object obj, long j10) {
        return (List) r1.C(obj, j10);
    }

    private static <T> long J(T t10, long j10) {
        return r1.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x008d, code lost:
    
        r0 = r18.f13368k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0092, code lost:
    
        if (r0 >= r18.f13369l) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0094, code lost:
    
        r4 = o(r21, r18.f13367j[r0], r4, r19, r21);
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
    /* JADX WARN: Removed duplicated region for block: B:36:0x05bd A[Catch: all -> 0x0615, TRY_LEAVE, TryCatch #7 {all -> 0x0615, blocks: (B:16:0x058e, B:34:0x05b7, B:36:0x05bd, B:49:0x05e5, B:50:0x05ea), top: B:15:0x058e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0627 A[LOOP:4: B:64:0x0623->B:66:0x0627, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x063c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.protobuf.t.b<ET>> void K(com.google.protobuf.n1<UT, UB> r19, com.google.protobuf.p<ET> r20, T r21, com.google.protobuf.f1 r22, com.google.protobuf.o r23) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.K(com.google.protobuf.n1, com.google.protobuf.p, java.lang.Object, com.google.protobuf.f1, com.google.protobuf.o):void");
    }

    private final <K, V> void L(Object obj, int i10, Object obj2, o oVar, f1 f1Var) {
        long V = V(o0(i10));
        Object C = r1.C(obj, V);
        if (C == null) {
            C = this.f13374q.d(obj2);
            r1.R(obj, V, C);
        } else if (this.f13374q.h(C)) {
            Object d10 = this.f13374q.d(obj2);
            this.f13374q.a(d10, C);
            r1.R(obj, V, d10);
            C = d10;
        }
        f1Var.M(this.f13374q.c(C), this.f13374q.b(obj2), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void M(T t10, T t11, int i10) {
        if (z(t11, i10)) {
            long V = V(o0(i10));
            Unsafe unsafe = f13357s;
            Object object = unsafe.getObject(t11, V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + U(i10) + " is present but null: " + t11);
            }
            g1 t12 = t(i10);
            if (!z(t10, i10)) {
                if (E(object)) {
                    Object e10 = t12.e();
                    t12.a(e10, object);
                    unsafe.putObject(t10, V, e10);
                } else {
                    unsafe.putObject(t10, V, object);
                }
                i0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, V);
            if (!E(object2)) {
                Object e11 = t12.e();
                t12.a(e11, object2);
                unsafe.putObject(t10, V, e11);
                object2 = e11;
            }
            t12.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(T t10, T t11, int i10) {
        int U = U(i10);
        if (G(t11, U, i10)) {
            long V = V(o0(i10));
            Unsafe unsafe = f13357s;
            Object object = unsafe.getObject(t11, V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + U(i10) + " is present but null: " + t11);
            }
            g1 t12 = t(i10);
            if (!G(t10, U, i10)) {
                if (E(object)) {
                    Object e10 = t12.e();
                    t12.a(e10, object);
                    unsafe.putObject(t10, V, e10);
                } else {
                    unsafe.putObject(t10, V, object);
                }
                j0(t10, U, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, V);
            if (!E(object2)) {
                Object e11 = t12.e();
                t12.a(e11, object2);
                unsafe.putObject(t10, V, e11);
                object2 = e11;
            }
            t12.a(object2, object);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    private void O(T t10, T t11, int i10) {
        int o02 = o0(i10);
        long V = V(o02);
        int U = U(i10);
        switch (n0(o02)) {
            case 0:
                if (z(t11, i10)) {
                    r1.N(t10, V, r1.x(t11, V));
                    i0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (z(t11, i10)) {
                    r1.O(t10, V, r1.y(t11, V));
                    i0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!z(t11, i10)) {
                    return;
                }
                r1.Q(t10, V, r1.A(t11, V));
                i0(t10, i10);
                return;
            case 3:
                if (!z(t11, i10)) {
                    return;
                }
                r1.Q(t10, V, r1.A(t11, V));
                i0(t10, i10);
                return;
            case 4:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 5:
                if (!z(t11, i10)) {
                    return;
                }
                r1.Q(t10, V, r1.A(t11, V));
                i0(t10, i10);
                return;
            case 6:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 7:
                if (z(t11, i10)) {
                    r1.H(t10, V, r1.r(t11, V));
                    i0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!z(t11, i10)) {
                    return;
                }
                r1.R(t10, V, r1.C(t11, V));
                i0(t10, i10);
                return;
            case 9:
            case 17:
                M(t10, t11, i10);
                return;
            case 10:
                if (!z(t11, i10)) {
                    return;
                }
                r1.R(t10, V, r1.C(t11, V));
                i0(t10, i10);
                return;
            case 11:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 12:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 13:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 14:
                if (!z(t11, i10)) {
                    return;
                }
                r1.Q(t10, V, r1.A(t11, V));
                i0(t10, i10);
                return;
            case 15:
                if (!z(t11, i10)) {
                    return;
                }
                r1.P(t10, V, r1.z(t11, V));
                i0(t10, i10);
                return;
            case 16:
                if (!z(t11, i10)) {
                    return;
                }
                r1.Q(t10, V, r1.A(t11, V));
                i0(t10, i10);
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
                this.f13371n.d(t10, t11, V);
                return;
            case 50:
                i1.F(this.f13374q, t10, t11, V);
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
                if (!G(t11, U, i10)) {
                    return;
                }
                r1.R(t10, V, r1.C(t11, V));
                j0(t10, U, i10);
                return;
            case 60:
            case 68:
                N(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!G(t11, U, i10)) {
                    return;
                }
                r1.R(t10, V, r1.C(t11, V));
                j0(t10, U, i10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object P(T t10, int i10) {
        g1 t11 = t(i10);
        long V = V(o0(i10));
        if (!z(t10, i10)) {
            return t11.e();
        }
        Object object = f13357s.getObject(t10, V);
        if (E(object)) {
            return object;
        }
        Object e10 = t11.e();
        if (object != null) {
            t11.a(e10, object);
        }
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object Q(T t10, int i10, int i11) {
        g1 t11 = t(i11);
        if (!G(t10, i10, i11)) {
            return t11.e();
        }
        Object object = f13357s.getObject(t10, V(o0(i11)));
        if (E(object)) {
            return object;
        }
        Object e10 = t11.e();
        if (object != null) {
            t11.a(e10, object);
        }
        return e10;
    }

    public static <T> u0<T> R(Class<T> cls, p0 p0Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        return p0Var instanceof e1 ? T((e1) p0Var, w0Var, h0Var, n1Var, pVar, m0Var) : S((k1) p0Var, w0Var, h0Var, n1Var, pVar, m0Var);
    }

    static <T> u0<T> S(k1 k1Var, w0 w0Var, h0 h0Var, n1<?, ?> n1Var, p<?> pVar, m0 m0Var) {
        boolean z10 = k1Var.c() == b1.PROTO3;
        s[] e10 = k1Var.e();
        if (e10.length != 0) {
            s sVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            s sVar2 = e10[0];
            throw null;
        }
        int[] d10 = k1Var.d();
        if (d10 == null) {
            d10 = f13356r;
        }
        if (e10.length > 0) {
            s sVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f13356r;
        int[] iArr3 = f13356r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new u0<>(iArr, objArr, 0, 0, k1Var.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, w0Var, h0Var, n1Var, pVar, m0Var);
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
    static <T> com.google.protobuf.u0<T> T(com.google.protobuf.e1 r34, com.google.protobuf.w0 r35, com.google.protobuf.h0 r36, com.google.protobuf.n1<?, ?> r37, com.google.protobuf.p<?> r38, com.google.protobuf.m0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.T(com.google.protobuf.e1, com.google.protobuf.w0, com.google.protobuf.h0, com.google.protobuf.n1, com.google.protobuf.p, com.google.protobuf.m0):com.google.protobuf.u0");
    }

    private int U(int i10) {
        return this.f13358a[i10];
    }

    private static long V(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean W(T t10, long j10) {
        return ((Boolean) r1.C(t10, j10)).booleanValue();
    }

    private static <T> double X(T t10, long j10) {
        return ((Double) r1.C(t10, j10)).doubleValue();
    }

    private static <T> float Y(T t10, long j10) {
        return ((Float) r1.C(t10, j10)).floatValue();
    }

    private static <T> int Z(T t10, long j10) {
        return ((Integer) r1.C(t10, j10)).intValue();
    }

    private static <T> long a0(T t10, long j10) {
        return ((Long) r1.C(t10, j10)).longValue();
    }

    private int b0(int i10) {
        if (i10 < this.f13360c || i10 > this.f13361d) {
            return -1;
        }
        return k0(i10, 0);
    }

    private int c0(int i10) {
        return this.f13358a[i10 + 2];
    }

    private <E> void d0(Object obj, long j10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.J(this.f13371n.e(obj, j10), g1Var, oVar);
    }

    private <E> void e0(Object obj, int i10, f1 f1Var, g1<E> g1Var, o oVar) {
        f1Var.K(this.f13371n.e(obj, V(i10)), g1Var, oVar);
    }

    private void f0(Object obj, int i10, f1 f1Var) {
        long V;
        Object o10;
        if (y(i10)) {
            V = V(i10);
            o10 = f1Var.I();
        } else if (this.f13364g) {
            V = V(i10);
            o10 = f1Var.z();
        } else {
            V = V(i10);
            o10 = f1Var.o();
        }
        r1.R(obj, V, o10);
    }

    private void g0(Object obj, int i10, f1 f1Var) {
        if (y(i10)) {
            f1Var.n(this.f13371n.e(obj, V(i10)));
        } else {
            f1Var.B(this.f13371n.e(obj, V(i10)));
        }
    }

    private static Field h0(Class<?> cls, String str) {
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

    private void i0(T t10, int i10) {
        int c02 = c0(i10);
        long j10 = 1048575 & c02;
        if (j10 == 1048575) {
            return;
        }
        r1.P(t10, j10, (1 << (c02 >>> 20)) | r1.z(t10, j10));
    }

    private boolean j(T t10, T t11, int i10) {
        return z(t10, i10) == z(t11, i10);
    }

    private void j0(T t10, int i10, int i11) {
        r1.P(t10, c0(i11) & 1048575, i10);
    }

    private static <T> boolean k(T t10, long j10) {
        return r1.r(t10, j10);
    }

    private int k0(int i10, int i11) {
        int length = (this.f13358a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int U = U(i13);
            if (i10 == U) {
                return i13;
            }
            if (i10 < U) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static void l(Object obj) {
        if (E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void l0(T t10, int i10, Object obj) {
        f13357s.putObject(t10, V(o0(i10)), obj);
        i0(t10, i10);
    }

    private static <T> double m(T t10, long j10) {
        return r1.x(t10, j10);
    }

    private void m0(T t10, int i10, int i11, Object obj) {
        f13357s.putObject(t10, V(o0(i11)), obj);
        j0(t10, i10, i11);
    }

    private boolean n(T t10, T t11, int i10) {
        int o02 = o0(i10);
        long V = V(o02);
        switch (n0(o02)) {
            case 0:
                return j(t10, t11, i10) && Double.doubleToLongBits(r1.x(t10, V)) == Double.doubleToLongBits(r1.x(t11, V));
            case 1:
                return j(t10, t11, i10) && Float.floatToIntBits(r1.y(t10, V)) == Float.floatToIntBits(r1.y(t11, V));
            case 2:
                return j(t10, t11, i10) && r1.A(t10, V) == r1.A(t11, V);
            case 3:
                return j(t10, t11, i10) && r1.A(t10, V) == r1.A(t11, V);
            case 4:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 5:
                return j(t10, t11, i10) && r1.A(t10, V) == r1.A(t11, V);
            case 6:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 7:
                return j(t10, t11, i10) && r1.r(t10, V) == r1.r(t11, V);
            case 8:
                return j(t10, t11, i10) && i1.K(r1.C(t10, V), r1.C(t11, V));
            case 9:
                return j(t10, t11, i10) && i1.K(r1.C(t10, V), r1.C(t11, V));
            case 10:
                return j(t10, t11, i10) && i1.K(r1.C(t10, V), r1.C(t11, V));
            case 11:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 12:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 13:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 14:
                return j(t10, t11, i10) && r1.A(t10, V) == r1.A(t11, V);
            case 15:
                return j(t10, t11, i10) && r1.z(t10, V) == r1.z(t11, V);
            case 16:
                return j(t10, t11, i10) && r1.A(t10, V) == r1.A(t11, V);
            case 17:
                return j(t10, t11, i10) && i1.K(r1.C(t10, V), r1.C(t11, V));
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
                return i1.K(r1.C(t10, V), r1.C(t11, V));
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
                return F(t10, t11, i10) && i1.K(r1.C(t10, V), r1.C(t11, V));
            default:
                return true;
        }
    }

    private static int n0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private <UT, UB> UB o(Object obj, int i10, UB ub2, n1<UT, UB> n1Var, Object obj2) {
        z.e r10;
        int U = U(i10);
        Object C = r1.C(obj, V(o0(i10)));
        return (C == null || (r10 = r(i10)) == null) ? ub2 : (UB) p(i10, U, this.f13374q.c(C), r10, ub2, n1Var, obj2);
    }

    private int o0(int i10) {
        return this.f13358a[i10 + 1];
    }

    private <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, z.e eVar, UB ub2, n1<UT, UB> n1Var, Object obj) {
        k0.a<?, ?> b10 = this.f13374q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = n1Var.f(obj);
                }
                g.h r10 = g.r(k0.b(b10, next.getKey(), next.getValue()));
                try {
                    k0.e(r10.b(), b10, next.getKey(), next.getValue());
                    n1Var.d(ub2, i11, r10.a());
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p0(T r18, com.google.protobuf.u1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.p0(java.lang.Object, com.google.protobuf.u1):void");
    }

    private static <T> float q(T t10, long j10) {
        return r1.y(t10, j10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q0(T r13, com.google.protobuf.u1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.q0(java.lang.Object, com.google.protobuf.u1):void");
    }

    private z.e r(int i10) {
        return (z.e) this.f13359b[((i10 / 3) * 2) + 1];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r0(T r11, com.google.protobuf.u1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.r0(java.lang.Object, com.google.protobuf.u1):void");
    }

    private Object s(int i10) {
        return this.f13359b[(i10 / 3) * 2];
    }

    private <K, V> void s0(u1 u1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            u1Var.O(i10, this.f13374q.b(s(i11)), this.f13374q.e(obj));
        }
    }

    private g1 t(int i10) {
        int i11 = (i10 / 3) * 2;
        g1 g1Var = (g1) this.f13359b[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> c10 = c1.a().c((Class) this.f13359b[i11 + 1]);
        this.f13359b[i11] = c10;
        return c10;
    }

    private void t0(int i10, Object obj, u1 u1Var) {
        if (obj instanceof String) {
            u1Var.e(i10, (String) obj);
        } else {
            u1Var.L(i10, (g) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ef, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0200, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0211, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0222, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0244, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (G(r17, r10, r5) != false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x031f, code lost:
    
        r3 = com.google.protobuf.j.s(r10, (com.google.protobuf.r0) r2.getObject(r17, r13), t(r5));
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
    
        if (G(r17, r10, r5) != false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x034c, code lost:
    
        r3 = com.google.protobuf.j.M(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (G(r17, r10, r5) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0355, code lost:
    
        r4 = com.google.protobuf.j.K(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (G(r17, r10, r5) != false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x037a, code lost:
    
        r3 = com.google.protobuf.j.g(r10, (com.google.protobuf.g) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (G(r17, r10, r5) != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0389, code lost:
    
        r3 = com.google.protobuf.i1.o(r10, r2.getObject(r17, r13), t(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (G(r17, r10, r5) != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03b6, code lost:
    
        r3 = com.google.protobuf.j.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025b, code lost:
    
        r4 = (com.google.protobuf.j.U(r10) + com.google.protobuf.j.W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0257, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r16.f13366i != false) goto L398;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x005d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int u(T r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.u(java.lang.Object):int");
    }

    private <UT, UB> void u0(n1<UT, UB> n1Var, T t10, u1 u1Var) {
        n1Var.t(n1Var.g(t10), u1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.protobuf.j.U(r8) + com.google.protobuf.j.W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f13366i != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.protobuf.g) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.protobuf.g) != false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.protobuf.j.S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int v(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.v(java.lang.Object):int");
    }

    private <UT, UB> int w(n1<UT, UB> n1Var, T t10) {
        return n1Var.h(n1Var.g(t10));
    }

    private static <T> int x(T t10, long j10) {
        return r1.z(t10, j10);
    }

    private static boolean y(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean z(T t10, int i10) {
        int c02 = c0(i10);
        long j10 = 1048575 & c02;
        if (j10 != 1048575) {
            return (r1.z(t10, j10) & (1 << (c02 >>> 20))) != 0;
        }
        int o02 = o0(i10);
        long V = V(o02);
        switch (n0(o02)) {
            case 0:
                return Double.doubleToRawLongBits(r1.x(t10, V)) != 0;
            case 1:
                return Float.floatToRawIntBits(r1.y(t10, V)) != 0;
            case 2:
                return r1.A(t10, V) != 0;
            case 3:
                return r1.A(t10, V) != 0;
            case 4:
                return r1.z(t10, V) != 0;
            case 5:
                return r1.A(t10, V) != 0;
            case 6:
                return r1.z(t10, V) != 0;
            case 7:
                return r1.r(t10, V);
            case 8:
                Object C = r1.C(t10, V);
                if (C instanceof String) {
                    return !((String) C).isEmpty();
                }
                if (C instanceof g) {
                    return !g.f13185b.equals(C);
                }
                throw new IllegalArgumentException();
            case 9:
                return r1.C(t10, V) != null;
            case 10:
                return !g.f13185b.equals(r1.C(t10, V));
            case 11:
                return r1.z(t10, V) != 0;
            case 12:
                return r1.z(t10, V) != 0;
            case 13:
                return r1.z(t10, V) != 0;
            case 14:
                return r1.A(t10, V) != 0;
            case 15:
                return r1.z(t10, V) != 0;
            case 16:
                return r1.A(t10, V) != 0;
            case 17:
                return r1.C(t10, V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.google.protobuf.g1
    public void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f13358a.length; i10 += 3) {
            O(t10, t11, i10);
        }
        i1.G(this.f13372o, t10, t11);
        if (this.f13363f) {
            i1.E(this.f13373p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.g1
    public void b(T t10) {
        if (E(t10)) {
            if (t10 instanceof x) {
                x xVar = (x) t10;
                xVar.x();
                xVar.w();
                xVar.P();
            }
            int length = this.f13358a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int o02 = o0(i10);
                long V = V(o02);
                int n02 = n0(o02);
                if (n02 != 9) {
                    switch (n02) {
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
                            this.f13371n.c(t10, V);
                            break;
                        case 50:
                            Unsafe unsafe = f13357s;
                            Object object = unsafe.getObject(t10, V);
                            if (object != null) {
                                unsafe.putObject(t10, V, this.f13374q.f(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (z(t10, i10)) {
                    t(i10).b(f13357s.getObject(t10, V));
                }
            }
            this.f13372o.j(t10);
            if (this.f13363f) {
                this.f13373p.f(t10);
            }
        }
    }

    @Override // com.google.protobuf.g1
    public final boolean c(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f13368k) {
            int i15 = this.f13367j[i14];
            int U = U(i15);
            int o02 = o0(i15);
            int i16 = this.f13358a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f13357s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (H(o02) && !A(t10, i15, i10, i11, i18)) {
                return false;
            }
            int n02 = n0(o02);
            if (n02 != 9 && n02 != 17) {
                if (n02 != 27) {
                    if (n02 == 60 || n02 == 68) {
                        if (G(t10, U, i15) && !B(t10, o02, t(i15))) {
                            return false;
                        }
                    } else if (n02 != 49) {
                        if (n02 == 50 && !D(t10, o02, i15)) {
                            return false;
                        }
                    }
                }
                if (!C(t10, o02, i15)) {
                    return false;
                }
            } else if (A(t10, i15, i10, i11, i18) && !B(t10, o02, t(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f13363f || this.f13373p.c(t10).p();
    }

    @Override // com.google.protobuf.g1
    public int d(T t10) {
        return this.f13365h ? v(t10) : u(t10);
    }

    @Override // com.google.protobuf.g1
    public T e() {
        return (T) this.f13370m.a(this.f13362e);
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
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.f(java.lang.Object):int");
    }

    @Override // com.google.protobuf.g1
    public boolean g(T t10, T t11) {
        int length = this.f13358a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f13372o.g(t10).equals(this.f13372o.g(t11))) {
            return false;
        }
        if (this.f13363f) {
            return this.f13373p.c(t10).equals(this.f13373p.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.g1
    public void h(T t10, u1 u1Var) {
        if (u1Var.t() == u1.a.DESCENDING) {
            r0(t10, u1Var);
        } else if (this.f13365h) {
            q0(t10, u1Var);
        } else {
            p0(t10, u1Var);
        }
    }

    @Override // com.google.protobuf.g1
    public void i(T t10, f1 f1Var, o oVar) {
        oVar.getClass();
        l(t10);
        K(this.f13372o, this.f13373p, t10, f1Var, oVar);
    }
}
