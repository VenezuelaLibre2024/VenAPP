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
import androidx.activity.AbstractC0197l;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0210c;
import androidx.activity.result.C0208a;
import androidx.activity.result.C0212e;
import androidx.activity.result.InterfaceC0209b;
import androidx.collection.C0732b;
import androidx.core.os.C0944c;
import androidx.fragment.app.AbstractC1280v;
import androidx.fragment.app.C1264f;
import androidx.fragment.app.C1281w;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.C1309j0;
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
import p052d1.C6816b;
import p091f.AbstractC7255a;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public abstract class AbstractC1272n {

    /* renamed from: O */
    private static boolean f5420O = false;

    /* renamed from: P */
    static boolean f5421P = true;

    /* renamed from: A */
    private AbstractC0210c<C0212e> f5422A;

    /* renamed from: B */
    private AbstractC0210c<String[]> f5423B;

    /* renamed from: D */
    private boolean f5425D;

    /* renamed from: E */
    private boolean f5426E;

    /* renamed from: F */
    private boolean f5427F;

    /* renamed from: G */
    private boolean f5428G;

    /* renamed from: H */
    private boolean f5429H;

    /* renamed from: I */
    private ArrayList<C1255a> f5430I;

    /* renamed from: J */
    private ArrayList<Boolean> f5431J;

    /* renamed from: K */
    private ArrayList<Fragment> f5432K;

    /* renamed from: L */
    private ArrayList<q> f5433L;

    /* renamed from: M */
    private C1275q f5434M;

    /* renamed from: b */
    private boolean f5437b;

    /* renamed from: d */
    ArrayList<C1255a> f5439d;

    /* renamed from: e */
    private ArrayList<Fragment> f5440e;

    /* renamed from: g */
    private OnBackPressedDispatcher f5442g;

    /* renamed from: l */
    private ArrayList<n> f5447l;

    /* renamed from: r */
    private AbstractC1269k<?> f5453r;

    /* renamed from: s */
    private AbstractC1265g f5454s;

    /* renamed from: t */
    private Fragment f5455t;

    /* renamed from: u */
    Fragment f5456u;

    /* renamed from: z */
    private AbstractC0210c<Intent> f5461z;

    /* renamed from: a */
    private final ArrayList<o> f5436a = new ArrayList<>();

    /* renamed from: c */
    private final C1279u f5438c = new C1279u();

    /* renamed from: f */
    private final LayoutInflaterFactory2C1270l f5441f = new LayoutInflaterFactory2C1270l(this);

    /* renamed from: h */
    private final AbstractC0197l f5443h = new c(false);

    /* renamed from: i */
    private final AtomicInteger f5444i = new AtomicInteger();

    /* renamed from: j */
    private final Map<String, Bundle> f5445j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map<String, Object> f5446k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map<Fragment, HashSet<C0944c>> f5448m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final C1281w.g f5449n = new d();

    /* renamed from: o */
    private final C1271m f5450o = new C1271m(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList<InterfaceC1276r> f5451p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    int f5452q = -1;

    /* renamed from: v */
    private C1268j f5457v = null;

    /* renamed from: w */
    private C1268j f5458w = new e();

    /* renamed from: x */
    private InterfaceC1260c0 f5459x = null;

    /* renamed from: y */
    private InterfaceC1260c0 f5460y = new f();

    /* renamed from: C */
    ArrayDeque<m> f5424C = new ArrayDeque<>();

    /* renamed from: N */
    private Runnable f5435N = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0209b<C0208a> {
        a() {
        }

        @Override // androidx.activity.result.InterfaceC0209b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo835a(C0208a c0208a) {
            m pollFirst = AbstractC1272n.this.f5424C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f5476a;
            int i10 = pollFirst.f5477b;
            Fragment m7188i = AbstractC1272n.this.f5438c.m7188i(str);
            if (m7188i != null) {
                m7188i.onActivityResult(i10, c0208a.m832b(), c0208a.m831a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0209b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.InterfaceC0209b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo835a(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m pollFirst = AbstractC1272n.this.f5424C.pollFirst();
            if (pollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = pollFirst.f5476a;
                int i11 = pollFirst.f5477b;
                Fragment m7188i = AbstractC1272n.this.f5438c.m7188i(str);
                if (m7188i != null) {
                    m7188i.onRequestPermissionsResult(i11, strArr, iArr);
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

    /* renamed from: androidx.fragment.app.n$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0197l {
        c(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.AbstractC0197l
        public void handleOnBackPressed() {
            AbstractC1272n.this.m7027A0();
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    /* loaded from: classes.dex */
    class d implements C1281w.g {
        d() {
        }

        @Override // androidx.fragment.app.C1281w.g
        /* renamed from: a */
        public void mo7115a(Fragment fragment, C0944c c0944c) {
            if (c0944c.m4704b()) {
                return;
            }
            AbstractC1272n.this.m7071b1(fragment, c0944c);
        }

        @Override // androidx.fragment.app.C1281w.g
        /* renamed from: b */
        public void mo7116b(Fragment fragment, C0944c c0944c) {
            AbstractC1272n.this.m7075f(fragment, c0944c);
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    /* loaded from: classes.dex */
    class e extends C1268j {
        e() {
        }

        @Override // androidx.fragment.app.C1268j
        /* renamed from: a */
        public Fragment mo6968a(ClassLoader classLoader, String str) {
            return AbstractC1272n.this.m7101s0().m6939b(AbstractC1272n.this.m7101s0().m6970f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.n$f */
    /* loaded from: classes.dex */
    class f implements InterfaceC1260c0 {
        f() {
        }

        @Override // androidx.fragment.app.InterfaceC1260c0
        /* renamed from: a */
        public AbstractC1258b0 mo6913a(ViewGroup viewGroup) {
            return new C1259c(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.n$g */
    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1272n.this.m7068a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5469a;

        /* renamed from: b */
        final /* synthetic */ View f5470b;

        /* renamed from: c */
        final /* synthetic */ Fragment f5471c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f5469a = viewGroup;
            this.f5470b = view;
            this.f5471c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5469a.endViewTransition(this.f5470b);
            animator.removeListener(this);
            Fragment fragment = this.f5471c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$i */
    /* loaded from: classes.dex */
    public class i implements InterfaceC1276r {

        /* renamed from: a */
        final /* synthetic */ Fragment f5473a;

        i(Fragment fragment) {
            this.f5473a = fragment;
        }

        @Override // androidx.fragment.app.InterfaceC1276r
        /* renamed from: a */
        public void mo6928a(AbstractC1272n abstractC1272n, Fragment fragment) {
            this.f5473a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$j */
    /* loaded from: classes.dex */
    public class j implements InterfaceC0209b<C0208a> {
        j() {
        }

        @Override // androidx.activity.result.InterfaceC0209b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo835a(C0208a c0208a) {
            m pollFirst = AbstractC1272n.this.f5424C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f5476a;
            int i10 = pollFirst.f5477b;
            Fragment m7188i = AbstractC1272n.this.f5438c.m7188i(str);
            if (m7188i != null) {
                m7188i.onActivityResult(i10, c0208a.m832b(), c0208a.m831a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$k */
    /* loaded from: classes.dex */
    public static class k extends AbstractC7255a<C0212e, C0208a> {
        k() {
        }

        @Override // p091f.AbstractC7255a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo7118a(Context context, C0212e c0212e) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m837a = c0212e.m837a();
            if (m837a != null && (bundleExtra = m837a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m837a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m837a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c0212e = new C0212e.a(c0212e.m840d()).m842b(null).m843c(c0212e.m839c(), c0212e.m838b()).m841a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0212e);
            if (AbstractC1272n.m6991E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p091f.AbstractC7255a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0208a mo7119c(int i10, Intent intent) {
            return new C0208a(i10, intent);
        }
    }

    /* renamed from: androidx.fragment.app.n$l */
    /* loaded from: classes.dex */
    public static abstract class l {
        @Deprecated
        /* renamed from: a */
        public void m7122a(AbstractC1272n abstractC1272n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m7123b(AbstractC1272n abstractC1272n, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m7124c(AbstractC1272n abstractC1272n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m7125d(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: e */
        public void m7126e(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo7127f(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: g */
        public void m7128g(AbstractC1272n abstractC1272n, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m7129h(AbstractC1272n abstractC1272n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo7130i(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: j */
        public void m7131j(AbstractC1272n abstractC1272n, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void m7132k(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: l */
        public void m7133l(AbstractC1272n abstractC1272n, Fragment fragment) {
        }

        /* renamed from: m */
        public void m7134m(AbstractC1272n abstractC1272n, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void m7135n(AbstractC1272n abstractC1272n, Fragment fragment) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$m */
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a */
        String f5476a;

        /* renamed from: b */
        int f5477b;

        /* renamed from: androidx.fragment.app.n$m$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(Parcel parcel) {
            this.f5476a = parcel.readString();
            this.f5477b = parcel.readInt();
        }

        m(String str, int i10) {
            this.f5476a = str;
            this.f5477b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f5476a);
            parcel.writeInt(this.f5477b);
        }
    }

    /* renamed from: androidx.fragment.app.n$n */
    /* loaded from: classes.dex */
    public interface n {
        void onBackStackChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$o */
    /* loaded from: classes.dex */
    public interface o {
        /* renamed from: a */
        boolean mo6840a(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.n$p */
    /* loaded from: classes.dex */
    private class p implements o {

        /* renamed from: a */
        final String f5478a;

        /* renamed from: b */
        final int f5479b;

        /* renamed from: c */
        final int f5480c;

        p(String str, int i10, int i11) {
            this.f5478a = str;
            this.f5479b = i10;
            this.f5480c = i11;
        }

        @Override // androidx.fragment.app.AbstractC1272n.o
        /* renamed from: a */
        public boolean mo6840a(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = AbstractC1272n.this.f5456u;
            if (fragment == null || this.f5479b >= 0 || this.f5478a != null || !fragment.getChildFragmentManager().m7065W0()) {
                return AbstractC1272n.this.m7067Y0(arrayList, arrayList2, this.f5478a, this.f5479b, this.f5480c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.n$q */
    /* loaded from: classes.dex */
    public static class q implements Fragment.InterfaceC1253l {

        /* renamed from: a */
        final boolean f5482a;

        /* renamed from: b */
        final C1255a f5483b;

        /* renamed from: c */
        private int f5484c;

        q(C1255a c1255a, boolean z10) {
            this.f5482a = z10;
            this.f5483b = c1255a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1253l
        /* renamed from: a */
        public void mo6833a() {
            this.f5484c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1253l
        /* renamed from: b */
        public void mo6834b() {
            int i10 = this.f5484c - 1;
            this.f5484c = i10;
            if (i10 != 0) {
                return;
            }
            this.f5483b.f5278t.m7086j1();
        }

        /* renamed from: c */
        void m7138c() {
            C1255a c1255a = this.f5483b;
            c1255a.f5278t.m7102t(c1255a, this.f5482a, false, false);
        }

        /* renamed from: d */
        void m7139d() {
            boolean z10 = this.f5484c > 0;
            for (Fragment fragment : this.f5483b.f5278t.m7100r0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z10 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C1255a c1255a = this.f5483b;
            c1255a.f5278t.m7102t(c1255a, this.f5482a, !z10, true);
        }

        /* renamed from: e */
        public boolean m7140e() {
            return this.f5484c == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public static boolean m6991E0(int i10) {
        return f5420O || Log.isLoggable("FragmentManager", i10);
    }

    /* renamed from: F0 */
    private boolean m6992F0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m7095o();
    }

    /* renamed from: L */
    private void m6993L(Fragment fragment) {
        if (fragment == null || !fragment.equals(m7076f0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: N0 */
    private void m6994N0(C0732b<Fragment> c0732b) {
        int size = c0732b.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment m3668n = c0732b.m3668n(i10);
            if (!m3668n.mAdded) {
                View requireView = m3668n.requireView();
                m3668n.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: S */
    private void m6995S(int i10) {
        try {
            this.f5437b = true;
            this.f5438c.m7183d(i10);
            m7053P0(i10, false);
            if (f5421P) {
                Iterator<AbstractC1258b0> it = m7020r().iterator();
                while (it.hasNext()) {
                    it.next().m6875j();
                }
            }
            this.f5437b = false;
            m7068a0(true);
        } catch (Throwable th2) {
            this.f5437b = false;
            throw th2;
        }
    }

    /* renamed from: V */
    private void m6996V() {
        if (this.f5429H) {
            this.f5429H = false;
            m7018p1();
        }
    }

    /* renamed from: X */
    private void m6997X() {
        if (f5421P) {
            Iterator<AbstractC1258b0> it = m7020r().iterator();
            while (it.hasNext()) {
                it.next().m6875j();
            }
        } else {
            if (this.f5448m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f5448m.keySet()) {
                m7014n(fragment);
                m7055Q0(fragment);
            }
        }
    }

    /* renamed from: X0 */
    private boolean m6998X0(String str, int i10, int i11) {
        m7068a0(false);
        m6999Z(true);
        Fragment fragment = this.f5456u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().m7065W0()) {
            return true;
        }
        boolean m7067Y0 = m7067Y0(this.f5430I, this.f5431J, str, i10, i11);
        if (m7067Y0) {
            this.f5437b = true;
            try {
                m7007d1(this.f5430I, this.f5431J);
            } finally {
                m7019q();
            }
        }
        m7021r1();
        m6996V();
        this.f5438c.m7181b();
        return m7067Y0;
    }

    /* renamed from: Z */
    private void m6999Z(boolean z10) {
        if (this.f5437b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5453r == null) {
            if (!this.f5428G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5453r.m6971g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            m7017p();
        }
        if (this.f5430I == null) {
            this.f5430I = new ArrayList<>();
            this.f5431J = new ArrayList<>();
        }
        this.f5437b = true;
        try {
            m7008e0(null, null);
        } finally {
            this.f5437b = false;
        }
    }

    /* renamed from: Z0 */
    private int m7000Z0(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, C0732b<Fragment> c0732b) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            C1255a c1255a = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (c1255a.m6856x() && !c1255a.m6855v(arrayList, i13 + 1, i11)) {
                if (this.f5433L == null) {
                    this.f5433L = new ArrayList<>();
                }
                q qVar = new q(c1255a, booleanValue);
                this.f5433L.add(qVar);
                c1255a.m6858z(qVar);
                if (booleanValue) {
                    c1255a.m6850q();
                } else {
                    c1255a.m6851r(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, c1255a);
                }
                m7005d(c0732b);
            }
        }
        return i12;
    }

    /* renamed from: c0 */
    private static void m7004c0(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C1255a c1255a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c1255a.m6846m(-1);
                c1255a.m6851r(i10 == i11 + (-1));
            } else {
                c1255a.m6846m(1);
                c1255a.m6850q();
            }
            i10++;
        }
    }

    /* renamed from: d */
    private void m7005d(C0732b<Fragment> c0732b) {
        int i10 = this.f5452q;
        if (i10 < 1) {
            return;
        }
        int min = Math.min(i10, 5);
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment.mState < min) {
                m7057R0(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    c0732b.add(fragment);
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
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7006d0(java.util.ArrayList<androidx.fragment.app.C1255a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC1272n.m7006d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: d1 */
    private void m7007d1(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m7008e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f5542r) {
                if (i11 != i10) {
                    m7006d0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f5542r) {
                        i11++;
                    }
                }
                m7006d0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m7006d0(arrayList, arrayList2, i11, size);
        }
    }

    /* renamed from: e0 */
    private void m7008e0(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<q> arrayList3 = this.f5433L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = this.f5433L.get(i10);
            if (arrayList == null || qVar.f5482a || (indexOf2 = arrayList.indexOf(qVar.f5483b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (qVar.m7140e() || (arrayList != null && qVar.f5483b.m6855v(arrayList, 0, arrayList.size()))) {
                    this.f5433L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || qVar.f5482a || (indexOf = arrayList.indexOf(qVar.f5483b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        qVar.m7139d();
                    }
                }
                i10++;
            } else {
                this.f5433L.remove(i10);
                i10--;
                size--;
            }
            qVar.m7138c();
            i10++;
        }
    }

    /* renamed from: f1 */
    private void m7009f1() {
        if (this.f5447l != null) {
            for (int i10 = 0; i10 < this.f5447l.size(); i10++) {
                this.f5447l.get(i10).onBackStackChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public static int m7010h1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: j0 */
    private void m7011j0() {
        if (f5421P) {
            Iterator<AbstractC1258b0> it = m7020r().iterator();
            while (it.hasNext()) {
                it.next().m6876k();
            }
        } else if (this.f5433L != null) {
            while (!this.f5433L.isEmpty()) {
                this.f5433L.remove(0).m7139d();
            }
        }
    }

    /* renamed from: k0 */
    private boolean m7012k0(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f5436a) {
            if (this.f5436a.isEmpty()) {
                return false;
            }
            int size = this.f5436a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f5436a.get(i10).mo6840a(arrayList, arrayList2);
            }
            this.f5436a.clear();
            this.f5453r.m6971g().removeCallbacks(this.f5435N);
            return z10;
        }
    }

    /* renamed from: m0 */
    private C1275q m7013m0(Fragment fragment) {
        return this.f5434M.m7148i(fragment);
    }

    /* renamed from: n */
    private void m7014n(Fragment fragment) {
        HashSet<C0944c> hashSet = this.f5448m.get(fragment);
        if (hashSet != null) {
            Iterator<C0944c> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m4703a();
            }
            hashSet.clear();
            m7024w(fragment);
            this.f5448m.remove(fragment);
        }
    }

    /* renamed from: n1 */
    private void m7015n1(Fragment fragment) {
        ViewGroup m7016o0 = m7016o0(fragment);
        if (m7016o0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = C6816b.f15048c;
        if (m7016o0.getTag(i10) == null) {
            m7016o0.setTag(i10, fragment);
        }
        ((Fragment) m7016o0.getTag(i10)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: o0 */
    private ViewGroup m7016o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f5454s.mo6829d()) {
            View mo6828c = this.f5454s.mo6828c(fragment.mContainerId);
            if (mo6828c instanceof ViewGroup) {
                return (ViewGroup) mo6828c;
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m7017p() {
        if (m7043J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: p1 */
    private void m7018p1() {
        Iterator<C1278t> it = this.f5438c.m7190k().iterator();
        while (it.hasNext()) {
            m7062U0(it.next());
        }
    }

    /* renamed from: q */
    private void m7019q() {
        this.f5437b = false;
        this.f5431J.clear();
        this.f5430I.clear();
    }

    /* renamed from: r */
    private Set<AbstractC1258b0> m7020r() {
        HashSet hashSet = new HashSet();
        Iterator<C1278t> it = this.f5438c.m7190k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m7170k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC1258b0.m6867o(viewGroup, m7109x0()));
            }
        }
        return hashSet;
    }

    /* renamed from: r1 */
    private void m7021r1() {
        synchronized (this.f5436a) {
            if (this.f5436a.isEmpty()) {
                this.f5443h.setEnabled(m7090l0() > 0 && m7039H0(this.f5455t));
            } else {
                this.f5443h.setEnabled(true);
            }
        }
    }

    /* renamed from: s */
    private Set<AbstractC1258b0> m7022s(ArrayList<C1255a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<AbstractC1280v.a> it = arrayList.get(i10).f5527c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f5545b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC1258b0.m6866n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* renamed from: u */
    private void m7023u(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C1264f.d m6937c = C1264f.m6937c(this.f5453r.m6970f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (m6937c == null || (animator = m6937c.f5396b) == null) {
                if (m6937c != null) {
                    fragment.mView.startAnimation(m6937c.f5395a);
                    m6937c.f5395a.start();
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
                    m6937c.f5396b.addListener(new h(viewGroup, view, fragment));
                }
                m6937c.f5396b.start();
            }
        }
        m7031C0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: w */
    private void m7024w(Fragment fragment) {
        fragment.performDestroyView();
        this.f5450o.m6988n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public static Fragment m7025y0(View view) {
        Object tag = view.getTag(C6816b.f15046a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m7026A(Configuration configuration) {
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: A0 */
    void m7027A0() {
        m7068a0(true);
        if (this.f5443h.isEnabled()) {
            m7065W0();
        } else {
            this.f5442g.m794e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean m7028B(MenuItem menuItem) {
        if (this.f5452q < 1) {
            return false;
        }
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void m7029B0(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m7015n1(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m7030C() {
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        m6995S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void m7031C0(Fragment fragment) {
        if (fragment.mAdded && m6992F0(fragment)) {
            this.f5425D = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m7032D(Menu menu, MenuInflater menuInflater) {
        if (this.f5452q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null && m7037G0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f5440e != null) {
            for (int i10 = 0; i10 < this.f5440e.size(); i10++) {
                Fragment fragment2 = this.f5440e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5440e = arrayList;
        return z10;
    }

    /* renamed from: D0 */
    public boolean m7033D0() {
        return this.f5428G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m7034E() {
        this.f5428G = true;
        m7068a0(true);
        m6997X();
        m6995S(-1);
        this.f5453r = null;
        this.f5454s = null;
        this.f5455t = null;
        if (this.f5442g != null) {
            this.f5443h.remove();
            this.f5442g = null;
        }
        AbstractC0210c<Intent> abstractC0210c = this.f5461z;
        if (abstractC0210c != null) {
            abstractC0210c.mo827c();
            this.f5422A.mo827c();
            this.f5423B.mo827c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m7035F() {
        m6995S(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m7036G() {
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean m7037G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m7038H(boolean z10) {
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public boolean m7039H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC1272n abstractC1272n = fragment.mFragmentManager;
        return fragment.equals(abstractC1272n.m7107w0()) && m7039H0(abstractC1272n.f5455t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m7040I(Fragment fragment) {
        Iterator<InterfaceC1276r> it = this.f5451p.iterator();
        while (it.hasNext()) {
            it.next().mo6928a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean m7041I0(int i10) {
        return this.f5452q >= i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m7042J(MenuItem menuItem) {
        if (this.f5452q < 1) {
            return false;
        }
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J0 */
    public boolean m7043J0() {
        return this.f5426E || this.f5427F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m7044K(Menu menu) {
        if (this.f5452q < 1) {
            return;
        }
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void m7045K0(Fragment fragment, String[] strArr, int i10) {
        if (this.f5423B == null) {
            this.f5453r.m6972j(fragment, strArr, i10);
            return;
        }
        this.f5424C.addLast(new m(fragment.mWho, i10));
        this.f5423B.m836a(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void m7046L0(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.f5461z == null) {
            this.f5453r.m6973m(fragment, intent, i10, bundle);
            return;
        }
        this.f5424C.addLast(new m(fragment.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f5461z.m836a(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m7047M() {
        m6995S(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void m7048M0(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (this.f5422A == null) {
            this.f5453r.m6974n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (m6991E0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        C0212e m841a = new C0212e.a(intentSender).m842b(intent2).m843c(i12, i11).m841a();
        this.f5424C.addLast(new m(fragment.mWho, i10));
        if (m6991E0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f5422A.m836a(m841a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m7049N(boolean z10) {
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean m7050O(Menu menu) {
        boolean z10 = false;
        if (this.f5452q < 1) {
            return false;
        }
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null && m7037G0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m7051O0(Fragment fragment) {
        if (!this.f5438c.m7182c(fragment.mWho)) {
            if (m6991E0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f5452q + "since it is not added to " + this);
                return;
            }
            return;
        }
        m7055Q0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f10 = fragment.mPostponedAlpha;
            if (f10 > 0.0f) {
                view.setAlpha(f10);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C1264f.d m6937c = C1264f.m6937c(this.f5453r.m6970f(), fragment, true, fragment.getPopDirection());
            if (m6937c != null) {
                Animation animation = m6937c.f5395a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    m6937c.f5396b.setTarget(fragment.mView);
                    m6937c.f5396b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m7023u(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m7052P() {
        m7021r1();
        m6993L(this.f5456u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void m7053P0(int i10, boolean z10) {
        AbstractC1269k<?> abstractC1269k;
        if (this.f5453r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f5452q) {
            this.f5452q = i10;
            if (f5421P) {
                this.f5438c.m7197r();
            } else {
                Iterator<Fragment> it = this.f5438c.m7193n().iterator();
                while (it.hasNext()) {
                    m7051O0(it.next());
                }
                for (C1278t c1278t : this.f5438c.m7190k()) {
                    Fragment m7170k = c1278t.m7170k();
                    if (!m7170k.mIsNewlyAdded) {
                        m7051O0(m7170k);
                    }
                    if (m7170k.mRemoving && !m7170k.isInBackStack()) {
                        this.f5438c.m7196q(c1278t);
                    }
                }
            }
            m7018p1();
            if (this.f5425D && (abstractC1269k = this.f5453r) != null && this.f5452q == 7) {
                abstractC1269k.mo6933o();
                this.f5425D = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m7054Q() {
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        m6995S(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void m7055Q0(Fragment fragment) {
        m7057R0(fragment, this.f5452q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m7056R() {
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        m6995S(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m7057R0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC1272n.m7057R0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m7058S0() {
        if (this.f5453r == null) {
            return;
        }
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        for (Fragment fragment : this.f5438c.m7193n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m7059T() {
        this.f5427F = true;
        this.f5434M.m7153o(true);
        m6995S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m7060T0(C1266h c1266h) {
        View view;
        for (C1278t c1278t : this.f5438c.m7190k()) {
            Fragment m7170k = c1278t.m7170k();
            if (m7170k.mContainerId == c1266h.getId() && (view = m7170k.mView) != null && view.getParent() == null) {
                m7170k.mContainer = c1266h;
                c1278t.m7161b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m7061U() {
        m6995S(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m7062U0(C1278t c1278t) {
        Fragment m7170k = c1278t.m7170k();
        if (m7170k.mDeferStart) {
            if (this.f5437b) {
                this.f5429H = true;
                return;
            }
            m7170k.mDeferStart = false;
            if (f5421P) {
                c1278t.m7171m();
            } else {
                m7055Q0(m7170k);
            }
        }
    }

    /* renamed from: V0 */
    public void m7063V0(int i10, int i11) {
        if (i10 >= 0) {
            m7066Y(new p(null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* renamed from: W */
    public void m7064W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f5438c.m7184e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f5440e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f5440e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C1255a> arrayList2 = this.f5439d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                C1255a c1255a = this.f5439d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1255a.toString());
                c1255a.m6848o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5444i.get());
        synchronized (this.f5436a) {
            int size3 = this.f5436a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    o oVar = this.f5436a.get(i12);
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
        printWriter.println(this.f5453r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5454s);
        if (this.f5455t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5455t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5452q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5426E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5427F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5428G);
        if (this.f5425D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5425D);
        }
    }

    /* renamed from: W0 */
    public boolean m7065W0() {
        return m6998X0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m7066Y(o oVar, boolean z10) {
        if (!z10) {
            if (this.f5453r == null) {
                if (!this.f5428G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m7017p();
        }
        synchronized (this.f5436a) {
            if (this.f5453r == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f5436a.add(oVar);
                m7086j1();
            }
        }
    }

    /* renamed from: Y0 */
    boolean m7067Y0(ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<C1255a> arrayList3 = this.f5439d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f5439d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1255a c1255a = this.f5439d.get(size2);
                    if ((str != null && str.equals(c1255a.m6853t())) || (i10 >= 0 && i10 == c1255a.f5280v)) {
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
                        C1255a c1255a2 = this.f5439d.get(size2);
                        if (str == null || !str.equals(c1255a2.m6853t())) {
                            if (i10 < 0 || i10 != c1255a2.f5280v) {
                                break;
                            }
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f5439d.size() - 1) {
                return false;
            }
            for (int size3 = this.f5439d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f5439d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean m7068a0(boolean z10) {
        m6999Z(z10);
        boolean z11 = false;
        while (m7012k0(this.f5430I, this.f5431J)) {
            z11 = true;
            this.f5437b = true;
            try {
                m7007d1(this.f5430I, this.f5431J);
            } finally {
                m7019q();
            }
        }
        m7021r1();
        m6996V();
        this.f5438c.m7181b();
        return z11;
    }

    /* renamed from: a1 */
    public void m7069a1(l lVar, boolean z10) {
        this.f5450o.m6989o(lVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m7070b0(o oVar, boolean z10) {
        if (z10 && (this.f5453r == null || this.f5428G)) {
            return;
        }
        m6999Z(z10);
        if (oVar.mo6840a(this.f5430I, this.f5431J)) {
            this.f5437b = true;
            try {
                m7007d1(this.f5430I, this.f5431J);
            } finally {
                m7019q();
            }
        }
        m7021r1();
        m6996V();
        this.f5438c.m7181b();
    }

    /* renamed from: b1 */
    void m7071b1(Fragment fragment, C0944c c0944c) {
        HashSet<C0944c> hashSet = this.f5448m.get(fragment);
        if (hashSet != null && hashSet.remove(c0944c) && hashSet.isEmpty()) {
            this.f5448m.remove(fragment);
            if (fragment.mState < 5) {
                m7024w(fragment);
                m7055Q0(fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void m7072c1(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f5438c.m7198s(fragment);
            if (m6992F0(fragment)) {
                this.f5425D = true;
            }
            fragment.mRemoving = true;
            m7015n1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7073e(C1255a c1255a) {
        if (this.f5439d == null) {
            this.f5439d = new ArrayList<>();
        }
        this.f5439d.add(c1255a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void m7074e1(Fragment fragment) {
        this.f5434M.m7152n(fragment);
    }

    /* renamed from: f */
    void m7075f(Fragment fragment, C0944c c0944c) {
        if (this.f5448m.get(fragment) == null) {
            this.f5448m.put(fragment, new HashSet<>());
        }
        this.f5448m.get(fragment).add(c0944c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public Fragment m7076f0(String str) {
        return this.f5438c.m7185f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1278t m7077g(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C1278t m7105v = m7105v(fragment);
        fragment.mFragmentManager = this;
        this.f5438c.m7195p(m7105v);
        if (!fragment.mDetached) {
            this.f5438c.m7180a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m6992F0(fragment)) {
                this.f5425D = true;
            }
        }
        return m7105v;
    }

    /* renamed from: g0 */
    public Fragment m7078g0(int i10) {
        return this.f5438c.m7186g(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void m7079g1(Parcelable parcelable) {
        C1278t c1278t;
        if (parcelable == null) {
            return;
        }
        C1274p c1274p = (C1274p) parcelable;
        if (c1274p.f5485a == null) {
            return;
        }
        this.f5438c.m7199t();
        Iterator<C1277s> it = c1274p.f5485a.iterator();
        while (it.hasNext()) {
            C1277s next = it.next();
            if (next != null) {
                Fragment m7147h = this.f5434M.m7147h(next.f5502b);
                if (m7147h != null) {
                    if (m6991E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m7147h);
                    }
                    c1278t = new C1278t(this.f5450o, this.f5438c, m7147h, next);
                } else {
                    c1278t = new C1278t(this.f5450o, this.f5438c, this.f5453r.m6970f().getClassLoader(), m7097p0(), next);
                }
                Fragment m7170k = c1278t.m7170k();
                m7170k.mFragmentManager = this;
                if (m6991E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m7170k.mWho + "): " + m7170k);
                }
                c1278t.m7173o(this.f5453r.m6970f().getClassLoader());
                this.f5438c.m7195p(c1278t);
                c1278t.m7177t(this.f5452q);
            }
        }
        for (Fragment fragment : this.f5434M.m7149k()) {
            if (!this.f5438c.m7182c(fragment.mWho)) {
                if (m6991E0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c1274p.f5485a);
                }
                this.f5434M.m7152n(fragment);
                fragment.mFragmentManager = this;
                C1278t c1278t2 = new C1278t(this.f5450o, this.f5438c, fragment);
                c1278t2.m7177t(1);
                c1278t2.m7171m();
                fragment.mRemoving = true;
                c1278t2.m7171m();
            }
        }
        this.f5438c.m7200u(c1274p.f5486b);
        if (c1274p.f5487c != null) {
            this.f5439d = new ArrayList<>(c1274p.f5487c.length);
            int i10 = 0;
            while (true) {
                C1257b[] c1257bArr = c1274p.f5487c;
                if (i10 >= c1257bArr.length) {
                    break;
                }
                C1255a m6860a = c1257bArr[i10].m6860a(this);
                if (m6991E0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + m6860a.f5280v + "): " + m6860a);
                    PrintWriter printWriter = new PrintWriter(new C1256a0("FragmentManager"));
                    m6860a.m6849p("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5439d.add(m6860a);
                i10++;
            }
        } else {
            this.f5439d = null;
        }
        this.f5444i.set(c1274p.f5488d);
        String str = c1274p.f5489e;
        if (str != null) {
            Fragment m7076f0 = m7076f0(str);
            this.f5456u = m7076f0;
            m6993L(m7076f0);
        }
        ArrayList<String> arrayList = c1274p.f5490f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Bundle bundle = c1274p.f5491r.get(i11);
                bundle.setClassLoader(this.f5453r.m6970f().getClassLoader());
                this.f5445j.put(arrayList.get(i11), bundle);
            }
        }
        this.f5424C = new ArrayDeque<>(c1274p.f5492s);
    }

    /* renamed from: h */
    public void m7080h(InterfaceC1276r interfaceC1276r) {
        this.f5451p.add(interfaceC1276r);
    }

    /* renamed from: h0 */
    public Fragment m7081h0(String str) {
        return this.f5438c.m7187h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7082i(Fragment fragment) {
        this.f5434M.m7145f(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Fragment m7083i0(String str) {
        return this.f5438c.m7188i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public Parcelable m7084i1() {
        int size;
        m7011j0();
        m6997X();
        m7068a0(true);
        this.f5426E = true;
        this.f5434M.m7153o(true);
        ArrayList<C1277s> m7201v = this.f5438c.m7201v();
        C1257b[] c1257bArr = null;
        if (m7201v.isEmpty()) {
            if (m6991E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m7202w = this.f5438c.m7202w();
        ArrayList<C1255a> arrayList = this.f5439d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c1257bArr = new C1257b[size];
            for (int i10 = 0; i10 < size; i10++) {
                c1257bArr[i10] = new C1257b(this.f5439d.get(i10));
                if (m6991E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f5439d.get(i10));
                }
            }
        }
        C1274p c1274p = new C1274p();
        c1274p.f5485a = m7201v;
        c1274p.f5486b = m7202w;
        c1274p.f5487c = c1257bArr;
        c1274p.f5488d = this.f5444i.get();
        Fragment fragment = this.f5456u;
        if (fragment != null) {
            c1274p.f5489e = fragment.mWho;
        }
        c1274p.f5490f.addAll(this.f5445j.keySet());
        c1274p.f5491r.addAll(this.f5445j.values());
        c1274p.f5492s = new ArrayList<>(this.f5424C);
        return c1274p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m7085j() {
        return this.f5444i.getAndIncrement();
    }

    /* renamed from: j1 */
    void m7086j1() {
        synchronized (this.f5436a) {
            ArrayList<q> arrayList = this.f5433L;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z11 = this.f5436a.size() == 1;
            if (z10 || z11) {
                this.f5453r.m6971g().removeCallbacks(this.f5435N);
                this.f5453r.m6971g().post(this.f5435N);
                m7021r1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m7087k(androidx.fragment.app.AbstractC1269k<?> r3, androidx.fragment.app.AbstractC1265g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC1272n.m7087k(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void m7088k1(Fragment fragment, boolean z10) {
        ViewGroup m7016o0 = m7016o0(fragment);
        if (m7016o0 == null || !(m7016o0 instanceof C1266h)) {
            return;
        }
        ((C1266h) m7016o0).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m7089l(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f5438c.m7180a(fragment);
            if (m6991E0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m6992F0(fragment)) {
                this.f5425D = true;
            }
        }
    }

    /* renamed from: l0 */
    public int m7090l0() {
        ArrayList<C1255a> arrayList = this.f5439d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void m7091l1(Fragment fragment, AbstractC1300f.b bVar) {
        if (fragment.equals(m7076f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m */
    public AbstractC1280v m7092m() {
        return new C1255a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m7093m1(Fragment fragment) {
        if (fragment == null || (fragment.equals(m7076f0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f5456u;
            this.f5456u = fragment;
            m6993L(fragment2);
            m6993L(this.f5456u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public AbstractC1265g m7094n0() {
        return this.f5454s;
    }

    /* renamed from: o */
    boolean m7095o() {
        boolean z10 = false;
        for (Fragment fragment : this.f5438c.m7191l()) {
            if (fragment != null) {
                z10 = m6992F0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m7096o1(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: p0 */
    public C1268j m7097p0() {
        C1268j c1268j = this.f5457v;
        if (c1268j != null) {
            return c1268j;
        }
        Fragment fragment = this.f5455t;
        return fragment != null ? fragment.mFragmentManager.m7097p0() : this.f5458w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public C1279u m7098q0() {
        return this.f5438c;
    }

    /* renamed from: q1 */
    public void m7099q1(l lVar) {
        this.f5450o.m6990p(lVar);
    }

    /* renamed from: r0 */
    public List<Fragment> m7100r0() {
        return this.f5438c.m7193n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public AbstractC1269k<?> m7101s0() {
        return this.f5453r;
    }

    /* renamed from: t */
    void m7102t(C1255a c1255a, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            c1255a.m6851r(z12);
        } else {
            c1255a.m6850q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1255a);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f5452q >= 1) {
            C1281w.m7211B(this.f5453r.m6970f(), this.f5454s, arrayList, arrayList2, 0, 1, true, this.f5449n);
        }
        if (z12) {
            m7053P0(this.f5452q, true);
        }
        for (Fragment fragment : this.f5438c.m7191l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c1255a.m6854u(fragment.mContainerId)) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public LayoutInflater.Factory2 m7103t0() {
        return this.f5441f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f5455t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f5455t;
        } else {
            AbstractC1269k<?> abstractC1269k = this.f5453r;
            if (abstractC1269k == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(abstractC1269k.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f5453r;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public C1271m m7104u0() {
        return this.f5450o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C1278t m7105v(Fragment fragment) {
        C1278t m7192m = this.f5438c.m7192m(fragment.mWho);
        if (m7192m != null) {
            return m7192m;
        }
        C1278t c1278t = new C1278t(this.f5450o, this.f5438c, fragment);
        c1278t.m7173o(this.f5453r.m6970f().getClassLoader());
        c1278t.m7177t(this.f5452q);
        return c1278t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public Fragment m7106v0() {
        return this.f5455t;
    }

    /* renamed from: w0 */
    public Fragment m7107w0() {
        return this.f5456u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m7108x(Fragment fragment) {
        if (m6991E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m6991E0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f5438c.m7198s(fragment);
            if (m6992F0(fragment)) {
                this.f5425D = true;
            }
            m7015n1(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public InterfaceC1260c0 m7109x0() {
        InterfaceC1260c0 interfaceC1260c0 = this.f5459x;
        if (interfaceC1260c0 != null) {
            return interfaceC1260c0;
        }
        Fragment fragment = this.f5455t;
        return fragment != null ? fragment.mFragmentManager.m7109x0() : this.f5460y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m7110y() {
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        m6995S(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m7111z() {
        this.f5426E = false;
        this.f5427F = false;
        this.f5434M.m7153o(false);
        m6995S(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public C1309j0 m7112z0(Fragment fragment) {
        return this.f5434M.m7150l(fragment);
    }
}
