package p073e2;

import android.webkit.CookieManager;
import androidx.webkit.internal.C1460j1;
import androidx.webkit.internal.C1463k1;
import androidx.webkit.internal.C1474o0;
import java.util.List;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public class C7097a {
    /* renamed from: a */
    private static C1474o0 m20924a(CookieManager cookieManager) {
        return C1463k1.m8376c().m8418a(cookieManager);
    }

    /* renamed from: b */
    public static List<String> m20925b(CookieManager cookieManager, String str) {
        if (C1460j1.f6425a0.mo8260d()) {
            return m20924a(cookieManager).m8403a(str);
        }
        throw C1460j1.m8361a();
    }
}
