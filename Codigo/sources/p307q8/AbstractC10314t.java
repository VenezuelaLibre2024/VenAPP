package p307q8;

import android.util.Pair;
import java.util.Arrays;
import p361t6.AbstractC11018d4;
import p361t6.C11100s3;
import p361t6.InterfaceC11095r3;
import p363t8.C11172r0;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.InterfaceC11684a0;

/* renamed from: q8.t */
/* loaded from: classes.dex */
public abstract class AbstractC10314t extends AbstractC10294a0 {

    /* renamed from: c */
    private a f25738c;

    /* renamed from: q8.t$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f25739a;

        /* renamed from: b */
        private final String[] f25740b;

        /* renamed from: c */
        private final int[] f25741c;

        /* renamed from: d */
        private final C11700f1[] f25742d;

        /* renamed from: e */
        private final int[] f25743e;

        /* renamed from: f */
        private final int[][][] f25744f;

        /* renamed from: g */
        private final C11700f1 f25745g;

        a(String[] strArr, int[] iArr, C11700f1[] c11700f1Arr, int[] iArr2, int[][][] iArr3, C11700f1 c11700f1) {
            this.f25740b = strArr;
            this.f25741c = iArr;
            this.f25742d = c11700f1Arr;
            this.f25744f = iArr3;
            this.f25743e = iArr2;
            this.f25745g = c11700f1;
            this.f25739a = iArr.length;
        }

        /* renamed from: a */
        public int m31040a(int i10, int i11, boolean z10) {
            int i12 = this.f25742d[i10].m36857c(i11).f30658a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int m31046g = m31046g(i10, i11, i14);
                if (m31046g == 4 || (z10 && m31046g == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return m31041b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        /* renamed from: b */
        public int m31041b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f25742d[i10].m36857c(i11).m36849d(iArr[i12]).f28797w;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !C11172r0.m34914c(str, str2);
                }
                i13 = Math.min(i13, InterfaceC11095r3.m34458n(this.f25744f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f25743e[i10]) : i13;
        }

        /* renamed from: c */
        public int m31042c(int i10, int i11, int i12) {
            return this.f25744f[i10][i11][i12];
        }

        /* renamed from: d */
        public int m31043d() {
            return this.f25739a;
        }

        /* renamed from: e */
        public int m31044e(int i10) {
            return this.f25741c[i10];
        }

        /* renamed from: f */
        public C11700f1 m31045f(int i10) {
            return this.f25742d[i10];
        }

        /* renamed from: g */
        public int m31046g(int i10, int i11, int i12) {
            return InterfaceC11095r3.m34454F(m31042c(i10, i11, i12));
        }

        /* renamed from: h */
        public C11700f1 m31047h() {
            return this.f25745g;
        }
    }

    /* renamed from: i */
    private static int m31037i(InterfaceC11095r3[] interfaceC11095r3Arr, C11694d1 c11694d1, int[] iArr, boolean z10) {
        int length = interfaceC11095r3Arr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < interfaceC11095r3Arr.length; i11++) {
            InterfaceC11095r3 interfaceC11095r3 = interfaceC11095r3Arr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < c11694d1.f30658a; i13++) {
                i12 = Math.max(i12, InterfaceC11095r3.m34454F(interfaceC11095r3.mo22834a(c11694d1.m36849d(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    /* renamed from: j */
    private static int[] m31038j(InterfaceC11095r3 interfaceC11095r3, C11694d1 c11694d1) {
        int[] iArr = new int[c11694d1.f30658a];
        for (int i10 = 0; i10 < c11694d1.f30658a; i10++) {
            iArr[i10] = interfaceC11095r3.mo22834a(c11694d1.m36849d(i10));
        }
        return iArr;
    }

    /* renamed from: k */
    private static int[] m31039k(InterfaceC11095r3[] interfaceC11095r3Arr) {
        int length = interfaceC11095r3Arr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = interfaceC11095r3Arr[i10].mo27379y();
        }
        return iArr;
    }

    @Override // p307q8.AbstractC10294a0
    /* renamed from: e */
    public final void mo30871e(Object obj) {
        this.f25738c = (a) obj;
    }

    @Override // p307q8.AbstractC10294a0
    /* renamed from: g */
    public final C10296b0 mo30873g(InterfaceC11095r3[] interfaceC11095r3Arr, C11700f1 c11700f1, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4) {
        int[] iArr = new int[interfaceC11095r3Arr.length + 1];
        int length = interfaceC11095r3Arr.length + 1;
        C11694d1[][] c11694d1Arr = new C11694d1[length];
        int[][][] iArr2 = new int[interfaceC11095r3Arr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = c11700f1.f30692a;
            c11694d1Arr[i10] = new C11694d1[i11];
            iArr2[i10] = new int[i11];
        }
        int[] m31039k = m31039k(interfaceC11095r3Arr);
        for (int i12 = 0; i12 < c11700f1.f30692a; i12++) {
            C11694d1 m36857c = c11700f1.m36857c(i12);
            int m31037i = m31037i(interfaceC11095r3Arr, m36857c, iArr, m36857c.f30660c == 5);
            int[] m31038j = m31037i == interfaceC11095r3Arr.length ? new int[m36857c.f30658a] : m31038j(interfaceC11095r3Arr[m31037i], m36857c);
            int i13 = iArr[m31037i];
            c11694d1Arr[m31037i][i13] = m36857c;
            iArr2[m31037i][i13] = m31038j;
            iArr[m31037i] = i13 + 1;
        }
        C11700f1[] c11700f1Arr = new C11700f1[interfaceC11095r3Arr.length];
        String[] strArr = new String[interfaceC11095r3Arr.length];
        int[] iArr3 = new int[interfaceC11095r3Arr.length];
        for (int i14 = 0; i14 < interfaceC11095r3Arr.length; i14++) {
            int i15 = iArr[i14];
            c11700f1Arr[i14] = new C11700f1((C11694d1[]) C11172r0.m34871H0(c11694d1Arr[i14], i15));
            iArr2[i14] = (int[][]) C11172r0.m34871H0(iArr2[i14], i15);
            strArr[i14] = interfaceC11095r3Arr[i14].getName();
            iArr3[i14] = interfaceC11095r3Arr[i14].mo34245g();
        }
        a aVar = new a(strArr, iArr3, c11700f1Arr, m31039k, iArr2, new C11700f1((C11694d1[]) C11172r0.m34871H0(c11694d1Arr[interfaceC11095r3Arr.length], iArr[interfaceC11095r3Arr.length])));
        Pair<C11100s3[], InterfaceC10312r[]> mo30929l = mo30929l(aVar, iArr2, m31039k, bVar, abstractC11018d4);
        return new C10296b0((C11100s3[]) mo30929l.first, (InterfaceC10312r[]) mo30929l.second, C10320z.m31109b(aVar, (InterfaceC10315u[]) mo30929l.second), aVar);
    }

    /* renamed from: l */
    protected abstract Pair<C11100s3[], InterfaceC10312r[]> mo30929l(a aVar, int[][][] iArr, int[] iArr2, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4);
}
