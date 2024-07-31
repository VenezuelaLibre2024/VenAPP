package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.f;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4538a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.f f4539b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f4540c;

    @Override // androidx.lifecycle.i
    public void onStateChanged(androidx.lifecycle.k kVar, f.a aVar) {
        Map map;
        Map map2;
        if (aVar == f.a.ON_START) {
            map2 = this.f4540c.f4691j;
            if (((Bundle) map2.get(this.f4538a)) != null) {
                throw null;
            }
        }
        if (aVar == f.a.ON_DESTROY) {
            this.f4539b.c(this);
            map = this.f4540c.f4692k;
            map.remove(this.f4538a);
        }
    }
}
