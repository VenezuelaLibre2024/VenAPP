package p022b4;

import java.security.MessageDigest;
import p036c4.C1870k;
import p129h3.InterfaceC7622f;

/* renamed from: b4.d */
/* loaded from: classes.dex */
public final class C1656d implements InterfaceC7622f {

    /* renamed from: b */
    private final Object f7040b;

    public C1656d(Object obj) {
        this.f7040b = C1870k.m9950d(obj);
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        messageDigest.update(this.f7040b.toString().getBytes(InterfaceC7622f.f18006a));
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (obj instanceof C1656d) {
            return this.f7040b.equals(((C1656d) obj).f7040b);
        }
        return false;
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return this.f7040b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f7040b + '}';
    }
}
