package p132h6;

import java.util.Arrays;
import p098f6.EnumC7300d;
import p132h6.AbstractC7646p;

/* renamed from: h6.d */
/* loaded from: classes.dex */
final class C7634d extends AbstractC7646p {

    /* renamed from: a */
    private final String f18063a;

    /* renamed from: b */
    private final byte[] f18064b;

    /* renamed from: c */
    private final EnumC7300d f18065c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h6.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC7646p.a {

        /* renamed from: a */
        private String f18066a;

        /* renamed from: b */
        private byte[] f18067b;

        /* renamed from: c */
        private EnumC7300d f18068c;

        @Override // p132h6.AbstractC7646p.a
        /* renamed from: a */
        public AbstractC7646p mo23194a() {
            String str = "";
            if (this.f18066a == null) {
                str = " backendName";
            }
            if (this.f18068c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C7634d(this.f18066a, this.f18067b, this.f18068c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p132h6.AbstractC7646p.a
        /* renamed from: b */
        public AbstractC7646p.a mo23195b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f18066a = str;
            return this;
        }

        @Override // p132h6.AbstractC7646p.a
        /* renamed from: c */
        public AbstractC7646p.a mo23196c(byte[] bArr) {
            this.f18067b = bArr;
            return this;
        }

        @Override // p132h6.AbstractC7646p.a
        /* renamed from: d */
        public AbstractC7646p.a mo23197d(EnumC7300d enumC7300d) {
            if (enumC7300d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f18068c = enumC7300d;
            return this;
        }
    }

    private C7634d(String str, byte[] bArr, EnumC7300d enumC7300d) {
        this.f18063a = str;
        this.f18064b = bArr;
        this.f18065c = enumC7300d;
    }

    @Override // p132h6.AbstractC7646p
    /* renamed from: b */
    public String mo23191b() {
        return this.f18063a;
    }

    @Override // p132h6.AbstractC7646p
    /* renamed from: c */
    public byte[] mo23192c() {
        return this.f18064b;
    }

    @Override // p132h6.AbstractC7646p
    /* renamed from: d */
    public EnumC7300d mo23193d() {
        return this.f18065c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7646p)) {
            return false;
        }
        AbstractC7646p abstractC7646p = (AbstractC7646p) obj;
        if (this.f18063a.equals(abstractC7646p.mo23191b())) {
            if (Arrays.equals(this.f18064b, abstractC7646p instanceof C7634d ? ((C7634d) abstractC7646p).f18064b : abstractC7646p.mo23192c()) && this.f18065c.equals(abstractC7646p.mo23193d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f18063a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18064b)) * 1000003) ^ this.f18065c.hashCode();
    }
}
