package p272oc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzagt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC6045a0;
import com.google.firebase.auth.AbstractC6072h;
import com.google.firebase.auth.C6059d2;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.InterfaceC6076i;
import p081ea.C7142e;
import p191k1.C9109a;

/* renamed from: oc.v */
/* loaded from: classes.dex */
public final class C9896v {

    /* renamed from: c */
    private static C9896v f24396c;

    /* renamed from: a */
    private boolean f24397a = false;

    /* renamed from: b */
    private BroadcastReceiver f24398b;

    private C9896v() {
    }

    /* renamed from: a */
    private static AbstractC6072h m29599a(Intent intent) {
        C5276s.m13324j(intent);
        return C6059d2.m16489B1(((zzagt) C7142e.m21236b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzagt.CREATOR)).zzc(true));
    }

    /* renamed from: b */
    public static C9896v m29600b() {
        if (f24396c == null) {
            f24396c = new C9896v();
        }
        return f24396c;
    }

    /* renamed from: c */
    private final void m29601c(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f24398b = broadcastReceiver;
        C9109a.m26825b(activity).m26827c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m29602d(Context context) {
        C9896v c9896v = f24396c;
        c9896v.f24397a = false;
        if (c9896v.f24398b != null) {
            C9109a.m26825b(context).m26829e(f24396c.f24398b);
        }
        f24396c.f24398b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m29603e(C9896v c9896v, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        m29602d(context);
    }

    /* renamed from: h */
    public final boolean m29607h(Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        if (this.f24397a) {
            return false;
        }
        m29601c(activity, new C9846e0(this, activity, taskCompletionSource));
        this.f24397a = true;
        return true;
    }

    /* renamed from: i */
    public final boolean m29608i(Activity activity, TaskCompletionSource<InterfaceC6076i> taskCompletionSource, FirebaseAuth firebaseAuth) {
        return m29609j(activity, taskCompletionSource, firebaseAuth, null);
    }

    /* renamed from: j */
    public final boolean m29609j(Activity activity, TaskCompletionSource<InterfaceC6076i> taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        if (this.f24397a) {
            return false;
        }
        m29601c(activity, new C9849f0(this, activity, taskCompletionSource, firebaseAuth, abstractC6045a0));
        this.f24397a = true;
        return true;
    }
}
