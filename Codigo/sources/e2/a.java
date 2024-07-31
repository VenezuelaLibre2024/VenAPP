package e2;

import android.webkit.CookieManager;
import androidx.webkit.internal.j1;
import androidx.webkit.internal.k1;
import androidx.webkit.internal.o0;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static o0 a(CookieManager cookieManager) {
        return k1.c().a(cookieManager);
    }

    public static List<String> b(CookieManager cookieManager, String str) {
        if (j1.f5574a0.d()) {
            return a(cookieManager).a(str);
        }
        throw j1.a();
    }
}
