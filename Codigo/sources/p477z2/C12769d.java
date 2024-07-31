package p477z2;

import io.flutter.plugin.common.MethodChannel;
import p455y2.EnumC12584b;

/* renamed from: z2.d */
/* loaded from: classes.dex */
public class C12769d implements InterfaceC12764a0 {

    /* renamed from: a */
    private MethodChannel.Result f34817a;

    public C12769d(MethodChannel.Result result) {
        this.f34817a = result;
    }

    @Override // p477z2.InterfaceC12764a0
    /* renamed from: a */
    public void mo42357a(EnumC12584b enumC12584b) {
        this.f34817a.error(enumC12584b.toString(), enumC12584b.m41328h(), null);
    }

    @Override // p477z2.InterfaceC12764a0
    /* renamed from: b */
    public void mo42358b(boolean z10) {
        this.f34817a.success(Boolean.valueOf(z10));
    }
}
