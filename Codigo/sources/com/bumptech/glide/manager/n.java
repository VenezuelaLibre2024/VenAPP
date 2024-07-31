package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.manager.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    final Map<androidx.lifecycle.f, com.bumptech.glide.k> f7482a = new HashMap();

    /* renamed from: b */
    private final q.b f7483b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements m {

        /* renamed from: a */
        final /* synthetic */ androidx.lifecycle.f f7484a;

        a(androidx.lifecycle.f fVar) {
            this.f7484a = fVar;
        }

        @Override // com.bumptech.glide.manager.m
        public void onDestroy() {
            n.this.f7482a.remove(this.f7484a);
        }

        @Override // com.bumptech.glide.manager.m
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.m
        public void onStop() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements r {

        /* renamed from: a */
        private final androidx.fragment.app.n f7486a;

        b(androidx.fragment.app.n nVar) {
            this.f7486a = nVar;
        }

        private void b(androidx.fragment.app.n nVar, Set<com.bumptech.glide.k> set) {
            List<Fragment> r02 = nVar.r0();
            int size = r02.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = r02.get(i10);
                b(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.k a10 = n.this.a(fragment.getLifecycle());
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }

        @Override // com.bumptech.glide.manager.r
        public Set<com.bumptech.glide.k> a() {
            HashSet hashSet = new HashSet();
            b(this.f7486a, hashSet);
            return hashSet;
        }
    }

    public n(q.b bVar) {
        this.f7483b = bVar;
    }

    com.bumptech.glide.k a(androidx.lifecycle.f fVar) {
        c4.l.b();
        return this.f7482a.get(fVar);
    }

    public com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.f fVar, androidx.fragment.app.n nVar, boolean z10) {
        c4.l.b();
        com.bumptech.glide.k a10 = a(fVar);
        if (a10 != null) {
            return a10;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(fVar);
        com.bumptech.glide.k a11 = this.f7483b.a(bVar, lifecycleLifecycle, new b(nVar), context);
        this.f7482a.put(fVar, a11);
        lifecycleLifecycle.b(new a(fVar));
        if (z10) {
            a11.onStart();
        }
        return a11;
    }
}
