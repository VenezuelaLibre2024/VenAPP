package xc;

import java.util.Arrays;
import xc.f0;

/* loaded from: classes.dex */
final class g extends f0.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31001a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f31002b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31003a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f31004b;

        @Override // xc.f0.d.b.a
        public f0.d.b a() {
            String str = "";
            if (this.f31003a == null) {
                str = " filename";
            }
            if (this.f31004b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new g(this.f31003a, this.f31004b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.d.b.a
        public f0.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f31004b = bArr;
            return this;
        }

        @Override // xc.f0.d.b.a
        public f0.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f31003a = str;
            return this;
        }
    }

    private g(String str, byte[] bArr) {
        this.f31001a = str;
        this.f31002b = bArr;
    }

    @Override // xc.f0.d.b
    public byte[] b() {
        return this.f31002b;
    }

    @Override // xc.f0.d.b
    public String c() {
        return this.f31001a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d.b)) {
            return false;
        }
        f0.d.b bVar = (f0.d.b) obj;
        if (this.f31001a.equals(bVar.c())) {
            if (Arrays.equals(this.f31002b, bVar instanceof g ? ((g) bVar).f31002b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31001a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31002b);
    }

    public String toString() {
        return "File{filename=" + this.f31001a + ", contents=" + Arrays.toString(this.f31002b) + "}";
    }
}
