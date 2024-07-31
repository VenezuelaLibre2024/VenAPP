package y3;

/* loaded from: classes.dex */
public interface f {

    /* loaded from: classes.dex */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z10) {
            this.isComplete = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean b(e eVar);

    void c(e eVar);

    void d(e eVar);

    boolean f(e eVar);

    f getRoot();

    boolean i(e eVar);
}
