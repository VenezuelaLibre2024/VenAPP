package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends g0 {

    /* renamed from: k, reason: collision with root package name */
    private static final h0.b f4739k = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4743g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Fragment> f4740d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, q> f4741e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, j0> f4742f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f4744h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4745i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4746j = false;

    /* loaded from: classes.dex */
    class a implements h0.b {
        a() {
        }

        @Override // androidx.lifecycle.h0.b
        public <T extends g0> T b(Class<T> cls) {
            return new q(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(boolean z10) {
        this.f4743g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q j(j0 j0Var) {
        return (q) new h0(j0Var, f4739k).a(q.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g0
    public void d() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4744h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f4740d.equals(qVar.f4740d) && this.f4741e.equals(qVar.f4741e) && this.f4742f.equals(qVar.f4742f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f4746j) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4740d.containsKey(fragment.mWho)) {
                return;
            }
            this.f4740d.put(fragment.mWho, fragment);
            if (n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f4741e.get(fragment.mWho);
        if (qVar != null) {
            qVar.d();
            this.f4741e.remove(fragment.mWho);
        }
        j0 j0Var = this.f4742f.get(fragment.mWho);
        if (j0Var != null) {
            j0Var.a();
            this.f4742f.remove(fragment.mWho);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f4740d.get(str);
    }

    public int hashCode() {
        return (((this.f4740d.hashCode() * 31) + this.f4741e.hashCode()) * 31) + this.f4742f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q i(Fragment fragment) {
        q qVar = this.f4741e.get(fragment.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f4743g);
        this.f4741e.put(fragment.mWho, qVar2);
        return qVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.f4740d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0 l(Fragment fragment) {
        j0 j0Var = this.f4742f.get(fragment.mWho);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        this.f4742f.put(fragment.mWho, j0Var2);
        return j0Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f4744h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (this.f4746j) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4740d.remove(fragment.mWho) != null) && n.E0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.f4746j = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (this.f4740d.containsKey(fragment.mWho)) {
            return this.f4743g ? this.f4744h : !this.f4745i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4740d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4741e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4742f.keySet().iterator();
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
