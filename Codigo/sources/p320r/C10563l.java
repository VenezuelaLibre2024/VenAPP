package p320r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0984h;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.l */
/* loaded from: classes.dex */
public class C10563l extends C10561j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f26580a;

        /* renamed from: b */
        long f26581b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f26580a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f26580a, aVar.f26580a) && this.f26581b == aVar.f26581b;
        }

        public int hashCode() {
            int hashCode = this.f26580a.hashCode() ^ 31;
            return Long.hashCode(this.f26581b) ^ ((hashCode << 5) - hashCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10563l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10563l(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C10563l m32074k(OutputConfiguration outputConfiguration) {
        return new C10563l(new a(outputConfiguration));
    }

    @Override // p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: c */
    public void mo32063c(long j10) {
        ((a) this.f26582a).f26581b = j10;
    }

    @Override // p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: d */
    public void mo32064d(String str) {
        ((OutputConfiguration) mo32067g()).setPhysicalCameraId(str);
    }

    @Override // p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: e */
    public String mo32065e() {
        return null;
    }

    @Override // p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: g */
    public Object mo32067g() {
        C0984h.m4823a(this.f26582a instanceof a);
        return ((a) this.f26582a).f26580a;
    }
}
