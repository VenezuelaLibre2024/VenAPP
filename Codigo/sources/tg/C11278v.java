package tg;

import java.util.EnumMap;
import java.util.Map;
import kg.C9263a;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6957r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tg.v */
/* loaded from: classes2.dex */
public final class C11278v {

    /* renamed from: a */
    private final int[] f29243a = new int[4];

    /* renamed from: b */
    private final StringBuilder f29244b = new StringBuilder();

    /* renamed from: a */
    private int m35234a(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29243a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m27590l = c9263a.m27590l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < m27590l; i12++) {
            int m35245j = AbstractC11281y.m35245j(c9263a, iArr2, i10, AbstractC11281y.f29255h);
            sb2.append((char) ((m35245j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m35245j >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = c9263a.m27589k(c9263a.m27588j(i10));
            }
        }
        if (sb2.length() != 2) {
            throw C6952m.m20106a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i11) {
            return i10;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: c */
    private static Map<EnumC6957r, Object> m35235c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC6957r.class);
        enumMap.put((EnumMap) EnumC6957r.ISSUE_NUMBER, (EnumC6957r) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6956q m35236b(int i10, C9263a c9263a, int[] iArr) {
        StringBuilder sb2 = this.f29244b;
        sb2.setLength(0);
        int m35234a = m35234a(c9263a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC6957r, Object> m35235c = m35235c(sb3);
        float f10 = i10;
        C6956q c6956q = new C6956q(sb3, null, new C6958s[]{new C6958s((iArr[0] + iArr[1]) / 2.0f, f10), new C6958s(m35234a, f10)}, EnumC6940a.UPC_EAN_EXTENSION);
        if (m35235c != null) {
            c6956q.m20114g(m35235c);
        }
        return c6956q;
    }
}
