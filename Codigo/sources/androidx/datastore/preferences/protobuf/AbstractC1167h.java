package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.h */
/* loaded from: classes.dex */
public abstract class AbstractC1167h implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final AbstractC1167h f4831b = new j(C1147a0.f4791c);

    /* renamed from: c */
    private static final f f4832c;

    /* renamed from: d */
    private static final Comparator<AbstractC1167h> f4833d;

    /* renamed from: a */
    private int f4834a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a */
        private int f4835a = 0;

        /* renamed from: b */
        private final int f4836b;

        a() {
            this.f4836b = AbstractC1167h.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.g
        /* renamed from: b */
        public byte mo5825b() {
            int i10 = this.f4835a;
            if (i10 >= this.f4836b) {
                throw new NoSuchElementException();
            }
            this.f4835a = i10 + 1;
            return AbstractC1167h.this.mo5815o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4835a < this.f4836b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$b */
    /* loaded from: classes.dex */
    static class b implements Comparator<AbstractC1167h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1167h abstractC1167h, AbstractC1167h abstractC1167h2) {
            g it = abstractC1167h.iterator();
            g it2 = abstractC1167h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(AbstractC1167h.m5810x(it.mo5825b()), AbstractC1167h.m5810x(it2.mo5825b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC1167h.size(), abstractC1167h2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$c */
    /* loaded from: classes.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo5825b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$d */
    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.f
        /* renamed from: a */
        public byte[] mo5828a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$e */
    /* loaded from: classes.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f4838f;

        /* renamed from: r */
        private final int f4839r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1167h.m5805h(i10, i10 + i11, bArr.length);
            this.f4838f = i10;
            this.f4839r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.j
        /* renamed from: G */
        protected int mo5829G() {
            return this.f4838f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.j, androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: d */
        public byte mo5813d(int i10) {
            AbstractC1167h.m5804f(i10, size());
            return this.f4842e[this.f4838f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.j, androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: n */
        protected void mo5814n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f4842e, mo5829G() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.j, androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: o */
        byte mo5815o(int i10) {
            return this.f4842e[this.f4838f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.j, androidx.datastore.preferences.protobuf.AbstractC1167h
        public int size() {
            return this.f4839r;
        }

        Object writeReplace() {
            return AbstractC1167h.m5801C(m5822w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        byte[] mo5828a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$g */
    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo5825b();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$h */
    /* loaded from: classes.dex */
    static final class h {

        /* renamed from: a */
        private final AbstractC1176k f4840a;

        /* renamed from: b */
        private final byte[] f4841b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f4841b = bArr;
            this.f4840a = AbstractC1176k.m6052g0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* renamed from: a */
        public AbstractC1167h m5830a() {
            this.f4840a.m6100c();
            return new j(this.f4841b);
        }

        /* renamed from: b */
        public AbstractC1176k m5831b() {
            return this.f4840a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$i */
    /* loaded from: classes.dex */
    static abstract class i extends AbstractC1167h {
        i() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.h$j */
    /* loaded from: classes.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f4842e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f4842e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: E */
        final void mo5812E(AbstractC1164g abstractC1164g) {
            abstractC1164g.mo5791a(this.f4842e, mo5829G(), size());
        }

        /* renamed from: F */
        final boolean m5832F(AbstractC1167h abstractC1167h, int i10, int i11) {
            if (i11 > abstractC1167h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1167h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1167h.size());
            }
            if (!(abstractC1167h instanceof j)) {
                return abstractC1167h.mo5821v(i10, i12).equals(mo5821v(0, i11));
            }
            j jVar = (j) abstractC1167h;
            byte[] bArr = this.f4842e;
            byte[] bArr2 = jVar.f4842e;
            int mo5829G = mo5829G() + i11;
            int mo5829G2 = mo5829G();
            int mo5829G3 = jVar.mo5829G() + i10;
            while (mo5829G2 < mo5829G) {
                if (bArr[mo5829G2] != bArr2[mo5829G3]) {
                    return false;
                }
                mo5829G2++;
                mo5829G3++;
            }
            return true;
        }

        /* renamed from: G */
        protected int mo5829G() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: d */
        public byte mo5813d(int i10) {
            return this.f4842e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1167h) || size() != ((AbstractC1167h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int m5820u = m5820u();
            int m5820u2 = jVar.m5820u();
            if (m5820u == 0 || m5820u2 == 0 || m5820u == m5820u2) {
                return m5832F(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: n */
        protected void mo5814n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f4842e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: o */
        byte mo5815o(int i10) {
            return this.f4842e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: p */
        public final boolean mo5816p() {
            int mo5829G = mo5829G();
            return C1202s1.m6392n(this.f4842e, mo5829G, size() + mo5829G);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: s */
        public final AbstractC1170i mo5818s() {
            return AbstractC1170i.m5848j(this.f4842e, mo5829G(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        public int size() {
            return this.f4842e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: t */
        protected final int mo5819t(int i10, int i11, int i12) {
            return C1147a0.m5651i(i10, this.f4842e, mo5829G() + i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: v */
        public final AbstractC1167h mo5821v(int i10, int i11) {
            int m5805h = AbstractC1167h.m5805h(i10, i11, size());
            return m5805h == 0 ? AbstractC1167h.f4831b : new e(this.f4842e, mo5829G() + i10, m5805h);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h
        /* renamed from: z */
        protected final String mo5824z(Charset charset) {
            return new String(this.f4842e, mo5829G(), size(), charset);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.h$k */
    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1167h.f
        /* renamed from: a */
        public byte[] mo5828a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f4832c = C1155d.m5684c() ? new k(aVar) : new d(aVar);
        f4833d = new b();
    }

    AbstractC1167h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static AbstractC1167h m5801C(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static AbstractC1167h m5802D(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* renamed from: f */
    static void m5804f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* renamed from: h */
    static int m5805h(int i10, int i11, int i12) {
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
    public static AbstractC1167h m5806k(byte[] bArr) {
        return m5807l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static AbstractC1167h m5807l(byte[] bArr, int i10, int i11) {
        m5805h(i10, i10 + i11, bArr.length);
        return new j(f4832c.mo5828a(bArr, i10, i11));
    }

    /* renamed from: m */
    public static AbstractC1167h m5808m(String str) {
        return new j(str.getBytes(C1147a0.f4789a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static h m5809r(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m5810x(byte b10) {
        return b10 & 255;
    }

    /* renamed from: A */
    public final String m5811A() {
        return m5823y(C1147a0.f4789a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract void mo5812E(AbstractC1164g abstractC1164g);

    /* renamed from: d */
    public abstract byte mo5813d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f4834a;
        if (i10 == 0) {
            int size = size();
            i10 = mo5819t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f4834a = i10;
        }
        return i10;
    }

    /* renamed from: n */
    protected abstract void mo5814n(byte[] bArr, int i10, int i11, int i12);

    /* renamed from: o */
    abstract byte mo5815o(int i10);

    /* renamed from: p */
    public abstract boolean mo5816p();

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    /* renamed from: s */
    public abstract AbstractC1170i mo5818s();

    public abstract int size();

    /* renamed from: t */
    protected abstract int mo5819t(int i10, int i11, int i12);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    protected final int m5820u() {
        return this.f4834a;
    }

    /* renamed from: v */
    public abstract AbstractC1167h mo5821v(int i10, int i11);

    /* renamed from: w */
    public final byte[] m5822w() {
        int size = size();
        if (size == 0) {
            return C1147a0.f4791c;
        }
        byte[] bArr = new byte[size];
        mo5814n(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: y */
    public final String m5823y(Charset charset) {
        return size() == 0 ? "" : mo5824z(charset);
    }

    /* renamed from: z */
    protected abstract String mo5824z(Charset charset);
}
