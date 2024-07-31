package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1215y;
import androidx.datastore.preferences.protobuf.C1205t1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.r */
/* loaded from: classes.dex */
final class C1197r extends AbstractC1194q<AbstractC1215y.d> {

    /* renamed from: androidx.datastore.preferences.protobuf.r$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4960a;

        static {
            int[] iArr = new int[C1205t1.b.values().length];
            f4960a = iArr;
            try {
                iArr[C1205t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4960a[C1205t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4960a[C1205t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4960a[C1205t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4960a[C1205t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4960a[C1205t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4960a[C1205t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4960a[C1205t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4960a[C1205t1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4960a[C1205t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4960a[C1205t1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4960a[C1205t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4960a[C1205t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4960a[C1205t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4960a[C1205t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4960a[C1205t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4960a[C1205t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4960a[C1205t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: a */
    public int mo6291a(Map.Entry<?, ?> entry) {
        return ((AbstractC1215y.d) entry.getKey()).mo6458a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: b */
    public Object mo6292b(C1191p c1191p, InterfaceC1198r0 interfaceC1198r0, int i10) {
        return c1191p.m6274a(interfaceC1198r0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: c */
    public C1206u<AbstractC1215y.d> mo6293c(Object obj) {
        return ((AbstractC1215y.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: d */
    public C1206u<AbstractC1215y.d> mo6294d(Object obj) {
        return ((AbstractC1215y.c) obj).m6571J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: e */
    public boolean mo6295e(InterfaceC1198r0 interfaceC1198r0) {
        return interfaceC1198r0 instanceof AbstractC1215y.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: f */
    public void mo6296f(Object obj) {
        mo6293c(obj).m6455t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00e6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <UT, UB> UB mo6297g(androidx.datastore.preferences.protobuf.InterfaceC1163f1 r4, java.lang.Object r5, androidx.datastore.preferences.protobuf.C1191p r6, androidx.datastore.preferences.protobuf.C1206u<androidx.datastore.preferences.protobuf.AbstractC1215y.d> r7, UB r8, androidx.datastore.preferences.protobuf.AbstractC1187n1<UT, UB> r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1197r.mo6297g(androidx.datastore.preferences.protobuf.f1, java.lang.Object, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.u, java.lang.Object, androidx.datastore.preferences.protobuf.n1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: h */
    public void mo6298h(InterfaceC1163f1 interfaceC1163f1, Object obj, C1191p c1191p, C1206u<AbstractC1215y.d> c1206u) {
        AbstractC1215y.e eVar = (AbstractC1215y.e) obj;
        c1206u.m6457x(eVar.f5038b, interfaceC1163f1.mo5726M(eVar.m6575b().getClass(), c1191p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: i */
    public void mo6299i(AbstractC1167h abstractC1167h, Object obj, C1191p c1191p, C1206u<AbstractC1215y.d> c1206u) {
        AbstractC1215y.e eVar = (AbstractC1215y.e) obj;
        InterfaceC1198r0 mo6313f = eVar.m6575b().mo6310d().mo6313f();
        AbstractC1158e m5693Q = AbstractC1158e.m5693Q(ByteBuffer.wrap(abstractC1167h.m5822w()), true);
        C1154c1.m5677a().m5678b(mo6313f, m5693Q, c1191p);
        c1206u.m6457x(eVar.f5038b, mo6313f);
        if (m5693Q.mo5714A() != Integer.MAX_VALUE) {
            throw C1150b0.m5664a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1194q
    /* renamed from: j */
    public void mo6300j(InterfaceC1208u1 interfaceC1208u1, Map.Entry<?, ?> entry) {
        AbstractC1215y.d dVar = (AbstractC1215y.d) entry.getKey();
        if (!dVar.mo6459c()) {
            switch (a.f4960a[dVar.mo6460d().ordinal()]) {
                case 1:
                    interfaceC1208u1.mo6180p(dVar.mo6458a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    interfaceC1208u1.mo6151B(dVar.mo6458a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    interfaceC1208u1.mo6185u(dVar.mo6458a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    interfaceC1208u1.mo6170f(dVar.mo6458a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    interfaceC1208u1.mo6172h(dVar.mo6458a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    interfaceC1208u1.mo6183s(dVar.mo6458a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    interfaceC1208u1.mo6167c(dVar.mo6458a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    interfaceC1208u1.mo6186v(dVar.mo6458a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    interfaceC1208u1.mo6179o(dVar.mo6458a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    interfaceC1208u1.mo6187w(dVar.mo6458a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    interfaceC1208u1.mo6173i(dVar.mo6458a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    interfaceC1208u1.mo6157H(dVar.mo6458a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    interfaceC1208u1.mo6177m(dVar.mo6458a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    interfaceC1208u1.mo6160K(dVar.mo6458a(), (AbstractC1167h) entry.getValue());
                    return;
                case 16:
                    interfaceC1208u1.mo6169e(dVar.mo6458a(), (String) entry.getValue());
                    return;
                case 17:
                    interfaceC1208u1.mo6163N(dVar.mo6458a(), entry.getValue(), C1154c1.m5677a().m5680d(entry.getValue().getClass()));
                    return;
                case 18:
                    interfaceC1208u1.mo6161L(dVar.mo6458a(), entry.getValue(), C1154c1.m5677a().m5680d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f4960a[dVar.mo6460d().ordinal()]) {
            case 1:
                C1172i1.m5932P(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 2:
                C1172i1.m5936T(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 3:
                C1172i1.m5939W(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 4:
                C1172i1.m5952e0(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 5:
            case 14:
                C1172i1.m5938V(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 6:
                C1172i1.m5935S(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 7:
                C1172i1.m5934R(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 8:
                C1172i1.m5930N(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 9:
                C1172i1.m5950d0(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 10:
                C1172i1.m5941Y(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 11:
                C1172i1.m5942Z(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 12:
                C1172i1.m5944a0(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 13:
                C1172i1.m5946b0(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, dVar.mo6462f());
                return;
            case 15:
                C1172i1.m5931O(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1);
                return;
            case 16:
                C1172i1.m5948c0(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                C1172i1.m5937U(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, C1154c1.m5677a().m5680d(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                C1172i1.m5940X(dVar.mo6458a(), (List) entry.getValue(), interfaceC1208u1, C1154c1.m5677a().m5680d(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
