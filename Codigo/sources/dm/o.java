package dm;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class o extends dk.c<e> implements RandomAccess {

    /* renamed from: d */
    public static final a f14311d = new a(null);

    /* renamed from: b */
    private final e[] f14312b;

    /* renamed from: c */
    private final int[] f14313c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final void a(long j10, b bVar, int i10, List<? extends e> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            b bVar2;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(list.get(i18).B() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            e eVar = list.get(i11);
            e eVar2 = list.get(i12 - 1);
            int i19 = -1;
            if (i17 == eVar.B()) {
                int intValue = list2.get(i11).intValue();
                int i20 = i11 + 1;
                e eVar3 = list.get(i20);
                i13 = i20;
                i14 = intValue;
                eVar = eVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (eVar.m(i17) == eVar2.m(i17)) {
                int min = Math.min(eVar.B(), eVar2.B());
                int i21 = 0;
                for (int i22 = i17; i22 < min && eVar.m(i22) == eVar2.m(i22); i22++) {
                    i21++;
                }
                long c10 = j10 + c(bVar) + 2 + i21 + 1;
                bVar.writeInt(-i21);
                bVar.writeInt(i14);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    bVar.writeInt(eVar.m(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i23 == list.get(i13).B())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    bVar.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    b bVar3 = new b();
                    bVar.writeInt(((int) (c(bVar3) + c10)) * (-1));
                    a(c10, bVar3, i23, list, i13, i12, list2);
                    bVar.E0(bVar3);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i13 + 1; i25 < i12; i25++) {
                if (list.get(i25 - 1).m(i17) != list.get(i25).m(i17)) {
                    i24++;
                }
            }
            long c11 = j10 + c(bVar) + 2 + (i24 * 2);
            bVar.writeInt(i24);
            bVar.writeInt(i14);
            for (int i26 = i13; i26 < i12; i26++) {
                byte m10 = list.get(i26).m(i17);
                if (i26 == i13 || m10 != list.get(i26 - 1).m(i17)) {
                    bVar.writeInt(m10 & 255);
                }
            }
            b bVar4 = new b();
            while (i13 < i12) {
                byte m11 = list.get(i13).m(i17);
                int i27 = i13 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (m11 != list.get(i28).m(i17)) {
                            i15 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i15 && i17 + 1 == list.get(i13).B()) {
                    bVar.writeInt(list2.get(i13).intValue());
                    i16 = i15;
                    bVar2 = bVar4;
                } else {
                    bVar.writeInt(((int) (c11 + c(bVar4))) * i19);
                    i16 = i15;
                    bVar2 = bVar4;
                    a(c11, bVar4, i17 + 1, list, i13, i15, list2);
                }
                bVar4 = bVar2;
                i13 = i16;
                i19 = -1;
            }
            bVar.E0(bVar4);
        }

        static /* synthetic */ void b(a aVar, long j10, b bVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, bVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(b bVar) {
            return bVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final dm.o d(dm.e... r17) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dm.o.a.d(dm.e[]):dm.o");
        }
    }

    private o(e[] eVarArr, int[] iArr) {
        this.f14312b = eVarArr;
        this.f14313c = iArr;
    }

    public /* synthetic */ o(e[] eVarArr, int[] iArr, kotlin.jvm.internal.g gVar) {
        this(eVarArr, iArr);
    }

    @Override // dk.a
    public int c() {
        return this.f14312b.length;
    }

    @Override // dk.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return d((e) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(e eVar) {
        return super.contains(eVar);
    }

    @Override // dk.c, java.util.List
    /* renamed from: f */
    public e get(int i10) {
        return this.f14312b[i10];
    }

    @Override // dk.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e) {
            return m((e) obj);
        }
        return -1;
    }

    public final e[] k() {
        return this.f14312b;
    }

    public final int[] l() {
        return this.f14313c;
    }

    @Override // dk.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e) {
            return n((e) obj);
        }
        return -1;
    }

    public /* bridge */ int m(e eVar) {
        return super.indexOf(eVar);
    }

    public /* bridge */ int n(e eVar) {
        return super.lastIndexOf(eVar);
    }
}
