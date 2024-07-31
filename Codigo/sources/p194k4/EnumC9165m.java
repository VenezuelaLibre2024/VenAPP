package p194k4;

import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: k4.m */
/* loaded from: classes.dex */
public enum EnumC9165m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");

    public static final a Companion = new a(null);
    private final String rawValue;

    /* renamed from: k4.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC9165m m27073a(String rawValue) {
            C9322n.m27781e(rawValue, "rawValue");
            for (EnumC9165m enumC9165m : EnumC9165m.valuesCustom()) {
                if (C9322n.m27777a(enumC9165m.m27072h(), rawValue)) {
                    return enumC9165m;
                }
            }
            return null;
        }
    }

    EnumC9165m(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC9165m[] valuesCustom() {
        EnumC9165m[] valuesCustom = values();
        return (EnumC9165m[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m27072h() {
        return this.rawValue;
    }
}
