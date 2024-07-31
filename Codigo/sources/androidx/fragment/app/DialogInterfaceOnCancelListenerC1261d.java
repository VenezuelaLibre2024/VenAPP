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
import androidx.lifecycle.C1313l0;
import androidx.lifecycle.C1315m0;
import androidx.lifecycle.InterfaceC1310k;
import androidx.lifecycle.InterfaceC1321s;
import p371u1.C11301e;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1261d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    private Handler f5360a;

    /* renamed from: u */
    private boolean f5369u;

    /* renamed from: w */
    private Dialog f5371w;

    /* renamed from: x */
    private boolean f5372x;

    /* renamed from: y */
    private boolean f5373y;

    /* renamed from: z */
    private boolean f5374z;

    /* renamed from: b */
    private Runnable f5361b = new a();

    /* renamed from: c */
    private DialogInterface.OnCancelListener f5362c = new b();

    /* renamed from: d */
    private DialogInterface.OnDismissListener f5363d = new c();

    /* renamed from: e */
    private int f5364e = 0;

    /* renamed from: f */
    private int f5365f = 0;

    /* renamed from: r */
    private boolean f5366r = true;

    /* renamed from: s */
    private boolean f5367s = true;

    /* renamed from: t */
    private int f5368t = -1;

    /* renamed from: v */
    private InterfaceC1321s<InterfaceC1310k> f5370v = new d();

    /* renamed from: A */
    private boolean f5359A = false;

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC1261d.this.f5363d.onDismiss(DialogInterfaceOnCancelListenerC1261d.this.f5371w);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1261d.this.f5371w != null) {
                DialogInterfaceOnCancelListenerC1261d dialogInterfaceOnCancelListenerC1261d = DialogInterfaceOnCancelListenerC1261d.this;
                dialogInterfaceOnCancelListenerC1261d.onCancel(dialogInterfaceOnCancelListenerC1261d.f5371w);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC1261d.this.f5371w != null) {
                DialogInterfaceOnCancelListenerC1261d dialogInterfaceOnCancelListenerC1261d = DialogInterfaceOnCancelListenerC1261d.this;
                dialogInterfaceOnCancelListenerC1261d.onDismiss(dialogInterfaceOnCancelListenerC1261d.f5371w);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC1321s<InterfaceC1310k> {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC1321s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2553a(InterfaceC1310k interfaceC1310k) {
            if (interfaceC1310k == null || !DialogInterfaceOnCancelListenerC1261d.this.f5367s) {
                return;
            }
            View requireView = DialogInterfaceOnCancelListenerC1261d.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC1261d.this.f5371w != null) {
                if (AbstractC1272n.m6991E0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC1261d.this.f5371w);
                }
                DialogInterfaceOnCancelListenerC1261d.this.f5371w.setContentView(requireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: classes.dex */
    class e extends AbstractC1265g {

        /* renamed from: a */
        final /* synthetic */ AbstractC1265g f5379a;

        e(AbstractC1265g abstractC1265g) {
            this.f5379a = abstractC1265g;
        }

        @Override // androidx.fragment.app.AbstractC1265g
        /* renamed from: c */
        public View mo6828c(int i10) {
            return this.f5379a.mo6829d() ? this.f5379a.mo6828c(i10) : DialogInterfaceOnCancelListenerC1261d.this.m6922k(i10);
        }

        @Override // androidx.fragment.app.AbstractC1265g
        /* renamed from: d */
        public boolean mo6829d() {
            return this.f5379a.mo6829d() || DialogInterfaceOnCancelListenerC1261d.this.m6923l();
        }
    }

    /* renamed from: g */
    private void m6917g(boolean z10, boolean z11) {
        if (this.f5373y) {
            return;
        }
        this.f5373y = true;
        this.f5374z = false;
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f5371w.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f5360a.getLooper()) {
                    onDismiss(this.f5371w);
                } else {
                    this.f5360a.post(this.f5361b);
                }
            }
        }
        this.f5372x = true;
        if (this.f5368t >= 0) {
            getParentFragmentManager().m7063V0(this.f5368t, 1);
            this.f5368t = -1;
            return;
        }
        AbstractC1280v m7092m = getParentFragmentManager().m7092m();
        m7092m.mo6845k(this);
        if (z10) {
            m7092m.mo6842g();
        } else {
            m7092m.mo6841f();
        }
    }

    /* renamed from: m */
    private void m6918m(Bundle bundle) {
        if (this.f5367s && !this.f5359A) {
            try {
                this.f5369u = true;
                Dialog mo6921j = mo6921j(bundle);
                this.f5371w = mo6921j;
                if (this.f5367s) {
                    m6925o(mo6921j, this.f5364e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f5371w.setOwnerActivity((Activity) context);
                    }
                    this.f5371w.setCancelable(this.f5366r);
                    this.f5371w.setOnCancelListener(this.f5362c);
                    this.f5371w.setOnDismissListener(this.f5363d);
                    this.f5359A = true;
                } else {
                    this.f5371w = null;
                }
            } finally {
                this.f5369u = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public AbstractC1265g createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    /* renamed from: h */
    public Dialog m6919h() {
        return this.f5371w;
    }

    /* renamed from: i */
    public int m6920i() {
        return this.f5365f;
    }

    /* renamed from: j */
    public Dialog mo6921j(Bundle bundle) {
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), m6920i());
    }

    /* renamed from: k */
    View m6922k(int i10) {
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* renamed from: l */
    boolean m6923l() {
        return this.f5359A;
    }

    /* renamed from: n */
    public void m6924n(boolean z10) {
        this.f5367s = z10;
    }

    /* renamed from: o */
    public void m6925o(Dialog dialog, int i10) {
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
        getViewLifecycleOwnerLiveData().observeForever(this.f5370v);
        if (this.f5374z) {
            return;
        }
        this.f5373y = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5360a = new Handler();
        this.f5367s = this.mContainerId == 0;
        if (bundle != null) {
            this.f5364e = bundle.getInt("android:style", 0);
            this.f5365f = bundle.getInt("android:theme", 0);
            this.f5366r = bundle.getBoolean("android:cancelable", true);
            this.f5367s = bundle.getBoolean("android:showsDialog", this.f5367s);
            this.f5368t = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            this.f5372x = true;
            dialog.setOnDismissListener(null);
            this.f5371w.dismiss();
            if (!this.f5373y) {
                onDismiss(this.f5371w);
            }
            this.f5371w = null;
            this.f5359A = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f5374z && !this.f5373y) {
            this.f5373y = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f5370v);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5372x) {
            return;
        }
        if (AbstractC1272n.m6991E0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m6917g(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f5367s && !this.f5369u) {
            m6918m(bundle);
            if (AbstractC1272n.m6991E0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f5371w;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (AbstractC1272n.m6991E0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f5367s) {
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
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f5364e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f5365f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f5366r;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f5367s;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f5368t;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            this.f5372x = false;
            dialog.show();
            View decorView = this.f5371w.getWindow().getDecorView();
            C1313l0.m7366a(decorView, this);
            C1315m0.m7367a(decorView, this);
            C11301e.m35303a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f5371w;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f5371w == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5371w.onRestoreInstanceState(bundle2);
    }

    /* renamed from: p */
    public void mo6926p(AbstractC1272n abstractC1272n, String str) {
        this.f5373y = false;
        this.f5374z = true;
        AbstractC1280v m7092m = abstractC1272n.m7092m();
        m7092m.m7206d(this, str);
        m7092m.mo6841f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f5371w == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5371w.onRestoreInstanceState(bundle2);
    }
}
