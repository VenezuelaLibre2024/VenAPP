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
/* renamed from: tg.w */
/* loaded from: classes2.dex */
public final class C11279w {

    /* renamed from: c */
    private static final int[] f29245c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f29246a = new int[4];

    /* renamed from: b */
    private final StringBuilder f29247b = new StringBuilder();

    /* renamed from: a */
    private int m35237a(C9263a c9263a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f29246a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m27590l = c9263a.m27590l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < m27590l; i12++) {
            int m35245j = AbstractC11281y.m35245j(c9263a, iArr2, i10, AbstractC11281y.f29255h);
            sb2.append((char) ((m35245j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m35245j >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = c9263a.m27589k(c9263a.m27588j(i10));
            }
        }
        if (sb2.length() != 5) {
            throw C6952m.m20106a();
        }
        if (m35239d(sb2.toString()) == m35238c(i11)) {
            return i10;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: c */
    private static int m35238c(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f29245c[i11]) {
                return i11;
            }
        }
        throw C6952m.m20106a();
    }

    /* renamed from: d */
    private static int m35239d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5.equals("90000") == false) goto L11;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m35240e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L15
            goto L4f
        L15:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r2
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r3
            goto L3e
        L35:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "0"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L79
        L75:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C11279w.m35240e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<EnumC6957r, Object> m35241f(String str) {
        String m35240e;
        if (str.length() != 5 || (m35240e = m35240e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC6957r.class);
        enumMap.put((EnumMap) EnumC6957r.SUGGESTED_PRICE, (EnumC6957r) m35240e);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6956q m35242b(int i10, C9263a c9263a, int[] iArr) {
        StringBuilder sb2 = this.f29247b;
        sb2.setLength(0);
        int m35237a = m35237a(c9263a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC6957r, Object> m35241f = m35241f(sb3);
        float f10 = i10;
        C6956q c6956q = new C6956q(sb3, null, new C6958s[]{new C6958s((iArr[0] + iArr[1]) / 2.0f, f10), new C6958s(m35237a, f10)}, EnumC6940a.UPC_EAN_EXTENSION);
        if (m35241f != null) {
            c6956q.m20114g(m35241f);
        }
        return c6956q;
    }
}
