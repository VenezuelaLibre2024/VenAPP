package androidx.camera.core.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f2452a = obj;
    }

    @Override // androidx.camera.core.impl.b1
    public Object b() {
        return this.f2452a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return this.f2452a.equals(((b1) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2452a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f2452a + "}";
    }
}
