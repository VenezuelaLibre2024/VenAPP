package r;

import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import r.f;

/* loaded from: classes.dex */
class n implements f.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f24468a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<Surface> f24469a;

        /* renamed from: b, reason: collision with root package name */
        final Size f24470b;

        /* renamed from: c, reason: collision with root package name */
        final int f24471c;

        /* renamed from: d, reason: collision with root package name */
        final int f24472d;

        /* renamed from: e, reason: collision with root package name */
        String f24473e;

        /* renamed from: f, reason: collision with root package name */
        boolean f24474f;

        /* renamed from: g, reason: collision with root package name */
        long f24475g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f24470b.equals(aVar.f24470b) || this.f24471c != aVar.f24471c || this.f24472d != aVar.f24472d || this.f24474f != aVar.f24474f || this.f24475g != aVar.f24475g || !Objects.equals(this.f24473e, aVar.f24473e)) {
                return false;
            }
            int min = Math.min(this.f24469a.size(), aVar.f24469a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f24469a.get(i10) != aVar.f24469a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f24469a.hashCode() ^ 31;
            int i10 = this.f24472d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f24470b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f24471c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f24474f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f24473e;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i13;
            return Long.hashCode(this.f24475g) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Object obj) {
        this.f24468a = obj;
    }

    @Override // r.f.a
    public void a(long j10) {
    }

    @Override // r.f.a
    public void b(Surface surface) {
        androidx.core.util.h.l(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // r.f.a
    public void c(long j10) {
        ((a) this.f24468a).f24475g = j10;
    }

    @Override // r.f.a
    public void d(String str) {
        ((a) this.f24468a).f24473e = str;
    }

    @Override // r.f.a
    public String e() {
        return ((a) this.f24468a).f24473e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return Objects.equals(this.f24468a, ((n) obj).f24468a);
        }
        return false;
    }

    @Override // r.f.a
    public void f() {
        ((a) this.f24468a).f24474f = true;
    }

    @Override // r.f.a
    public Object g() {
        return null;
    }

    @Override // r.f.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f24468a).f24469a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    boolean h() {
        return ((a) this.f24468a).f24474f;
    }

    public int hashCode() {
        return this.f24468a.hashCode();
    }
}
