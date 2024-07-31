package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final h f4120b = new j(a0.f4080c);

    /* renamed from: c */
    private static final f f4121c;

    /* renamed from: d */
    private static final Comparator<h> f4122d;

    /* renamed from: a */
    private int f4123a = 0;

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a */
        private int f4124a = 0;

        /* renamed from: b */
        private final int f4125b;

        a() {
            this.f4125b = h.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.h.g
        public byte b() {
            int i10 = this.f4124a;
            if (i10 >= this.f4125b) {
                throw new NoSuchElementException();
            }
            this.f4124a = i10 + 1;
            return h.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4124a < this.f4125b;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(h.x(it.b()), h.x(it2.b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f4127f;

        /* renamed from: r */
        private final int f4128r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.h(i10, i10 + i11, bArr.length);
            this.f4127f = i10;
            this.f4128r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.h.j
        protected int G() {
            return this.f4127f;
        }

        @Override // androidx.datastore.preferences.protobuf.h.j, androidx.datastore.preferences.protobuf.h
        public byte d(int i10) {
            h.f(i10, size());
            return this.f4131e[this.f4127f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.h.j, androidx.datastore.preferences.protobuf.h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f4131e, G() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.h.j, androidx.datastore.preferences.protobuf.h
        byte o(int i10) {
            return this.f4131e[this.f4127f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.h.j, androidx.datastore.preferences.protobuf.h
        public int size() {
            return this.f4128r;
        }

        Object writeReplace() {
            return h.C(w());
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$h */
    /* loaded from: classes.dex */
    public static final class C0058h {

        /* renamed from: a */
        private final androidx.datastore.preferences.protobuf.k f4129a;

        /* renamed from: b */
        private final byte[] f4130b;

        private C0058h(int i10) {
            byte[] bArr = new byte[i10];
            this.f4130b = bArr;
            this.f4129a = androidx.datastore.preferences.protobuf.k.g0(bArr);
        }

        /* synthetic */ C0058h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f4129a.c();
            return new j(this.f4130b);
        }

        public androidx.datastore.preferences.protobuf.k b() {
            return this.f4129a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class i extends h {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f4131e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f4131e = bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.datastore.preferences.protobuf.h
        public final void E(androidx.datastore.preferences.protobuf.g gVar) {
            gVar.a(this.f4131e, G(), size());
        }

        final boolean F(h hVar, int i10, int i11) {
            if (i11 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
            }
            if (!(hVar instanceof j)) {
                return hVar.v(i10, i12).equals(v(0, i11));
            }
            j jVar = (j) hVar;
            byte[] bArr = this.f4131e;
            byte[] bArr2 = jVar.f4131e;
            int G = G() + i11;
            int G2 = G();
            int G3 = jVar.G() + i10;
            while (G2 < G) {
                if (bArr[G2] != bArr2[G3]) {
                    return false;
                }
                G2++;
                G3++;
            }
            return true;
        }

        protected int G() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public byte d(int i10) {
            return this.f4131e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int u10 = u();
            int u11 = jVar.u();
            if (u10 == 0 || u11 == 0 || u10 == u11) {
                return F(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f4131e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        byte o(int i10) {
            return this.f4131e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final boolean p() {
            int G = G();
            return s1.n(this.f4131e, G, size() + G);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final androidx.datastore.preferences.protobuf.i s() {
            return androidx.datastore.preferences.protobuf.i.j(this.f4131e, G(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int size() {
            return this.f4131e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        protected final int t(int i10, int i11, int i12) {
            return a0.i(i10, this.f4131e, G() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public final h v(int i10, int i11) {
            int h10 = h.h(i10, i11, size());
            return h10 == 0 ? h.f4120b : new e(this.f4131e, G() + i10, h10);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        protected final String z(Charset charset) {
            return new String(this.f4131e, G(), size(), charset);
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f4121c = androidx.datastore.preferences.protobuf.d.c() ? new k(null) : new d(null);
        f4122d = new b();
    }

    h() {
    }

    public static h C(byte[] bArr) {
        return new j(bArr);
    }

    public static h D(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static h k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static h l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f4121c.a(bArr, i10, i11));
    }

    public static h m(String str) {
        return new j(str.getBytes(a0.f4078a));
    }

    public static C0058h r(int i10) {
        return new C0058h(i10, null);
    }

    public static int x(byte b10) {
        return b10 & 255;
    }

    public final String A() {
        return y(a0.f4078a);
    }

    public abstract void E(androidx.datastore.preferences.protobuf.g gVar);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f4123a;
        if (i10 == 0) {
            int size = size();
            i10 = t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f4123a = i10;
        }
        return i10;
    }

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* renamed from: q */
    public g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.i s();

    public abstract int size();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected final int u() {
        return this.f4123a;
    }

    public abstract h v(int i10, int i11);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return a0.f4080c;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String y(Charset charset) {
        return size() == 0 ? "" : z(charset);
    }

    protected abstract String z(Charset charset);
}
