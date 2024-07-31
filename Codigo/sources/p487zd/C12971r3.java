package p487zd;

import java.util.Iterator;
import p275of.C9938c;
import pf.C10167e;

/* renamed from: zd.r3 */
/* loaded from: classes.dex */
public class C12971r3 {

    /* renamed from: a */
    private final C12966q3 f35279a;

    /* renamed from: d */
    private int f35282d = 0;

    /* renamed from: c */
    private boolean f35281c = m42916d();

    /* renamed from: b */
    private boolean f35280b = m42917e();

    public C12971r3(C12966q3 c12966q3) {
        this.f35279a = c12966q3;
    }

    /* renamed from: d */
    private boolean m42916d() {
        return this.f35279a.m42908b("fresh_install", true);
    }

    /* renamed from: e */
    private boolean m42917e() {
        return this.f35279a.m42908b("test_device", false);
    }

    /* renamed from: f */
    private void m42918f(boolean z10) {
        this.f35281c = z10;
        this.f35279a.m42913g("fresh_install", z10);
    }

    /* renamed from: g */
    private void m42919g(boolean z10) {
        this.f35280b = z10;
        this.f35279a.m42913g("test_device", z10);
    }

    /* renamed from: h */
    private void m42920h() {
        if (this.f35281c) {
            int i10 = this.f35282d + 1;
            this.f35282d = i10;
            if (i10 >= 5) {
                m42918f(false);
            }
        }
    }

    /* renamed from: a */
    public boolean m42921a() {
        return this.f35281c;
    }

    /* renamed from: b */
    public boolean m42922b() {
        return this.f35280b;
    }

    /* renamed from: c */
    public void m42923c(C10167e c10167e) {
        if (this.f35280b) {
            return;
        }
        m42920h();
        Iterator<C9938c> it = c10167e.m30429f0().iterator();
        while (it.hasNext()) {
            if (it.next().m29683f0()) {
                m42919g(true);
                C12940l2.m42842c("Setting this device as a test device");
                return;
            }
        }
    }
}
