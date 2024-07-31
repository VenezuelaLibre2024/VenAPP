package p129h3;

import androidx.collection.C0731a;
import java.security.MessageDigest;
import p036c4.C1861b;

/* renamed from: h3.h */
/* loaded from: classes.dex */
public final class C7624h implements InterfaceC7622f {

    /* renamed from: b */
    private final C0731a<C7623g<?>, Object> f18012b = new C1861b();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private static <T> void m23146g(C7623g<T> c7623g, Object obj, MessageDigest messageDigest) {
        c7623g.m23144g(obj, messageDigest);
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f18012b.size(); i10++) {
            m23146g(this.f18012b.m3711j(i10), this.f18012b.m3715n(i10), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T m23147c(C7623g<T> c7623g) {
        return this.f18012b.containsKey(c7623g) ? (T) this.f18012b.get(c7623g) : c7623g.m23143c();
    }

    /* renamed from: d */
    public void m23148d(C7624h c7624h) {
        this.f18012b.mo3712k(c7624h.f18012b);
    }

    /* renamed from: e */
    public C7624h m23149e(C7623g<?> c7623g) {
        this.f18012b.remove(c7623g);
        return this;
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (obj instanceof C7624h) {
            return this.f18012b.equals(((C7624h) obj).f18012b);
        }
        return false;
    }

    /* renamed from: f */
    public <T> C7624h m23150f(C7623g<T> c7623g, T t10) {
        this.f18012b.put(c7623g, t10);
        return this;
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return this.f18012b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f18012b + '}';
    }
}
