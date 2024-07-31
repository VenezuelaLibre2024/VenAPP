package p082eb;

/* renamed from: eb.r */
/* loaded from: classes2.dex */
final class C7162r<T> extends AbstractC7156l<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final T f16035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7162r(T t10) {
        this.f16035a = t10;
    }

    @Override // p082eb.AbstractC7156l
    /* renamed from: b */
    public T mo21242b() {
        return this.f16035a;
    }

    @Override // p082eb.AbstractC7156l
    /* renamed from: c */
    public boolean mo21243c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7162r) {
            return this.f16035a.equals(((C7162r) obj).f16035a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16035a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f16035a + ")";
    }
}
