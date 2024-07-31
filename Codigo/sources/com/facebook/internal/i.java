package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.internal.m;
import com.facebook.internal.s0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.d {
    public static final a C = new a(null);
    private Dialog B;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(i this$0, Bundle bundle, i4.r rVar) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.v(bundle, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(i this$0, Bundle bundle, i4.r rVar) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.w(bundle);
    }

    private final void v(Bundle bundle, i4.r rVar) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        e0 e0Var = e0.f7730a;
        Intent intent = activity.getIntent();
        kotlin.jvm.internal.n.d(intent, "fragmentActivity.intent");
        activity.setResult(rVar == null ? -1 : 0, e0.m(intent, bundle, rVar));
        activity.finish();
    }

    private final void w(Bundle bundle) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // androidx.fragment.app.d
    public Dialog j(Bundle bundle) {
        Dialog dialog = this.B;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        v(null, null);
        n(false);
        Dialog j10 = super.j(bundle);
        kotlin.jvm.internal.n.d(j10, "super.onCreateDialog(savedInstanceState)");
        return j10;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.B instanceof s0) && isResumed()) {
            Dialog dialog = this.B;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((s0) dialog).x();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog h10 = h();
        if (h10 != null && getRetainInstance()) {
            h10.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.B;
        if (dialog instanceof s0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((s0) dialog).x();
        }
    }

    public final void s() {
        androidx.fragment.app.e activity;
        s0 a10;
        String str;
        if (this.B == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            e0 e0Var = e0.f7730a;
            kotlin.jvm.internal.n.d(intent, "intent");
            Bundle u10 = e0.u(intent);
            if (!(u10 == null ? false : u10.getBoolean("is_fallback", false))) {
                String string = u10 == null ? null : u10.getString("action");
                Bundle bundle = u10 != null ? u10.getBundle("params") : null;
                if (n0.d0(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                    n0.k0("FacebookDialogFragment", str);
                    activity.finish();
                    return;
                } else {
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    a10 = new s0.a(activity, string, bundle).h(new s0.d() { // from class: com.facebook.internal.g
                        @Override // com.facebook.internal.s0.d
                        public final void a(Bundle bundle2, i4.r rVar) {
                            i.t(i.this, bundle2, rVar);
                        }
                    }).a();
                    this.B = a10;
                }
            }
            String string2 = u10 != null ? u10.getString("url") : null;
            if (n0.d0(string2)) {
                str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                n0.k0("FacebookDialogFragment", str);
                activity.finish();
                return;
            }
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{i4.e0.m()}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            m.a aVar = m.B;
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            a10 = aVar.a(activity, string2, format);
            a10.B(new s0.d() { // from class: com.facebook.internal.h
                @Override // com.facebook.internal.s0.d
                public final void a(Bundle bundle2, i4.r rVar) {
                    i.u(i.this, bundle2, rVar);
                }
            });
            this.B = a10;
        }
    }

    public final void x(Dialog dialog) {
        this.B = dialog;
    }
}
