package p442xc;

import java.util.Arrays;
import p442xc.AbstractC12426f0;

/* renamed from: xc.g */
/* loaded from: classes.dex */
final class C12427g extends AbstractC12426f0.d.b {

    /* renamed from: a */
    private final String f33521a;

    /* renamed from: b */
    private final byte[] f33522b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.d.b.a {

        /* renamed from: a */
        private String f33523a;

        /* renamed from: b */
        private byte[] f33524b;

        @Override // p442xc.AbstractC12426f0.d.b.a
        /* renamed from: a */
        public AbstractC12426f0.d.b mo40197a() {
            String str = "";
            if (this.f33523a == null) {
                str = " filename";
            }
            if (this.f33524b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C12427g(this.f33523a, this.f33524b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.d.b.a
        /* renamed from: b */
        public AbstractC12426f0.d.b.a mo40198b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f33524b = bArr;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.d.b.a
        /* renamed from: c */
        public AbstractC12426f0.d.b.a mo40199c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f33523a = str;
            return this;
        }
    }

    private C12427g(String str, byte[] bArr) {
        this.f33521a = str;
        this.f33522b = bArr;
    }

    @Override // p442xc.AbstractC12426f0.d.b
    /* renamed from: b */
    public byte[] mo40195b() {
        return this.f33522b;
    }

    @Override // p442xc.AbstractC12426f0.d.b
    /* renamed from: c */
    public String mo40196c() {
        return this.f33521a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.d.b)) {
            return false;
        }
        AbstractC12426f0.d.b bVar = (AbstractC12426f0.d.b) obj;
        if (this.f33521a.equals(bVar.mo40196c())) {
            if (Arrays.equals(this.f33522b, bVar instanceof C12427g ? ((C12427g) bVar).f33522b : bVar.mo40195b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33521a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33522b);
    }

    public String toString() {
        return "File{filename=" + this.f33521a + ", contents=" + Arrays.toString(this.f33522b) + "}";
    }
}
