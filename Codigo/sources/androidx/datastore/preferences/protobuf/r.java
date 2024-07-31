package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.y;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class r extends q<y.d> {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4249a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f4249a = iArr;
            try {
                iArr[t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4249a[t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4249a[t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4249a[t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4249a[t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4249a[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4249a[t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4249a[t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4249a[t1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4249a[t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4249a[t1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4249a[t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4249a[t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4249a[t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4249a[t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4249a[t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4249a[t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4249a[t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public Object b(p pVar, r0 r0Var, int i10) {
        return pVar.a(r0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public u<y.d> d(Object obj) {
        return ((y.c) obj).J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public boolean e(r0 r0Var) {
        return r0Var instanceof y.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public void f(Object obj) {
        c(obj).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00e6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    @Override // androidx.datastore.preferences.protobuf.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <UT, UB> UB g(androidx.datastore.preferences.protobuf.f1 r4, java.lang.Object r5, androidx.datastore.preferences.protobuf.p r6, androidx.datastore.preferences.protobuf.u<androidx.datastore.preferences.protobuf.y.d> r7, UB r8, androidx.datastore.preferences.protobuf.n1<UT, UB> r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r.g(androidx.datastore.preferences.protobuf.f1, java.lang.Object, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.u, java.lang.Object, androidx.datastore.preferences.protobuf.n1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.f4327b, f1Var.M(eVar.b().getClass(), pVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        r0 f10 = eVar.b().d().f();
        e Q = e.Q(ByteBuffer.wrap(hVar.w()), true);
        c1.a().b(f10, Q, pVar);
        uVar.x(eVar.f4327b, f10);
        if (Q.A() != Integer.MAX_VALUE) {
            throw b0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.q
    public void j(u1 u1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (!dVar.c()) {
            switch (a.f4249a[dVar.d().ordinal()]) {
                case 1:
                    u1Var.p(dVar.a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    u1Var.B(dVar.a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    u1Var.u(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    u1Var.f(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    u1Var.h(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    u1Var.s(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    u1Var.c(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    u1Var.v(dVar.a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    u1Var.o(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    u1Var.w(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    u1Var.i(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    u1Var.H(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    u1Var.m(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    u1Var.K(dVar.a(), (h) entry.getValue());
                    return;
                case 16:
                    u1Var.e(dVar.a(), (String) entry.getValue());
                    return;
                case 17:
                    u1Var.N(dVar.a(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    u1Var.L(dVar.a(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f4249a[dVar.d().ordinal()]) {
            case 1:
                i1.P(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 2:
                i1.T(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 3:
                i1.W(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 4:
                i1.e0(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 5:
            case 14:
                i1.V(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 6:
                i1.S(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 7:
                i1.R(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 8:
                i1.N(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 9:
                i1.d0(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 10:
                i1.Y(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 11:
                i1.Z(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 12:
                i1.a0(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 13:
                i1.b0(dVar.a(), (List) entry.getValue(), u1Var, dVar.f());
                return;
            case 15:
                i1.O(dVar.a(), (List) entry.getValue(), u1Var);
                return;
            case 16:
                i1.c0(dVar.a(), (List) entry.getValue(), u1Var);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                i1.U(dVar.a(), (List) entry.getValue(), u1Var, c1.a().d(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                i1.X(dVar.a(), (List) entry.getValue(), u1Var, c1.a().d(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
