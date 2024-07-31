package androidx.camera.core.impl;

import androidx.camera.core.impl.j2;
import androidx.camera.core.impl.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2519a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f2520b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final y1 f2521a;

        /* renamed from: b, reason: collision with root package name */
        private final k2<?> f2522b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2523c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2524d = false;

        b(y1 y1Var, k2<?> k2Var) {
            this.f2521a = y1Var;
            this.f2522b = k2Var;
        }

        boolean a() {
            return this.f2524d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f2523c;
        }

        y1 c() {
            return this.f2521a;
        }

        k2<?> d() {
            return this.f2522b;
        }

        void e(boolean z10) {
            this.f2524d = z10;
        }

        void f(boolean z10) {
            this.f2523c = z10;
        }
    }

    public j2(String str) {
        this.f2519a = str;
    }

    private b i(String str, y1 y1Var, k2<?> k2Var) {
        b bVar = this.f2520b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(y1Var, k2Var);
        this.f2520b.put(str, bVar2);
        return bVar2;
    }

    private Collection<y1> j(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2520b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    private Collection<k2<?>> k(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2520b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m(b bVar) {
        return bVar.a() && bVar.b();
    }

    public y1.g d() {
        y1.g gVar = new y1.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2520b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                gVar.a(value.c());
                arrayList.add(key);
            }
        }
        w.o0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2519a);
        return gVar;
    }

    public Collection<y1> e() {
        return Collections.unmodifiableCollection(j(new a() { // from class: androidx.camera.core.impl.i2
            @Override // androidx.camera.core.impl.j2.a
            public final boolean a(j2.b bVar) {
                boolean m10;
                m10 = j2.m(bVar);
                return m10;
            }
        }));
    }

    public y1.g f() {
        y1.g gVar = new y1.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2520b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                gVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        w.o0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2519a);
        return gVar;
    }

    public Collection<y1> g() {
        return Collections.unmodifiableCollection(j(new a() { // from class: androidx.camera.core.impl.g2
            @Override // androidx.camera.core.impl.j2.a
            public final boolean a(j2.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public Collection<k2<?>> h() {
        return Collections.unmodifiableCollection(k(new a() { // from class: androidx.camera.core.impl.h2
            @Override // androidx.camera.core.impl.j2.a
            public final boolean a(j2.b bVar) {
                boolean b10;
                b10 = bVar.b();
                return b10;
            }
        }));
    }

    public boolean l(String str) {
        if (this.f2520b.containsKey(str)) {
            return this.f2520b.get(str).b();
        }
        return false;
    }

    public void p(String str) {
        this.f2520b.remove(str);
    }

    public void q(String str, y1 y1Var, k2<?> k2Var) {
        i(str, y1Var, k2Var).e(true);
    }

    public void r(String str, y1 y1Var, k2<?> k2Var) {
        i(str, y1Var, k2Var).f(true);
    }

    public void s(String str) {
        if (this.f2520b.containsKey(str)) {
            b bVar = this.f2520b.get(str);
            bVar.f(false);
            if (bVar.a()) {
                return;
            }
            this.f2520b.remove(str);
        }
    }

    public void t(String str) {
        if (this.f2520b.containsKey(str)) {
            b bVar = this.f2520b.get(str);
            bVar.e(false);
            if (bVar.b()) {
                return;
            }
            this.f2520b.remove(str);
        }
    }

    public void u(String str, y1 y1Var, k2<?> k2Var) {
        if (this.f2520b.containsKey(str)) {
            b bVar = new b(y1Var, k2Var);
            b bVar2 = this.f2520b.get(str);
            bVar.f(bVar2.b());
            bVar.e(bVar2.a());
            this.f2520b.put(str, bVar);
        }
    }
}
