package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1732b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1733c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1734d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0023a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f1735a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f1736b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1737c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f1738d;

        public a a() {
            return new a(this.f1735a, this.f1736b, this.f1737c, this.f1738d);
        }

        public C0023a b(int i10) {
            this.f1737c = Integer.valueOf(i10 | (-16777216));
            return this;
        }

        public C0023a c(int i10) {
            this.f1738d = Integer.valueOf(i10);
            return this;
        }

        public C0023a d(int i10) {
            this.f1736b = Integer.valueOf(i10);
            return this;
        }

        public C0023a e(int i10) {
            this.f1735a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1731a = num;
        this.f1732b = num2;
        this.f1733c = num3;
        this.f1734d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1731a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1732b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1733c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1734d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
