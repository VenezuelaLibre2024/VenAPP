package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    private final ArrayList<Fragment> f4768a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, t> f4769b = new HashMap<>();

    /* renamed from: c */
    private q f4770c;

    public void a(Fragment fragment) {
        if (this.f4768a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4768a) {
            this.f4768a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f4769b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f4769b.get(str) != null;
    }

    public void d(int i10) {
        for (t tVar : this.f4769b.values()) {
            if (tVar != null) {
                tVar.t(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4769b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.f4769b.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    Fragment k10 = tVar.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4768a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f4768a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        t tVar = this.f4769b.get(str);
        if (tVar != null) {
            return tVar.k();
        }
        return null;
    }

    public Fragment g(int i10) {
        for (int size = this.f4768a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4768a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (t tVar : this.f4769b.values()) {
            if (tVar != null) {
                Fragment k10 = tVar.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f4768a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4768a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f4769b.values()) {
            if (tVar != null) {
                Fragment k10 = tVar.k();
                if (str.equals(k10.mTag)) {
                    return k10;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (t tVar : this.f4769b.values()) {
            if (tVar != null && (findFragmentByWho = tVar.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4768a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f4768a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4768a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4768a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<t> k() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f4769b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<t> it = this.f4769b.values().iterator();
        while (it.hasNext()) {
            t next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    public t m(String str) {
        return this.f4769b.get(str);
    }

    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f4768a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4768a) {
            arrayList = new ArrayList(this.f4768a);
        }
        return arrayList;
    }

    public q o() {
        return this.f4770c;
    }

    public void p(t tVar) {
        Fragment k10 = tVar.k();
        if (c(k10.mWho)) {
            return;
        }
        this.f4769b.put(k10.mWho, tVar);
        if (k10.mRetainInstanceChangedWhileDetached) {
            if (k10.mRetainInstance) {
                this.f4770c.f(k10);
            } else {
                this.f4770c.n(k10);
            }
            k10.mRetainInstanceChangedWhileDetached = false;
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    public void q(t tVar) {
        Fragment k10 = tVar.k();
        if (k10.mRetainInstance) {
            this.f4770c.n(k10);
        }
        if (this.f4769b.put(k10.mWho, null) != null && n.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    public void r() {
        Iterator<Fragment> it = this.f4768a.iterator();
        while (it.hasNext()) {
            t tVar = this.f4769b.get(it.next().mWho);
            if (tVar != null) {
                tVar.m();
            }
        }
        for (t tVar2 : this.f4769b.values()) {
            if (tVar2 != null) {
                tVar2.m();
                Fragment k10 = tVar2.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    q(tVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.f4768a) {
            this.f4768a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void t() {
        this.f4769b.clear();
    }

    public void u(List<String> list) {
        this.f4768a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                }
                a(f10);
            }
        }
    }

    public ArrayList<s> v() {
        ArrayList<s> arrayList = new ArrayList<>(this.f4769b.size());
        for (t tVar : this.f4769b.values()) {
            if (tVar != null) {
                Fragment k10 = tVar.k();
                s r10 = tVar.r();
                arrayList.add(r10);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + r10.f4759x);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> w() {
        synchronized (this.f4768a) {
            if (this.f4768a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4768a.size());
            Iterator<Fragment> it = this.f4768a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    public void x(q qVar) {
        this.f4770c = qVar;
    }
}
