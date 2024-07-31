package vc;

/* renamed from: vc.y */
/* loaded from: classes.dex */
public enum EnumC11871y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id */
    private final int f31372id;

    EnumC11871y(int i10) {
        this.f31372id = i10;
    }

    /* renamed from: b */
    public static EnumC11871y m37955b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: h */
    public int m37956h() {
        return this.f31372id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f31372id);
    }
}
