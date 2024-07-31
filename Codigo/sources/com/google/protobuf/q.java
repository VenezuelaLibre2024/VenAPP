package com.google.protobuf;

import com.google.protobuf.r0;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class q extends p<x.d> {

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13308a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f13308a = iArr;
            try {
                iArr[t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13308a[t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13308a[t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13308a[t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13308a[t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13308a[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13308a[t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13308a[t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13308a[t1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13308a[t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13308a[t1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13308a[t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13308a[t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13308a[t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13308a[t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13308a[t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13308a[t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13308a[t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public Object b(o oVar, r0 r0Var, int i10) {
        return oVar.a(r0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public t<x.d> d(Object obj) {
        return ((x.c) obj).Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public boolean e(r0 r0Var) {
        return r0Var instanceof x.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void f(Object obj) {
        c(obj).u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0105. Please report as an issue. */
    @Override // com.google.protobuf.p
    public <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<x.d> tVar, UB ub2, n1<UT, UB> n1Var) {
        Object valueOf;
        long H;
        int p10;
        Object i10;
        ArrayList arrayList;
        x.e eVar = (x.e) obj2;
        int c10 = eVar.c();
        if (eVar.f13392b.c() && eVar.f13392b.f()) {
            switch (a.f13308a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f1Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f1Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f1Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f1Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f1Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f1Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f1Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f1Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f1Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f1Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f1Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f1Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f1Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f1Var.j(arrayList);
                    ub2 = (UB) i1.z(obj, c10, arrayList, eVar.f13392b.h(), ub2, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f13392b.d());
            }
            tVar.y(eVar.f13392b, arrayList);
        } else {
            if (eVar.a() != t1.b.ENUM) {
                switch (a.f13308a[eVar.a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(f1Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(f1Var.readFloat());
                        break;
                    case 3:
                        H = f1Var.H();
                        valueOf = Long.valueOf(H);
                        break;
                    case 4:
                        H = f1Var.s();
                        valueOf = Long.valueOf(H);
                        break;
                    case 5:
                        p10 = f1Var.p();
                        valueOf = Integer.valueOf(p10);
                        break;
                    case 6:
                        H = f1Var.b();
                        valueOf = Long.valueOf(H);
                        break;
                    case 7:
                        p10 = f1Var.u();
                        valueOf = Integer.valueOf(p10);
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(f1Var.e());
                        break;
                    case 9:
                        p10 = f1Var.h();
                        valueOf = Integer.valueOf(p10);
                        break;
                    case 10:
                        p10 = f1Var.E();
                        valueOf = Integer.valueOf(p10);
                        break;
                    case 11:
                        H = f1Var.f();
                        valueOf = Long.valueOf(H);
                        break;
                    case 12:
                        p10 = f1Var.l();
                        valueOf = Integer.valueOf(p10);
                        break;
                    case 13:
                        H = f1Var.y();
                        valueOf = Long.valueOf(H);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = f1Var.o();
                        break;
                    case 16:
                        valueOf = f1Var.z();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object i11 = tVar.i(eVar.f13392b);
                            if (i11 instanceof x) {
                                g1 d10 = c1.a().d(i11);
                                if (!((x) i11).N()) {
                                    Object e10 = d10.e();
                                    d10.a(e10, i11);
                                    tVar.y(eVar.f13392b, e10);
                                    i11 = e10;
                                }
                                f1Var.O(i11, d10, oVar);
                                return ub2;
                            }
                        }
                        valueOf = f1Var.L(eVar.b().getClass(), oVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object i12 = tVar.i(eVar.f13392b);
                            if (i12 instanceof x) {
                                g1 d11 = c1.a().d(i12);
                                if (!((x) i12).N()) {
                                    Object e11 = d11.e();
                                    d11.a(e11, i12);
                                    tVar.y(eVar.f13392b, e11);
                                    i12 = e11;
                                }
                                f1Var.P(i12, d11, oVar);
                                return ub2;
                            }
                        }
                        valueOf = f1Var.N(eVar.b().getClass(), oVar);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int p11 = f1Var.p();
                if (eVar.f13392b.h().a(p11) == null) {
                    return (UB) i1.L(obj, c10, p11, ub2, n1Var);
                }
                valueOf = Integer.valueOf(p11);
            }
            if (eVar.d()) {
                tVar.a(eVar.f13392b, valueOf);
            } else {
                int i13 = a.f13308a[eVar.a().ordinal()];
                if ((i13 == 17 || i13 == 18) && (i10 = tVar.i(eVar.f13392b)) != null) {
                    valueOf = z.h(i10, valueOf);
                }
                tVar.y(eVar.f13392b, valueOf);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void h(f1 f1Var, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        tVar.y(eVar.f13392b, f1Var.N(eVar.b().getClass(), oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void i(g gVar, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        r0.a d10 = eVar.b().d();
        h s10 = gVar.s();
        d10.c0(s10, oVar);
        tVar.y(eVar.f13392b, d10.f());
        s10.a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void j(u1 u1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        if (!dVar.c()) {
            switch (a.f13308a[dVar.d().ordinal()]) {
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
                    u1Var.L(dVar.a(), (g) entry.getValue());
                    return;
                case 16:
                    u1Var.e(dVar.a(), (String) entry.getValue());
                    return;
                case 17:
                    u1Var.K(dVar.a(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    return;
                case 18:
                    u1Var.N(dVar.a(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f13308a[dVar.d().ordinal()]) {
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
                i1.U(dVar.a(), (List) entry.getValue(), u1Var, c1.a().c(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                i1.X(dVar.a(), (List) entry.getValue(), u1Var, c1.a().c(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
