package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0210c;
import androidx.activity.result.C0208a;
import androidx.activity.result.InterfaceC0209b;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.Fragment;
import ck.C2037v;
import com.facebook.common.C4602b;
import com.facebook.common.C4603c;
import com.facebook.login.C4689u;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p091f.C7260f;
import p280ok.InterfaceC9998l;

/* renamed from: com.facebook.login.y */
/* loaded from: classes.dex */
public class C4693y extends Fragment {

    /* renamed from: f */
    public static final a f9047f = new a(null);

    /* renamed from: a */
    private String f9048a;

    /* renamed from: b */
    private C4689u.e f9049b;

    /* renamed from: c */
    private C4689u f9050c;

    /* renamed from: d */
    private AbstractC0210c<Intent> f9051d;

    /* renamed from: e */
    private View f9052e;

    /* renamed from: com.facebook.login.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.y$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC9323o implements InterfaceC9998l<C0208a, C2037v> {

        /* renamed from: b */
        final /* synthetic */ ActivityC1263e f9054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ActivityC1263e activityC1263e) {
            super(1);
            this.f9054b = activityC1263e;
        }

        /* renamed from: a */
        public final void m11773a(C0208a result) {
            C9322n.m27781e(result, "result");
            if (result.m832b() == -1) {
                C4693y.this.m11770k().m11704v(C4689u.f9000x.m11714b(), result.m832b(), result.m831a());
            } else {
                this.f9054b.finish();
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(C0208a c0208a) {
            m11773a(c0208a);
            return C2037v.f8089a;
        }
    }

    /* renamed from: com.facebook.login.y$c */
    /* loaded from: classes.dex */
    public static final class c implements C4689u.a {
        c() {
        }

        @Override // com.facebook.login.C4689u.a
        /* renamed from: a */
        public void mo11709a() {
            C4693y.this.m11766t();
        }

        @Override // com.facebook.login.C4689u.a
        /* renamed from: b */
        public void mo11710b() {
            C4693y.this.m11761m();
        }
    }

    /* renamed from: l */
    private final InterfaceC9998l<C0208a, C2037v> m11760l(ActivityC1263e activityC1263e) {
        return new b(activityC1263e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m11761m() {
        View view = this.f9052e;
        if (view == null) {
            C9322n.m27792p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        m11771r();
    }

    /* renamed from: n */
    private final void m11762n(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f9048a = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m11763o(C4693y this$0, C4689u.f outcome) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(outcome, "outcome");
        this$0.m11765q(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m11764p(InterfaceC9998l tmp0, C0208a c0208a) {
        C9322n.m27781e(tmp0, "$tmp0");
        tmp0.invoke(c0208a);
    }

    /* renamed from: q */
    private final void m11765q(C4689u.f fVar) {
        this.f9049b = null;
        int i10 = fVar.f9033a == C4689u.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        ActivityC1263e activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m11766t() {
        View view = this.f9052e;
        if (view == null) {
            C9322n.m27792p("progressBar");
            throw null;
        }
        view.setVisibility(0);
        m11772s();
    }

    /* renamed from: h */
    protected C4689u m11767h() {
        return new C4689u(this);
    }

    /* renamed from: i */
    public final AbstractC0210c<Intent> m11768i() {
        AbstractC0210c<Intent> abstractC0210c = this.f9051d;
        if (abstractC0210c != null) {
            return abstractC0210c;
        }
        C9322n.m27792p("launcher");
        throw null;
    }

    /* renamed from: j */
    protected int m11769j() {
        return C4603c.f8659c;
    }

    /* renamed from: k */
    public final C4689u m11770k() {
        C4689u c4689u = this.f9050c;
        if (c4689u != null) {
            return c4689u;
        }
        C9322n.m27792p("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        m11770k().m11704v(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        C4689u c4689u = bundle == null ? null : (C4689u) bundle.getParcelable("loginClient");
        if (c4689u != null) {
            c4689u.m11706x(this);
        } else {
            c4689u = m11767h();
        }
        this.f9050c = c4689u;
        m11770k().m11707y(new C4689u.d() { // from class: com.facebook.login.w
            @Override // com.facebook.login.C4689u.d
            /* renamed from: a */
            public final void mo11715a(C4689u.f fVar) {
                C4693y.m11763o(C4693y.this, fVar);
            }
        });
        ActivityC1263e activity = getActivity();
        if (activity == null) {
            return;
        }
        m11762n(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f9049b = (C4689u.e) bundleExtra.getParcelable("request");
        }
        C7260f c7260f = new C7260f();
        final InterfaceC9998l<C0208a, C2037v> m11760l = m11760l(activity);
        AbstractC0210c<Intent> registerForActivityResult = registerForActivityResult(c7260f, new InterfaceC0209b() { // from class: com.facebook.login.x
            @Override // androidx.activity.result.InterfaceC0209b
            /* renamed from: a */
            public final void mo835a(Object obj) {
                C4693y.m11764p(InterfaceC9998l.this, (C0208a) obj);
            }
        });
        C9322n.m27780d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f9051d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C9322n.m27781e(inflater, "inflater");
        View inflate = inflater.inflate(m11769j(), viewGroup, false);
        View findViewById = inflate.findViewById(C4602b.f8654d);
        C9322n.m27780d(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f9052e = findViewById;
        m11770k().m11705w(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m11770k().m11691c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(C4602b.f8654d);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f9048a != null) {
            m11770k().m11708z(this.f9049b);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        ActivityC1263e activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        C9322n.m27781e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", m11770k());
    }

    /* renamed from: r */
    protected void m11771r() {
    }

    /* renamed from: s */
    protected void m11772s() {
    }
}
