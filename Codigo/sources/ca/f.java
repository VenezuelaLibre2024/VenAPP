package ca;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.o;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class f extends g {

    /* renamed from: c */
    private String f6969c;

    /* renamed from: e */
    private static final Object f6967e = new Object();

    /* renamed from: f */
    private static final f f6968f = new f();

    /* renamed from: d */
    public static final int f6966d = g.f6974a;

    public static f n() {
        return f6968f;
    }

    @Override // ca.g
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // ca.g
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // ca.g
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // ca.g
    public int g(Context context) {
        return super.g(context);
    }

    @Override // ca.g
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // ca.g
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog l(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i10, com.google.android.gms.common.internal.i0.b(activity, b(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent m(Context context, b bVar) {
        return bVar.x1() ? bVar.w1() : c(context, bVar.u1(), 0);
    }

    public boolean o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog l10 = l(activity, i10, i11, onCancelListener);
        if (l10 == null) {
            return false;
        }
        t(activity, l10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i10) {
        u(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog q(Context context, int i10, com.google.android.gms.common.internal.i0 i0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.f0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = com.google.android.gms.common.internal.f0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, i0Var);
        }
        String g10 = com.google.android.gms.common.internal.f0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.f0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final s0 s(Context context, r0 r0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        s0 s0Var = new s0(r0Var);
        zao.zaa(context, s0Var, intentFilter);
        s0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return s0Var;
        }
        r0Var.a();
        s0Var.b();
        return null;
    }

    final void t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                n.q(dialog, onCancelListener).p(((androidx.fragment.app.e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void u(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f10 = com.google.android.gms.common.internal.f0.f(context, i10);
        String e10 = com.google.android.gms.common.internal.f0.e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) com.google.android.gms.common.internal.s.j(context.getSystemService("notification"));
        o.e H = new o.e(context).x(true).g(true).n(f10).H(new o.c().n(e10));
        if (la.j.f(context)) {
            com.google.android.gms.common.internal.s.n(la.p.e());
            H.F(context.getApplicationInfo().icon).B(2);
            if (la.j.g(context)) {
                H.a(aa.a.f271a, resources.getString(aa.b.f286o), pendingIntent);
            } else {
                H.l(pendingIntent);
            }
        } else {
            H.F(R.drawable.stat_sys_warning).J(resources.getString(aa.b.f279h)).O(System.currentTimeMillis()).l(pendingIntent).m(e10);
        }
        if (la.p.i()) {
            com.google.android.gms.common.internal.s.n(la.p.i());
            synchronized (f6967e) {
                str2 = this.f6969c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b10 = com.google.android.gms.common.internal.f0.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b10, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!b10.contentEquals(name)) {
                        notificationChannel.setName(b10);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            H.i(str2);
        }
        Notification c10 = H.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            k.f6984b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, c10);
    }

    final void v(Context context) {
        new p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean w(Activity activity, com.google.android.gms.common.api.internal.j jVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog q10 = q(activity, i10, com.google.android.gms.common.internal.i0.c(jVar, b(activity, i10, "d"), 2), onCancelListener);
        if (q10 == null) {
            return false;
        }
        t(activity, q10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean x(Context context, b bVar, int i10) {
        PendingIntent m10;
        if (na.b.a(context) || (m10 = m(context, bVar)) == null) {
            return false;
        }
        u(context, bVar.u1(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, m10, i10, true), zap.zaa | 134217728));
        return true;
    }
}
