package vi;

/* renamed from: vi.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11949u0 {

    /* renamed from: vi.u0$a */
    /* loaded from: classes3.dex */
    public static final class a extends RuntimeException {
        private static final long serialVersionUID = 1;

        public a(String str) {
            super(str);
        }
    }

    /* renamed from: d */
    public static AbstractC11949u0 m38273d() {
        AbstractC11949u0 m38287d = C11951v0.m38284b().m38287d();
        if (m38287d != null) {
            return m38287d;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC11947t0<?> mo38274a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo38275b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo38276c();
}
