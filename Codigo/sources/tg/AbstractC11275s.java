package tg;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import kg.C9264b;
import p066dg.EnumC6940a;
import p066dg.EnumC6946g;
import p066dg.InterfaceC6960u;

/* renamed from: tg.s */
/* loaded from: classes2.dex */
public abstract class AbstractC11275s implements InterfaceC6960u {

    /* renamed from: a */
    private static final Pattern f29240a = Pattern.compile("[0-9]+");

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static int m35228b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static void m35229c(String str) {
        if (!f29240a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: h */
    private static C9264b m35230h(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        C9264b c9264b = new C9264b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                c9264b.m27613s(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return c9264b;
    }

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        Collection<EnumC6940a> mo35183g = mo35183g();
        if (mo35183g == null || mo35183g.contains(enumC6940a)) {
            int mo35231f = mo35231f();
            if (map != null) {
                EnumC6946g enumC6946g = EnumC6946g.MARGIN;
                if (map.containsKey(enumC6946g)) {
                    mo35231f = Integer.parseInt(map.get(enumC6946g).toString());
                }
            }
            return m35230h(mo35191e(str, map), i10, i11, mo35231f);
        }
        throw new IllegalArgumentException("Can only encode " + mo35183g + ", but got " + enumC6940a);
    }

    /* renamed from: d */
    public abstract boolean[] mo35182d(String str);

    /* renamed from: e */
    protected boolean[] mo35191e(String str, Map<EnumC6946g, ?> map) {
        return mo35182d(str);
    }

    /* renamed from: f */
    public int mo35231f() {
        return 10;
    }

    /* renamed from: g */
    protected abstract Collection<EnumC6940a> mo35183g();
}
