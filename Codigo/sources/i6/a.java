package i6;

import i6.f;
import java.util.Arrays;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<h6.i> f17159a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f17160b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<h6.i> f17161a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f17162b;

        @Override // i6.f.a
        public f a() {
            String str = "";
            if (this.f17161a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f17161a, this.f17162b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i6.f.a
        public f.a b(Iterable<h6.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f17161a = iterable;
            return this;
        }

        @Override // i6.f.a
        public f.a c(byte[] bArr) {
            this.f17162b = bArr;
            return this;
        }
    }

    private a(Iterable<h6.i> iterable, byte[] bArr) {
        this.f17159a = iterable;
        this.f17160b = bArr;
    }

    @Override // i6.f
    public Iterable<h6.i> b() {
        return this.f17159a;
    }

    @Override // i6.f
    public byte[] c() {
        return this.f17160b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f17159a.equals(fVar.b())) {
            if (Arrays.equals(this.f17160b, fVar instanceof a ? ((a) fVar).f17160b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f17159a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f17160b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f17159a + ", extras=" + Arrays.toString(this.f17160b) + "}";
    }
}
