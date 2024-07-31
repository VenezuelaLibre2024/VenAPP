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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public class C1279u {

    /* renamed from: a */
    private final ArrayList<Fragment> f5522a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1278t> f5523b = new HashMap<>();

    /* renamed from: c */
    private C1275q f5524c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7180a(Fragment fragment) {
        if (this.f5522a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f5522a) {
            this.f5522a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7181b() {
        this.f5523b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m7182c(String str) {
        return this.f5523b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m7183d(int i10) {
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null) {
                c1278t.m7177t(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7184e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f5523b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1278t c1278t : this.f5523b.values()) {
                printWriter.print(str);
                if (c1278t != null) {
                    Fragment m7170k = c1278t.m7170k();
                    printWriter.println(m7170k);
                    m7170k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f5522a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f5522a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m7185f(String str) {
        C1278t c1278t = this.f5523b.get(str);
        if (c1278t != null) {
            return c1278t.m7170k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m7186g(int i10) {
        for (int size = this.f5522a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f5522a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null) {
                Fragment m7170k = c1278t.m7170k();
                if (m7170k.mFragmentId == i10) {
                    return m7170k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m7187h(String str) {
        if (str != null) {
            for (int size = this.f5522a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f5522a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null) {
                Fragment m7170k = c1278t.m7170k();
                if (str.equals(m7170k.mTag)) {
                    return m7170k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m7188i(String str) {
        Fragment findFragmentByWho;
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null && (findFragmentByWho = c1278t.m7170k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m7189j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f5522a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f5522a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f5522a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f5522a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1278t> m7190k() {
        ArrayList arrayList = new ArrayList();
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null) {
                arrayList.add(c1278t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> m7191l() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1278t> it = this.f5523b.values().iterator();
        while (it.hasNext()) {
            C1278t next = it.next();
            arrayList.add(next != null ? next.m7170k() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C1278t m7192m(String str) {
        return this.f5523b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> m7193n() {
        ArrayList arrayList;
        if (this.f5522a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f5522a) {
            arrayList = new ArrayList(this.f5522a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C1275q m7194o() {
        return this.f5524c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m7195p(C1278t c1278t) {
        Fragment m7170k = c1278t.m7170k();
        if (m7182c(m7170k.mWho)) {
            return;
        }
        this.f5523b.put(m7170k.mWho, c1278t);
        if (m7170k.mRetainInstanceChangedWhileDetached) {
            if (m7170k.mRetainInstance) {
                this.f5524c.m7145f(m7170k);
            } else {
                this.f5524c.m7152n(m7170k);
            }
            m7170k.mRetainInstanceChangedWhileDetached = false;
        }
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m7170k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m7196q(C1278t c1278t) {
        Fragment m7170k = c1278t.m7170k();
        if (m7170k.mRetainInstance) {
            this.f5524c.m7152n(m7170k);
        }
        if (this.f5523b.put(m7170k.mWho, null) != null && AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m7170k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m7197r() {
        Iterator<Fragment> it = this.f5522a.iterator();
        while (it.hasNext()) {
            C1278t c1278t = this.f5523b.get(it.next().mWho);
            if (c1278t != null) {
                c1278t.m7171m();
            }
        }
        for (C1278t c1278t2 : this.f5523b.values()) {
            if (c1278t2 != null) {
                c1278t2.m7171m();
                Fragment m7170k = c1278t2.m7170k();
                if (m7170k.mRemoving && !m7170k.isInBackStack()) {
                    m7196q(c1278t2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m7198s(Fragment fragment) {
        synchronized (this.f5522a) {
            this.f5522a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7199t() {
        this.f5523b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m7200u(List<String> list) {
        this.f5522a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m7185f = m7185f(str);
                if (m7185f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC1272n.m6991E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m7185f);
                }
                m7180a(m7185f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<C1277s> m7201v() {
        ArrayList<C1277s> arrayList = new ArrayList<>(this.f5523b.size());
        for (C1278t c1278t : this.f5523b.values()) {
            if (c1278t != null) {
                Fragment m7170k = c1278t.m7170k();
                C1277s m7175r = c1278t.m7175r();
                arrayList.add(m7175r);
                if (AbstractC1272n.m6991E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m7170k + ": " + m7175r.f5513x);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> m7202w() {
        synchronized (this.f5522a) {
            if (this.f5522a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f5522a.size());
            Iterator<Fragment> it = this.f5522a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (AbstractC1272n.m6991E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m7203x(C1275q c1275q) {
        this.f5524c = c1275q;
    }
}
