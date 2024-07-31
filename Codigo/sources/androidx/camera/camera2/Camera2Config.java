package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.camera2.internal.g1;
import androidx.camera.camera2.internal.k1;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.z;
import java.util.Set;
import w.n0;
import w.p;
import w.r;
import w.w;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements w.b {
        @Override // w.w.b
        public w getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static w c() {
        a0.a aVar = new a0.a() { // from class: p.a
            @Override // androidx.camera.core.impl.a0.a
            public final a0 a(Context context, i0 i0Var, p pVar) {
                return new androidx.camera.camera2.internal.w(context, i0Var, pVar);
            }
        };
        z.a aVar2 = new z.a() { // from class: p.b
            @Override // androidx.camera.core.impl.z.a
            public final z a(Context context, Object obj, Set set) {
                z d10;
                d10 = Camera2Config.d(context, obj, set);
                return d10;
            }
        };
        return new w.a().c(aVar).d(aVar2).g(new l2.c() { // from class: p.c
            @Override // androidx.camera.core.impl.l2.c
            public final l2 a(Context context) {
                l2 e10;
                e10 = Camera2Config.e(context);
                return e10;
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z d(Context context, Object obj, Set set) {
        try {
            return new g1(context, obj, set);
        } catch (r e10) {
            throw new n0(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l2 e(Context context) {
        return new k1(context);
    }
}
