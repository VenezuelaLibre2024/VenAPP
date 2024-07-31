package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d;
import com.facebook.internal.DialogC4631m;
import com.facebook.internal.DialogC4644s0;
import java.util.Arrays;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.C7824r;

/* renamed from: com.facebook.internal.i */
/* loaded from: classes.dex */
public final class C4623i extends DialogInterfaceOnCancelListenerC1261d {

    /* renamed from: C */
    public static final a f8735C = new a(null);

    /* renamed from: B */
    private Dialog f8736B;

    /* renamed from: com.facebook.internal.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m11223t(C4623i this$0, Bundle bundle, C7824r c7824r) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m11225v(bundle, c7824r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m11224u(C4623i this$0, Bundle bundle, C7824r c7824r) {
        C9322n.m27781e(this$0, "this$0");
        this$0.m11226w(bundle);
    }

    /* renamed from: v */
    private final void m11225v(Bundle bundle, C7824r c7824r) {
        ActivityC1263e activity = getActivity();
        if (activity == null) {
            return;
        }
        C4616e0 c4616e0 = C4616e0.f8705a;
        Intent intent = activity.getIntent();
        C9322n.m27780d(intent, "fragmentActivity.intent");
        activity.setResult(c7824r == null ? -1 : 0, C4616e0.m11167m(intent, bundle, c7824r));
        activity.finish();
    }

    /* renamed from: w */
    private final void m11226w(Bundle bundle) {
        ActivityC1263e activity = getActivity();
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d
    /* renamed from: j */
    public Dialog mo6921j(Bundle bundle) {
        Dialog dialog = this.f8736B;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        m11225v(null, null);
        m6924n(false);
        Dialog mo6921j = super.mo6921j(bundle);
        C9322n.m27780d(mo6921j, "super.onCreateDialog(savedInstanceState)");
        return mo6921j;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C9322n.m27781e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f8736B instanceof DialogC4644s0) && isResumed()) {
            Dialog dialog = this.f8736B;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((DialogC4644s0) dialog).m11422x();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11227s();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog m6919h = m6919h();
        if (m6919h != null && getRetainInstance()) {
            m6919h.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.f8736B;
        if (dialog instanceof DialogC4644s0) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((DialogC4644s0) dialog).m11422x();
        }
    }

    /* renamed from: s */
    public final void m11227s() {
        ActivityC1263e activity;
        DialogC4644s0 m11247a;
        String str;
        if (this.f8736B == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            C4616e0 c4616e0 = C4616e0.f8705a;
            C9322n.m27780d(intent, "intent");
            Bundle m11175u = C4616e0.m11175u(intent);
            if (!(m11175u == null ? false : m11175u.getBoolean("is_fallback", false))) {
                String string = m11175u == null ? null : m11175u.getString("action");
                Bundle bundle = m11175u != null ? m11175u.getBundle("params") : null;
                if (C4634n0.m11300d0(string)) {
                    str = "Cannot start a WebDialog with an empty/missing 'actionName'";
                    C4634n0.m11314k0("FacebookDialogFragment", str);
                    activity.finish();
                    return;
                } else {
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    m11247a = new DialogC4644s0.a(activity, string, bundle).m11432h(new DialogC4644s0.d() { // from class: com.facebook.internal.g
                        @Override // com.facebook.internal.DialogC4644s0.d
                        /* renamed from: a */
                        public final void mo11207a(Bundle bundle2, C7824r c7824r) {
                            C4623i.m11223t(C4623i.this, bundle2, c7824r);
                        }
                    }).mo11426a();
                    this.f8736B = m11247a;
                }
            }
            String string2 = m11175u != null ? m11175u.getString("url") : null;
            if (C4634n0.m11300d0(string2)) {
                str = "Cannot start a fallback WebDialog with an empty/missing 'url'";
                C4634n0.m11314k0("FacebookDialogFragment", str);
                activity.finish();
                return;
            }
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{C7799e0.m23861m()}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            DialogC4631m.a aVar = DialogC4631m.f8751B;
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            m11247a = aVar.m11247a(activity, string2, format);
            m11247a.m11418B(new DialogC4644s0.d() { // from class: com.facebook.internal.h
                @Override // com.facebook.internal.DialogC4644s0.d
                /* renamed from: a */
                public final void mo11207a(Bundle bundle2, C7824r c7824r) {
                    C4623i.m11224u(C4623i.this, bundle2, c7824r);
                }
            });
            this.f8736B = m11247a;
        }
    }

    /* renamed from: x */
    public final void m11228x(Dialog dialog) {
        this.f8736B = dialog;
    }
}
