package p073e2;

import java.util.Objects;

/* renamed from: e2.m */
/* loaded from: classes.dex */
public class C7109m {

    /* renamed from: a */
    private final AbstractC7110n[] f15821a;

    /* renamed from: b */
    private final String f15822b;

    /* renamed from: c */
    private final byte[] f15823c;

    /* renamed from: d */
    private final int f15824d;

    public C7109m(String str, AbstractC7110n[] abstractC7110nArr) {
        this.f15822b = str;
        this.f15823c = null;
        this.f15821a = abstractC7110nArr;
        this.f15824d = 0;
    }

    public C7109m(byte[] bArr, AbstractC7110n[] abstractC7110nArr) {
        Objects.requireNonNull(bArr);
        this.f15823c = bArr;
        this.f15822b = null;
        this.f15821a = abstractC7110nArr;
        this.f15824d = 1;
    }

    /* renamed from: a */
    private void m20953a(int i10) {
        if (i10 == this.f15824d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + m20954f(this.f15824d) + " expected, but got " + m20954f(i10));
    }

    /* renamed from: f */
    private String m20954f(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    /* renamed from: b */
    public byte[] m20955b() {
        m20953a(1);
        Objects.requireNonNull(this.f15823c);
        return this.f15823c;
    }

    /* renamed from: c */
    public String m20956c() {
        m20953a(0);
        return this.f15822b;
    }

    /* renamed from: d */
    public AbstractC7110n[] m20957d() {
        return this.f15821a;
    }

    /* renamed from: e */
    public int m20958e() {
        return this.f15824d;
    }
}
