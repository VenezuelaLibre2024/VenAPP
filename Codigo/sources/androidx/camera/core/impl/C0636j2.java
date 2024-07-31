package androidx.camera.core.impl;

import androidx.camera.core.impl.C0636j2;
import androidx.camera.core.impl.C0701y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p407w.C12029o0;

/* renamed from: androidx.camera.core.impl.j2 */
/* loaded from: classes.dex */
public final class C0636j2 {

    /* renamed from: a */
    private final String f2857a;

    /* renamed from: b */
    private final Map<String, b> f2858b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.j2$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo3084a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.j2$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C0701y1 f2859a;

        /* renamed from: b */
        private final InterfaceC0640k2<?> f2860b;

        /* renamed from: c */
        private boolean f2861c = false;

        /* renamed from: d */
        private boolean f2862d = false;

        b(C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2) {
            this.f2859a = c0701y1;
            this.f2860b = interfaceC0640k2;
        }

        /* renamed from: a */
        boolean m3128a() {
            return this.f2862d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m3129b() {
            return this.f2861c;
        }

        /* renamed from: c */
        C0701y1 m3130c() {
            return this.f2859a;
        }

        /* renamed from: d */
        InterfaceC0640k2<?> m3131d() {
            return this.f2860b;
        }

        /* renamed from: e */
        void m3132e(boolean z10) {
            this.f2862d = z10;
        }

        /* renamed from: f */
        void m3133f(boolean z10) {
            this.f2861c = z10;
        }
    }

    public C0636j2(String str) {
        this.f2857a = str;
    }

    /* renamed from: i */
    private b m3110i(String str, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2) {
        b bVar = this.f2858b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(c0701y1, interfaceC0640k2);
        this.f2858b.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: j */
    private Collection<C0701y1> m3111j(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2858b.entrySet()) {
            if (aVar == null || aVar.mo3084a(entry.getValue())) {
                arrayList.add(entry.getValue().m3130c());
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private Collection<InterfaceC0640k2<?>> m3112k(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2858b.entrySet()) {
            if (aVar == null || aVar.mo3084a(entry.getValue())) {
                arrayList.add(entry.getValue().m3131d());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ boolean m3113m(b bVar) {
        return bVar.m3128a() && bVar.m3129b();
    }

    /* renamed from: d */
    public C0701y1.g m3116d() {
        C0701y1.g gVar = new C0701y1.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2858b.entrySet()) {
            b value = entry.getValue();
            if (value.m3128a() && value.m3129b()) {
                String key = entry.getKey();
                gVar.m3416a(value.m3130c());
                arrayList.add(key);
            }
        }
        C12029o0.m38638a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2857a);
        return gVar;
    }

    /* renamed from: e */
    public Collection<C0701y1> m3117e() {
        return Collections.unmodifiableCollection(m3111j(new a() { // from class: androidx.camera.core.impl.i2
            @Override // androidx.camera.core.impl.C0636j2.a
            /* renamed from: a */
            public final boolean mo3084a(C0636j2.b bVar) {
                boolean m3113m;
                m3113m = C0636j2.m3113m(bVar);
                return m3113m;
            }
        }));
    }

    /* renamed from: f */
    public C0701y1.g m3118f() {
        C0701y1.g gVar = new C0701y1.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2858b.entrySet()) {
            b value = entry.getValue();
            if (value.m3129b()) {
                gVar.m3416a(value.m3130c());
                arrayList.add(entry.getKey());
            }
        }
        C12029o0.m38638a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2857a);
        return gVar;
    }

    /* renamed from: g */
    public Collection<C0701y1> m3119g() {
        return Collections.unmodifiableCollection(m3111j(new a() { // from class: androidx.camera.core.impl.g2
            @Override // androidx.camera.core.impl.C0636j2.a
            /* renamed from: a */
            public final boolean mo3084a(C0636j2.b bVar) {
                boolean m3129b;
                m3129b = bVar.m3129b();
                return m3129b;
            }
        }));
    }

    /* renamed from: h */
    public Collection<InterfaceC0640k2<?>> m3120h() {
        return Collections.unmodifiableCollection(m3112k(new a() { // from class: androidx.camera.core.impl.h2
            @Override // androidx.camera.core.impl.C0636j2.a
            /* renamed from: a */
            public final boolean mo3084a(C0636j2.b bVar) {
                boolean m3129b;
                m3129b = bVar.m3129b();
                return m3129b;
            }
        }));
    }

    /* renamed from: l */
    public boolean m3121l(String str) {
        if (this.f2858b.containsKey(str)) {
            return this.f2858b.get(str).m3129b();
        }
        return false;
    }

    /* renamed from: p */
    public void m3122p(String str) {
        this.f2858b.remove(str);
    }

    /* renamed from: q */
    public void m3123q(String str, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2) {
        m3110i(str, c0701y1, interfaceC0640k2).m3132e(true);
    }

    /* renamed from: r */
    public void m3124r(String str, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2) {
        m3110i(str, c0701y1, interfaceC0640k2).m3133f(true);
    }

    /* renamed from: s */
    public void m3125s(String str) {
        if (this.f2858b.containsKey(str)) {
            b bVar = this.f2858b.get(str);
            bVar.m3133f(false);
            if (bVar.m3128a()) {
                return;
            }
            this.f2858b.remove(str);
        }
    }

    /* renamed from: t */
    public void m3126t(String str) {
        if (this.f2858b.containsKey(str)) {
            b bVar = this.f2858b.get(str);
            bVar.m3132e(false);
            if (bVar.m3129b()) {
                return;
            }
            this.f2858b.remove(str);
        }
    }

    /* renamed from: u */
    public void m3127u(String str, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2) {
        if (this.f2858b.containsKey(str)) {
            b bVar = new b(c0701y1, interfaceC0640k2);
            b bVar2 = this.f2858b.get(str);
            bVar.m3133f(bVar2.m3129b());
            bVar.m3132e(bVar2.m3128a());
            this.f2858b.put(str, bVar);
        }
    }
}
