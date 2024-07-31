package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C6008t1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.r */
/* loaded from: classes2.dex */
final class C6000r extends AbstractC5997q<AbstractC6018y.d> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.r$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12707a;

        static {
            int[] iArr = new int[C6008t1.b.values().length];
            f12707a = iArr;
            try {
                iArr[C6008t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12707a[C6008t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12707a[C6008t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12707a[C6008t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12707a[C6008t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12707a[C6008t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12707a[C6008t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12707a[C6008t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12707a[C6008t1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12707a[C6008t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12707a[C6008t1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12707a[C6008t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12707a[C6008t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12707a[C6008t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12707a[C6008t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12707a[C6008t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12707a[C6008t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12707a[C6008t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: a */
    public int mo15950a(Map.Entry<?, ?> entry) {
        return ((AbstractC6018y.d) entry.getKey()).mo16121a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: b */
    public Object mo15951b(C5994p c5994p, InterfaceC6001r0 interfaceC6001r0, int i10) {
        return c5994p.m15933a(interfaceC6001r0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: c */
    public C6009u<AbstractC6018y.d> mo15952c(Object obj) {
        return ((AbstractC6018y.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: d */
    public C6009u<AbstractC6018y.d> mo15953d(Object obj) {
        return ((AbstractC6018y.c) obj).m16265V();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: e */
    public boolean mo15954e(InterfaceC6001r0 interfaceC6001r0) {
        return interfaceC6001r0 instanceof AbstractC6018y.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: f */
    public void mo15955f(Object obj) {
        mo15952c(obj).m16118t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0105. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: g */
    public <UT, UB> UB mo15956g(Object obj, InterfaceC5966f1 interfaceC5966f1, Object obj2, C5994p c5994p, C6009u<AbstractC6018y.d> c6009u, UB ub2, AbstractC5990n1<UT, UB> abstractC5990n1) {
        Object valueOf;
        long mo15434H;
        int mo15458p;
        Object m16111i;
        ArrayList arrayList;
        AbstractC6018y.e eVar = (AbstractC6018y.e) obj2;
        int m16270c = eVar.m16270c();
        if (eVar.f12785b.mo16122c() && eVar.f12785b.mo16125f()) {
            switch (a.f12707a[eVar.m16268a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15433G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15429C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15451i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15449g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15465w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15459q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15466x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15455m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15462t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15445c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15464v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15460r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15446d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC5966f1.mo15452j(arrayList);
                    ub2 = (UB) C5975i1.m15656z(obj, m16270c, arrayList, eVar.f12785b.m16267h(), ub2, abstractC5990n1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f12785b.mo16123d());
            }
            c6009u.m16120x(eVar.f12785b, arrayList);
        } else {
            if (eVar.m16268a() != C6008t1.b.ENUM) {
                switch (a.f12707a[eVar.m16268a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC5966f1.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC5966f1.readFloat());
                        break;
                    case 3:
                        mo15434H = interfaceC5966f1.mo15434H();
                        valueOf = Long.valueOf(mo15434H);
                        break;
                    case 4:
                        mo15434H = interfaceC5966f1.mo15461s();
                        valueOf = Long.valueOf(mo15434H);
                        break;
                    case 5:
                        mo15458p = interfaceC5966f1.mo15458p();
                        valueOf = Integer.valueOf(mo15458p);
                        break;
                    case 6:
                        mo15434H = interfaceC5966f1.mo15444b();
                        valueOf = Long.valueOf(mo15434H);
                        break;
                    case 7:
                        mo15458p = interfaceC5966f1.mo15463u();
                        valueOf = Integer.valueOf(mo15458p);
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC5966f1.mo15447e());
                        break;
                    case 9:
                        mo15458p = interfaceC5966f1.mo15450h();
                        valueOf = Integer.valueOf(mo15458p);
                        break;
                    case 10:
                        mo15458p = interfaceC5966f1.mo15431E();
                        valueOf = Integer.valueOf(mo15458p);
                        break;
                    case 11:
                        mo15434H = interfaceC5966f1.mo15448f();
                        valueOf = Long.valueOf(mo15434H);
                        break;
                    case 12:
                        mo15458p = interfaceC5966f1.mo15454l();
                        valueOf = Integer.valueOf(mo15458p);
                        break;
                    case 13:
                        mo15434H = interfaceC5966f1.mo15467y();
                        valueOf = Long.valueOf(mo15434H);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC5966f1.mo15457o();
                        break;
                    case 16:
                        valueOf = interfaceC5966f1.mo15468z();
                        break;
                    case 17:
                        if (!eVar.m16271d()) {
                            Object m16111i2 = c6009u.m16111i(eVar.f12785b);
                            if (m16111i2 instanceof AbstractC6018y) {
                                InterfaceC5969g1 m15341d = C5957c1.m15338a().m15341d(m16111i2);
                                if (!((AbstractC6018y) m16111i2).m16237F()) {
                                    Object mo15474e = m15341d.mo15474e();
                                    m15341d.mo15470a(mo15474e, m16111i2);
                                    c6009u.m16120x(eVar.f12785b, mo15474e);
                                    m16111i2 = mo15474e;
                                }
                                interfaceC5966f1.mo15436J(m16111i2, m15341d, c5994p);
                                return ub2;
                            }
                        }
                        valueOf = interfaceC5966f1.mo15437K(eVar.m16269b().getClass(), c5994p);
                        break;
                    case 18:
                        if (!eVar.m16271d()) {
                            Object m16111i3 = c6009u.m16111i(eVar.f12785b);
                            if (m16111i3 instanceof AbstractC6018y) {
                                InterfaceC5969g1 m15341d2 = C5957c1.m15338a().m15341d(m16111i3);
                                if (!((AbstractC6018y) m16111i3).m16237F()) {
                                    Object mo15474e2 = m15341d2.mo15474e();
                                    m15341d2.mo15470a(mo15474e2, m16111i3);
                                    c6009u.m16120x(eVar.f12785b, mo15474e2);
                                    m16111i3 = mo15474e2;
                                }
                                interfaceC5966f1.mo15439M(m16111i3, m15341d2, c5994p);
                                return ub2;
                            }
                        }
                        valueOf = interfaceC5966f1.mo15441O(eVar.m16269b().getClass(), c5994p);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int mo15458p2 = interfaceC5966f1.mo15458p();
                if (eVar.f12785b.m16267h().mo15313a(mo15458p2) == null) {
                    return (UB) C5975i1.m15611L(obj, m16270c, mo15458p2, ub2, abstractC5990n1);
                }
                valueOf = Integer.valueOf(mo15458p2);
            }
            if (eVar.m16271d()) {
                c6009u.m16108a(eVar.f12785b, valueOf);
            } else {
                int i10 = a.f12707a[eVar.m16268a().ordinal()];
                if ((i10 == 17 || i10 == 18) && (m16111i = c6009u.m16111i(eVar.f12785b)) != null) {
                    valueOf = C5950a0.m15309h(m16111i, valueOf);
                }
                c6009u.m16120x(eVar.f12785b, valueOf);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: h */
    public void mo15957h(InterfaceC5966f1 interfaceC5966f1, Object obj, C5994p c5994p, C6009u<AbstractC6018y.d> c6009u) {
        AbstractC6018y.e eVar = (AbstractC6018y.e) obj;
        c6009u.m16120x(eVar.f12785b, interfaceC5966f1.mo15441O(eVar.m16269b().getClass(), c5994p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: i */
    public void mo15958i(AbstractC5970h abstractC5970h, Object obj, C5994p c5994p, C6009u<AbstractC6018y.d> c6009u) {
        AbstractC6018y.e eVar = (AbstractC6018y.e) obj;
        InterfaceC6001r0.a mo15969d = eVar.m16269b().mo15969d();
        AbstractC5973i mo15498s = abstractC5970h.mo15498s();
        mo15969d.mo15972H0(mo15498s, c5994p);
        c6009u.m16120x(eVar.f12785b, mo15969d.mo15973f());
        mo15498s.mo15534a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5997q
    /* renamed from: j */
    public void mo15959j(InterfaceC6011u1 interfaceC6011u1, Map.Entry<?, ?> entry) {
        AbstractC6018y.d dVar = (AbstractC6018y.d) entry.getKey();
        if (!dVar.mo16122c()) {
            switch (a.f12707a[dVar.mo16123d().ordinal()]) {
                case 1:
                    interfaceC6011u1.mo15839p(dVar.mo16121a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    interfaceC6011u1.mo15810B(dVar.mo16121a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    interfaceC6011u1.mo15844u(dVar.mo16121a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    interfaceC6011u1.mo15829f(dVar.mo16121a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    interfaceC6011u1.mo15831h(dVar.mo16121a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    interfaceC6011u1.mo15842s(dVar.mo16121a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    interfaceC6011u1.mo15826c(dVar.mo16121a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    interfaceC6011u1.mo15845v(dVar.mo16121a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    interfaceC6011u1.mo15838o(dVar.mo16121a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    interfaceC6011u1.mo15846w(dVar.mo16121a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    interfaceC6011u1.mo15832i(dVar.mo16121a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    interfaceC6011u1.mo15816H(dVar.mo16121a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    interfaceC6011u1.mo15836m(dVar.mo16121a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    interfaceC6011u1.mo15821M(dVar.mo16121a(), (AbstractC5970h) entry.getValue());
                    return;
                case 16:
                    interfaceC6011u1.mo15828e(dVar.mo16121a(), (String) entry.getValue());
                    return;
                case 17:
                    interfaceC6011u1.mo15819K(dVar.mo16121a(), entry.getValue(), C5957c1.m15338a().m15340c(entry.getValue().getClass()));
                    return;
                case 18:
                    interfaceC6011u1.mo15822N(dVar.mo16121a(), entry.getValue(), C5957c1.m15338a().m15340c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f12707a[dVar.mo16123d().ordinal()]) {
            case 1:
                C5975i1.m15615P(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 2:
                C5975i1.m15619T(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 3:
                C5975i1.m15622W(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 4:
                C5975i1.m15635e0(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 5:
            case 14:
                C5975i1.m15621V(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 6:
                C5975i1.m15618S(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 7:
                C5975i1.m15617R(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 8:
                C5975i1.m15613N(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 9:
                C5975i1.m15633d0(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 10:
                C5975i1.m15624Y(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 11:
                C5975i1.m15625Z(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 12:
                C5975i1.m15627a0(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 13:
                C5975i1.m15629b0(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, dVar.mo16125f());
                return;
            case 15:
                C5975i1.m15614O(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1);
                return;
            case 16:
                C5975i1.m15631c0(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                C5975i1.m15620U(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, C5957c1.m15338a().m15340c(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                C5975i1.m15623X(dVar.mo16121a(), (List) entry.getValue(), interfaceC6011u1, C5957c1.m15338a().m15340c(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
