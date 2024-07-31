package yh;

/* loaded from: classes3.dex */
public interface n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f31936a;

        a(i iVar) {
            this.f31936a = iVar;
        }

        @Override // yh.j
        public int a() {
            return this.f31936a.f31914c;
        }

        @Override // yh.j
        public boolean b() {
            return this.f31936a.F();
        }
    }

    static n b(String str, int i10, int i11) {
        return i10 == 1 ? new r(str, i11) : new p(str, i10, i11);
    }

    void a(k kVar);

    default void c(i iVar, Runnable runnable) {
        a(new k(iVar == null ? null : new a(iVar), runnable));
    }

    void d();

    void start();
}
