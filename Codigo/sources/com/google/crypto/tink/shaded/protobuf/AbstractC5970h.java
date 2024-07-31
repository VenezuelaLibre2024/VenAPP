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

/* renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* loaded from: classes2.dex */
public abstract class AbstractC5970h implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final AbstractC5970h f12591b = new j(C5950a0.f12552d);

    /* renamed from: c */
    private static final f f12592c;

    /* renamed from: d */
    private static final Comparator<AbstractC5970h> f12593d;

    /* renamed from: a */
    private int f12594a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: a */
        private int f12595a = 0;

        /* renamed from: b */
        private final int f12596b;

        a() {
            this.f12596b = AbstractC5970h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.g
        /* renamed from: b */
        public byte mo15505b() {
            int i10 = this.f12595a;
            if (i10 >= this.f12596b) {
                throw new NoSuchElementException();
            }
            this.f12595a = i10 + 1;
            return AbstractC5970h.this.mo15495o(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12595a < this.f12596b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    /* loaded from: classes2.dex */
    class b implements Comparator<AbstractC5970h> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC5970h abstractC5970h, AbstractC5970h abstractC5970h2) {
            g it = abstractC5970h.iterator();
            g it2 = abstractC5970h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC5970h.m15490x(it.mo15505b())).compareTo(Integer.valueOf(AbstractC5970h.m15490x(it2.mo15505b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC5970h.size()).compareTo(Integer.valueOf(abstractC5970h2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    /* loaded from: classes2.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(mo15505b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    /* loaded from: classes2.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.f
        /* renamed from: a */
        public byte[] mo15508a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    /* loaded from: classes2.dex */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        private final int f12598f;

        /* renamed from: r */
        private final int f12599r;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC5970h.m15485h(i10, i10 + i11, bArr.length);
            this.f12598f = i10;
            this.f12599r = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.j
        /* renamed from: H */
        protected int mo15509H() {
            return this.f12598f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: d */
        public byte mo15493d(int i10) {
            AbstractC5970h.m15484f(i10, size());
            return this.f12602e[this.f12598f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: n */
        protected void mo15494n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12602e, mo15509H() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: o */
        byte mo15495o(int i10) {
            return this.f12602e[this.f12598f + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.j, com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        public int size() {
            return this.f12599r;
        }

        Object writeReplace() {
            return AbstractC5970h.m15481D(m15502w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    /* loaded from: classes2.dex */
    public interface f {
        /* renamed from: a */
        byte[] mo15508a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    /* loaded from: classes2.dex */
    public interface g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo15505b();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h */
    /* loaded from: classes2.dex */
    static final class h {

        /* renamed from: a */
        private final AbstractC5979k f12600a;

        /* renamed from: b */
        private final byte[] f12601b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f12601b = bArr;
            this.f12600a = AbstractC5979k.m15729c0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* renamed from: a */
        public AbstractC5970h m15510a() {
            this.f12600a.m15772c();
            return new j(this.f12601b);
        }

        /* renamed from: b */
        public AbstractC5979k m15511b() {
            return this.f12600a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    /* loaded from: classes2.dex */
    static abstract class i extends AbstractC5970h {
        i() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    /* loaded from: classes2.dex */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        protected final byte[] f12602e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f12602e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: F */
        final void mo15492F(AbstractC5967g abstractC5967g) {
            abstractC5967g.mo15469a(this.f12602e, mo15509H(), size());
        }

        /* renamed from: G */
        final boolean m15512G(AbstractC5970h abstractC5970h, int i10, int i11) {
            if (i11 > abstractC5970h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC5970h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC5970h.size());
            }
            if (!(abstractC5970h instanceof j)) {
                return abstractC5970h.mo15501v(i10, i12).equals(mo15501v(0, i11));
            }
            j jVar = (j) abstractC5970h;
            byte[] bArr = this.f12602e;
            byte[] bArr2 = jVar.f12602e;
            int mo15509H = mo15509H() + i11;
            int mo15509H2 = mo15509H();
            int mo15509H3 = jVar.mo15509H() + i10;
            while (mo15509H2 < mo15509H) {
                if (bArr[mo15509H2] != bArr2[mo15509H3]) {
                    return false;
                }
                mo15509H2++;
                mo15509H3++;
            }
            return true;
        }

        /* renamed from: H */
        protected int mo15509H() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: d */
        public byte mo15493d(int i10) {
            return this.f12602e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5970h) || size() != ((AbstractC5970h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int m15500u = m15500u();
            int m15500u2 = jVar.m15500u();
            if (m15500u == 0 || m15500u2 == 0 || m15500u == m15500u2) {
                return m15512G(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: n */
        protected void mo15494n(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f12602e, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: o */
        byte mo15495o(int i10) {
            return this.f12602e[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: p */
        public final boolean mo15496p() {
            int mo15509H = mo15509H();
            return C6005s1.m16057n(this.f12602e, mo15509H, size() + mo15509H);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: s */
        public final AbstractC5973i mo15498s() {
            return AbstractC5973i.m15528j(this.f12602e, mo15509H(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        public int size() {
            return this.f12602e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: t */
        protected final int mo15499t(int i10, int i11, int i12) {
            return C5950a0.m15310i(i10, this.f12602e, mo15509H() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: v */
        public final AbstractC5970h mo15501v(int i10, int i11) {
            int m15485h = AbstractC5970h.m15485h(i10, i11, size());
            return m15485h == 0 ? AbstractC5970h.f12591b : new e(this.f12602e, mo15509H() + i10, m15485h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h
        /* renamed from: z */
        protected final String mo15504z(Charset charset) {
            return new String(this.f12602e, mo15509H(), size(), charset);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    /* loaded from: classes2.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5970h.f
        /* renamed from: a */
        public byte[] mo15508a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f12592c = C5958d.m15344c() ? new k(aVar) : new d(aVar);
        f12593d = new b();
    }

    AbstractC5970h() {
    }

    /* renamed from: C */
    private String m15480C() {
        if (size() <= 50) {
            return C5984l1.m15861a(this);
        }
        return C5984l1.m15861a(mo15501v(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static AbstractC5970h m15481D(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static AbstractC5970h m15482E(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* renamed from: f */
    static void m15484f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* renamed from: h */
    static int m15485h(int i10, int i11, int i12) {
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
    public static AbstractC5970h m15486k(byte[] bArr) {
        return m15487l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static AbstractC5970h m15487l(byte[] bArr, int i10, int i11) {
        m15485h(i10, i10 + i11, bArr.length);
        return new j(f12592c.mo15508a(bArr, i10, i11));
    }

    /* renamed from: m */
    public static AbstractC5970h m15488m(String str) {
        return new j(str.getBytes(C5950a0.f12550b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static h m15489r(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m15490x(byte b10) {
        return b10 & 255;
    }

    /* renamed from: A */
    public final String m15491A() {
        return m15503y(C5950a0.f12550b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo15492F(AbstractC5967g abstractC5967g);

    /* renamed from: d */
    public abstract byte mo15493d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f12594a;
        if (i10 == 0) {
            int size = size();
            i10 = mo15499t(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f12594a = i10;
        }
        return i10;
    }

    /* renamed from: n */
    protected abstract void mo15494n(byte[] bArr, int i10, int i11, int i12);

    /* renamed from: o */
    abstract byte mo15495o(int i10);

    /* renamed from: p */
    public abstract boolean mo15496p();

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    /* renamed from: s */
    public abstract AbstractC5973i mo15498s();

    public abstract int size();

    /* renamed from: t */
    protected abstract int mo15499t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m15480C());
    }

    /* renamed from: u */
    protected final int m15500u() {
        return this.f12594a;
    }

    /* renamed from: v */
    public abstract AbstractC5970h mo15501v(int i10, int i11);

    /* renamed from: w */
    public final byte[] m15502w() {
        int size = size();
        if (size == 0) {
            return C5950a0.f12552d;
        }
        byte[] bArr = new byte[size];
        mo15494n(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: y */
    public final String m15503y(Charset charset) {
        return size() == 0 ? "" : mo15504z(charset);
    }

    /* renamed from: z */
    protected abstract String mo15504z(Charset charset);
}
