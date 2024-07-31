package df;

/* loaded from: classes2.dex */
public enum i implements ld.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    i(int i10) {
        this.number = i10;
    }

    @Override // ld.f
    public int a() {
        return this.number;
    }
}
