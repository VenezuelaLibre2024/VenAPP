package p055d4;

/* renamed from: d4.c */
/* loaded from: classes.dex */
public abstract class AbstractC6844c {

    /* renamed from: d4.c$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC6844c {

        /* renamed from: a */
        private volatile boolean f15126a;

        b() {
            super();
        }

        @Override // p055d4.AbstractC6844c
        /* renamed from: b */
        public void mo19781b(boolean z10) {
            this.f15126a = z10;
        }

        @Override // p055d4.AbstractC6844c
        /* renamed from: c */
        public void mo19782c() {
            if (this.f15126a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private AbstractC6844c() {
    }

    /* renamed from: a */
    public static AbstractC6844c m19780a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo19781b(boolean z10);

    /* renamed from: c */
    public abstract void mo19782c();
}
