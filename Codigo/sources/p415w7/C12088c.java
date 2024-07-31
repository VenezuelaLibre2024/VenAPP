package p415w7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;
import p415w7.C12088c;

/* renamed from: w7.c */
/* loaded from: classes.dex */
public final class C12088c implements InterfaceC11076o {

    /* renamed from: r */
    public static final C12088c f32171r = new C12088c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: s */
    private static final a f32172s = new a(0).m38840j(0);

    /* renamed from: t */
    private static final String f32173t = C11172r0.m34945r0(1);

    /* renamed from: u */
    private static final String f32174u = C11172r0.m34945r0(2);

    /* renamed from: v */
    private static final String f32175v = C11172r0.m34945r0(3);

    /* renamed from: w */
    private static final String f32176w = C11172r0.m34945r0(4);

    /* renamed from: x */
    public static final InterfaceC11076o.a<C12088c> f32177x = new InterfaceC11076o.a() { // from class: w7.a
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C12088c m38827c;
            m38827c = C12088c.m38827c(bundle);
            return m38827c;
        }
    };

    /* renamed from: a */
    public final Object f32178a;

    /* renamed from: b */
    public final int f32179b;

    /* renamed from: c */
    public final long f32180c;

    /* renamed from: d */
    public final long f32181d;

    /* renamed from: e */
    public final int f32182e;

    /* renamed from: f */
    private final a[] f32183f;

    /* renamed from: w7.c$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC11076o {

        /* renamed from: a */
        public final long f32193a;

        /* renamed from: b */
        public final int f32194b;

        /* renamed from: c */
        public final int f32195c;

        /* renamed from: d */
        public final Uri[] f32196d;

        /* renamed from: e */
        public final int[] f32197e;

        /* renamed from: f */
        public final long[] f32198f;

        /* renamed from: r */
        public final long f32199r;

        /* renamed from: s */
        public final boolean f32200s;

        /* renamed from: t */
        private static final String f32186t = C11172r0.m34945r0(0);

        /* renamed from: u */
        private static final String f32187u = C11172r0.m34945r0(1);

        /* renamed from: v */
        private static final String f32188v = C11172r0.m34945r0(2);

        /* renamed from: w */
        private static final String f32189w = C11172r0.m34945r0(3);

        /* renamed from: x */
        private static final String f32190x = C11172r0.m34945r0(4);

        /* renamed from: y */
        private static final String f32191y = C11172r0.m34945r0(5);

        /* renamed from: z */
        private static final String f32192z = C11172r0.m34945r0(6);

        /* renamed from: A */
        private static final String f32184A = C11172r0.m34945r0(7);

        /* renamed from: B */
        public static final InterfaceC11076o.a<a> f32185B = new InterfaceC11076o.a() { // from class: w7.b
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C12088c.a m38835e;
                m38835e = C12088c.a.m38835e(bundle);
                return m38835e;
            }
        };

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            C11137a.m34599a(iArr.length == uriArr.length);
            this.f32193a = j10;
            this.f32194b = i10;
            this.f32195c = i11;
            this.f32197e = iArr;
            this.f32196d = uriArr;
            this.f32198f = jArr;
            this.f32199r = j11;
            this.f32200s = z10;
        }

        /* renamed from: c */
        private static long[] m38833c(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: d */
        private static int[] m38834d(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static a m38835e(Bundle bundle) {
            long j10 = bundle.getLong(f32186t);
            int i10 = bundle.getInt(f32187u);
            int i11 = bundle.getInt(f32184A);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f32188v);
            int[] intArray = bundle.getIntArray(f32189w);
            long[] longArray = bundle.getLongArray(f32190x);
            long j11 = bundle.getLong(f32191y);
            boolean z10 = bundle.getBoolean(f32192z);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            bundle.putLong(f32186t, this.f32193a);
            bundle.putInt(f32187u, this.f32194b);
            bundle.putInt(f32184A, this.f32195c);
            bundle.putParcelableArrayList(f32188v, new ArrayList<>(Arrays.asList(this.f32196d)));
            bundle.putIntArray(f32189w, this.f32197e);
            bundle.putLongArray(f32190x, this.f32198f);
            bundle.putLong(f32191y, this.f32199r);
            bundle.putBoolean(f32192z, this.f32200s);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32193a == aVar.f32193a && this.f32194b == aVar.f32194b && this.f32195c == aVar.f32195c && Arrays.equals(this.f32196d, aVar.f32196d) && Arrays.equals(this.f32197e, aVar.f32197e) && Arrays.equals(this.f32198f, aVar.f32198f) && this.f32199r == aVar.f32199r && this.f32200s == aVar.f32200s;
        }

        /* renamed from: f */
        public int m38836f() {
            return m38837g(-1);
        }

        /* renamed from: g */
        public int m38837g(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f32197e;
                if (i12 >= iArr.length || this.f32200s || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        /* renamed from: h */
        public boolean m38838h() {
            if (this.f32194b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f32194b; i10++) {
                int i11 = this.f32197e[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f32194b * 31) + this.f32195c) * 31;
            long j10 = this.f32193a;
            int hashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f32196d)) * 31) + Arrays.hashCode(this.f32197e)) * 31) + Arrays.hashCode(this.f32198f)) * 31;
            long j11 = this.f32199r;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f32200s ? 1 : 0);
        }

        /* renamed from: i */
        public boolean m38839i() {
            return this.f32194b == -1 || m38836f() < this.f32194b;
        }

        /* renamed from: j */
        public a m38840j(int i10) {
            int[] m38834d = m38834d(this.f32197e, i10);
            long[] m38833c = m38833c(this.f32198f, i10);
            return new a(this.f32193a, i10, this.f32195c, m38834d, (Uri[]) Arrays.copyOf(this.f32196d, i10), m38833c, this.f32199r, this.f32200s);
        }
    }

    private C12088c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f32178a = obj;
        this.f32180c = j10;
        this.f32181d = j11;
        this.f32179b = aVarArr.length + i10;
        this.f32183f = aVarArr;
        this.f32182e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static C12088c m38827c(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f32173t);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f32185B.mo22759a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f32174u;
        C12088c c12088c = f32171r;
        return new C12088c(null, aVarArr, bundle.getLong(str, c12088c.f32180c), bundle.getLong(f32175v, c12088c.f32181d), bundle.getInt(f32176w, c12088c.f32182e));
    }

    /* renamed from: g */
    private boolean m38828g(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = m38829d(i10).f32193a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f32183f) {
            arrayList.add(aVar.mo22762a());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f32173t, arrayList);
        }
        long j10 = this.f32180c;
        C12088c c12088c = f32171r;
        if (j10 != c12088c.f32180c) {
            bundle.putLong(f32174u, j10);
        }
        long j11 = this.f32181d;
        if (j11 != c12088c.f32181d) {
            bundle.putLong(f32175v, j11);
        }
        int i10 = this.f32182e;
        if (i10 != c12088c.f32182e) {
            bundle.putInt(f32176w, i10);
        }
        return bundle;
    }

    /* renamed from: d */
    public a m38829d(int i10) {
        int i11 = this.f32182e;
        return i10 < i11 ? f32172s : this.f32183f[i10 - i11];
    }

    /* renamed from: e */
    public int m38830e(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f32182e;
        while (i10 < this.f32179b && ((m38829d(i10).f32193a != Long.MIN_VALUE && m38829d(i10).f32193a <= j10) || !m38829d(i10).m38839i())) {
            i10++;
        }
        if (i10 < this.f32179b) {
            return i10;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12088c.class != obj.getClass()) {
            return false;
        }
        C12088c c12088c = (C12088c) obj;
        return C11172r0.m34914c(this.f32178a, c12088c.f32178a) && this.f32179b == c12088c.f32179b && this.f32180c == c12088c.f32180c && this.f32181d == c12088c.f32181d && this.f32182e == c12088c.f32182e && Arrays.equals(this.f32183f, c12088c.f32183f);
    }

    /* renamed from: f */
    public int m38831f(long j10, long j11) {
        int i10 = this.f32179b - 1;
        while (i10 >= 0 && m38828g(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !m38829d(i10).m38838h()) {
            return -1;
        }
        return i10;
    }

    public int hashCode() {
        int i10 = this.f32179b * 31;
        Object obj = this.f32178a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f32180c)) * 31) + ((int) this.f32181d)) * 31) + this.f32182e) * 31) + Arrays.hashCode(this.f32183f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f32178a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f32180c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f32183f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f32183f[i10].f32193a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f32183f[i10].f32197e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f32183f[i10].f32197e[i11];
                sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb2.append(", durationUs=");
                sb2.append(this.f32183f[i10].f32198f[i11]);
                sb2.append(')');
                if (i11 < this.f32183f[i10].f32197e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f32183f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
