package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: classes.dex */
public final class C0963a {

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ULocale m4785a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        static ULocale m4786b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m4787c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    /* renamed from: a */
    public static String m4784a(Locale locale) {
        return a.m4787c(a.m4785a(a.m4786b(locale)));
    }
}
