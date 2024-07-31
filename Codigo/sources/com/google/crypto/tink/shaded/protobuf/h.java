package com.google.crypto.tink.shaded.protobuf;

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
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final h f11376b = new j(a0.f11337d);

    /* renamed from: c */
    private static final f f11377c;

    /* renamed from: d */
    private static final Comparator<h> f11378d;

    /* renamed from: a */
    private int f11379a = 0;

    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: a */
        private int f11380a = 0;

        /* renamed from: b */
        private final int f11381b;

        a() {
            this.f11381b = h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.g
        public byte b() {
            int i10 = this.f11380a;
            if (i10 >= this.f11381b) {
                throw new NoSuchElementException();
            }
            this.f11380a = i10 + 1;
            return h.this.o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11380a < this.f11381b;
        }
    }

    /* loaded from: classes2.dex */
    class b implements Comparator<h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(h hVar, h hVar2) {
            g it = hVar.iterator();
            g it2 = hVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(h.x(it.b())).compareTo(Integer.valueOf(h.x(it2.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f11383f;

        /* renamed from: r */
        private final int f11384r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.h(i10, i10 + i11, bArr.length);
            this.f11383f = i10;
            this.f11384r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j
        protected int H() {
            return this.f11383f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte d(int i10) {
            h.f(i10, size());
            return this.f11387e[this.f11383f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f11387e, H() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        byte o(int i10) {
            return this.f11387e[this.f11383f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f11384r;
        }

        Object writeReplace() {
            return h.D(w());
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h */
    /* loaded from: classes2.dex */
    public static final class C0172h {

        /* renamed from: a */
        private final com.google.crypto.tink.shaded.protobuf.k f11385a;

        /* renamed from: b */
        private final byte[] f11386b;

        private C0172h(int i10) {
            byte[] bArr = new byte[i10];
            this.f11386b = bArr;
            this.f11385a = com.google.crypto.tink.shaded.protobuf.k.c0(bArr);
        }

        /* synthetic */ C0172h(int i10, a aVar) {
            this(i10);
        }

        public h a() {
            this.f11385a.c();
            return new j(this.f11386b);
        }

        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.f11385a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class i extends h {
        i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f11387e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f11387e = bArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final void F(com.google.crypto.tink.shaded.protobuf.g gVar) {
            gVar.a(this.f11387e, H(), size());
        }

        final boolean G(h hVar, int i10, int i11) {
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
            byte[] bArr = this.f11387e;
            byte[] bArr2 = jVar.f11387e;
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

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte d(int i10) {
            return this.f11387e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
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
                return G(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected void n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f11387e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        byte o(int i10) {
            return this.f11387e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean p() {
            int H = H();
            return s1.n(this.f11387e, H, size() + H);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final com.google.crypto.tink.shaded.protobuf.i s() {
            return com.google.crypto.tink.shaded.protobuf.i.j(this.f11387e, H(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f11387e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final int t(int i10, int i11, int i12) {
            return a0.i(i10, this.f11387e, H() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final h v(int i10, int i11) {
            int h10 = h.h(i10, i11, size());
            return h10 == 0 ? h.f11376b : new e(this.f11387e, H() + i10, h10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final String z(Charset charset) {
            return new String(this.f11387e, H(), size(), charset);
        }
    }

    /* loaded from: classes2.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f11377c = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(null) : new d(null);
        f11378d = new b();
    }

    h() {
    }

    private String C() {
        if (size() <= 50) {
            return l1.a(this);
        }
        return l1.a(v(0, 47)) + "...";
    }

    public static h D(byte[] bArr) {
        return new j(bArr);
    }

    public static h E(byte[] bArr, int i10, int i11) {
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
        return new j(f11377c.a(bArr, i10, i11));
    }

    public static h m(String str) {
        return new j(str.getBytes(a0.f11335b));
    }

    public static C0172h r(int i10) {
        return new C0172h(i10, null);
    }

    public static int x(byte b10) {
        return b10 & 255;
    }

    public final String A() {
        return y(a0.f11335b);
    }

    public abstract void F(com.google.crypto.tink.shaded.protobuf.g gVar);

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f11379a;
        if (i10 == 0) {
            int size = size();
            i10 = t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f11379a = i10;
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

    public abstract com.google.crypto.tink.shaded.protobuf.i s();

    public abstract int size();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), C());
    }

    protected final int u() {
        return this.f11379a;
    }

    public abstract h v(int i10, int i11);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return a0.f11337d;
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
