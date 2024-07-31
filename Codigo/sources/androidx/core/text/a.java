package androidx.core.text;

import android.icu.util.ULocale;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0050a {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    public static String a(Locale locale) {
        return C0050a.c(C0050a.a(C0050a.b(locale)));
    }
}
