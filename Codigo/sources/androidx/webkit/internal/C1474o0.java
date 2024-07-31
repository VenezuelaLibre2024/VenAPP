package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* renamed from: androidx.webkit.internal.o0 */
/* loaded from: classes.dex */
public class C1474o0 {

    /* renamed from: a */
    private final WebViewCookieManagerBoundaryInterface f6458a;

    public C1474o0(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f6458a = webViewCookieManagerBoundaryInterface;
    }

    /* renamed from: a */
    public List<String> m8403a(String str) {
        return this.f6458a.getCookieInfo(str);
    }
}
