package com.google.protobuf;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6621t1;
import com.google.protobuf.InterfaceC6614r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.q */
/* loaded from: classes2.dex */
final class C6610q extends AbstractC6607p<AbstractC6629x.d> {

    /* renamed from: com.google.protobuf.q$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14582a;

        static {
            int[] iArr = new int[C6621t1.b.values().length];
            f14582a = iArr;
            try {
                iArr[C6621t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14582a[C6621t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14582a[C6621t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14582a[C6621t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14582a[C6621t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14582a[C6621t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14582a[C6621t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14582a[C6621t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14582a[C6621t1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14582a[C6621t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14582a[C6621t1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14582a[C6621t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14582a[C6621t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14582a[C6621t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14582a[C6621t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14582a[C6621t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14582a[C6621t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14582a[C6621t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: a */
    public int mo18996a(Map.Entry<?, ?> entry) {
        return ((AbstractC6629x.d) entry.getKey()).mo19176a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: b */
    public Object mo18997b(C6604o c6604o, InterfaceC6614r0 interfaceC6614r0, int i10) {
        return c6604o.m18974a(interfaceC6614r0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: c */
    public C6619t<AbstractC6629x.d> mo18998c(Object obj) {
        return ((AbstractC6629x.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: d */
    public C6619t<AbstractC6629x.d> mo18999d(Object obj) {
        return ((AbstractC6629x.c) obj).m19325Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: e */
    public boolean mo19000e(InterfaceC6614r0 interfaceC6614r0) {
        return interfaceC6614r0 instanceof AbstractC6629x.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: f */
    public void mo19001f(Object obj) {
        mo18998c(obj).m19173u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0105. Please report as an issue. */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: g */
    public <UT, UB> UB mo19002g(Object obj, InterfaceC6579f1 interfaceC6579f1, Object obj2, C6604o c6604o, C6619t<AbstractC6629x.d> c6619t, UB ub2, AbstractC6603n1<UT, UB> abstractC6603n1) {
        Object valueOf;
        long mo18472H;
        int mo18496p;
        Object m19166i;
        ArrayList arrayList;
        AbstractC6629x.e eVar = (AbstractC6629x.e) obj2;
        int m19330c = eVar.m19330c();
        if (eVar.f14666b.mo19177c() && eVar.f14666b.mo19180f()) {
            switch (a.f14582a[eVar.m19328a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18471G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18467C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18489i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18487g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18503w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18497q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18504x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18493m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18500t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18483c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18502v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18498r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18484d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC6579f1.mo18490j(arrayList);
                    ub2 = (UB) C6588i1.m18704z(obj, m19330c, arrayList, eVar.f14666b.m19327h(), ub2, abstractC6603n1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f14666b.mo19178d());
            }
            c6619t.m19175y(eVar.f14666b, arrayList);
        } else {
            if (eVar.m19328a() != C6621t1.b.ENUM) {
                switch (a.f14582a[eVar.m19328a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC6579f1.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC6579f1.readFloat());
                        break;
                    case 3:
                        mo18472H = interfaceC6579f1.mo18472H();
                        valueOf = Long.valueOf(mo18472H);
                        break;
                    case 4:
                        mo18472H = interfaceC6579f1.mo18499s();
                        valueOf = Long.valueOf(mo18472H);
                        break;
                    case 5:
                        mo18496p = interfaceC6579f1.mo18496p();
                        valueOf = Integer.valueOf(mo18496p);
                        break;
                    case 6:
                        mo18472H = interfaceC6579f1.mo18482b();
                        valueOf = Long.valueOf(mo18472H);
                        break;
                    case 7:
                        mo18496p = interfaceC6579f1.mo18501u();
                        valueOf = Integer.valueOf(mo18496p);
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC6579f1.mo18485e());
                        break;
                    case 9:
                        mo18496p = interfaceC6579f1.mo18488h();
                        valueOf = Integer.valueOf(mo18496p);
                        break;
                    case 10:
                        mo18496p = interfaceC6579f1.mo18469E();
                        valueOf = Integer.valueOf(mo18496p);
                        break;
                    case 11:
                        mo18472H = interfaceC6579f1.mo18486f();
                        valueOf = Long.valueOf(mo18472H);
                        break;
                    case 12:
                        mo18496p = interfaceC6579f1.mo18492l();
                        valueOf = Integer.valueOf(mo18496p);
                        break;
                    case 13:
                        mo18472H = interfaceC6579f1.mo18505y();
                        valueOf = Long.valueOf(mo18472H);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC6579f1.mo18495o();
                        break;
                    case 16:
                        valueOf = interfaceC6579f1.mo18506z();
                        break;
                    case 17:
                        if (!eVar.m19331d()) {
                            Object m19166i2 = c6619t.m19166i(eVar.f14666b);
                            if (m19166i2 instanceof AbstractC6629x) {
                                InterfaceC6582g1 m18419d = C6570c1.m18416a().m18419d(m19166i2);
                                if (!((AbstractC6629x) m19166i2).m19301N()) {
                                    Object mo18544e = m18419d.mo18544e();
                                    m18419d.mo18540a(mo18544e, m19166i2);
                                    c6619t.m19175y(eVar.f14666b, mo18544e);
                                    m19166i2 = mo18544e;
                                }
                                interfaceC6579f1.mo18479O(m19166i2, m18419d, c6604o);
                                return ub2;
                            }
                        }
                        valueOf = interfaceC6579f1.mo18476L(eVar.m19329b().getClass(), c6604o);
                        break;
                    case 18:
                        if (!eVar.m19331d()) {
                            Object m19166i3 = c6619t.m19166i(eVar.f14666b);
                            if (m19166i3 instanceof AbstractC6629x) {
                                InterfaceC6582g1 m18419d2 = C6570c1.m18416a().m18419d(m19166i3);
                                if (!((AbstractC6629x) m19166i3).m19301N()) {
                                    Object mo18544e2 = m18419d2.mo18544e();
                                    m18419d2.mo18540a(mo18544e2, m19166i3);
                                    c6619t.m19175y(eVar.f14666b, mo18544e2);
                                    m19166i3 = mo18544e2;
                                }
                                interfaceC6579f1.mo18480P(m19166i3, m18419d2, c6604o);
                                return ub2;
                            }
                        }
                        valueOf = interfaceC6579f1.mo18478N(eVar.m19329b().getClass(), c6604o);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int mo18496p2 = interfaceC6579f1.mo18496p();
                if (eVar.f14666b.m19327h().mo19358a(mo18496p2) == null) {
                    return (UB) C6588i1.m18659L(obj, m19330c, mo18496p2, ub2, abstractC6603n1);
                }
                valueOf = Integer.valueOf(mo18496p2);
            }
            if (eVar.m19331d()) {
                c6619t.m19163a(eVar.f14666b, valueOf);
            } else {
                int i10 = a.f14582a[eVar.m19328a().ordinal()];
                if ((i10 == 17 || i10 == 18) && (m19166i = c6619t.m19166i(eVar.f14666b)) != null) {
                    valueOf = C6633z.m19354h(m19166i, valueOf);
                }
                c6619t.m19175y(eVar.f14666b, valueOf);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: h */
    public void mo19003h(InterfaceC6579f1 interfaceC6579f1, Object obj, C6604o c6604o, C6619t<AbstractC6629x.d> c6619t) {
        AbstractC6629x.e eVar = (AbstractC6629x.e) obj;
        c6619t.m19175y(eVar.f14666b, interfaceC6579f1.mo18478N(eVar.m19329b().getClass(), c6604o));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: i */
    public void mo19004i(AbstractC6580g abstractC6580g, Object obj, C6604o c6604o, C6619t<AbstractC6629x.d> c6619t) {
        AbstractC6629x.e eVar = (AbstractC6629x.e) obj;
        InterfaceC6614r0.a mo19034d = eVar.m19329b().mo19034d();
        AbstractC6583h mo18525s = abstractC6580g.mo18525s();
        mo19034d.mo19037c0(mo18525s, c6604o);
        c6619t.m19175y(eVar.f14666b, mo19034d.mo19038f());
        mo18525s.mo18562a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.AbstractC6607p
    /* renamed from: j */
    public void mo19005j(InterfaceC6624u1 interfaceC6624u1, Map.Entry<?, ?> entry) {
        AbstractC6629x.d dVar = (AbstractC6629x.d) entry.getKey();
        if (!dVar.mo19177c()) {
            switch (a.f14582a[dVar.mo19178d().ordinal()]) {
                case 1:
                    interfaceC6624u1.mo18894p(dVar.mo19176a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    interfaceC6624u1.mo18865B(dVar.mo19176a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    interfaceC6624u1.mo18899u(dVar.mo19176a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    interfaceC6624u1.mo18884f(dVar.mo19176a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    interfaceC6624u1.mo18886h(dVar.mo19176a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    interfaceC6624u1.mo18897s(dVar.mo19176a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    interfaceC6624u1.mo18881c(dVar.mo19176a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    interfaceC6624u1.mo18900v(dVar.mo19176a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    interfaceC6624u1.mo18893o(dVar.mo19176a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    interfaceC6624u1.mo18901w(dVar.mo19176a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    interfaceC6624u1.mo18887i(dVar.mo19176a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    interfaceC6624u1.mo18871H(dVar.mo19176a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    interfaceC6624u1.mo18891m(dVar.mo19176a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    interfaceC6624u1.mo18875L(dVar.mo19176a(), (AbstractC6580g) entry.getValue());
                    return;
                case 16:
                    interfaceC6624u1.mo18883e(dVar.mo19176a(), (String) entry.getValue());
                    return;
                case 17:
                    interfaceC6624u1.mo18874K(dVar.mo19176a(), entry.getValue(), C6570c1.m18416a().m18418c(entry.getValue().getClass()));
                    return;
                case 18:
                    interfaceC6624u1.mo18877N(dVar.mo19176a(), entry.getValue(), C6570c1.m18416a().m18418c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f14582a[dVar.mo19178d().ordinal()]) {
            case 1:
                C6588i1.m18663P(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 2:
                C6588i1.m18667T(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 3:
                C6588i1.m18670W(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 4:
                C6588i1.m18683e0(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 5:
            case 14:
                C6588i1.m18669V(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 6:
                C6588i1.m18666S(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 7:
                C6588i1.m18665R(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 8:
                C6588i1.m18661N(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 9:
                C6588i1.m18681d0(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 10:
                C6588i1.m18672Y(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 11:
                C6588i1.m18673Z(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 12:
                C6588i1.m18675a0(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 13:
                C6588i1.m18677b0(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, dVar.mo19180f());
                return;
            case 15:
                C6588i1.m18662O(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1);
                return;
            case 16:
                C6588i1.m18679c0(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                C6588i1.m18668U(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, C6570c1.m18416a().m18418c(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                C6588i1.m18671X(dVar.mo19176a(), (List) entry.getValue(), interfaceC6624u1, C6570c1.m18416a().m18418c(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
