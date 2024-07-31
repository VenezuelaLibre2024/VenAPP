package p441xb;

import p179jb.C9033y;

/* renamed from: xb.b */
/* loaded from: classes2.dex */
public final class C12414b {

    /* renamed from: a */
    private final C12413a f33296a;

    private C12414b(C12413a c12413a) {
        this.f33296a = c12413a;
    }

    /* renamed from: a */
    public static C12414b m40070a(byte[] bArr, C9033y c9033y) {
        if (c9033y != null) {
            return new C12414b(C12413a.m40067a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* renamed from: b */
    public int m40071b() {
        return this.f33296a.m40069c();
    }
}
