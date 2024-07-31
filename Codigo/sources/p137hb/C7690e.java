package p137hb;

import com.google.android.gms.common.api.C5101a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p082eb.C7159o;

/* renamed from: hb.e */
/* loaded from: classes2.dex */
public final class C7690e extends AbstractC7691f {

    /* renamed from: hb.e$a */
    /* loaded from: classes2.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final int[] f18297a;

        /* renamed from: b */
        final int f18298b;

        /* renamed from: c */
        final int f18299c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i10, int i11) {
            this.f18297a = iArr;
            this.f18298b = i10;
            this.f18299c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            C7159o.m21310m(i10, size());
            return Integer.valueOf(this.f18297a[this.f18298b + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C7690e.m23418i(this.f18297a, ((Integer) obj).intValue(), this.f18298b, this.f18299c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            C7159o.m21310m(i10, size());
            int[] iArr = this.f18297a;
            int i11 = this.f18298b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) C7159o.m21312o(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f18297a[this.f18298b + i10] != aVar.f18297a[aVar.f18298b + i10]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        int[] m23424f() {
            return Arrays.copyOfRange(this.f18297a, this.f18298b, this.f18299c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f18298b; i11 < this.f18299c; i11++) {
                i10 = (i10 * 31) + C7690e.m23416g(this.f18297a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m23418i;
            if (!(obj instanceof Integer) || (m23418i = C7690e.m23418i(this.f18297a, ((Integer) obj).intValue(), this.f18298b, this.f18299c)) < 0) {
                return -1;
            }
            return m23418i - this.f18298b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m23419j;
            if (!(obj instanceof Integer) || (m23419j = C7690e.m23419j(this.f18297a, ((Integer) obj).intValue(), this.f18298b, this.f18299c)) < 0) {
                return -1;
            }
            return m23419j - this.f18298b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f18299c - this.f18298b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            C7159o.m21317t(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f18297a;
            int i12 = this.f18298b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f18297a[this.f18298b]);
            int i10 = this.f18298b;
            while (true) {
                i10++;
                if (i10 >= this.f18299c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f18297a[i10]);
            }
        }
    }

    /* renamed from: c */
    public static List<Integer> m23412c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    /* renamed from: d */
    public static int m23413d(long j10) {
        int i10 = (int) j10;
        C7159o.m21307j(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    /* renamed from: e */
    public static int m23414e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m23415f(int i10, int i11, int i12) {
        C7159o.m21306i(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    /* renamed from: g */
    public static int m23416g(int i10) {
        return i10;
    }

    /* renamed from: h */
    public static int m23417h(int[] iArr, int i10) {
        return m23418i(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m23418i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m23419j(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public static int m23420k(long j10) {
        if (j10 > 2147483647L) {
            return C5101a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: l */
    public static int[] m23421l(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).m23424f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) C7159o.m21312o(array[i10])).intValue();
        }
        return iArr;
    }
}
