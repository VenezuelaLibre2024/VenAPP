package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.login.u;

/* loaded from: classes.dex */
public class y extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8048f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f8049a;

    /* renamed from: b, reason: collision with root package name */
    private u.e f8050b;

    /* renamed from: c, reason: collision with root package name */
    private u f8051c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.activity.result.c<Intent> f8052d;

    /* renamed from: e, reason: collision with root package name */
    private View f8053e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.l<androidx.activity.result.a, ck.v> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f8055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.fragment.app.e eVar) {
            super(1);
            this.f8055b = eVar;
        }

        public final void a(androidx.activity.result.a result) {
            kotlin.jvm.internal.n.e(result, "result");
            if (result.b() == -1) {
                y.this.k().v(u.f8005x.b(), result.b(), result.a());
            } else {
                this.f8055b.finish();
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(androidx.activity.result.a aVar) {
            a(aVar);
            return ck.v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements u.a {
        c() {
        }

        @Override // com.facebook.login.u.a
        public void a() {
            y.this.t();
        }

        @Override // com.facebook.login.u.a
        public void b() {
            y.this.m();
        }
    }

    private final ok.l<androidx.activity.result.a, ck.v> l(androidx.fragment.app.e eVar) {
        return new b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        View view = this.f8053e;
        if (view == null) {
            kotlin.jvm.internal.n.p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        r();
    }

    private final void n(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f8049a = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(y this$0, u.f outcome) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(outcome, "outcome");
        this$0.q(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ok.l tmp0, androidx.activity.result.a aVar) {
        kotlin.jvm.internal.n.e(tmp0, "$tmp0");
        tmp0.invoke(aVar);
    }

    private final void q(u.f fVar) {
        this.f8050b = null;
        int i10 = fVar.f8034a == u.f.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", fVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        View view = this.f8053e;
        if (view == null) {
            kotlin.jvm.internal.n.p("progressBar");
            throw null;
        }
        view.setVisibility(0);
        s();
    }

    protected u h() {
        return new u(this);
    }

    public final androidx.activity.result.c<Intent> i() {
        androidx.activity.result.c<Intent> cVar = this.f8052d;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.n.p("launcher");
        throw null;
    }

    protected int j() {
        return com.facebook.common.c.f7684c;
    }

    public final u k() {
        u uVar = this.f8051c;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.n.p("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        k().v(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        u uVar = bundle == null ? null : (u) bundle.getParcelable("loginClient");
        if (uVar != null) {
            uVar.x(this);
        } else {
            uVar = h();
        }
        this.f8051c = uVar;
        k().y(new u.d() { // from class: com.facebook.login.w
            @Override // com.facebook.login.u.d
            public final void a(u.f fVar) {
                y.o(y.this, fVar);
            }
        });
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        n(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f8050b = (u.e) bundleExtra.getParcelable("request");
        }
        f.f fVar = new f.f();
        final ok.l<androidx.activity.result.a, ck.v> l10 = l(activity);
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(fVar, new androidx.activity.result.b() { // from class: com.facebook.login.x
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                y.p(ok.l.this, (androidx.activity.result.a) obj);
            }
        });
        kotlin.jvm.internal.n.d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f8052d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.e(inflater, "inflater");
        View inflate = inflater.inflate(j(), viewGroup, false);
        View findViewById = inflate.findViewById(com.facebook.common.b.f7679d);
        kotlin.jvm.internal.n.d(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f8053e = findViewById;
        k().w(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        k().c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(com.facebook.common.b.f7679d);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f8049a != null) {
            k().z(this.f8050b);
            return;
        }
        Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", k());
    }

    protected void r() {
    }

    protected void s() {
    }
}
