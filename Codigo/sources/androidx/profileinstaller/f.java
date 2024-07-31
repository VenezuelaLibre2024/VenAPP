package androidx.profileinstaller;

/* loaded from: classes.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    f(long j10) {
        this.mValue = j10;
    }

    public long h() {
        return this.mValue;
    }
}
