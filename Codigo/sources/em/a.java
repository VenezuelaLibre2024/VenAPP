package em;

import dm.b0;
import dm.o;
import dm.s;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14829a = b0.a("0123456789abcdef");

    public static final byte[] a() {
        return f14829a;
    }

    public static final String b(dm.b bVar, long j10) {
        n.e(bVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (bVar.l(j11) == ((byte) 13)) {
                String i02 = bVar.i0(j11);
                bVar.skip(2L);
                return i02;
            }
        }
        String i03 = bVar.i0(j10);
        bVar.skip(1L);
        return i03;
    }

    public static final int c(dm.b bVar, o options, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        s sVar;
        n.e(bVar, "<this>");
        n.e(options, "options");
        s sVar2 = bVar.f14280a;
        if (sVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = sVar2.f14323a;
        int i14 = sVar2.f14324b;
        int i15 = sVar2.f14325c;
        int[] l10 = options.l();
        s sVar3 = sVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = l10[i17];
            int i20 = i18 + 1;
            int i21 = l10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (sVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == l10[i20]) {
                        i11 = l10[i20 + i19];
                        if (i10 == i15) {
                            sVar3 = sVar3.f14328f;
                            n.b(sVar3);
                            i10 = sVar3.f14324b;
                            bArr = sVar3.f14323a;
                            i15 = sVar3.f14325c;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != l10[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    n.b(sVar3);
                    s sVar4 = sVar3.f14328f;
                    n.b(sVar4);
                    i13 = sVar4.f14324b;
                    byte[] bArr2 = sVar4.f14323a;
                    i12 = sVar4.f14325c;
                    if (sVar4 != sVar2) {
                        sVar = sVar4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        sVar = null;
                    }
                } else {
                    s sVar5 = sVar3;
                    i12 = i15;
                    i13 = i25;
                    sVar = sVar5;
                }
                if (z11) {
                    i11 = l10[i26];
                    i10 = i13;
                    i15 = i12;
                    sVar3 = sVar;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                sVar3 = sVar;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int d(dm.b bVar, o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c(bVar, oVar, z10);
    }
}
