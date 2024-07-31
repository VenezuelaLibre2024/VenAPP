package vc;

/* loaded from: classes.dex */
public enum y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id, reason: collision with root package name */
    private final int f28938id;

    y(int i10) {
        this.f28938id = i10;
    }

    public static y b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int h() {
        return this.f28938id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f28938id);
    }
}
