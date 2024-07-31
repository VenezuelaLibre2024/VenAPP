package e0;

import android.media.MediaCodec;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y1;
import androidx.camera.core.s;
import d0.i;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final boolean f14349a;

    public e() {
        this.f14349a = d0.b.a(i.class) != null;
    }

    private int b(r0 r0Var) {
        if (r0Var.g() == MediaCodec.class) {
            return 2;
        }
        return r0Var.g() == s.class ? 0 : 1;
    }

    public /* synthetic */ int c(y1.e eVar, y1.e eVar2) {
        return b(eVar.e()) - b(eVar2.e());
    }

    public void d(List<y1.e> list) {
        if (this.f14349a) {
            Collections.sort(list, new Comparator() { // from class: e0.d
                public /* synthetic */ d() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c10;
                    c10 = e.this.c((y1.e) obj, (y1.e) obj2);
                    return c10;
                }
            });
        }
    }
}
