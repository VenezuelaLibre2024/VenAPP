package c4;

/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f6842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f6843b;

        a(b bVar) {
            this.f6843b = bVar;
        }

        @Override // c4.f.b
        public T get() {
            if (this.f6842a == null) {
                synchronized (this) {
                    if (this.f6842a == null) {
                        this.f6842a = (T) k.d(this.f6843b.get());
                    }
                }
            }
            return this.f6842a;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
