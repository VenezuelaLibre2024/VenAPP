package androidx.webkit.internal;

import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f5572a;

    public i1(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f5572a = webSettingsBoundaryInterface;
    }

    public int a() {
        return this.f5572a.getDisabledActionModeMenuItems();
    }

    public boolean b() {
        return this.f5572a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int c() {
        return this.f5572a.getForceDark();
    }

    public boolean d() {
        return this.f5572a.getOffscreenPreRaster();
    }

    public Set<String> e() {
        return this.f5572a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean f() {
        return this.f5572a.getSafeBrowsingEnabled();
    }

    public boolean g() {
        return this.f5572a.isAlgorithmicDarkeningAllowed();
    }

    public void h(boolean z10) {
        this.f5572a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void i(int i10) {
        this.f5572a.setDisabledActionModeMenuItems(i10);
    }

    public void j(boolean z10) {
        this.f5572a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z10);
    }

    public void k(int i10) {
        this.f5572a.setForceDark(i10);
    }

    public void l(int i10) {
        this.f5572a.setForceDarkBehavior(i10);
    }

    public void m(boolean z10) {
        this.f5572a.setOffscreenPreRaster(z10);
    }

    public void n(Set<String> set) {
        this.f5572a.setRequestedWithHeaderOriginAllowList(set);
    }

    public void o(boolean z10) {
        this.f5572a.setSafeBrowsingEnabled(z10);
    }

    public void p(boolean z10) {
        this.f5572a.setWillSuppressErrorPage(z10);
    }

    public boolean q() {
        return this.f5572a.getWillSuppressErrorPage();
    }
}
