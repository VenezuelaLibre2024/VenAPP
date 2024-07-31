package df;

/* loaded from: classes2.dex */
public enum d implements ld.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    d(int i10) {
        this.number = i10;
    }

    @Override // ld.f
    public int a() {
        return this.number;
    }
}
