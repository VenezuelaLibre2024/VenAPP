package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.f;
import androidx.lifecycle.j0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.e> A;
    private androidx.activity.result.c<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private androidx.fragment.app.q M;

    /* renamed from: b */
    private boolean f4683b;

    /* renamed from: d */
    ArrayList<androidx.fragment.app.a> f4685d;

    /* renamed from: e */
    private ArrayList<Fragment> f4686e;

    /* renamed from: g */
    private OnBackPressedDispatcher f4688g;

    /* renamed from: l */
    private ArrayList<InterfaceC0067n> f4693l;

    /* renamed from: r */
    private androidx.fragment.app.k<?> f4699r;

    /* renamed from: s */
    private androidx.fragment.app.g f4700s;

    /* renamed from: t */
    private Fragment f4701t;

    /* renamed from: u */
    Fragment f4702u;

    /* renamed from: z */
    private androidx.activity.result.c<Intent> f4707z;

    /* renamed from: a */
    private final ArrayList<o> f4682a = new ArrayList<>();

    /* renamed from: c */
    private final u f4684c = new u();

    /* renamed from: f */
    private final androidx.fragment.app.l f4687f = new androidx.fragment.app.l(this);

    /* renamed from: h */
    private final androidx.activity.l f4689h = new c(false);

    /* renamed from: i */
    private final AtomicInteger f4690i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f4691j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f4692k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<androidx.core.os.c>> f4694m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final w.g f4695n = new d();

    /* renamed from: o */
    private final androidx.fragment.app.m f4696o = new androidx.fragment.app.m(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<r> f4697p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f4698q = -1;

    /* renamed from: v */
    private androidx.fragment.app.j f4703v = null;

    /* renamed from: w */
    private androidx.fragment.app.j f4704w = new e();

    /* renamed from: x */
    private c0 f4705x = null;

    /* renamed from: y */
    private c0 f4706y = new f();
    ArrayDeque<m> C = new ArrayDeque<>();
    private Runnable N = new g();

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4722a;
            int i10 = pollFirst.f4723b;
            Fragment i11 = n.this.f4684c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = pollFirst.f4722a;
                int i11 = pollFirst.f4723b;
                Fragment i12 = n.this.f4684c.i(str);
                if (i12 != null) {
                    i12.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.activity.l {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.l
        public void handleOnBackPressed() {
            n.this.A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements w.g {
        d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(Fragment fragment, androidx.core.os.c cVar) {
            if (cVar.b()) {
                return;
            }
            n.this.b1(fragment, cVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(Fragment fragment, androidx.core.os.c cVar) {
            n.this.f(fragment, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().b(n.this.s0().f(), str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements c0 {
        f() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a0(true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4715a;

        /* renamed from: b */
        final /* synthetic */ View f4716b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4717c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4715a = viewGroup;
            this.f4716b = view;
            this.f4717c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4715a.endViewTransition(this.f4716b);
            animator.removeListener(this);
            Fragment fragment = this.f4717c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class i implements r {

        /* renamed from: a */
        final /* synthetic */ Fragment f4719a;

        i(Fragment fragment) {
            this.f4719a = fragment;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            this.f4719a.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            m pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f4722a;
            int i10 = pollFirst.f4723b;
            Fragment i11 = n.this.f4684c.i(str);
            if (i11 != null) {
                i11.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends f.a<androidx.activity.result.e, androidx.activity.result.a> {
        k() {
        }

        @Override // f.a
        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = eVar.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.a(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.a
        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        public void a(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void b(n nVar, Fragment fragment, Context context) {
        }

        public void c(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void d(n nVar, Fragment fragment) {
        }

        public void e(n nVar, Fragment fragment) {
        }

        public void f(n nVar, Fragment fragment) {
        }

        public void g(n nVar, Fragment fragment, Context context) {
        }

        public void h(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void i(n nVar, Fragment fragment) {
        }

        public void j(n nVar, Fragment fragment, Bundle bundle) {
        }

        public void k(n nVar, Fragment fragment) {
        }

        public void l(n nVar, Fragment fragment) {
        }

        public void m(n nVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(n nVar, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a */
        String f4722a;

        /* renamed from: b */
        int f4723b;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(Parcel parcel) {
            this.f4722a = parcel.readString();
            this.f4723b = parcel.readInt();
        }

        m(String str, int i10) {
            this.f4722a = str;
            this.f4723b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4722a);
            parcel.writeInt(this.f4723b);
        }
    }

    /* renamed from: androidx.fragment.app.n$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0067n {
        void onBackStackChanged();
    }

    /* loaded from: classes.dex */
    public interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class p implements o {

        /* renamed from: a */
        final String f4724a;

        /* renamed from: b */
        final int f4725b;

        /* renamed from: c */
        final int f4726c;

        p(String str, int i10, int i11) {
            this.f4724a = str;
            this.f4725b = i10;
            this.f4726c = i11;
        }

        @Override // androidx.fragment.app.n.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f4702u;
            if (fragment == null || this.f4725b >= 0 || this.f4724a != null || !fragment.getChildFragmentManager().W0()) {
                return n.this.Y0(arrayList, arrayList2, this.f4724a, this.f4725b, this.f4726c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class q implements Fragment.l {

        /* renamed from: a */
        final boolean f4728a;

        /* renamed from: b */
        final androidx.fragment.app.a f4729b;

        /* renamed from: c */
        private int f4730c;

        q(androidx.fragment.app.a aVar, boolean z10) {
            this.f4728a = z10;
            this.f4729b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            this.f4730c++;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            int i10 = this.f4730c - 1;
            this.f4730c = i10;
            if (i10 != 0) {
                return;
            }
            this.f4729b.f4541t.j1();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f4729b;
            aVar.f4541t.t(aVar, this.f4728a, false, false);
        }

        void d() {
            boolean z10 = this.f4730c > 0;
            for (Fragment fragment : this.f4729b.f4541t.r0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z10 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            androidx.fragment.app.a aVar = this.f4729b;
            aVar.f4541t.t(aVar, this.f4728a, !z10, true);
        }

        public boolean e() {
            return this.f4730c == 0;
        }
    }

    public static boolean E0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean F0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void N0(androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment n10 = bVar.n(i10);
            if (!n10.mAdded) {
                View requireView = n10.requireView();
                n10.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private void S(int i10) {
        try {
            this.f4683b = true;
            this.f4684c.d(i10);
            P0(i10, false);
            if (P) {
                Iterator<b0> it = r().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.f4683b = false;
            a0(true);
        } catch (Throwable th2) {
            this.f4683b = false;
            throw th2;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            p1();
        }
    }

    private void X() {
        if (P) {
            Iterator<b0> it = r().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.f4694m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f4694m.keySet()) {
                n(fragment);
                Q0(fragment);
            }
        }
    }

    private boolean X0(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f4702u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().W0()) {
            return true;
        }
        boolean Y0 = Y0(this.I, this.J, str, i10, i11);
        if (Y0) {
            this.f4683b = true;
            try {
                d1(this.I, this.J);
            } finally {
                q();
            }
        }
        r1();
        V();
        this.f4684c.b();
        return Y0;
    }

    private void Z(boolean z10) {
        if (this.f4683b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4699r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4699r.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            p();
        }
        if (this.I == null) {
            this.I = new ArrayList<>();
            this.J = new ArrayList<>();
        }
        this.f4683b = true;
        try {
            e0(null, null);
        } finally {
            this.f4683b = false;
        }
    }

    private int Z0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, booleanValue);
                this.L.add(qVar);
                aVar.z(qVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private static void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.m(-1);
                aVar.r(i10 == i11 + (-1));
            } else {
                aVar.m(1);
                aVar.q();
            }
            i10++;
        }
    }

    private void d(androidx.collection.b<Fragment> bVar) {
        int i10 = this.f4698q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment.mState < min) {
                R0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    bVar.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void d1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f4788r) {
                if (i11 != i10) {
                    d0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4788r) {
                        i11++;
                    }
                }
                d0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            d0(arrayList, arrayList2, i11, size);
        }
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = this.L.get(i10);
            if (arrayList == null || qVar.f4728a || (indexOf2 = arrayList.indexOf(qVar.f4729b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.f4729b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || qVar.f4728a || (indexOf = arrayList.indexOf(qVar.f4729b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i10++;
            } else {
                this.L.remove(i10);
                i10--;
                size--;
            }
            qVar.c();
            i10++;
        }
    }

    private void f1() {
        if (this.f4693l != null) {
            for (int i10 = 0; i10 < this.f4693l.size(); i10++) {
                this.f4693l.get(i10).onBackStackChanged();
            }
        }
    }

    public static int h1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void j0() {
        if (P) {
            Iterator<b0> it = r().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4682a) {
            if (this.f4682a.isEmpty()) {
                return false;
            }
            int size = this.f4682a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f4682a.get(i10).a(arrayList, arrayList2);
            }
            this.f4682a.clear();
            this.f4699r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    private androidx.fragment.app.q m0(Fragment fragment) {
        return this.M.i(fragment);
    }

    private void n(Fragment fragment) {
        HashSet<androidx.core.os.c> hashSet = this.f4694m.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.c> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            w(fragment);
            this.f4694m.remove(fragment);
        }
    }

    private void n1(Fragment fragment) {
        ViewGroup o02 = o0(fragment);
        if (o02 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = d1.b.f13694c;
        if (o02.getTag(i10) == null) {
            o02.setTag(i10, fragment);
        }
        ((Fragment) o02.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4700s.d()) {
            View c10 = this.f4700s.c(fragment.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void p() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p1() {
        Iterator<t> it = this.f4684c.k().iterator();
        while (it.hasNext()) {
            U0(it.next());
        }
    }

    private void q() {
        this.f4683b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<b0> r() {
        HashSet hashSet = new HashSet();
        Iterator<t> it = this.f4684c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    private void r1() {
        synchronized (this.f4682a) {
            if (this.f4682a.isEmpty()) {
                this.f4689h.setEnabled(l0() > 0 && H0(this.f4701t));
            } else {
                this.f4689h.setEnabled(true);
            }
        }
    }

    private Set<b0> s(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<v.a> it = arrayList.get(i10).f4773c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4791b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(b0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            f.d c10 = androidx.fragment.app.f.c(this.f4699r.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c10 == null || (animator = c10.f4658b) == null) {
                if (c10 != null) {
                    fragment.mView.startAnimation(c10.f4657a);
                    c10.f4657a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    c10.f4658b.addListener(new h(viewGroup, view, fragment));
                }
                c10.f4658b.start();
            }
        }
        C0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void w(Fragment fragment) {
        fragment.performDestroyView();
        this.f4696o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public static Fragment y0(View view) {
        Object tag = view.getTag(d1.b.f13692a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public void A(Configuration configuration) {
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    void A0() {
        a0(true);
        if (this.f4689h.isEnabled()) {
            W0();
        } else {
            this.f4688g.e();
        }
    }

    public boolean B(MenuItem menuItem) {
        if (this.f4698q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void B0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        n1(fragment);
    }

    public void C() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(1);
    }

    public void C0(Fragment fragment) {
        if (fragment.mAdded && F0(fragment)) {
            this.D = true;
        }
    }

    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f4698q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null && G0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f4686e != null) {
            for (int i10 = 0; i10 < this.f4686e.size(); i10++) {
                Fragment fragment2 = this.f4686e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4686e = arrayList;
        return z10;
    }

    public boolean D0() {
        return this.G;
    }

    public void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.f4699r = null;
        this.f4700s = null;
        this.f4701t = null;
        if (this.f4688g != null) {
            this.f4689h.remove();
            this.f4688g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f4707z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    public void F() {
        S(1);
    }

    public void G() {
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void H(boolean z10) {
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        return fragment.equals(nVar.w0()) && H0(nVar.f4701t);
    }

    public void I(Fragment fragment) {
        Iterator<r> it = this.f4697p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public boolean I0(int i10) {
        return this.f4698q >= i10;
    }

    public boolean J(MenuItem menuItem) {
        if (this.f4698q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0() {
        return this.E || this.F;
    }

    public void K(Menu menu) {
        if (this.f4698q < 1) {
            return;
        }
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void K0(Fragment fragment, String[] strArr, int i10) {
        if (this.B == null) {
            this.f4699r.j(fragment, strArr, i10);
            return;
        }
        this.C.addLast(new m(fragment.mWho, i10));
        this.B.a(strArr);
    }

    public void L0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f4707z == null) {
            this.f4699r.m(fragment, intent, i10, bundle);
            return;
        }
        this.C.addLast(new m(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f4707z.a(intent);
    }

    public void M() {
        S(5);
    }

    public void M0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (this.A == null) {
            this.f4699r.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (E0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.e a10 = new e.a(intentSender).b(intent2).c(i12, i11).a();
        this.C.addLast(new m(fragment.mWho, i10));
        if (E0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.A.a(a10);
    }

    public void N(boolean z10) {
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    public boolean O(Menu menu) {
        boolean z10 = false;
        if (this.f4698q < 1) {
            return false;
        }
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null && G0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void O0(Fragment fragment) {
        if (!this.f4684c.c(fragment.mWho)) {
            if (E0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f4698q + "since it is not added to " + this);
                return;
            }
            return;
        }
        Q0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f10 = fragment.mPostponedAlpha;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            f.d c10 = androidx.fragment.app.f.c(this.f4699r.f(), fragment, true, fragment.getPopDirection());
            if (c10 != null) {
                Animation animation = c10.f4657a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    c10.f4658b.setTarget(fragment.mView);
                    c10.f4658b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            u(fragment);
        }
    }

    public void P() {
        r1();
        L(this.f4702u);
    }

    public void P0(int i10, boolean z10) {
        androidx.fragment.app.k<?> kVar;
        if (this.f4699r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f4698q) {
            this.f4698q = i10;
            if (P) {
                this.f4684c.r();
            } else {
                Iterator<Fragment> it = this.f4684c.n().iterator();
                while (it.hasNext()) {
                    O0(it.next());
                }
                for (t tVar : this.f4684c.k()) {
                    Fragment k10 = tVar.k();
                    if (!k10.mIsNewlyAdded) {
                        O0(k10);
                    }
                    if (k10.mRemoving && !k10.isInBackStack()) {
                        this.f4684c.q(tVar);
                    }
                }
            }
            p1();
            if (this.D && (kVar = this.f4699r) != null && this.f4698q == 7) {
                kVar.o();
                this.D = false;
            }
        }
    }

    public void Q() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(7);
    }

    public void Q0(Fragment fragment) {
        R0(fragment, this.f4698q);
    }

    public void R() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.R0(androidx.fragment.app.Fragment, int):void");
    }

    public void S0() {
        if (this.f4699r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.o(false);
        for (Fragment fragment : this.f4684c.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void T() {
        this.F = true;
        this.M.o(true);
        S(4);
    }

    public void T0(androidx.fragment.app.h hVar) {
        View view;
        for (t tVar : this.f4684c.k()) {
            Fragment k10 = tVar.k();
            if (k10.mContainerId == hVar.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = hVar;
                tVar.b();
            }
        }
    }

    public void U() {
        S(2);
    }

    public void U0(t tVar) {
        Fragment k10 = tVar.k();
        if (k10.mDeferStart) {
            if (this.f4683b) {
                this.H = true;
                return;
            }
            k10.mDeferStart = false;
            if (P) {
                tVar.m();
            } else {
                Q0(k10);
            }
        }
    }

    public void V0(int i10, int i11) {
        if (i10 >= 0) {
            Y(new p(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4684c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4686e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f4686e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f4685d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f4685d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4690i.get());
        synchronized (this.f4682a) {
            int size3 = this.f4682a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    o oVar = this.f4682a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4699r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4700s);
        if (this.f4701t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4701t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4698q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public boolean W0() {
        return X0(null, -1, 0);
    }

    public void Y(o oVar, boolean z10) {
        if (!z10) {
            if (this.f4699r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f4682a) {
            if (this.f4699r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f4682a.add(oVar);
                j1();
            }
        }
    }

    boolean Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f4685d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4685d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f4685d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i10 >= 0 && i10 == aVar.f4543v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f4685d.get(size2);
                        if (str == null || !str.equals(aVar2.t())) {
                            if (i10 < 0 || i10 != aVar2.f4543v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f4685d.size() - 1) {
                return false;
            }
            for (int size3 = this.f4685d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f4685d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean a0(boolean z10) {
        Z(z10);
        boolean z11 = false;
        while (k0(this.I, this.J)) {
            z11 = true;
            this.f4683b = true;
            try {
                d1(this.I, this.J);
            } finally {
                q();
            }
        }
        r1();
        V();
        this.f4684c.b();
        return z11;
    }

    public void a1(l lVar, boolean z10) {
        this.f4696o.o(lVar, z10);
    }

    public void b0(o oVar, boolean z10) {
        if (z10 && (this.f4699r == null || this.G)) {
            return;
        }
        Z(z10);
        if (oVar.a(this.I, this.J)) {
            this.f4683b = true;
            try {
                d1(this.I, this.J);
            } finally {
                q();
            }
        }
        r1();
        V();
        this.f4684c.b();
    }

    void b1(Fragment fragment, androidx.core.os.c cVar) {
        HashSet<androidx.core.os.c> hashSet = this.f4694m.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.f4694m.remove(fragment);
            if (fragment.mState < 5) {
                w(fragment);
                Q0(fragment);
            }
        }
    }

    public void c1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f4684c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            fragment.mRemoving = true;
            n1(fragment);
        }
    }

    public void e(androidx.fragment.app.a aVar) {
        if (this.f4685d == null) {
            this.f4685d = new ArrayList<>();
        }
        this.f4685d.add(aVar);
    }

    public void e1(Fragment fragment) {
        this.M.n(fragment);
    }

    void f(Fragment fragment, androidx.core.os.c cVar) {
        if (this.f4694m.get(fragment) == null) {
            this.f4694m.put(fragment, new HashSet<>());
        }
        this.f4694m.get(fragment).add(cVar);
    }

    public Fragment f0(String str) {
        return this.f4684c.f(str);
    }

    public t g(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t v10 = v(fragment);
        fragment.mFragmentManager = this;
        this.f4684c.p(v10);
        if (!fragment.mDetached) {
            this.f4684c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
        return v10;
    }

    public Fragment g0(int i10) {
        return this.f4684c.g(i10);
    }

    public void g1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f4731a == null) {
            return;
        }
        this.f4684c.t();
        Iterator<s> it = pVar.f4731a.iterator();
        while (it.hasNext()) {
            s next = it.next();
            if (next != null) {
                Fragment h10 = this.M.h(next.f4748b);
                if (h10 != null) {
                    if (E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h10);
                    }
                    tVar = new t(this.f4696o, this.f4684c, h10, next);
                } else {
                    tVar = new t(this.f4696o, this.f4684c, this.f4699r.f().getClassLoader(), p0(), next);
                }
                Fragment k10 = tVar.k();
                k10.mFragmentManager = this;
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                }
                tVar.o(this.f4699r.f().getClassLoader());
                this.f4684c.p(tVar);
                tVar.t(this.f4698q);
            }
        }
        for (Fragment fragment : this.M.k()) {
            if (!this.f4684c.c(fragment.mWho)) {
                if (E0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f4731a);
                }
                this.M.n(fragment);
                fragment.mFragmentManager = this;
                t tVar2 = new t(this.f4696o, this.f4684c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.mRemoving = true;
                tVar2.m();
            }
        }
        this.f4684c.u(pVar.f4732b);
        if (pVar.f4733c != null) {
            this.f4685d = new ArrayList<>(pVar.f4733c.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f4733c;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a10 = bVarArr[i10].a(this);
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a10.f4543v + "): " + a10);
                    PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
                    a10.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4685d.add(a10);
                i10++;
            }
        } else {
            this.f4685d = null;
        }
        this.f4690i.set(pVar.f4734d);
        String str = pVar.f4735e;
        if (str != null) {
            Fragment f02 = f0(str);
            this.f4702u = f02;
            L(f02);
        }
        ArrayList<String> arrayList = pVar.f4736f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = pVar.f4737r.get(i11);
                bundle.setClassLoader(this.f4699r.f().getClassLoader());
                this.f4691j.put(arrayList.get(i11), bundle);
            }
        }
        this.C = new ArrayDeque<>(pVar.f4738s);
    }

    public void h(r rVar) {
        this.f4697p.add(rVar);
    }

    public Fragment h0(String str) {
        return this.f4684c.h(str);
    }

    public void i(Fragment fragment) {
        this.M.f(fragment);
    }

    public Fragment i0(String str) {
        return this.f4684c.i(str);
    }

    public Parcelable i1() {
        int size;
        j0();
        X();
        a0(true);
        this.E = true;
        this.M.o(true);
        ArrayList<s> v10 = this.f4684c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (v10.isEmpty()) {
            if (E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w10 = this.f4684c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f4685d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new androidx.fragment.app.b(this.f4685d.get(i10));
                if (E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f4685d.get(i10));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f4731a = v10;
        pVar.f4732b = w10;
        pVar.f4733c = bVarArr;
        pVar.f4734d = this.f4690i.get();
        Fragment fragment = this.f4702u;
        if (fragment != null) {
            pVar.f4735e = fragment.mWho;
        }
        pVar.f4736f.addAll(this.f4691j.keySet());
        pVar.f4737r.addAll(this.f4691j.values());
        pVar.f4738s = new ArrayList<>(this.C);
        return pVar;
    }

    public int j() {
        return this.f4690i.getAndIncrement();
    }

    void j1() {
        synchronized (this.f4682a) {
            ArrayList<q> arrayList = this.L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f4682a.size() == 1;
            if (z10 || z11) {
                this.f4699r.g().removeCallbacks(this.N);
                this.f4699r.g().post(this.N);
                r1();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    public void k1(Fragment fragment, boolean z10) {
        ViewGroup o02 = o0(fragment);
        if (o02 == null || !(o02 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) o02).setDrawDisappearingViewsLast(!z10);
    }

    public void l(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f4684c.a(fragment);
            if (E0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
    }

    public int l0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4685d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void l1(Fragment fragment, f.b bVar) {
        if (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public v m() {
        return new androidx.fragment.app.a(this);
    }

    public void m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f4702u;
            this.f4702u = fragment;
            L(fragment2);
            L(this.f4702u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public androidx.fragment.app.g n0() {
        return this.f4700s;
    }

    boolean o() {
        boolean z10 = false;
        for (Fragment fragment : this.f4684c.l()) {
            if (fragment != null) {
                z10 = F0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void o1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.f4703v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f4701t;
        return fragment != null ? fragment.mFragmentManager.p0() : this.f4704w;
    }

    public u q0() {
        return this.f4684c;
    }

    public void q1(l lVar) {
        this.f4696o.p(lVar);
    }

    public List<Fragment> r0() {
        return this.f4684c.n();
    }

    public androidx.fragment.app.k<?> s0() {
        return this.f4699r;
    }

    void t(androidx.fragment.app.a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.r(z12);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f4698q >= 1) {
            w.B(this.f4699r.f(), this.f4700s, arrayList, arrayList2, 0, 1, true, this.f4695n);
        }
        if (z12) {
            P0(this.f4698q, true);
        }
        for (Fragment fragment : this.f4684c.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.u(fragment.mContainerId)) {
                float f10 = fragment.mPostponedAlpha;
                if (f10 > 0.0f) {
                    fragment.mView.setAlpha(f10);
                }
                if (z12) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public LayoutInflater.Factory2 t0() {
        return this.f4687f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4701t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4701t;
        } else {
            androidx.fragment.app.k<?> kVar = this.f4699r;
            if (kVar == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(kVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4699r;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public androidx.fragment.app.m u0() {
        return this.f4696o;
    }

    public t v(Fragment fragment) {
        t m10 = this.f4684c.m(fragment.mWho);
        if (m10 != null) {
            return m10;
        }
        t tVar = new t(this.f4696o, this.f4684c, fragment);
        tVar.o(this.f4699r.f().getClassLoader());
        tVar.t(this.f4698q);
        return tVar;
    }

    public Fragment v0() {
        return this.f4701t;
    }

    public Fragment w0() {
        return this.f4702u;
    }

    public void x(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (E0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f4684c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            n1(fragment);
        }
    }

    public c0 x0() {
        c0 c0Var = this.f4705x;
        if (c0Var != null) {
            return c0Var;
        }
        Fragment fragment = this.f4701t;
        return fragment != null ? fragment.mFragmentManager.x0() : this.f4706y;
    }

    public void y() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(4);
    }

    public void z() {
        this.E = false;
        this.F = false;
        this.M.o(false);
        S(0);
    }

    public j0 z0(Fragment fragment) {
        return this.M.l(fragment);
    }
}
