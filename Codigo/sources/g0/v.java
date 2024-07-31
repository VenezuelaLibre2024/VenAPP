package g0;

/* loaded from: classes.dex */
public class v<T> implements androidx.core.util.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private androidx.core.util.a<T> f15676a;

    public void a(androidx.core.util.a<T> aVar) {
        this.f15676a = aVar;
    }

    @Override // androidx.core.util.a
    public void accept(T t10) {
        kotlin.jvm.internal.n.c(this.f15676a, "Listener is not set.");
        this.f15676a.accept(t10);
    }
}
