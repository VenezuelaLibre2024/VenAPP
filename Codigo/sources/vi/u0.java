package vi;

/* loaded from: classes3.dex */
public abstract class u0 {

    /* loaded from: classes3.dex */
    public static final class a extends RuntimeException {
        private static final long serialVersionUID = 1;

        public a(String str) {
            super(str);
        }
    }

    public static u0 d() {
        u0 d10 = v0.b().d();
        if (d10 != null) {
            return d10;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract t0<?> a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int c();
}
