package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class k<E> extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f4670a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4671b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f4672c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4673d;

    /* renamed from: e, reason: collision with root package name */
    final n f4674e;

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f4674e = new o();
        this.f4670a = activity;
        this.f4671b = (Context) androidx.core.util.h.l(context, "context == null");
        this.f4672c = (Handler) androidx.core.util.h.l(handler, "handler == null");
        this.f4673d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f4670a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f4671b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler g() {
        return this.f4672c;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f4671b);
    }

    @Deprecated
    public void j(Fragment fragment, String[] strArr, int i10) {
    }

    public boolean k(Fragment fragment) {
        return true;
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.startActivity(this.f4671b, intent, bundle);
    }

    @Deprecated
    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.l(this.f4670a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void o() {
    }
}
