package z2;

import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel.Result f32266a;

    public d(MethodChannel.Result result) {
        this.f32266a = result;
    }

    @Override // z2.a0
    public void a(y2.b bVar) {
        this.f32266a.error(bVar.toString(), bVar.h(), null);
    }

    @Override // z2.a0
    public void b(boolean z10) {
        this.f32266a.success(Boolean.valueOf(z10));
    }
}
