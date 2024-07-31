package p149i1;

import androidx.lifecycle.AbstractC1303g0;
import androidx.lifecycle.C1305h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p257nk.C9728a;
import p280ok.InterfaceC9998l;
import p405vk.InterfaceC11966c;

/* renamed from: i1.c */
/* loaded from: classes.dex */
public final class C7770c {

    /* renamed from: a */
    private final List<C7773f<?>> f18525a = new ArrayList();

    /* renamed from: a */
    public final <T extends AbstractC1303g0> void m23721a(InterfaceC11966c<T> clazz, InterfaceC9998l<? super AbstractC7768a, ? extends T> initializer) {
        C9322n.m27781e(clazz, "clazz");
        C9322n.m27781e(initializer, "initializer");
        this.f18525a.add(new C7773f<>(C9728a.m29160a(clazz), initializer));
    }

    /* renamed from: b */
    public final C1305h0.b m23722b() {
        C7773f[] c7773fArr = (C7773f[]) this.f18525a.toArray(new C7773f[0]);
        return new C7769b((C7773f[]) Arrays.copyOf(c7773fArr, c7773fArr.length));
    }
}
