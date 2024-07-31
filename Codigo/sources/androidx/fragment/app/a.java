package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends v implements n.o {

    /* renamed from: t */
    final n f4541t;

    /* renamed from: u */
    boolean f4542u;

    /* renamed from: v */
    int f4543v;

    public a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().f().getClassLoader() : null);
        this.f4543v = -1;
        this.f4541t = nVar;
    }

    private static boolean w(v.a aVar) {
        Fragment fragment = aVar.f4791b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    public Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4773c.size() - 1; size >= 0; size--) {
            v.a aVar = this.f4773c.get(size);
            int i10 = aVar.f4790a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f4791b;
                            break;
                        case 10:
                            aVar.f4797h = aVar.f4796g;
                            break;
                    }
                }
                arrayList.add(aVar.f4791b);
            }
            arrayList.remove(aVar.f4791b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4779i) {
            return true;
        }
        this.f4541t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.v
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.v
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.v
    public void h() {
        i();
        this.f4541t.b0(this, true);
    }

    @Override // androidx.fragment.app.v
    public void j(int i10, Fragment fragment, String str, int i11) {
        super.j(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f4541t;
    }

    @Override // androidx.fragment.app.v
    public v k(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.f4541t) {
            return super.k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void m(int i10) {
        if (this.f4779i) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f4773c.size();
            for (int i11 = 0; i11 < size; i11++) {
                v.a aVar = this.f4773c.get(i11);
                Fragment fragment = aVar.f4791b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4791b + " to " + aVar.f4791b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int n(boolean z10) {
        if (this.f4542u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
            o("  ", printWriter);
            printWriter.close();
        }
        this.f4542u = true;
        this.f4543v = this.f4779i ? this.f4541t.j() : -1;
        this.f4541t.Y(this, z10);
        return this.f4543v;
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4781k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4543v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4542u);
            if (this.f4778h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4778h));
            }
            if (this.f4774d != 0 || this.f4775e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4774d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4775e));
            }
            if (this.f4776f != 0 || this.f4777g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4776f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4777g));
            }
            if (this.f4782l != 0 || this.f4783m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4782l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4783m);
            }
            if (this.f4784n != 0 || this.f4785o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4784n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4785o);
            }
        }
        if (this.f4773c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4773c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = this.f4773c.get(i10);
            switch (aVar.f4790a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4790a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4791b);
            if (z10) {
                if (aVar.f4792c != 0 || aVar.f4793d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4792c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4793d));
                }
                if (aVar.f4794e != 0 || aVar.f4795f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4794e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4795f));
                }
            }
        }
    }

    public void q() {
        int size = this.f4773c.size();
        for (int i10 = 0; i10 < size; i10++) {
            v.a aVar = this.f4773c.get(i10);
            Fragment fragment = aVar.f4791b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4778h);
                fragment.setSharedElementNames(this.f4786p, this.f4787q);
            }
            switch (aVar.f4790a) {
                case 1:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, false);
                    this.f4541t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4790a);
                case 3:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.c1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.B0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, false);
                    this.f4541t.o1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, false);
                    this.f4541t.l(fragment);
                    break;
                case 8:
                    this.f4541t.m1(fragment);
                    break;
                case 9:
                    this.f4541t.m1(null);
                    break;
                case 10:
                    this.f4541t.l1(fragment, aVar.f4797h);
                    break;
            }
            if (!this.f4788r && aVar.f4790a != 1 && fragment != null && !n.P) {
                this.f4541t.O0(fragment);
            }
        }
        if (this.f4788r || n.P) {
            return;
        }
        n nVar = this.f4541t;
        nVar.P0(nVar.f4698q, true);
    }

    public void r(boolean z10) {
        for (int size = this.f4773c.size() - 1; size >= 0; size--) {
            v.a aVar = this.f4773c.get(size);
            Fragment fragment = aVar.f4791b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(n.h1(this.f4778h));
                fragment.setSharedElementNames(this.f4787q, this.f4786p);
            }
            switch (aVar.f4790a) {
                case 1:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, true);
                    this.f4541t.c1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4790a);
                case 3:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.o1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, true);
                    this.f4541t.B0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4792c, aVar.f4793d, aVar.f4794e, aVar.f4795f);
                    this.f4541t.k1(fragment, true);
                    this.f4541t.x(fragment);
                    break;
                case 8:
                    this.f4541t.m1(null);
                    break;
                case 9:
                    this.f4541t.m1(fragment);
                    break;
                case 10:
                    this.f4541t.l1(fragment, aVar.f4796g);
                    break;
            }
            if (!this.f4788r && aVar.f4790a != 3 && fragment != null && !n.P) {
                this.f4541t.O0(fragment);
            }
        }
        if (this.f4788r || !z10 || n.P) {
            return;
        }
        n nVar = this.f4541t;
        nVar.P0(nVar.f4698q, true);
    }

    public Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f4773c.size()) {
            v.a aVar = this.f4773c.get(i10);
            int i11 = aVar.f4790a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f4791b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4773c.add(i10, new v.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                v.a aVar2 = new v.a(3, fragment4);
                                aVar2.f4792c = aVar.f4792c;
                                aVar2.f4794e = aVar.f4794e;
                                aVar2.f4793d = aVar.f4793d;
                                aVar2.f4795f = aVar.f4795f;
                                this.f4773c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f4773c.remove(i10);
                        i10--;
                    } else {
                        aVar.f4790a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f4791b);
                    Fragment fragment5 = aVar.f4791b;
                    if (fragment5 == fragment2) {
                        this.f4773c.add(i10, new v.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f4773c.add(i10, new v.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f4791b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f4791b);
            i10++;
        }
        return fragment2;
    }

    public String t() {
        return this.f4781k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4543v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4543v);
        }
        if (this.f4781k != null) {
            sb2.append(" ");
            sb2.append(this.f4781k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public boolean u(int i10) {
        int size = this.f4773c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f4773c.get(i11).f4791b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean v(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f4773c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f4773c.get(i13).f4791b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f4773c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f4773c.get(i16).f4791b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }

    public boolean x() {
        for (int i10 = 0; i10 < this.f4773c.size(); i10++) {
            if (w(this.f4773c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.f4789s != null) {
            for (int i10 = 0; i10 < this.f4789s.size(); i10++) {
                this.f4789s.get(i10).run();
            }
            this.f4789s = null;
        }
    }

    public void z(Fragment.l lVar) {
        for (int i10 = 0; i10 < this.f4773c.size(); i10++) {
            v.a aVar = this.f4773c.get(i10);
            if (w(aVar)) {
                aVar.f4791b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }
}
