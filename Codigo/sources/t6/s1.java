package t6;

/* loaded from: classes.dex */
public final class s1 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f26458a;

    public s1(int i10) {
        super(a(i10));
        this.f26458a = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
