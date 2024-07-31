package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1303g0;
import androidx.lifecycle.C1305h0;
import androidx.lifecycle.C1309j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C1275q extends AbstractC1303g0 {

    /* renamed from: k */
    private static final C1305h0.b f5493k = new a();

    /* renamed from: g */
    private final boolean f5497g;

    /* renamed from: d */
    private final HashMap<String, Fragment> f5494d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1275q> f5495e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C1309j0> f5496f = new HashMap<>();

    /* renamed from: h */
    private boolean f5498h = false;

    /* renamed from: i */
    private boolean f5499i = false;

    /* renamed from: j */
    private boolean f5500j = false;

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    class a implements C1305h0.b {
        a() {
        }

        @Override // androidx.lifecycle.C1305h0.b
        /* renamed from: b */
        public <T extends AbstractC1303g0> T mo7155b(Class<T> cls) {
            return new C1275q(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1275q(boolean z10) {
        this.f5497g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C1275q m7143j(C1309j0 c1309j0) {
        return (C1275q) new C1305h0(c1309j0, f5493k).m7337a(C1275q.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1303g0
    /* renamed from: d */
    public void mo7144d() {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5498h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1275q.class != obj.getClass()) {
            return false;
        }
        C1275q c1275q = (C1275q) obj;
        return this.f5494d.equals(c1275q.f5494d) && this.f5495e.equals(c1275q.f5495e) && this.f5496f.equals(c1275q.f5496f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7145f(Fragment fragment) {
        if (this.f5500j) {
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f5494d.containsKey(fragment.mWho)) {
                return;
            }
            this.f5494d.put(fragment.mWho, fragment);
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7146g(Fragment fragment) {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1275q c1275q = this.f5495e.get(fragment.mWho);
        if (c1275q != null) {
            c1275q.mo7144d();
            this.f5495e.remove(fragment.mWho);
        }
        C1309j0 c1309j0 = this.f5496f.get(fragment.mWho);
        if (c1309j0 != null) {
            c1309j0.m7347a();
            this.f5496f.remove(fragment.mWho);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m7147h(String str) {
        return this.f5494d.get(str);
    }

    public int hashCode() {
        return (((this.f5494d.hashCode() * 31) + this.f5495e.hashCode()) * 31) + this.f5496f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1275q m7148i(Fragment fragment) {
        C1275q c1275q = this.f5495e.get(fragment.mWho);
        if (c1275q != null) {
            return c1275q;
        }
        C1275q c1275q2 = new C1275q(this.f5497g);
        this.f5495e.put(fragment.mWho, c1275q2);
        return c1275q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Collection<Fragment> m7149k() {
        return new ArrayList(this.f5494d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C1309j0 m7150l(Fragment fragment) {
        C1309j0 c1309j0 = this.f5496f.get(fragment.mWho);
        if (c1309j0 != null) {
            return c1309j0;
        }
        C1309j0 c1309j02 = new C1309j0();
        this.f5496f.put(fragment.mWho, c1309j02);
        return c1309j02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m7151m() {
        return this.f5498h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m7152n(Fragment fragment) {
        if (this.f5500j) {
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f5494d.remove(fragment.mWho) != null) && AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m7153o(boolean z10) {
        this.f5500j = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m7154p(Fragment fragment) {
        if (this.f5494d.containsKey(fragment.mWho)) {
            return this.f5497g ? this.f5498h : !this.f5499i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f5494d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f5495e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f5496f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
