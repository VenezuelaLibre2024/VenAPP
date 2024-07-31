package p089el;

/* renamed from: el.j0 */
/* loaded from: classes3.dex */
final /* synthetic */ class C7227j0 {

    /* renamed from: a */
    private static final int f16201a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m21593a() {
        return f16201a;
    }

    /* renamed from: b */
    public static final String m21594b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
