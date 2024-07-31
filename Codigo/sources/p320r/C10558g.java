package p320r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0984h;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.g */
/* loaded from: classes.dex */
public class C10558g extends C10565n {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f26573a;

        /* renamed from: b */
        String f26574b;

        /* renamed from: c */
        boolean f26575c;

        /* renamed from: d */
        long f26576d = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f26573a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f26573a, aVar.f26573a) && this.f26575c == aVar.f26575c && this.f26576d == aVar.f26576d && Objects.equals(this.f26574b, aVar.f26574b);
        }

        public int hashCode() {
            int hashCode = this.f26573a.hashCode() ^ 31;
            int i10 = (this.f26575c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f26574b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f26576d) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10558g(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10558g(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C10558g m32068i(OutputConfiguration outputConfiguration) {
        return new C10558g(new a(outputConfiguration));
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: c */
    public void mo32063c(long j10) {
        ((a) this.f26582a).f26576d = j10;
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: d */
    public void mo32064d(String str) {
        ((a) this.f26582a).f26574b = str;
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: e */
    public String mo32065e() {
        return ((a) this.f26582a).f26574b;
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: f */
    public void mo32066f() {
        ((a) this.f26582a).f26575c = true;
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: g */
    public Object mo32067g() {
        C0984h.m4823a(this.f26582a instanceof a);
        return ((a) this.f26582a).f26573a;
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    public Surface getSurface() {
        return ((OutputConfiguration) mo32067g()).getSurface();
    }

    @Override // p320r.C10565n
    /* renamed from: h */
    boolean mo32069h() {
        return ((a) this.f26582a).f26575c;
    }
}
