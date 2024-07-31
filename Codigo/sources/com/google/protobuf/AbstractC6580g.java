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

/* renamed from: com.google.protobuf.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6580g implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final AbstractC6580g f14459b = new j(C6633z.f14675d);

    /* renamed from: c */
    private static final f f14460c;

    /* renamed from: d */
    private static final Comparator<AbstractC6580g> f14461d;

    /* renamed from: a */
    private int f14462a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.g$a */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: a */
        private int f14463a = 0;

        /* renamed from: b */
        private final int f14464b;

        a() {
            this.f14464b = AbstractC6580g.this.size();
        }

        @Override // com.google.protobuf.AbstractC6580g.g
        /* renamed from: b */
        public byte mo18532b() {
            int i10 = this.f14463a;
            if (i10 >= this.f14464b) {
                throw new NoSuchElementException();
            }
            this.f14463a = i10 + 1;
            return AbstractC6580g.this.mo18522o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14463a < this.f14464b;
        }
    }

    /* renamed from: com.google.protobuf.g$b */
    /* loaded from: classes2.dex */
    class b implements Comparator<AbstractC6580g> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC6580g abstractC6580g, AbstractC6580g abstractC6580g2) {
            g it = abstractC6580g.iterator();
            g it2 = abstractC6580g2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC6580g.m18517x(it.mo18532b())).compareTo(Integer.valueOf(AbstractC6580g.m18517x(it2.mo18532b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC6580g.size()).compareTo(Integer.valueOf(abstractC6580g2.size()));
        }
    }

    /* renamed from: com.google.protobuf.g$c */
    /* loaded from: classes2.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo18532b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.g$d */
    /* loaded from: classes2.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC6580g.f
        /* renamed from: a */
        public byte[] mo18535a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g$e */
    /* loaded from: classes2.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f14466f;

        /* renamed from: r */
        private final int f14467r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC6580g.m18512h(i10, i10 + i11, bArr.length);
            this.f14466f = i10;
            this.f14467r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC6580g.j
        /* renamed from: H */
        protected int mo18536H() {
            return this.f14466f;
        }

        @Override // com.google.protobuf.AbstractC6580g.j, com.google.protobuf.AbstractC6580g
        /* renamed from: d */
        public byte mo18520d(int i10) {
            AbstractC6580g.m18511f(i10, size());
            return this.f14470e[this.f14466f + i10];
        }

        @Override // com.google.protobuf.AbstractC6580g.j, com.google.protobuf.AbstractC6580g
        /* renamed from: n */
        protected void mo18521n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f14470e, mo18536H() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC6580g.j, com.google.protobuf.AbstractC6580g
        /* renamed from: o */
        byte mo18522o(int i10) {
            return this.f14470e[this.f14466f + i10];
        }

        @Override // com.google.protobuf.AbstractC6580g.j, com.google.protobuf.AbstractC6580g
        public int size() {
            return this.f14467r;
        }

        Object writeReplace() {
            return AbstractC6580g.m18508D(m18529w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g$f */
    /* loaded from: classes2.dex */
    public interface f {
        /* renamed from: a */
        byte[] mo18535a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.g$g */
    /* loaded from: classes2.dex */
    public interface g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo18532b();
    }

    /* renamed from: com.google.protobuf.g$h */
    /* loaded from: classes2.dex */
    static final class h {

        /* renamed from: a */
        private final AbstractC6589j f14468a;

        /* renamed from: b */
        private final byte[] f14469b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f14469b = bArr;
            this.f14468a = AbstractC6589j.m18737f0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* renamed from: a */
        public AbstractC6580g m18537a() {
            this.f14468a.m18786c();
            return new j(this.f14469b);
        }

        /* renamed from: b */
        public AbstractC6589j m18538b() {
            return this.f14468a;
        }
    }

    /* renamed from: com.google.protobuf.g$i */
    /* loaded from: classes2.dex */
    static abstract class i extends AbstractC6580g {
        i() {
        }

        @Override // com.google.protobuf.AbstractC6580g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g$j */
    /* loaded from: classes2.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f14470e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f14470e = bArr;
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: F */
        final void mo18519F(AbstractC6577f abstractC6577f) {
            abstractC6577f.mo18454a(this.f14470e, mo18536H(), size());
        }

        /* renamed from: G */
        final boolean m18539G(AbstractC6580g abstractC6580g, int i10, int i11) {
            if (i11 > abstractC6580g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC6580g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC6580g.size());
            }
            if (!(abstractC6580g instanceof j)) {
                return abstractC6580g.mo18528v(i10, i12).equals(mo18528v(0, i11));
            }
            j jVar = (j) abstractC6580g;
            byte[] bArr = this.f14470e;
            byte[] bArr2 = jVar.f14470e;
            int mo18536H = mo18536H() + i11;
            int mo18536H2 = mo18536H();
            int mo18536H3 = jVar.mo18536H() + i10;
            while (mo18536H2 < mo18536H) {
                if (bArr[mo18536H2] != bArr2[mo18536H3]) {
                    return false;
                }
                mo18536H2++;
                mo18536H3++;
            }
            return true;
        }

        /* renamed from: H */
        protected int mo18536H() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: d */
        public byte mo18520d(int i10) {
            return this.f14470e[i10];
        }

        @Override // com.google.protobuf.AbstractC6580g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC6580g) || size() != ((AbstractC6580g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int m18527u = m18527u();
            int m18527u2 = jVar.m18527u();
            if (m18527u == 0 || m18527u2 == 0 || m18527u == m18527u2) {
                return m18539G(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: n */
        protected void mo18521n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f14470e, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: o */
        byte mo18522o(int i10) {
            return this.f14470e[i10];
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: p */
        public final boolean mo18523p() {
            int mo18536H = mo18536H();
            return C6618s1.m19119n(this.f14470e, mo18536H, size() + mo18536H);
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: s */
        public final AbstractC6583h mo18525s() {
            return AbstractC6583h.m18555j(this.f14470e, mo18536H(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC6580g
        public int size() {
            return this.f14470e.length;
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: t */
        protected final int mo18526t(int i10, int i11, int i12) {
            return C6633z.m19355i(i10, this.f14470e, mo18536H() + i11, i12);
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: v */
        public final AbstractC6580g mo18528v(int i10, int i11) {
            int m18512h = AbstractC6580g.m18512h(i10, i11, size());
            return m18512h == 0 ? AbstractC6580g.f14459b : new e(this.f14470e, mo18536H() + i10, m18512h);
        }

        @Override // com.google.protobuf.AbstractC6580g
        /* renamed from: z */
        protected final String mo18531z(Charset charset) {
            return new String(this.f14470e, mo18536H(), size(), charset);
        }
    }

    /* renamed from: com.google.protobuf.g$k */
    /* loaded from: classes2.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.AbstractC6580g.f
        /* renamed from: a */
        public byte[] mo18535a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f14460c = C6571d.m18422c() ? new k(aVar) : new d(aVar);
        f14461d = new b();
    }

    AbstractC6580g() {
    }

    /* renamed from: C */
    private String m18507C() {
        if (size() <= 50) {
            return C6597l1.m18935a(this);
        }
        return C6597l1.m18935a(mo18528v(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static AbstractC6580g m18508D(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static AbstractC6580g m18509E(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* renamed from: f */
    static void m18511f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* renamed from: h */
    static int m18512h(int i10, int i11, int i12) {
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

    /* renamed from: k */
    public static AbstractC6580g m18513k(byte[] bArr) {
        return m18514l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static AbstractC6580g m18514l(byte[] bArr, int i10, int i11) {
        m18512h(i10, i10 + i11, bArr.length);
        return new j(f14460c.mo18535a(bArr, i10, i11));
    }

    /* renamed from: m */
    public static AbstractC6580g m18515m(String str) {
        return new j(str.getBytes(C6633z.f14673b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static h m18516r(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m18517x(byte b10) {
        return b10 & 255;
    }

    /* renamed from: A */
    public final String m18518A() {
        return m18530y(C6633z.f14673b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo18519F(AbstractC6577f abstractC6577f);

    /* renamed from: d */
    public abstract byte mo18520d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f14462a;
        if (i10 == 0) {
            int size = size();
            i10 = mo18526t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f14462a = i10;
        }
        return i10;
    }

    /* renamed from: n */
    protected abstract void mo18521n(byte[] bArr, int i10, int i11, int i12);

    /* renamed from: o */
    abstract byte mo18522o(int i10);

    /* renamed from: p */
    public abstract boolean mo18523p();

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    /* renamed from: s */
    public abstract AbstractC6583h mo18525s();

    public abstract int size();

    /* renamed from: t */
    protected abstract int mo18526t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m18507C());
    }

    /* renamed from: u */
    protected final int m18527u() {
        return this.f14462a;
    }

    /* renamed from: v */
    public abstract AbstractC6580g mo18528v(int i10, int i11);

    /* renamed from: w */
    public final byte[] m18529w() {
        int size = size();
        if (size == 0) {
            return C6633z.f14675d;
        }
        byte[] bArr = new byte[size];
        mo18521n(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: y */
    public final String m18530y(Charset charset) {
        return size() == 0 ? "" : mo18531z(charset);
    }

    /* renamed from: z */
    protected abstract String mo18531z(Charset charset);
}
