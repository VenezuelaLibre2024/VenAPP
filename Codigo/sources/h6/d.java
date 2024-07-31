package h6;

import h6.p;
import java.util.Arrays;

/* loaded from: classes.dex */
final class d extends p {

    /* renamed from: a */
    private final String f16426a;

    /* renamed from: b */
    private final byte[] f16427b;

    /* renamed from: c */
    private final f6.d f16428c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends p.a {

        /* renamed from: a */
        private String f16429a;

        /* renamed from: b */
        private byte[] f16430b;

        /* renamed from: c */
        private f6.d f16431c;

        @Override // h6.p.a
        public p a() {
            String str = "";
            if (this.f16429a == null) {
                str = " backendName";
            }
            if (this.f16431c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f16429a, this.f16430b, this.f16431c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // h6.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f16429a = str;
            return this;
        }

        @Override // h6.p.a
        public p.a c(byte[] bArr) {
            this.f16430b = bArr;
            return this;
        }

        @Override // h6.p.a
        public p.a d(f6.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f16431c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, f6.d dVar) {
        this.f16426a = str;
        this.f16427b = bArr;
        this.f16428c = dVar;
    }

    /* synthetic */ d(String str, byte[] bArr, f6.d dVar, a aVar) {
        this(str, bArr, dVar);
    }

    @Override // h6.p
    public String b() {
        return this.f16426a;
    }

    @Override // h6.p
    public byte[] c() {
        return this.f16427b;
    }

    @Override // h6.p
    public f6.d d() {
        return this.f16428c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f16426a.equals(pVar.b())) {
            if (Arrays.equals(this.f16427b, pVar instanceof d ? ((d) pVar).f16427b : pVar.c()) && this.f16428c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f16426a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16427b)) * 1000003) ^ this.f16428c.hashCode();
    }
}
