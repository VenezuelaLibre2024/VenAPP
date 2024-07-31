package zd;

import android.os.Bundle;
import cc.a;
import ee.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zd.y2;

/* loaded from: classes.dex */
public class y2 implements cc.a {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f32779a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0120a {

        /* renamed from: c, reason: collision with root package name */
        private static final Object f32780c = new Object();

        /* renamed from: a, reason: collision with root package name */
        private Set<String> f32781a;

        /* renamed from: b, reason: collision with root package name */
        private volatile Object f32782b;

        private b(final String str, final a.b bVar, ee.a<cc.a> aVar) {
            this.f32781a = new HashSet();
            aVar.a(new a.InterfaceC0227a() { // from class: zd.z2
                @Override // ee.a.InterfaceC0227a
                public final void a(ee.b bVar2) {
                    y2.b.this.c(str, bVar, bVar2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(String str, a.b bVar, ee.b bVar2) {
            if (this.f32782b == f32780c) {
                return;
            }
            a.InterfaceC0120a b10 = ((cc.a) bVar2.get()).b(str, bVar);
            this.f32782b = b10;
            synchronized (this) {
                if (!this.f32781a.isEmpty()) {
                    b10.a(this.f32781a);
                    this.f32781a = new HashSet();
                }
            }
        }

        @Override // cc.a.InterfaceC0120a
        public void a(Set<String> set) {
            Object obj = this.f32782b;
            if (obj == f32780c) {
                return;
            }
            if (obj != null) {
                ((a.InterfaceC0120a) obj).a(set);
            } else {
                synchronized (this) {
                    this.f32781a.addAll(set);
                }
            }
        }
    }

    public y2(ee.a<cc.a> aVar) {
        this.f32779a = aVar;
        aVar.a(new a.InterfaceC0227a() { // from class: zd.x2
            @Override // ee.a.InterfaceC0227a
            public final void a(ee.b bVar) {
                y2.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ee.b bVar) {
        this.f32779a = bVar.get();
    }

    private cc.a j() {
        Object obj = this.f32779a;
        if (obj instanceof cc.a) {
            return (cc.a) obj;
        }
        return null;
    }

    @Override // cc.a
    public void a(String str, String str2, Bundle bundle) {
        cc.a j10 = j();
        if (j10 != null) {
            j10.a(str, str2, bundle);
        }
    }

    @Override // cc.a
    public a.InterfaceC0120a b(String str, a.b bVar) {
        Object obj = this.f32779a;
        return obj instanceof cc.a ? ((cc.a) obj).b(str, bVar) : new b(str, bVar, (ee.a) obj);
    }

    @Override // cc.a
    public void c(String str, String str2, Object obj) {
        cc.a j10 = j();
        if (j10 != null) {
            j10.c(str, str2, obj);
        }
    }

    @Override // cc.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @Override // cc.a
    public Map<String, Object> d(boolean z10) {
        return Collections.emptyMap();
    }

    @Override // cc.a
    public int e(String str) {
        return 0;
    }

    @Override // cc.a
    public List<a.c> f(String str, String str2) {
        return Collections.emptyList();
    }

    @Override // cc.a
    public void g(a.c cVar) {
    }
}
