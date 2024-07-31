package p036c4;

/* renamed from: c4.f */
/* loaded from: classes.dex */
public final class C1865f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: c4.f$a */
    /* loaded from: classes.dex */
    class a<T> implements b<T> {

        /* renamed from: a */
        private volatile T f7791a;

        /* renamed from: b */
        final /* synthetic */ b f7792b;

        a(b bVar) {
            this.f7792b = bVar;
        }

        @Override // p036c4.C1865f.b
        public T get() {
            if (this.f7791a == null) {
                synchronized (this) {
                    if (this.f7791a == null) {
                        this.f7791a = (T) C1870k.m9950d(this.f7792b.get());
                    }
                }
            }
            return this.f7791a;
        }
    }

    /* renamed from: c4.f$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        T get();
    }

    /* renamed from: a */
    public static <T> b<T> m9932a(b<T> bVar) {
        return new a(bVar);
    }
}
