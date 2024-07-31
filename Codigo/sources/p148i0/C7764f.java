package p148i0;

import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.List;
import p018b0.InterfaceC1603k;

/* renamed from: i0.f */
/* loaded from: classes.dex */
public class C7764f implements InterfaceC0640k2<C7762d>, InterfaceC0619f1, InterfaceC1603k {

    /* renamed from: H */
    static final InterfaceC0649n0.a<List<InterfaceC0644l2.b>> f18508H = InterfaceC0649n0.a.m3199a("camerax.core.streamSharing.captureTypes", List.class);

    /* renamed from: G */
    private final C0656p1 f18509G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7764f(C0656p1 c0656p1) {
        this.f18509G = c0656p1;
    }

    /* renamed from: W */
    public List<InterfaceC0644l2.b> m23696W() {
        return (List) mo3191a(f18508H);
    }

    @Override // androidx.camera.core.impl.InterfaceC0671u1
    /* renamed from: m */
    public InterfaceC0649n0 mo2589m() {
        return this.f18509G;
    }
}
