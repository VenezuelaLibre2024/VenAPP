package p469yh;

/* renamed from: yh.n */
/* loaded from: classes3.dex */
public interface InterfaceC12712n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yh.n$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC12708j {

        /* renamed from: a */
        final /* synthetic */ C12707i f34472a;

        a(C12707i c12707i) {
            this.f34472a = c12707i;
        }

        @Override // p469yh.InterfaceC12708j
        /* renamed from: a */
        public int mo41930a() {
            return this.f34472a.f34450c;
        }

        @Override // p469yh.InterfaceC12708j
        /* renamed from: b */
        public boolean mo41931b() {
            return this.f34472a.m41919F();
        }
    }

    /* renamed from: b */
    static InterfaceC12712n m41942b(String str, int i10, int i11) {
        return i10 == 1 ? new C12716r(str, i11) : new C12714p(str, i10, i11);
    }

    /* renamed from: a */
    void mo41943a(C12709k c12709k);

    /* renamed from: c */
    default void m41944c(C12707i c12707i, Runnable runnable) {
        mo41943a(new C12709k(c12707i == null ? null : new a(c12707i), runnable));
    }

    /* renamed from: d */
    void mo41945d();

    void start();
}
