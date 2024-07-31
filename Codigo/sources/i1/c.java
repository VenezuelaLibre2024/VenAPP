package i1;

import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.n;
import ok.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<f<?>> f16873a = new ArrayList();

    public final <T extends g0> void a(vk.c<T> clazz, l<? super a, ? extends T> initializer) {
        n.e(clazz, "clazz");
        n.e(initializer, "initializer");
        this.f16873a.add(new f<>(nk.a.a(clazz), initializer));
    }

    public final h0.b b() {
        f[] fVarArr = (f[]) this.f16873a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
