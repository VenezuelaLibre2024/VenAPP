package p154i6;

import java.util.Arrays;
import p132h6.AbstractC7639i;
import p154i6.AbstractC7854f;

/* renamed from: i6.a */
/* loaded from: classes.dex */
final class C7849a extends AbstractC7854f {

    /* renamed from: a */
    private final Iterable<AbstractC7639i> f18819a;

    /* renamed from: b */
    private final byte[] f18820b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i6.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC7854f.a {

        /* renamed from: a */
        private Iterable<AbstractC7639i> f18821a;

        /* renamed from: b */
        private byte[] f18822b;

        @Override // p154i6.AbstractC7854f.a
        /* renamed from: a */
        public AbstractC7854f mo24146a() {
            String str = "";
            if (this.f18821a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C7849a(this.f18821a, this.f18822b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p154i6.AbstractC7854f.a
        /* renamed from: b */
        public AbstractC7854f.a mo24147b(Iterable<AbstractC7639i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f18821a = iterable;
            return this;
        }

        @Override // p154i6.AbstractC7854f.a
        /* renamed from: c */
        public AbstractC7854f.a mo24148c(byte[] bArr) {
            this.f18822b = bArr;
            return this;
        }
    }

    private C7849a(Iterable<AbstractC7639i> iterable, byte[] bArr) {
        this.f18819a = iterable;
        this.f18820b = bArr;
    }

    @Override // p154i6.AbstractC7854f
    /* renamed from: b */
    public Iterable<AbstractC7639i> mo24144b() {
        return this.f18819a;
    }

    @Override // p154i6.AbstractC7854f
    /* renamed from: c */
    public byte[] mo24145c() {
        return this.f18820b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7854f)) {
            return false;
        }
        AbstractC7854f abstractC7854f = (AbstractC7854f) obj;
        if (this.f18819a.equals(abstractC7854f.mo24144b())) {
            if (Arrays.equals(this.f18820b, abstractC7854f instanceof C7849a ? ((C7849a) abstractC7854f).f18820b : abstractC7854f.mo24145c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18819a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18820b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f18819a + ", extras=" + Arrays.toString(this.f18820b) + "}";
    }
}
