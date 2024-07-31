package b0;

import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.u1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface k extends u1 {
    public static final n0.a<Executor> E = n0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor R(Executor executor) {
        return (Executor) g(E, executor);
    }
}
