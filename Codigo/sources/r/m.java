package r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
public class m extends l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    m(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m l(OutputConfiguration outputConfiguration) {
        return new m(outputConfiguration);
    }

    @Override // r.n, r.f.a
    public void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j10);
    }

    @Override // r.j, r.n, r.f.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // r.l, r.j, r.g, r.n, r.f.a
    public void c(long j10) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j10);
    }

    @Override // r.l, r.j, r.g, r.n, r.f.a
    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    @Override // r.l, r.j, r.g, r.n, r.f.a
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // r.n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // r.j, r.g, r.n, r.f.a
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // r.l, r.j, r.g, r.n, r.f.a
    public Object g() {
        androidx.core.util.h.a(this.f24468a instanceof OutputConfiguration);
        return this.f24468a;
    }

    @Override // r.g, r.n, r.f.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // r.n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
