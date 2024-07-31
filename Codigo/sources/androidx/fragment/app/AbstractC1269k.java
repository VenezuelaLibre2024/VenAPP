package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import androidx.core.util.C0984h;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public abstract class AbstractC1269k<E> extends AbstractC1265g {

    /* renamed from: a */
    private final Activity f5408a;

    /* renamed from: b */
    private final Context f5409b;

    /* renamed from: c */
    private final Handler f5410c;

    /* renamed from: d */
    private final int f5411d;

    /* renamed from: e */
    final AbstractC1272n f5412e;

    AbstractC1269k(Activity activity, Context context, Handler handler, int i10) {
        this.f5412e = new C1273o();
        this.f5408a = activity;
        this.f5409b = (Context) C0984h.m4834l(context, "context == null");
        this.f5410c = (Handler) C0984h.m4834l(handler, "handler == null");
        this.f5411d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1269k(ActivityC1263e activityC1263e) {
        this(activityC1263e, activityC1263e, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC1265g
    /* renamed from: c */
    public View mo6828c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1265g
    /* renamed from: d */
    public boolean mo6829d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m6969e() {
        return this.f5408a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m6970f() {
        return this.f5409b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler m6971g() {
        return this.f5410c;
    }

    /* renamed from: h */
    public abstract E mo6929h();

    /* renamed from: i */
    public LayoutInflater mo6930i() {
        return LayoutInflater.from(this.f5409b);
    }

    @Deprecated
    /* renamed from: j */
    public void m6972j(Fragment fragment, String[] strArr, int i10) {
    }

    /* renamed from: k */
    public boolean mo6931k(Fragment fragment) {
        return true;
    }

    /* renamed from: l */
    public boolean mo6932l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m6973m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C0854a.startActivity(this.f5409b, intent, bundle);
    }

    @Deprecated
    /* renamed from: n */
    public void m6974n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C0777b.m3921l(this.f5408a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* renamed from: o */
    public void mo6933o() {
    }
}
