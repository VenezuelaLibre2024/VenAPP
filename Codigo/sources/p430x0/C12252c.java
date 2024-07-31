package p430x0;

/* renamed from: x0.c */
/* loaded from: classes.dex */
final class C12252c<T> extends AbstractC12263n<T> {

    /* renamed from: a */
    private final T f32737a;

    /* renamed from: b */
    private final int f32738b;

    public C12252c(T t10, int i10) {
        super(null);
        this.f32737a = t10;
        this.f32738b = i10;
    }

    /* renamed from: a */
    public final void m39435a() {
        T t10 = this.f32737a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f32738b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* renamed from: b */
    public final T m39436b() {
        return this.f32737a;
    }
}
