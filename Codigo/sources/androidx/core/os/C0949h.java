package androidx.core.os;

import android.os.LocaleList;
import androidx.core.text.C0963a;
import java.util.Locale;

/* renamed from: androidx.core.os.h */
/* loaded from: classes.dex */
public final class C0949h {

    /* renamed from: b */
    private static final C0949h f4470b = m4716a(new Locale[0]);

    /* renamed from: a */
    private final InterfaceC0950i f4471a;

    /* renamed from: androidx.core.os.h$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static final Locale[] f4472a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        static Locale m4725a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        private static boolean m4726b(Locale locale) {
            for (Locale locale2 : f4472a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        static boolean m4727c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m4726b(locale) || m4726b(locale2)) {
                return false;
            }
            String m4784a = C0963a.m4784a(locale);
            if (!m4784a.isEmpty()) {
                return m4784a.equals(C0963a.m4784a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.h$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static LocaleList m4728a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m4729b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m4730c() {
            return LocaleList.getDefault();
        }
    }

    private C0949h(InterfaceC0950i interfaceC0950i) {
        this.f4471a = interfaceC0950i;
    }

    /* renamed from: a */
    public static C0949h m4716a(Locale... localeArr) {
        return m4720i(b.m4728a(localeArr));
    }

    /* renamed from: b */
    public static C0949h m4717b(String str) {
        if (str == null || str.isEmpty()) {
            return m4719e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.m4725a(split[i10]);
        }
        return m4716a(localeArr);
    }

    /* renamed from: d */
    public static C0949h m4718d() {
        return m4720i(b.m4729b());
    }

    /* renamed from: e */
    public static C0949h m4719e() {
        return f4470b;
    }

    /* renamed from: i */
    public static C0949h m4720i(LocaleList localeList) {
        return new C0949h(new C0951j(localeList));
    }

    /* renamed from: c */
    public Locale m4721c(int i10) {
        return this.f4471a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0949h) && this.f4471a.equals(((C0949h) obj).f4471a);
    }

    /* renamed from: f */
    public boolean m4722f() {
        return this.f4471a.isEmpty();
    }

    /* renamed from: g */
    public int m4723g() {
        return this.f4471a.size();
    }

    /* renamed from: h */
    public String m4724h() {
        return this.f4471a.mo4731a();
    }

    public int hashCode() {
        return this.f4471a.hashCode();
    }

    public String toString() {
        return this.f4471a.toString();
    }
}
