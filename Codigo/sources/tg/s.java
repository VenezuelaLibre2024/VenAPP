package tg;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class s implements dg.u {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f26938a = Pattern.compile("[0-9]+");

    /* JADX INFO: Access modifiers changed from: protected */
    public static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
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
    public static void c(String str) {
        if (!f26938a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    private static kg.b h(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        kg.b bVar = new kg.b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.s(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<dg.g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        Collection<dg.a> g10 = g();
        if (g10 == null || g10.contains(aVar)) {
            int f10 = f();
            if (map != null) {
                dg.g gVar = dg.g.MARGIN;
                if (map.containsKey(gVar)) {
                    f10 = Integer.parseInt(map.get(gVar).toString());
                }
            }
            return h(e(str, map), i10, i11, f10);
        }
        throw new IllegalArgumentException("Can only encode " + g10 + ", but got " + aVar);
    }

    public abstract boolean[] d(String str);

    protected boolean[] e(String str, Map<dg.g, ?> map) {
        return d(str);
    }

    public int f() {
        return 10;
    }

    protected abstract Collection<dg.a> g();
}
