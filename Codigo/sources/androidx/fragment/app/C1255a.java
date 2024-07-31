package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.AbstractC1280v;
import androidx.fragment.app.Fragment;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C1255a extends AbstractC1280v implements AbstractC1272n.o {

    /* renamed from: t */
    final AbstractC1272n f5278t;

    /* renamed from: u */
    boolean f5279u;

    /* renamed from: v */
    int f5280v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1255a(AbstractC1272n abstractC1272n) {
        super(abstractC1272n.m7097p0(), abstractC1272n.m7101s0() != null ? abstractC1272n.m7101s0().m6970f().getClassLoader() : null);
        this.f5280v = -1;
        this.f5278t = abstractC1272n;
    }

    /* renamed from: w */
    private static boolean m6838w(AbstractC1280v.a aVar) {
        Fragment fragment = aVar.f5545b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public Fragment m6839A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f5527c.size() - 1; size >= 0; size--) {
            AbstractC1280v.a aVar = this.f5527c.get(size);
            int i10 = aVar.f5544a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f5545b;
                            break;
                        case 10:
                            aVar.f5551h = aVar.f5550g;
                            break;
                    }
                }
                arrayList.add(aVar.f5545b);
            }
            arrayList.remove(aVar.f5545b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.AbstractC1272n.o
    /* renamed from: a */
    public boolean mo6840a(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2) {
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f5533i) {
            return true;
        }
        this.f5278t.m7073e(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1280v
    /* renamed from: f */
    public int mo6841f() {
        return m6847n(false);
    }

    @Override // androidx.fragment.app.AbstractC1280v
    /* renamed from: g */
    public int mo6842g() {
        return m6847n(true);
    }

    @Override // androidx.fragment.app.AbstractC1280v
    /* renamed from: h */
    public void mo6843h() {
        m7208i();
        this.f5278t.m7070b0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC1280v
    /* renamed from: j */
    public void mo6844j(int i10, Fragment fragment, String str, int i11) {
        super.mo6844j(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f5278t;
    }

    @Override // androidx.fragment.app.AbstractC1280v
    /* renamed from: k */
    public AbstractC1280v mo6845k(Fragment fragment) {
        AbstractC1272n abstractC1272n = fragment.mFragmentManager;
        if (abstractC1272n == null || abstractC1272n == this.f5278t) {
            return super.mo6845k(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6846m(int i10) {
        if (this.f5533i) {
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f5527c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC1280v.a aVar = this.f5527c.get(i11);
                Fragment fragment = aVar.f5545b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (AbstractC1272n.m6991E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f5545b + " to " + aVar.f5545b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    int m6847n(boolean z10) {
        if (this.f5279u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC1272n.m6991E0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1256a0("FragmentManager"));
            m6848o("  ", printWriter);
            printWriter.close();
        }
        this.f5279u = true;
        this.f5280v = this.f5533i ? this.f5278t.m7085j() : -1;
        this.f5278t.m7066Y(this, z10);
        return this.f5280v;
    }

    /* renamed from: o */
    public void m6848o(String str, PrintWriter printWriter) {
        m6849p(str, printWriter, true);
    }

    /* renamed from: p */
    public void m6849p(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5535k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5280v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5279u);
            if (this.f5532h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5532h));
            }
            if (this.f5528d != 0 || this.f5529e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5528d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5529e));
            }
            if (this.f5530f != 0 || this.f5531g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5530f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5531g));
            }
            if (this.f5536l != 0 || this.f5537m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5536l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5537m);
            }
            if (this.f5538n != 0 || this.f5539o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5538n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5539o);
            }
        }
        if (this.f5527c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f5527c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1280v.a aVar = this.f5527c.get(i10);
            switch (aVar.f5544a) {
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
                    str2 = "cmd=" + aVar.f5544a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f5545b);
            if (z10) {
                if (aVar.f5546c != 0 || aVar.f5547d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5546c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5547d));
                }
                if (aVar.f5548e != 0 || aVar.f5549f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5548e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5549f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m6850q() {
        int size = this.f5527c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1280v.a aVar = this.f5527c.get(i10);
            Fragment fragment = aVar.f5545b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f5532h);
                fragment.setSharedElementNames(this.f5540p, this.f5541q);
            }
            switch (aVar.f5544a) {
                case 1:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, false);
                    this.f5278t.m7077g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5544a);
                case 3:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7072c1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7029B0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, false);
                    this.f5278t.m7096o1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7108x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, false);
                    this.f5278t.m7089l(fragment);
                    break;
                case 8:
                    this.f5278t.m7093m1(fragment);
                    break;
                case 9:
                    this.f5278t.m7093m1(null);
                    break;
                case 10:
                    this.f5278t.m7091l1(fragment, aVar.f5551h);
                    break;
            }
            if (!this.f5542r && aVar.f5544a != 1 && fragment != null && !AbstractC1272n.f5421P) {
                this.f5278t.m7051O0(fragment);
            }
        }
        if (this.f5542r || AbstractC1272n.f5421P) {
            return;
        }
        AbstractC1272n abstractC1272n = this.f5278t;
        abstractC1272n.m7053P0(abstractC1272n.f5452q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6851r(boolean z10) {
        for (int size = this.f5527c.size() - 1; size >= 0; size--) {
            AbstractC1280v.a aVar = this.f5527c.get(size);
            Fragment fragment = aVar.f5545b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(AbstractC1272n.m7010h1(this.f5532h));
                fragment.setSharedElementNames(this.f5541q, this.f5540p);
            }
            switch (aVar.f5544a) {
                case 1:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, true);
                    this.f5278t.m7072c1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5544a);
                case 3:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7077g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7096o1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, true);
                    this.f5278t.m7029B0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7089l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f5546c, aVar.f5547d, aVar.f5548e, aVar.f5549f);
                    this.f5278t.m7088k1(fragment, true);
                    this.f5278t.m7108x(fragment);
                    break;
                case 8:
                    this.f5278t.m7093m1(null);
                    break;
                case 9:
                    this.f5278t.m7093m1(fragment);
                    break;
                case 10:
                    this.f5278t.m7091l1(fragment, aVar.f5550g);
                    break;
            }
            if (!this.f5542r && aVar.f5544a != 3 && fragment != null && !AbstractC1272n.f5421P) {
                this.f5278t.m7051O0(fragment);
            }
        }
        if (this.f5542r || !z10 || AbstractC1272n.f5421P) {
            return;
        }
        AbstractC1272n abstractC1272n = this.f5278t;
        abstractC1272n.m7053P0(abstractC1272n.f5452q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public Fragment m6852s(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f5527c.size()) {
            AbstractC1280v.a aVar = this.f5527c.get(i10);
            int i11 = aVar.f5544a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f5545b;
                    int i12 = fragment3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f5527c.add(i10, new AbstractC1280v.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                AbstractC1280v.a aVar2 = new AbstractC1280v.a(3, fragment4);
                                aVar2.f5546c = aVar.f5546c;
                                aVar2.f5548e = aVar.f5548e;
                                aVar2.f5547d = aVar.f5547d;
                                aVar2.f5549f = aVar.f5549f;
                                this.f5527c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f5527c.remove(i10);
                        i10--;
                    } else {
                        aVar.f5544a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f5545b);
                    Fragment fragment5 = aVar.f5545b;
                    if (fragment5 == fragment2) {
                        this.f5527c.add(i10, new AbstractC1280v.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f5527c.add(i10, new AbstractC1280v.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f5545b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f5545b);
            i10++;
        }
        return fragment2;
    }

    /* renamed from: t */
    public String m6853t() {
        return this.f5535k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5280v >= 0) {
            sb2.append(" #");
            sb2.append(this.f5280v);
        }
        if (this.f5535k != null) {
            sb2.append(" ");
            sb2.append(this.f5535k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m6854u(int i10) {
        int size = this.f5527c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f5527c.get(i11).f5545b;
            int i12 = fragment != null ? fragment.mContainerId : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m6855v(ArrayList<C1255a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f5527c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f5527c.get(i13).f5545b;
            int i14 = fragment != null ? fragment.mContainerId : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    C1255a c1255a = arrayList.get(i15);
                    int size2 = c1255a.f5527c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = c1255a.f5527c.get(i16).f5545b;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m6856x() {
        for (int i10 = 0; i10 < this.f5527c.size(); i10++) {
            if (m6838w(this.f5527c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public void m6857y() {
        if (this.f5543s != null) {
            for (int i10 = 0; i10 < this.f5543s.size(); i10++) {
                this.f5543s.get(i10).run();
            }
            this.f5543s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m6858z(Fragment.InterfaceC1253l interfaceC1253l) {
        for (int i10 = 0; i10 < this.f5527c.size(); i10++) {
            AbstractC1280v.a aVar = this.f5527c.get(i10);
            if (m6838w(aVar)) {
                aVar.f5545b.setOnStartEnterTransitionListener(interfaceC1253l);
            }
        }
    }
}
