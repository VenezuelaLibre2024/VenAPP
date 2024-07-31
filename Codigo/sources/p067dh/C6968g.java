package p067dh;

import com.google.android.gms.common.api.C5101a;

/* renamed from: dh.g */
/* loaded from: classes2.dex */
final class C6968g {

    /* renamed from: c */
    private static final int[][] f15524c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final EnumC6967f f15525a;

    /* renamed from: b */
    private final byte f15526b;

    private C6968g(int i10) {
        this.f15525a = EnumC6967f.m20145b((i10 >> 3) & 3);
        this.f15526b = (byte) (i10 & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6968g m20147a(int i10, int i11) {
        C6968g m20148b = m20148b(i10, i11);
        return m20148b != null ? m20148b : m20148b(i10 ^ 21522, i11 ^ 21522);
    }

    /* renamed from: b */
    private static C6968g m20148b(int i10, int i11) {
        int m20149e;
        int[][] iArr = f15524c;
        int i12 = C5101a.e.API_PRIORITY_OTHER;
        int i13 = 0;
        for (int[] iArr2 : iArr) {
            int i14 = iArr2[0];
            if (i14 == i10 || i14 == i11) {
                return new C6968g(iArr2[1]);
            }
            int m20149e2 = m20149e(i10, i14);
            if (m20149e2 < i12) {
                i13 = iArr2[1];
                i12 = m20149e2;
            }
            if (i10 != i11 && (m20149e = m20149e(i11, i14)) < i12) {
                i13 = iArr2[1];
                i12 = m20149e;
            }
        }
        if (i12 <= 3) {
            return new C6968g(i13);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m20149e(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m20150c() {
        return this.f15526b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC6967f m20151d() {
        return this.f15525a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6968g)) {
            return false;
        }
        C6968g c6968g = (C6968g) obj;
        return this.f15525a == c6968g.f15525a && this.f15526b == c6968g.f15526b;
    }

    public int hashCode() {
        return (this.f15525a.ordinal() << 3) | this.f15526b;
    }
}
