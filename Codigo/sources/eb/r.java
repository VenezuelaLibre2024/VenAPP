package eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r<T> extends l<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f14612a;

    public r(T t10) {
        this.f14612a = t10;
    }

    @Override // eb.l
    public T b() {
        return this.f14612a;
    }

    @Override // eb.l
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f14612a.equals(((r) obj).f14612a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14612a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f14612a + ")";
    }
}
