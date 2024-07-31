package androidx.webkit.internal;

import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: androidx.webkit.internal.i1 */
/* loaded from: classes.dex */
public class C1457i1 {

    /* renamed from: a */
    private final WebSettingsBoundaryInterface f6397a;

    public C1457i1(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f6397a = webSettingsBoundaryInterface;
    }

    /* renamed from: a */
    public int m8338a() {
        return this.f6397a.getDisabledActionModeMenuItems();
    }

    /* renamed from: b */
    public boolean m8339b() {
        return this.f6397a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    /* renamed from: c */
    public int m8340c() {
        return this.f6397a.getForceDark();
    }

    /* renamed from: d */
    public boolean m8341d() {
        return this.f6397a.getOffscreenPreRaster();
    }

    /* renamed from: e */
    public Set<String> m8342e() {
        return this.f6397a.getRequestedWithHeaderOriginAllowList();
    }

    /* renamed from: f */
    public boolean m8343f() {
        return this.f6397a.getSafeBrowsingEnabled();
    }

    /* renamed from: g */
    public boolean m8344g() {
        return this.f6397a.isAlgorithmicDarkeningAllowed();
    }

    /* renamed from: h */
    public void m8345h(boolean z10) {
        this.f6397a.setAlgorithmicDarkeningAllowed(z10);
    }

    /* renamed from: i */
    public void m8346i(int i10) {
        this.f6397a.setDisabledActionModeMenuItems(i10);
    }

    /* renamed from: j */
    public void m8347j(boolean z10) {
        this.f6397a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    /* renamed from: k */
    public void m8348k(int i10) {
        this.f6397a.setForceDark(i10);
    }

    /* renamed from: l */
    public void m8349l(int i10) {
        this.f6397a.setForceDarkBehavior(i10);
    }

    /* renamed from: m */
    public void m8350m(boolean z10) {
        this.f6397a.setOffscreenPreRaster(z10);
    }

    /* renamed from: n */
    public void m8351n(Set<String> set) {
        this.f6397a.setRequestedWithHeaderOriginAllowList(set);
    }

    /* renamed from: o */
    public void m8352o(boolean z10) {
        this.f6397a.setSafeBrowsingEnabled(z10);
    }

    /* renamed from: p */
    public void m8353p(boolean z10) {
        this.f6397a.setWillSuppressErrorPage(z10);
    }

    /* renamed from: q */
    public boolean m8354q() {
        return this.f6397a.getWillSuppressErrorPage();
    }
}
