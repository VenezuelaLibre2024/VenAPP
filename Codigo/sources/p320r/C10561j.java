package p320r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0984h;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.j */
/* loaded from: classes.dex */
public class C10561j extends C10558g {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f26577a;

        /* renamed from: b */
        String f26578b;

        /* renamed from: c */
        long f26579c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f26577a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f26577a, aVar.f26577a) && this.f26579c == aVar.f26579c && Objects.equals(this.f26578b, aVar.f26578b);
        }

        public int hashCode() {
            int hashCode = this.f26577a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f26578b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f26579c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10561j(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10561j(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C10561j m32072j(OutputConfiguration outputConfiguration) {
        return new C10561j(new a(outputConfiguration));
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: b */
    public void mo32062b(Surface surface) {
        ((OutputConfiguration) mo32067g()).addSurface(surface);
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: c */
    public void mo32063c(long j10) {
        ((a) this.f26582a).f26579c = j10;
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: d */
    public void mo32064d(String str) {
        ((a) this.f26582a).f26578b = str;
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: e */
    public String mo32065e() {
        return ((a) this.f26582a).f26578b;
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: f */
    public void mo32066f() {
        ((OutputConfiguration) mo32067g()).enableSurfaceSharing();
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: g */
    public Object mo32067g() {
        C0984h.m4823a(this.f26582a instanceof a);
        return ((a) this.f26582a).f26577a;
    }

    @Override // p320r.C10558g, p320r.C10565n
    /* renamed from: h */
    final boolean mo32069h() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
