package androidx.webkit.internal;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final WebViewCookieManagerBoundaryInterface f5607a;

    public o0(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f5607a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> a(String str) {
        return this.f5607a.getCookieInfo(str);
    }
}
