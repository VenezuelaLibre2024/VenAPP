package androidx.browser.customtabs;

import android.os.Bundle;

/* renamed from: androidx.browser.customtabs.a */
/* loaded from: classes.dex */
public final class C0391a {

    /* renamed from: a */
    public final Integer f2034a;

    /* renamed from: b */
    public final Integer f2035b;

    /* renamed from: c */
    public final Integer f2036c;

    /* renamed from: d */
    public final Integer f2037d;

    /* renamed from: androidx.browser.customtabs.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Integer f2038a;

        /* renamed from: b */
        private Integer f2039b;

        /* renamed from: c */
        private Integer f2040c;

        /* renamed from: d */
        private Integer f2041d;

        /* renamed from: a */
        public C0391a m2086a() {
            return new C0391a(this.f2038a, this.f2039b, this.f2040c, this.f2041d);
        }

        /* renamed from: b */
        public a m2087b(int i10) {
            this.f2040c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        /* renamed from: c */
        public a m2088c(int i10) {
            this.f2041d = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: d */
        public a m2089d(int i10) {
            this.f2039b = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public a m2090e(int i10) {
            this.f2038a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    C0391a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f2034a = num;
        this.f2035b = num2;
        this.f2036c = num3;
        this.f2037d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle m2085a() {
        Bundle bundle = new Bundle();
        Integer num = this.f2034a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f2035b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f2036c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f2037d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
