package p389v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0671u1;
import p298q.C10214a;
import p389v.C11600j;
import p407w.InterfaceC12050z;

/* renamed from: v.j */
/* loaded from: classes.dex */
public class C11600j implements InterfaceC0671u1 {

    /* renamed from: G */
    private final InterfaceC0649n0 f30175G;

    /* renamed from: v.j$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC12050z<C11600j> {

        /* renamed from: a */
        private final C0647m1 f30176a = C0647m1.m3184a0();

        /* renamed from: e */
        public static a m36367e(final InterfaceC0649n0 interfaceC0649n0) {
            final a aVar = new a();
            interfaceC0649n0.mo3193c("camera2.captureRequest.option.", new InterfaceC0649n0.b() { // from class: v.i
                @Override // androidx.camera.core.impl.InterfaceC0649n0.b
                /* renamed from: a */
                public final boolean mo3201a(InterfaceC0649n0.a aVar2) {
                    boolean m36368f;
                    m36368f = C11600j.a.m36368f(C11600j.a.this, interfaceC0649n0, aVar2);
                    return m36368f;
                }
            });
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ boolean m36368f(a aVar, InterfaceC0649n0 interfaceC0649n0, InterfaceC0649n0.a aVar2) {
            aVar.mo2932a().mo3177p(aVar2, interfaceC0649n0.mo3198h(aVar2), interfaceC0649n0.mo3191a(aVar2));
            return true;
        }

        @Override // p407w.InterfaceC12050z
        /* renamed from: a */
        public InterfaceC0643l1 mo2932a() {
            return this.f30176a;
        }

        /* renamed from: d */
        public C11600j m36369d() {
            return new C11600j(C0656p1.m3211Y(this.f30176a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public <ValueT> a m36370g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f30176a.mo3178r(C10214a.m30559W(key), valuet);
            return this;
        }
    }

    public C11600j(InterfaceC0649n0 interfaceC0649n0) {
        this.f30175G = interfaceC0649n0;
    }

    @Override // androidx.camera.core.impl.InterfaceC0671u1
    /* renamed from: m */
    public InterfaceC0649n0 mo2589m() {
        return this.f30175G;
    }
}
