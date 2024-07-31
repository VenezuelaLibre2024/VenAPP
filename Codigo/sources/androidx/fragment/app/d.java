package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;

/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    private Handler f4622a;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4631u;

    /* renamed from: w, reason: collision with root package name */
    private Dialog f4633w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4634x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4635y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4636z;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f4623b = new a();

    /* renamed from: c, reason: collision with root package name */
    private DialogInterface.OnCancelListener f4624c = new b();

    /* renamed from: d, reason: collision with root package name */
    private DialogInterface.OnDismissListener f4625d = new c();

    /* renamed from: e, reason: collision with root package name */
    private int f4626e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f4627f = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4628r = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4629s = true;

    /* renamed from: t, reason: collision with root package name */
    private int f4630t = -1;

    /* renamed from: v, reason: collision with root package name */
    private androidx.lifecycle.s<androidx.lifecycle.k> f4632v = new C0066d();
    private boolean A = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f4625d.onDismiss(d.this.f4633w);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f4633w != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f4633w);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f4633w != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f4633w);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0066d implements androidx.lifecycle.s<androidx.lifecycle.k> {
        C0066d() {
        }

        @Override // androidx.lifecycle.s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.k kVar) {
            if (kVar == null || !d.this.f4629s) {
                return;
            }
            View requireView = d.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.f4633w != null) {
                if (n.E0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f4633w);
                }
                d.this.f4633w.setContentView(requireView);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f4641a;

        e(g gVar) {
            this.f4641a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View c(int i10) {
            return this.f4641a.d() ? this.f4641a.c(i10) : d.this.k(i10);
        }

        @Override // androidx.fragment.app.g
        public boolean d() {
            return this.f4641a.d() || d.this.l();
        }
    }

    private void g(boolean z10, boolean z11) {
        if (this.f4635y) {
            return;
        }
        this.f4635y = true;
        this.f4636z = false;
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4633w.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f4622a.getLooper()) {
                    onDismiss(this.f4633w);
                } else {
                    this.f4622a.post(this.f4623b);
                }
            }
        }
        this.f4634x = true;
        if (this.f4630t >= 0) {
            getParentFragmentManager().V0(this.f4630t, 1);
            this.f4630t = -1;
            return;
        }
        v m10 = getParentFragmentManager().m();
        m10.k(this);
        if (z10) {
            m10.g();
        } else {
            m10.f();
        }
    }

    private void m(Bundle bundle) {
        if (this.f4629s && !this.A) {
            try {
                this.f4631u = true;
                Dialog j10 = j(bundle);
                this.f4633w = j10;
                if (this.f4629s) {
                    o(j10, this.f4626e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f4633w.setOwnerActivity((Activity) context);
                    }
                    this.f4633w.setCancelable(this.f4628r);
                    this.f4633w.setOnCancelListener(this.f4624c);
                    this.f4633w.setOnDismissListener(this.f4625d);
                    this.A = true;
                } else {
                    this.f4633w = null;
                }
            } finally {
                this.f4631u = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public g createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public Dialog h() {
        return this.f4633w;
    }

    public int i() {
        return this.f4627f;
    }

    public Dialog j(Bundle bundle) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), i());
    }

    View k(int i10) {
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean l() {
        return this.A;
    }

    public void n(boolean z10) {
        this.f4629s = z10;
    }

    public void o(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f4632v);
        if (this.f4636z) {
            return;
        }
        this.f4635y = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4622a = new Handler();
        this.f4629s = this.mContainerId == 0;
        if (bundle != null) {
            this.f4626e = bundle.getInt("android:style", 0);
            this.f4627f = bundle.getInt("android:theme", 0);
            this.f4628r = bundle.getBoolean("android:cancelable", true);
            this.f4629s = bundle.getBoolean("android:showsDialog", this.f4629s);
            this.f4630t = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            this.f4634x = true;
            dialog.setOnDismissListener(null);
            this.f4633w.dismiss();
            if (!this.f4635y) {
                onDismiss(this.f4633w);
            }
            this.f4633w = null;
            this.A = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f4636z && !this.f4635y) {
            this.f4635y = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f4632v);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4634x) {
            return;
        }
        if (n.E0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        g(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f4629s && !this.f4631u) {
            m(bundle);
            if (n.E0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4633w;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (n.E0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f4629s) {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f4626e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f4627f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f4628r;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f4629s;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f4630t;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            this.f4634x = false;
            dialog.show();
            View decorView = this.f4633w.getWindow().getDecorView();
            l0.a(decorView, this);
            m0.a(decorView, this);
            u1.e.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4633w;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4633w == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4633w.onRestoreInstanceState(bundle2);
    }

    public void p(n nVar, String str) {
        this.f4635y = false;
        this.f4636z = true;
        v m10 = nVar.m();
        m10.d(this, str);
        m10.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f4633w == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4633w.onRestoreInstanceState(bundle2);
    }
}
