package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static final h f3798b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final i f3799a;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f3800a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f3800a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a10 = androidx.core.text.a.a(locale);
            if (!a10.isEmpty()) {
                return a10.equals(androidx.core.text.a.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private h(i iVar) {
        this.f3799a = iVar;
    }

    public static h a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static h b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static h d() {
        return i(b.b());
    }

    public static h e() {
        return f3798b;
    }

    public static h i(LocaleList localeList) {
        return new h(new j(localeList));
    }

    public Locale c(int i10) {
        return this.f3799a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && this.f3799a.equals(((h) obj).f3799a);
    }

    public boolean f() {
        return this.f3799a.isEmpty();
    }

    public int g() {
        return this.f3799a.size();
    }

    public String h() {
        return this.f3799a.a();
    }

    public int hashCode() {
        return this.f3799a.hashCode();
    }

    public String toString() {
        return this.f3799a.toString();
    }
}
