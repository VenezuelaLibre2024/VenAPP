package r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends n {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f24459a;

        /* renamed from: b, reason: collision with root package name */
        String f24460b;

        /* renamed from: c, reason: collision with root package name */
        boolean f24461c;

        /* renamed from: d, reason: collision with root package name */
        long f24462d = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f24459a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f24459a, aVar.f24459a) && this.f24461c == aVar.f24461c && this.f24462d == aVar.f24462d && Objects.equals(this.f24460b, aVar.f24460b);
        }

        public int hashCode() {
            int hashCode = this.f24459a.hashCode() ^ 31;
            int i10 = (this.f24461c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f24460b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f24462d) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g i(OutputConfiguration outputConfiguration) {
        return new g(new a(outputConfiguration));
    }

    @Override // r.n, r.f.a
    public void c(long j10) {
        ((a) this.f24468a).f24462d = j10;
    }

    @Override // r.n, r.f.a
    public void d(String str) {
        ((a) this.f24468a).f24460b = str;
    }

    @Override // r.n, r.f.a
    public String e() {
        return ((a) this.f24468a).f24460b;
    }

    @Override // r.n, r.f.a
    public void f() {
        ((a) this.f24468a).f24461c = true;
    }

    @Override // r.n, r.f.a
    public Object g() {
        androidx.core.util.h.a(this.f24468a instanceof a);
        return ((a) this.f24468a).f24459a;
    }

    @Override // r.n, r.f.a
    public Surface getSurface() {
        return ((OutputConfiguration) g()).getSurface();
    }

    @Override // r.n
    boolean h() {
        return ((a) this.f24468a).f24461c;
    }
}
