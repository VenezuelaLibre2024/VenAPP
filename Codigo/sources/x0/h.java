package x0;

/* loaded from: classes.dex */
final class h<T> extends n<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f30246a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable finalException) {
        super(null);
        kotlin.jvm.internal.n.e(finalException, "finalException");
        this.f30246a = finalException;
    }

    public final Throwable a() {
        return this.f30246a;
    }
}
