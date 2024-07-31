package tg;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f26941a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f26942b = new StringBuilder();

    private int a(kg.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f26941a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < l10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f26953h);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = aVar.k(aVar.j(i10));
            }
        }
        if (sb2.length() != 2) {
            throw dg.m.a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i11) {
            return i10;
        }
        throw dg.m.a();
    }

    private static Map<dg.r, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(dg.r.class);
        enumMap.put((EnumMap) dg.r.ISSUE_NUMBER, (dg.r) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dg.q b(int i10, kg.a aVar, int[] iArr) {
        StringBuilder sb2 = this.f26942b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<dg.r, Object> c10 = c(sb3);
        float f10 = i10;
        dg.q qVar = new dg.q(sb3, null, new dg.s[]{new dg.s((iArr[0] + iArr[1]) / 2.0f, f10), new dg.s(a10, f10)}, dg.a.UPC_EAN_EXTENSION);
        if (c10 != null) {
            qVar.g(c10);
        }
        return qVar;
    }
}
