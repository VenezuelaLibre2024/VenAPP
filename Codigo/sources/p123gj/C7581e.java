package p123gj;

/* renamed from: gj.e */
/* loaded from: classes3.dex */
final class C7581e extends AbstractC7580d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7581e(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p123gj.AbstractC7580d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo23027a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + mo616h() + ", " + get() + ")";
    }
}
