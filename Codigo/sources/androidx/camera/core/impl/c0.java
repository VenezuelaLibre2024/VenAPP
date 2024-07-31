package androidx.camera.core.impl;

import androidx.camera.core.w;
import java.util.Collection;

/* loaded from: classes.dex */
public interface c0 extends w.i, w.d {

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

        public boolean h() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // w.i
    default w.j a() {
        return d();
    }

    @Override // w.i
    default w.o b() {
        return i();
    }

    y d();

    default u e() {
        return x.a();
    }

    default void f(boolean z10) {
    }

    void g(Collection<androidx.camera.core.w> collection);

    void h(Collection<androidx.camera.core.w> collection);

    b0 i();

    default boolean j() {
        return b().getLensFacing() == 0;
    }

    default void l(u uVar) {
    }

    default boolean m() {
        return true;
    }
}
