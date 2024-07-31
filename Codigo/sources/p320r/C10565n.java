package p320r;

import android.util.Size;
import android.view.Surface;
import androidx.core.util.C0984h;
import java.util.List;
import java.util.Objects;
import p320r.C10557f;

/* renamed from: r.n */
/* loaded from: classes.dex */
class C10565n implements C10557f.a {

    /* renamed from: a */
    final Object f26582a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final List<Surface> f26583a;

        /* renamed from: b */
        final Size f26584b;

        /* renamed from: c */
        final int f26585c;

        /* renamed from: d */
        final int f26586d;

        /* renamed from: e */
        String f26587e;

        /* renamed from: f */
        boolean f26588f;

        /* renamed from: g */
        long f26589g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f26584b.equals(aVar.f26584b) || this.f26585c != aVar.f26585c || this.f26586d != aVar.f26586d || this.f26588f != aVar.f26588f || this.f26589g != aVar.f26589g || !Objects.equals(this.f26587e, aVar.f26587e)) {
                return false;
            }
            int min = Math.min(this.f26583a.size(), aVar.f26583a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f26583a.get(i10) != aVar.f26583a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f26583a.hashCode() ^ 31;
            int i10 = this.f26586d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f26584b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f26585c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f26588f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f26587e;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i13;
            return Long.hashCode(this.f26589g) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10565n(Object obj) {
        this.f26582a = obj;
    }

    @Override // p320r.C10557f.a
    /* renamed from: a */
    public void mo32061a(long j10) {
    }

    @Override // p320r.C10557f.a
    /* renamed from: b */
    public void mo32062b(Surface surface) {
        C0984h.m4834l(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!mo32069h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // p320r.C10557f.a
    /* renamed from: c */
    public void mo32063c(long j10) {
        ((a) this.f26582a).f26589g = j10;
    }

    @Override // p320r.C10557f.a
    /* renamed from: d */
    public void mo32064d(String str) {
        ((a) this.f26582a).f26587e = str;
    }

    @Override // p320r.C10557f.a
    /* renamed from: e */
    public String mo32065e() {
        return ((a) this.f26582a).f26587e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10565n) {
            return Objects.equals(this.f26582a, ((C10565n) obj).f26582a);
        }
        return false;
    }

    @Override // p320r.C10557f.a
    /* renamed from: f */
    public void mo32066f() {
        ((a) this.f26582a).f26588f = true;
    }

    @Override // p320r.C10557f.a
    /* renamed from: g */
    public Object mo32067g() {
        return null;
    }

    @Override // p320r.C10557f.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f26582a).f26583a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: h */
    boolean mo32069h() {
        return ((a) this.f26582a).f26588f;
    }

    public int hashCode() {
        return this.f26582a.hashCode();
    }
}
