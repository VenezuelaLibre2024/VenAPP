package p109fh;

import p067dh.C6971j;
import p067dh.EnumC6967f;
import p067dh.EnumC6969h;

/* renamed from: fh.g */
/* loaded from: classes2.dex */
public final class C7355g {

    /* renamed from: a */
    private EnumC6969h f16644a;

    /* renamed from: b */
    private EnumC6967f f16645b;

    /* renamed from: c */
    private C6971j f16646c;

    /* renamed from: d */
    private int f16647d = -1;

    /* renamed from: e */
    private C7350b f16648e;

    /* renamed from: b */
    public static boolean m22182b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    /* renamed from: a */
    public C7350b m22183a() {
        return this.f16648e;
    }

    /* renamed from: c */
    public void m22184c(EnumC6967f enumC6967f) {
        this.f16645b = enumC6967f;
    }

    /* renamed from: d */
    public void m22185d(int i10) {
        this.f16647d = i10;
    }

    /* renamed from: e */
    public void m22186e(C7350b c7350b) {
        this.f16648e = c7350b;
    }

    /* renamed from: f */
    public void m22187f(EnumC6969h enumC6969h) {
        this.f16644a = enumC6969h;
    }

    /* renamed from: g */
    public void m22188g(C6971j c6971j) {
        this.f16646c = c6971j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f16644a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f16645b);
        sb2.append("\n version: ");
        sb2.append(this.f16646c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f16647d);
        if (this.f16648e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f16648e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
