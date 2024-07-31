package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1300f;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import com.bumptech.glide.manager.C2160q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p036c4.C1871l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.manager.n */
/* loaded from: classes.dex */
public final class C2157n {

    /* renamed from: a */
    final Map<AbstractC1300f, ComponentCallbacks2C2125k> f8449a = new HashMap();

    /* renamed from: b */
    private final C2160q.b f8450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.manager.n$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2156m {

        /* renamed from: a */
        final /* synthetic */ AbstractC1300f f8451a;

        a(AbstractC1300f abstractC1300f) {
            this.f8451a = abstractC1300f;
        }

        @Override // com.bumptech.glide.manager.InterfaceC2156m
        public void onDestroy() {
            C2157n.this.f8449a.remove(this.f8451a);
        }

        @Override // com.bumptech.glide.manager.InterfaceC2156m
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC2156m
        public void onStop() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.manager.n$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC2161r {

        /* renamed from: a */
        private final AbstractC1272n f8453a;

        b(AbstractC1272n abstractC1272n) {
            this.f8453a = abstractC1272n;
        }

        /* renamed from: b */
        private void m10809b(AbstractC1272n abstractC1272n, Set<ComponentCallbacks2C2125k> set) {
            List<Fragment> m7100r0 = abstractC1272n.m7100r0();
            int size = m7100r0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = m7100r0.get(i10);
                m10809b(fragment.getChildFragmentManager(), set);
                ComponentCallbacks2C2125k m10807a = C2157n.this.m10807a(fragment.getLifecycle());
                if (m10807a != null) {
                    set.add(m10807a);
                }
            }
        }

        @Override // com.bumptech.glide.manager.InterfaceC2161r
        /* renamed from: a */
        public Set<ComponentCallbacks2C2125k> mo10806a() {
            HashSet hashSet = new HashSet();
            m10809b(this.f8453a, hashSet);
            return hashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2157n(C2160q.b bVar) {
        this.f8450b = bVar;
    }

    /* renamed from: a */
    ComponentCallbacks2C2125k m10807a(AbstractC1300f abstractC1300f) {
        C1871l.m9953b();
        return this.f8449a.get(abstractC1300f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentCallbacks2C2125k m10808b(Context context, ComponentCallbacks2C2116b componentCallbacks2C2116b, AbstractC1300f abstractC1300f, AbstractC1272n abstractC1272n, boolean z10) {
        C1871l.m9953b();
        ComponentCallbacks2C2125k m10807a = m10807a(abstractC1300f);
        if (m10807a != null) {
            return m10807a;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC1300f);
        ComponentCallbacks2C2125k mo10837a = this.f8450b.mo10837a(componentCallbacks2C2116b, lifecycleLifecycle, new b(abstractC1272n), context);
        this.f8449a.put(abstractC1300f, mo10837a);
        lifecycleLifecycle.mo10798b(new a(abstractC1300f));
        if (z10) {
            mo10837a.onStart();
        }
        return mo10837a;
    }
}
