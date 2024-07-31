package androidx.camera.core.impl;

import androidx.camera.core.AbstractC0718w;
import java.util.Collection;
import p407w.InterfaceC12013i;
import p407w.InterfaceC12016j;
import p407w.InterfaceC12028o;

/* renamed from: androidx.camera.core.impl.c0 */
/* loaded from: classes.dex */
public interface InterfaceC0606c0 extends InterfaceC12013i, AbstractC0718w.d {

    /* renamed from: androidx.camera.core.impl.c0$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);

        private final boolean mHoldsCameraSlot;

        a(boolean z10) {
            this.mHoldsCameraSlot = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean m3003h() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // p407w.InterfaceC12013i
    /* renamed from: a */
    default InterfaceC12016j mo2998a() {
        return mo2489d();
    }

    @Override // p407w.InterfaceC12013i
    /* renamed from: b */
    default InterfaceC12028o mo2999b() {
        return mo2495i();
    }

    /* renamed from: d */
    InterfaceC0699y mo2489d();

    /* renamed from: e */
    default InterfaceC0669u mo2490e() {
        return C0696x.m3377a();
    }

    /* renamed from: f */
    default void mo2491f(boolean z10) {
    }

    /* renamed from: g */
    void mo2492g(Collection<AbstractC0718w> collection);

    /* renamed from: h */
    void mo2493h(Collection<AbstractC0718w> collection);

    /* renamed from: i */
    InterfaceC0602b0 mo2495i();

    /* renamed from: j */
    default boolean m3000j() {
        return mo2999b().getLensFacing() == 0;
    }

    /* renamed from: l */
    default void mo2499l(InterfaceC0669u interfaceC0669u) {
    }

    /* renamed from: m */
    default boolean mo3001m() {
        return true;
    }
}
