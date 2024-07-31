package r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends j {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f24466a;

        /* renamed from: b, reason: collision with root package name */
        long f24467b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f24466a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f24466a, aVar.f24466a) && this.f24467b == aVar.f24467b;
        }

        public int hashCode() {
            int hashCode = this.f24466a.hashCode() ^ 31;
            return Long.hashCode(this.f24467b) ^ ((hashCode << 5) - hashCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l k(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // r.j, r.g, r.n, r.f.a
    public void c(long j10) {
        ((a) this.f24468a).f24467b = j10;
    }

    @Override // r.j, r.g, r.n, r.f.a
    public void d(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // r.j, r.g, r.n, r.f.a
    public String e() {
        return null;
    }

    @Override // r.j, r.g, r.n, r.f.a
    public Object g() {
        androidx.core.util.h.a(this.f24468a instanceof a);
        return ((a) this.f24468a).f24466a;
    }
}
