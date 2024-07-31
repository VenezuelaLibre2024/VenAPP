package r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f24463a;

        /* renamed from: b, reason: collision with root package name */
        String f24464b;

        /* renamed from: c, reason: collision with root package name */
        long f24465c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f24463a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f24463a, aVar.f24463a) && this.f24465c == aVar.f24465c && Objects.equals(this.f24464b, aVar.f24464b);
        }

        public int hashCode() {
            int hashCode = this.f24463a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f24464b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f24465c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j j(OutputConfiguration outputConfiguration) {
        return new j(new a(outputConfiguration));
    }

    @Override // r.n, r.f.a
    public void b(Surface surface) {
        ((OutputConfiguration) g()).addSurface(surface);
    }

    @Override // r.g, r.n, r.f.a
    public void c(long j10) {
        ((a) this.f24468a).f24465c = j10;
    }

    @Override // r.g, r.n, r.f.a
    public void d(String str) {
        ((a) this.f24468a).f24464b = str;
    }

    @Override // r.g, r.n, r.f.a
    public String e() {
        return ((a) this.f24468a).f24464b;
    }

    @Override // r.g, r.n, r.f.a
    public void f() {
        ((OutputConfiguration) g()).enableSurfaceSharing();
    }

    @Override // r.g, r.n, r.f.a
    public Object g() {
        androidx.core.util.h.a(this.f24468a instanceof a);
        return ((a) this.f24468a).f24463a;
    }

    @Override // r.g, r.n
    final boolean h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
