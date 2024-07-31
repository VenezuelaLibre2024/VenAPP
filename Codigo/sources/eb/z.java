package eb;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final z f14639a = new a();

    /* loaded from: classes2.dex */
    class a extends z {
        a() {
        }

        @Override // eb.z
        public long a() {
            return System.nanoTime();
        }
    }

    protected z() {
    }

    public static z b() {
        return f14639a;
    }

    public abstract long a();
}
