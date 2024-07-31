package e2;

import java.util.Objects;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final n[] f14449a;

    /* renamed from: b */
    private final String f14450b;

    /* renamed from: c */
    private final byte[] f14451c;

    /* renamed from: d */
    private final int f14452d;

    public m(String str, n[] nVarArr) {
        this.f14450b = str;
        this.f14451c = null;
        this.f14449a = nVarArr;
        this.f14452d = 0;
    }

    public m(byte[] bArr, n[] nVarArr) {
        Objects.requireNonNull(bArr);
        this.f14451c = bArr;
        this.f14450b = null;
        this.f14449a = nVarArr;
        this.f14452d = 1;
    }

    private void a(int i10) {
        if (i10 == this.f14452d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f14452d) + " expected, but got " + f(i10));
    }

    private String f(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f14451c);
        return this.f14451c;
    }

    public String c() {
        a(0);
        return this.f14450b;
    }

    public n[] d() {
        return this.f14449a;
    }

    public int e() {
        return this.f14452d;
    }
}
