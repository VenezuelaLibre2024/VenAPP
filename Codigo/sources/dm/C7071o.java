package dm;

import dk.AbstractC7001c;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9315g;

/* renamed from: dm.o */
/* loaded from: classes3.dex */
public final class C7071o extends AbstractC7001c<C7061e> implements RandomAccess {

    /* renamed from: d */
    public static final a f15669d = new a(null);

    /* renamed from: b */
    private final C7061e[] f15670b;

    /* renamed from: c */
    private final int[] f15671c;

    /* renamed from: dm.o$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final void m20825a(long j10, C7056b c7056b, int i10, List<? extends C7061e> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            C7056b c7056b2;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(list.get(i18).m20756B() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C7061e c7061e = list.get(i11);
            C7061e c7061e2 = list.get(i12 - 1);
            int i19 = -1;
            if (i17 == c7061e.m20756B()) {
                int intValue = list2.get(i11).intValue();
                int i20 = i11 + 1;
                C7061e c7061e3 = list.get(i20);
                i13 = i20;
                i14 = intValue;
                c7061e = c7061e3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c7061e.m20765m(i17) == c7061e2.m20765m(i17)) {
                int min = Math.min(c7061e.m20756B(), c7061e2.m20756B());
                int i21 = 0;
                for (int i22 = i17; i22 < min && c7061e.m20765m(i22) == c7061e2.m20765m(i22); i22++) {
                    i21++;
                }
                long m20827c = j10 + m20827c(c7056b) + 2 + i21 + 1;
                c7056b.writeInt(-i21);
                c7056b.writeInt(i14);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    c7056b.writeInt(c7061e.m20765m(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i23 == list.get(i13).m20756B())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c7056b.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    C7056b c7056b3 = new C7056b();
                    c7056b.writeInt(((int) (m20827c(c7056b3) + m20827c)) * (-1));
                    m20825a(m20827c, c7056b3, i23, list, i13, i12, list2);
                    c7056b.mo20693E0(c7056b3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (list.get(i25 - 1).m20765m(i17) != list.get(i25).m20765m(i17)) {
                    i24++;
                }
            }
            long m20827c2 = j10 + m20827c(c7056b) + 2 + (i24 * 2);
            c7056b.writeInt(i24);
            c7056b.writeInt(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte m20765m = list.get(i26).m20765m(i17);
                if (i26 == i13 || m20765m != list.get(i26 - 1).m20765m(i17)) {
                    c7056b.writeInt(m20765m & 255);
                }
            }
            C7056b c7056b4 = new C7056b();
            while (i13 < i12) {
                byte m20765m2 = list.get(i13).m20765m(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (m20765m2 != list.get(i28).m20765m(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == list.get(i13).m20756B()) {
                    c7056b.writeInt(list2.get(i13).intValue());
                    i16 = i15;
                    c7056b2 = c7056b4;
                } else {
                    c7056b.writeInt(((int) (m20827c2 + m20827c(c7056b4))) * i19);
                    i16 = i15;
                    c7056b2 = c7056b4;
                    m20825a(m20827c2, c7056b4, i17 + 1, list, i13, i15, list2);
                }
                c7056b4 = c7056b2;
                i13 = i16;
                i19 = -1;
            }
            c7056b.mo20693E0(c7056b4);
        }

        /* renamed from: b */
        static /* synthetic */ void m20826b(a aVar, long j10, C7056b c7056b, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.m20825a((i13 & 1) != 0 ? 0L : j10, c7056b, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        /* renamed from: c */
        private final long m20827c(C7056b c7056b) {
            return c7056b.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
        
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final dm.C7071o m20828d(dm.C7061e... r17) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dm.C7071o.a.m20828d(dm.e[]):dm.o");
        }
    }

    private C7071o(C7061e[] c7061eArr, int[] iArr) {
        this.f15670b = c7061eArr;
        this.f15671c = iArr;
    }

    public /* synthetic */ C7071o(C7061e[] c7061eArr, int[] iArr, C9315g c9315g) {
        this(c7061eArr, iArr);
    }

    @Override // dk.AbstractC6997a
    /* renamed from: c */
    public int mo20314c() {
        return this.f15670b.length;
    }

    @Override // dk.AbstractC6997a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C7061e) {
            return m20819d((C7061e) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean m20819d(C7061e c7061e) {
        return super.contains(c7061e);
    }

    @Override // dk.AbstractC7001c, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7061e get(int i10) {
        return this.f15670b[i10];
    }

    @Override // dk.AbstractC7001c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C7061e) {
            return m20823m((C7061e) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public final C7061e[] m20821k() {
        return this.f15670b;
    }

    /* renamed from: l */
    public final int[] m20822l() {
        return this.f15671c;
    }

    @Override // dk.AbstractC7001c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C7061e) {
            return m20824n((C7061e) obj);
        }
        return -1;
    }

    /* renamed from: m */
    public /* bridge */ int m20823m(C7061e c7061e) {
        return super.indexOf(c7061e);
    }

    /* renamed from: n */
    public /* bridge */ int m20824n(C7061e c7061e) {
        return super.lastIndexOf(c7061e);
    }
}
