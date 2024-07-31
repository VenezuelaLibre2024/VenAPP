package p361t6;

/* renamed from: t6.s1 */
/* loaded from: classes.dex */
public final class C11098s1 extends RuntimeException {

    /* renamed from: a */
    public final int f28711a;

    public C11098s1(int i10) {
        super(m34473a(i10));
        this.f28711a = i10;
    }

    /* renamed from: a */
    private static String m34473a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
