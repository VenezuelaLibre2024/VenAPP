package zd;

import java.util.Iterator;

/* loaded from: classes.dex */
public class r3 {

    /* renamed from: a */
    private final q3 f32728a;

    /* renamed from: d */
    private int f32731d = 0;

    /* renamed from: c */
    private boolean f32730c = d();

    /* renamed from: b */
    private boolean f32729b = e();

    public r3(q3 q3Var) {
        this.f32728a = q3Var;
    }

    private boolean d() {
        return this.f32728a.b("fresh_install", true);
    }

    private boolean e() {
        return this.f32728a.b("test_device", false);
    }

    private void f(boolean z10) {
        this.f32730c = z10;
        this.f32728a.g("fresh_install", z10);
    }

    private void g(boolean z10) {
        this.f32729b = z10;
        this.f32728a.g("test_device", z10);
    }

    private void h() {
        if (this.f32730c) {
            int i10 = this.f32731d + 1;
            this.f32731d = i10;
            if (i10 >= 5) {
                f(false);
            }
        }
    }

    public boolean a() {
        return this.f32730c;
    }

    public boolean b() {
        return this.f32729b;
    }

    public void c(pf.e eVar) {
        if (this.f32729b) {
            return;
        }
        h();
        Iterator<of.c> it = eVar.f0().iterator();
        while (it.hasNext()) {
            if (it.next().f0()) {
                g(true);
                l2.c("Setting this device as a test device");
                return;
            }
        }
    }
}
