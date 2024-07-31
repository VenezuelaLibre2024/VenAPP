package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final g f13185b = new j(z.f13401d);

    /* renamed from: c */
    private static final f f13186c;

    /* renamed from: d */
    private static final Comparator<g> f13187d;

    /* renamed from: a */
    private int f13188a = 0;

    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: a */
        private int f13189a = 0;

        /* renamed from: b */
        private final int f13190b;

        a() {
            this.f13190b = g.this.size();
        }

        @Override // com.google.protobuf.g.InterfaceC0189g
        public byte b() {
            int i10 = this.f13189a;
            if (i10 >= this.f13190b) {
                throw new NoSuchElementException();
            }
            this.f13189a = i10 + 1;
            return g.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13189a < this.f13190b;
        }
    }

    /* loaded from: classes2.dex */
    class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            InterfaceC0189g it = gVar.iterator();
            InterfaceC0189g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(g.x(it.b())).compareTo(Integer.valueOf(g.x(it2.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class c implements InterfaceC0189g {
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

    /* loaded from: classes2.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f13192f;

        /* renamed from: r */
        private final int f13193r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.h(i10, i10 + i11, bArr.length);
            this.f13192f = i10;
            this.f13193r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.g.j
        protected int H() {
            return this.f13192f;
        }

        @Override // com.google.protobuf.g.j, com.google.protobuf.g
        public byte d(int i10) {
            g.f(i10, size());
            return this.f13196e[this.f13192f + i10];
        }

        @Override // com.google.protobuf.g.j, com.google.protobuf.g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f13196e, H() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.g.j, com.google.protobuf.g
        byte o(int i10) {
            return this.f13196e[this.f13192f + i10];
        }

        @Override // com.google.protobuf.g.j, com.google.protobuf.g
        public int size() {
            return this.f13193r;
        }

        Object writeReplace() {
            return g.D(w());
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.g$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC0189g extends Iterator<Byte> {
        byte b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a */
        private final com.google.protobuf.j f13194a;

        /* renamed from: b */
        private final byte[] f13195b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f13195b = bArr;
            this.f13194a = com.google.protobuf.j.f0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public g a() {
            this.f13194a.c();
            return new j(this.f13195b);
        }

        public com.google.protobuf.j b() {
            return this.f13194a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class i extends g {
        i() {
        }

        @Override // com.google.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f13196e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f13196e = bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.g
        public final void F(com.google.protobuf.f fVar) {
            fVar.a(this.f13196e, H(), size());
        }

        final boolean G(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.v(i10, i12).equals(v(0, i11));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f13196e;
            byte[] bArr2 = jVar.f13196e;
            int H = H() + i11;
            int H2 = H();
            int H3 = jVar.H() + i10;
            while (H2 < H) {
                if (bArr[H2] != bArr2[H3]) {
                    return false;
                }
                H2++;
                H3++;
            }
            return true;
        }

        protected int H() {
            return 0;
        }

        @Override // com.google.protobuf.g
        public byte d(int i10) {
            return this.f13196e[i10];
        }

        @Override // com.google.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
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
                return G(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.g
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f13196e, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.g
        byte o(int i10) {
            return this.f13196e[i10];
        }

        @Override // com.google.protobuf.g
        public final boolean p() {
            int H = H();
            return s1.n(this.f13196e, H, size() + H);
        }

        @Override // com.google.protobuf.g
        public final com.google.protobuf.h s() {
            return com.google.protobuf.h.j(this.f13196e, H(), size(), true);
        }

        @Override // com.google.protobuf.g
        public int size() {
            return this.f13196e.length;
        }

        @Override // com.google.protobuf.g
        protected final int t(int i10, int i11, int i12) {
            return z.i(i10, this.f13196e, H() + i11, i12);
        }

        @Override // com.google.protobuf.g
        public final g v(int i10, int i11) {
            int h10 = g.h(i10, i11, size());
            return h10 == 0 ? g.f13185b : new e(this.f13196e, H() + i10, h10);
        }

        @Override // com.google.protobuf.g
        protected final String z(Charset charset) {
            return new String(this.f13196e, H(), size(), charset);
        }
    }

    /* loaded from: classes2.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f13186c = com.google.protobuf.d.c() ? new k(null) : new d(null);
        f13187d = new b();
    }

    g() {
    }

    private String C() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(v(0, 47)) + "...";
    }

    public static g D(byte[] bArr) {
        return new j(bArr);
    }

    public static g E(byte[] bArr, int i10, int i11) {
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

    public static g k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static g l(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new j(f13186c.a(bArr, i10, i11));
    }

    public static g m(String str) {
        return new j(str.getBytes(z.f13399b));
    }

    public static h r(int i10) {
        return new h(i10, null);
    }

    public static int x(byte b10) {
        return b10 & 255;
    }

    public final String A() {
        return y(z.f13399b);
    }

    public abstract void F(com.google.protobuf.f fVar);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f13188a;
        if (i10 == 0) {
            int size = size();
            i10 = t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f13188a = i10;
        }
        return i10;
    }

    protected abstract void n(byte[] bArr, int i10, int i11, int i12);

    abstract byte o(int i10);

    public abstract boolean p();

    @Override // java.lang.Iterable
    /* renamed from: q */
    public InterfaceC0189g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.h s();

    public abstract int size();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), C());
    }

    protected final int u() {
        return this.f13188a;
    }

    public abstract g v(int i10, int i11);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return z.f13401d;
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
