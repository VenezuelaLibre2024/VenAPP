package p452y;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0716u;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.core.util.C0984h;
import java.util.concurrent.Executor;
import p018b0.C1594b;
import p148i0.C7766h;

/* renamed from: y.x */
/* loaded from: classes.dex */
public class C12575x implements InterfaceC0623g1 {

    /* renamed from: a */
    private final InterfaceC0623g1 f34095a;

    /* renamed from: b */
    private C12541f0 f34096b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12575x(InterfaceC0623g1 interfaceC0623g1) {
        this.f34095a = interfaceC0623g1;
    }

    /* renamed from: i */
    private InterfaceC0710o m41317i(InterfaceC0710o interfaceC0710o) {
        if (interfaceC0710o == null) {
            return null;
        }
        C0984h.m4836n(this.f34096b != null, "Pending request should not be null");
        C0620f2 m3068a = C0620f2.m3068a(new Pair(this.f34096b.m41183h(), this.f34096b.m41182g().get(0)));
        this.f34096b = null;
        return new C0716u(interfaceC0710o, new Size(interfaceC0710o.getWidth(), interfaceC0710o.getHeight()), new C1594b(new C7766h(m3068a, interfaceC0710o.mo2883e1().mo8853c())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m41318j(InterfaceC0623g1.a aVar, InterfaceC0623g1 interfaceC0623g1) {
        aVar.mo2863a(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: b */
    public InterfaceC0710o mo2894b() {
        return m41317i(this.f34095a.mo2894b());
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: c */
    public int mo2895c() {
        return this.f34095a.mo2895c();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public void close() {
        this.f34095a.close();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: d */
    public void mo2896d() {
        this.f34095a.mo2896d();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: e */
    public int mo2897e() {
        return this.f34095a.mo2897e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: f */
    public void mo2898f(final InterfaceC0623g1.a aVar, Executor executor) {
        this.f34095a.mo2898f(new InterfaceC0623g1.a() { // from class: y.w
            @Override // androidx.camera.core.impl.InterfaceC0623g1.a
            /* renamed from: a */
            public final void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
                C12575x.this.m41318j(aVar, interfaceC0623g1);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: g */
    public InterfaceC0710o mo2899g() {
        return m41317i(this.f34095a.mo2899g());
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getHeight() {
        return this.f34095a.getHeight();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public Surface getSurface() {
        return this.f34095a.getSurface();
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getWidth() {
        return this.f34095a.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m41319h(C12541f0 c12541f0) {
        C0984h.m4836n(this.f34096b == null, "Pending request should be null");
        this.f34096b = c12541f0;
    }
}
