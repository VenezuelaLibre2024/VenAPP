package x0;

/* loaded from: classes.dex */
final class j<T> extends n<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f30247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Throwable readException) {
        super(null);
        kotlin.jvm.internal.n.e(readException, "readException");
        this.f30247a = readException;
    }

    public final Throwable a() {
        return this.f30247a;
    }
}
