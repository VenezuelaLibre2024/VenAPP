package p018b0;

import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0671u1;
import java.util.concurrent.Executor;

/* renamed from: b0.k */
/* loaded from: classes.dex */
public interface InterfaceC1603k extends InterfaceC0671u1 {

    /* renamed from: E */
    public static final InterfaceC0649n0.a<Executor> f6865E = InterfaceC0649n0.a.m3199a("camerax.core.thread.backgroundExecutor", Executor.class);

    /* renamed from: R */
    default Executor m8927R(Executor executor) {
        return (Executor) mo3197g(f6865E, executor);
    }
}
