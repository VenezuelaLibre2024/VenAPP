package tg;

import java.util.Arrays;
import java.util.Map;
import kg.C9263a;
import p066dg.C6942c;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;
import p066dg.InterfaceC6954o;

/* renamed from: tg.r */
/* loaded from: classes2.dex */
public abstract class AbstractC11274r implements InterfaceC6954o {
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: p -> 0x00cc, TRY_LEAVE, TryCatch #3 {p -> 0x00cc, blocks: (B:34:0x0076, B:36:0x007c), top: B:33:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p066dg.C6956q m35224d(p066dg.C6942c r22, java.util.Map<p066dg.EnumC6944e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.AbstractC11274r.m35224d(dg.c, java.util.Map):dg.q");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static float m35225e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static void m35226f(C9263a c9263a, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m27590l = c9263a.m27590l();
        if (i10 >= m27590l) {
            throw C6952m.m20106a();
        }
        boolean z10 = !c9263a.m27586h(i10);
        while (i10 < m27590l) {
            if (c9263a.m27586h(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != m27590l) {
                throw C6952m.m20106a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static void m35227g(C9263a c9263a, int i10, int[] iArr) {
        int length = iArr.length;
        boolean m27586h = c9263a.m27586h(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (c9263a.m27586h(i10) != m27586h) {
                length--;
                m27586h = !m27586h;
            }
        }
        if (length >= 0) {
            throw C6952m.m20106a();
        }
        m35226f(c9263a, i10 + 1, iArr);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    public C6956q mo10301b(C6942c c6942c, Map<EnumC6944e, ?> map) {
        try {
            return m35224d(c6942c, map);
        } catch (C6952m e10) {
            if (!(map != null && map.containsKey(EnumC6944e.TRY_HARDER)) || !c6942c.m20088e()) {
                throw e10;
            }
            C6942c m20089f = c6942c.m20089f();
            C6956q m35224d = m35224d(m20089f, map);
            Map<EnumC6957r, Object> m20111d = m35224d.m20111d();
            int i10 = 270;
            if (m20111d != null) {
                EnumC6957r enumC6957r = EnumC6957r.ORIENTATION;
                if (m20111d.containsKey(enumC6957r)) {
                    i10 = (((Integer) m20111d.get(enumC6957r)).intValue() + 270) % 360;
                }
            }
            m35224d.m20115h(EnumC6957r.ORIENTATION, Integer.valueOf(i10));
            C6958s[] m20112e = m35224d.m20112e();
            if (m20112e != null) {
                int m20086c = m20089f.m20086c();
                for (int i11 = 0; i11 < m20112e.length; i11++) {
                    m20112e[i11] = new C6958s((m20086c - m20112e[i11].m20120d()) - 1.0f, m20112e[i11].m20119c());
                }
            }
            return m35224d;
        }
    }

    /* renamed from: c */
    public abstract C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map);

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}
