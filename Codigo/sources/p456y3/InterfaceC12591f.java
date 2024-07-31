package p456y3;

/* renamed from: y3.f */
/* loaded from: classes.dex */
public interface InterfaceC12591f {

    /* renamed from: y3.f$a */
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
        /* renamed from: b */
        public boolean m41393b() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo41381a();

    /* renamed from: b */
    boolean mo41382b(InterfaceC12590e interfaceC12590e);

    /* renamed from: c */
    void mo41383c(InterfaceC12590e interfaceC12590e);

    /* renamed from: d */
    void mo41384d(InterfaceC12590e interfaceC12590e);

    /* renamed from: f */
    boolean mo41386f(InterfaceC12590e interfaceC12590e);

    InterfaceC12591f getRoot();

    /* renamed from: i */
    boolean mo41389i(InterfaceC12590e interfaceC12590e);
}
