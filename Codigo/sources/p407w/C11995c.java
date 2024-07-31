package p407w;

import p407w.AbstractC12032q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.c */
/* loaded from: classes.dex */
public final class C11995c extends AbstractC12032q.a {

    /* renamed from: a */
    private final int f31898a;

    /* renamed from: b */
    private final Throwable f31899b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11995c(int i10, Throwable th2) {
        this.f31898a = i10;
        this.f31899b = th2;
    }

    @Override // p407w.AbstractC12032q.a
    /* renamed from: c */
    public Throwable mo38572c() {
        return this.f31899b;
    }

    @Override // p407w.AbstractC12032q.a
    /* renamed from: d */
    public int mo38573d() {
        return this.f31898a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12032q.a)) {
            return false;
        }
        AbstractC12032q.a aVar = (AbstractC12032q.a) obj;
        if (this.f31898a == aVar.mo38573d()) {
            Throwable th2 = this.f31899b;
            Throwable mo38572c = aVar.mo38572c();
            if (th2 == null) {
                if (mo38572c == null) {
                    return true;
                }
            } else if (th2.equals(mo38572c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f31898a ^ 1000003) * 1000003;
        Throwable th2 = this.f31899b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f31898a + ", cause=" + this.f31899b + "}";
    }
}
