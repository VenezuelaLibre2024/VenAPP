package w7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import t6.o;
import t8.r0;
import w7.c;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: r */
    public static final c f29708r = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: s */
    private static final a f29709s = new a(0).j(0);

    /* renamed from: t */
    private static final String f29710t = r0.r0(1);

    /* renamed from: u */
    private static final String f29711u = r0.r0(2);

    /* renamed from: v */
    private static final String f29712v = r0.r0(3);

    /* renamed from: w */
    private static final String f29713w = r0.r0(4);

    /* renamed from: x */
    public static final o.a<c> f29714x = new o.a() { // from class: w7.a
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            c c10;
            c10 = c.c(bundle);
            return c10;
        }
    };

    /* renamed from: a */
    public final Object f29715a;

    /* renamed from: b */
    public final int f29716b;

    /* renamed from: c */
    public final long f29717c;

    /* renamed from: d */
    public final long f29718d;

    /* renamed from: e */
    public final int f29719e;

    /* renamed from: f */
    private final a[] f29720f;

    /* loaded from: classes.dex */
    public static final class a implements o {

        /* renamed from: a */
        public final long f29728a;

        /* renamed from: b */
        public final int f29729b;

        /* renamed from: c */
        public final int f29730c;

        /* renamed from: d */
        public final Uri[] f29731d;

        /* renamed from: e */
        public final int[] f29732e;

        /* renamed from: f */
        public final long[] f29733f;

        /* renamed from: r */
        public final long f29734r;

        /* renamed from: s */
        public final boolean f29735s;

        /* renamed from: t */
        private static final String f29721t = r0.r0(0);

        /* renamed from: u */
        private static final String f29722u = r0.r0(1);

        /* renamed from: v */
        private static final String f29723v = r0.r0(2);

        /* renamed from: w */
        private static final String f29724w = r0.r0(3);

        /* renamed from: x */
        private static final String f29725x = r0.r0(4);

        /* renamed from: y */
        private static final String f29726y = r0.r0(5);

        /* renamed from: z */
        private static final String f29727z = r0.r0(6);
        private static final String A = r0.r0(7);
        public static final o.a<a> B = new o.a() { // from class: w7.b
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                c.a e10;
                e10 = c.a.e(bundle);
                return e10;
            }
        };

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            t8.a.a(iArr.length == uriArr.length);
            this.f29728a = j10;
            this.f29729b = i10;
            this.f29730c = i11;
            this.f29732e = iArr;
            this.f29731d = uriArr;
            this.f29733f = jArr;
            this.f29734r = j11;
            this.f29735s = z10;
        }

        private static long[] c(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] d(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static a e(Bundle bundle) {
            long j10 = bundle.getLong(f29721t);
            int i10 = bundle.getInt(f29722u);
            int i11 = bundle.getInt(A);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f29723v);
            int[] intArray = bundle.getIntArray(f29724w);
            long[] longArray = bundle.getLongArray(f29725x);
            long j11 = bundle.getLong(f29726y);
            boolean z10 = bundle.getBoolean(f29727z);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(f29721t, this.f29728a);
            bundle.putInt(f29722u, this.f29729b);
            bundle.putInt(A, this.f29730c);
            bundle.putParcelableArrayList(f29723v, new ArrayList<>(Arrays.asList(this.f29731d)));
            bundle.putIntArray(f29724w, this.f29732e);
            bundle.putLongArray(f29725x, this.f29733f);
            bundle.putLong(f29726y, this.f29734r);
            bundle.putBoolean(f29727z, this.f29735s);
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
            return this.f29728a == aVar.f29728a && this.f29729b == aVar.f29729b && this.f29730c == aVar.f29730c && Arrays.equals(this.f29731d, aVar.f29731d) && Arrays.equals(this.f29732e, aVar.f29732e) && Arrays.equals(this.f29733f, aVar.f29733f) && this.f29734r == aVar.f29734r && this.f29735s == aVar.f29735s;
        }

        public int f() {
            return g(-1);
        }

        public int g(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f29732e;
                if (i12 >= iArr.length || this.f29735s || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean h() {
            if (this.f29729b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f29729b; i10++) {
                int i11 = this.f29732e[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f29729b * 31) + this.f29730c) * 31;
            long j10 = this.f29728a;
            int hashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f29731d)) * 31) + Arrays.hashCode(this.f29732e)) * 31) + Arrays.hashCode(this.f29733f)) * 31;
            long j11 = this.f29734r;
            return ((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f29735s ? 1 : 0);
        }

        public boolean i() {
            return this.f29729b == -1 || f() < this.f29729b;
        }

        public a j(int i10) {
            int[] d10 = d(this.f29732e, i10);
            long[] c10 = c(this.f29733f, i10);
            return new a(this.f29728a, i10, this.f29730c, d10, (Uri[]) Arrays.copyOf(this.f29731d, i10), c10, this.f29734r, this.f29735s);
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f29715a = obj;
        this.f29717c = j10;
        this.f29718d = j11;
        this.f29716b = aVarArr.length + i10;
        this.f29720f = aVarArr;
        this.f29719e = i10;
    }

    public static c c(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f29710t);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.B.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        String str = f29711u;
        c cVar = f29708r;
        return new c(null, aVarArr, bundle.getLong(str, cVar.f29717c), bundle.getLong(f29712v, cVar.f29718d), bundle.getInt(f29713w, cVar.f29719e));
    }

    private boolean g(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = d(i10).f29728a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f29720f) {
            arrayList.add(aVar.a());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f29710t, arrayList);
        }
        long j10 = this.f29717c;
        c cVar = f29708r;
        if (j10 != cVar.f29717c) {
            bundle.putLong(f29711u, j10);
        }
        long j11 = this.f29718d;
        if (j11 != cVar.f29718d) {
            bundle.putLong(f29712v, j11);
        }
        int i10 = this.f29719e;
        if (i10 != cVar.f29719e) {
            bundle.putInt(f29713w, i10);
        }
        return bundle;
    }

    public a d(int i10) {
        int i11 = this.f29719e;
        return i10 < i11 ? f29709s : this.f29720f[i10 - i11];
    }

    public int e(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f29719e;
        while (i10 < this.f29716b && ((d(i10).f29728a != Long.MIN_VALUE && d(i10).f29728a <= j10) || !d(i10).i())) {
            i10++;
        }
        if (i10 < this.f29716b) {
            return i10;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return r0.c(this.f29715a, cVar.f29715a) && this.f29716b == cVar.f29716b && this.f29717c == cVar.f29717c && this.f29718d == cVar.f29718d && this.f29719e == cVar.f29719e && Arrays.equals(this.f29720f, cVar.f29720f);
    }

    public int f(long j10, long j11) {
        int i10 = this.f29716b - 1;
        while (i10 >= 0 && g(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !d(i10).h()) {
            return -1;
        }
        return i10;
    }

    public int hashCode() {
        int i10 = this.f29716b * 31;
        Object obj = this.f29715a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f29717c)) * 31) + ((int) this.f29718d)) * 31) + this.f29719e) * 31) + Arrays.hashCode(this.f29720f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f29715a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f29717c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f29720f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f29720f[i10].f29728a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f29720f[i10].f29732e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f29720f[i10].f29732e[i11];
                sb2.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb2.append(", durationUs=");
                sb2.append(this.f29720f[i10].f29733f[i11]);
                sb2.append(')');
                if (i11 < this.f29720f[i10].f29732e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f29720f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
