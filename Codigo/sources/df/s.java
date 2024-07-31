package df;

/* loaded from: classes2.dex */
public enum s implements ld.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    s(int i10) {
        this.number = i10;
    }

    @Override // ld.f
    public int a() {
        return this.number;
    }
}
