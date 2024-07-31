package androidx.camera.core.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.e */
/* loaded from: classes.dex */
public final class C0613e extends AbstractC0603b1 {

    /* renamed from: a */
    private final Object f2790a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0613e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f2790a = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC0603b1
    /* renamed from: b */
    public Object mo2984b() {
        return this.f2790a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0603b1) {
            return this.f2790a.equals(((AbstractC0603b1) obj).mo2984b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2790a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f2790a + "}";
    }
}
