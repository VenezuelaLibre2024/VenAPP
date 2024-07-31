package p320r;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0984h;

/* renamed from: r.m */
/* loaded from: classes.dex */
public class C10564m extends C10563l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10564m(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    C10564m(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C10564m m32075l(OutputConfiguration outputConfiguration) {
        return new C10564m(outputConfiguration);
    }

    @Override // p320r.C10565n, p320r.C10557f.a
    /* renamed from: a */
    public void mo32061a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) mo32067g()).setStreamUseCase(j10);
    }

    @Override // p320r.C10561j, p320r.C10565n, p320r.C10557f.a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo32062b(Surface surface) {
        super.mo32062b(surface);
    }

    @Override // p320r.C10563l, p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: c */
    public void mo32063c(long j10) {
        ((OutputConfiguration) mo32067g()).setDynamicRangeProfile(j10);
    }

    @Override // p320r.C10563l, p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo32064d(String str) {
        super.mo32064d(str);
    }

    @Override // p320r.C10563l, p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ String mo32065e() {
        return super.mo32065e();
    }

    @Override // p320r.C10565n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo32066f() {
        super.mo32066f();
    }

    @Override // p320r.C10563l, p320r.C10561j, p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    /* renamed from: g */
    public Object mo32067g() {
        C0984h.m4823a(this.f26582a instanceof OutputConfiguration);
        return this.f26582a;
    }

    @Override // p320r.C10558g, p320r.C10565n, p320r.C10557f.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // p320r.C10565n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
