package p487zd;

import android.os.Bundle;
import cc.InterfaceC1940a;
import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p487zd.C12999y2;

/* renamed from: zd.y2 */
/* loaded from: classes.dex */
public class C12999y2 implements InterfaceC1940a {

    /* renamed from: a */
    private volatile Object f35330a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zd.y2$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC1940a.a {

        /* renamed from: c */
        private static final Object f35331c = new Object();

        /* renamed from: a */
        private Set<String> f35332a;

        /* renamed from: b */
        private volatile Object f35333b;

        private b(final String str, final InterfaceC1940a.b bVar, InterfaceC7182a<InterfaceC1940a> interfaceC7182a) {
            this.f35332a = new HashSet();
            interfaceC7182a.mo21379a(new InterfaceC7182a.a() { // from class: zd.z2
                @Override // ee.InterfaceC7182a.a
                /* renamed from: a */
                public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                    C12999y2.b.this.m42981c(str, bVar, interfaceC7183b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m42981c(String str, InterfaceC1940a.b bVar, InterfaceC7183b interfaceC7183b) {
            if (this.f35333b == f35331c) {
                return;
            }
            InterfaceC1940a.a mo10147b = ((InterfaceC1940a) interfaceC7183b.get()).mo10147b(str, bVar);
            this.f35333b = mo10147b;
            synchronized (this) {
                if (!this.f35332a.isEmpty()) {
                    mo10147b.mo10153a(this.f35332a);
                    this.f35332a = new HashSet();
                }
            }
        }

        @Override // cc.InterfaceC1940a.a
        /* renamed from: a */
        public void mo10153a(Set<String> set) {
            Object obj = this.f35333b;
            if (obj == f35331c) {
                return;
            }
            if (obj != null) {
                ((InterfaceC1940a.a) obj).mo10153a(set);
            } else {
                synchronized (this) {
                    this.f35332a.addAll(set);
                }
            }
        }
    }

    public C12999y2(InterfaceC7182a<InterfaceC1940a> interfaceC7182a) {
        this.f35330a = interfaceC7182a;
        interfaceC7182a.mo21379a(new InterfaceC7182a.a() { // from class: zd.x2
            @Override // ee.InterfaceC7182a.a
            /* renamed from: a */
            public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                C12999y2.this.m42978i(interfaceC7183b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m42978i(InterfaceC7183b interfaceC7183b) {
        this.f35330a = interfaceC7183b.get();
    }

    /* renamed from: j */
    private InterfaceC1940a m42979j() {
        Object obj = this.f35330a;
        if (obj instanceof InterfaceC1940a) {
            return (InterfaceC1940a) obj;
        }
        return null;
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: a */
    public void mo10146a(String str, String str2, Bundle bundle) {
        InterfaceC1940a m42979j = m42979j();
        if (m42979j != null) {
            m42979j.mo10146a(str, str2, bundle);
        }
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: b */
    public InterfaceC1940a.a mo10147b(String str, InterfaceC1940a.b bVar) {
        Object obj = this.f35330a;
        return obj instanceof InterfaceC1940a ? ((InterfaceC1940a) obj).mo10147b(str, bVar) : new b(str, bVar, (InterfaceC7182a) obj);
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: c */
    public void mo10148c(String str, String str2, Object obj) {
        InterfaceC1940a m42979j = m42979j();
        if (m42979j != null) {
            m42979j.mo10148c(str, str2, obj);
        }
    }

    @Override // cc.InterfaceC1940a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: d */
    public Map<String, Object> mo10149d(boolean z10) {
        return Collections.emptyMap();
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: e */
    public int mo10150e(String str) {
        return 0;
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: f */
    public List<InterfaceC1940a.c> mo10151f(String str, String str2) {
        return Collections.emptyList();
    }

    @Override // cc.InterfaceC1940a
    /* renamed from: g */
    public void mo10152g(InterfaceC1940a.c cVar) {
    }
}
