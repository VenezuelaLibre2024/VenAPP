package p194k4;

import java.util.Arrays;

/* renamed from: k4.j */
/* loaded from: classes.dex */
public enum EnumC9162j {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED("Search"),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");

    private final String rawValue;

    EnumC9162j(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9162j[] valuesCustom() {
        EnumC9162j[] valuesCustom = values();
        return (EnumC9162j[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27066h() {
        return this.rawValue;
    }
}
