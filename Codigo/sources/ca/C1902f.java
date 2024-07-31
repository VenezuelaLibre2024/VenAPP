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
import androidx.core.app.C0818o;
import androidx.fragment.app.ActivityC1263e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC5174r0;
import com.google.android.gms.common.api.internal.C5177s0;
import com.google.android.gms.common.api.internal.InterfaceC5147j;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC5247i0;
import com.google.android.gms.common.internal.C5238f0;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.errorprone.annotations.RestrictedInheritance;
import la.C9465j;
import la.C9471p;
import na.C9693b;
import p012aa.C0080a;
import p012aa.C0081b;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: ca.f */
/* loaded from: classes.dex */
public class C1902f extends C1904g {

    /* renamed from: c */
    private String f7918c;

    /* renamed from: e */
    private static final Object f7916e = new Object();

    /* renamed from: f */
    private static final C1902f f7917f = new C1902f();

    /* renamed from: d */
    public static final int f7915d = C1904g.f7923a;

    /* renamed from: n */
    public static C1902f m10067n() {
        return f7917f;
    }

    @Override // ca.C1904g
    /* renamed from: b */
    public Intent mo10068b(Context context, int i10, String str) {
        return super.mo10068b(context, i10, str);
    }

    @Override // ca.C1904g
    /* renamed from: c */
    public PendingIntent mo10069c(Context context, int i10, int i11) {
        return super.mo10069c(context, i10, i11);
    }

    @Override // ca.C1904g
    /* renamed from: e */
    public final String mo10070e(int i10) {
        return super.mo10070e(i10);
    }

    @Override // ca.C1904g
    /* renamed from: g */
    public int mo10071g(Context context) {
        return super.mo10071g(context);
    }

    @Override // ca.C1904g
    /* renamed from: h */
    public int mo10072h(Context context, int i10) {
        return super.mo10072h(context, i10);
    }

    @Override // ca.C1904g
    /* renamed from: j */
    public final boolean mo10073j(int i10) {
        return super.mo10073j(i10);
    }

    /* renamed from: l */
    public Dialog m10074l(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m10078q(activity, i10, AbstractDialogInterfaceOnClickListenerC5247i0.m13278b(activity, mo10068b(activity, i10, "d"), i11), onCancelListener);
    }

    /* renamed from: m */
    public PendingIntent m10075m(Context context, C1894b c1894b) {
        return c1894b.m10053x1() ? c1894b.m10052w1() : mo10069c(context, c1894b.m10050u1(), 0);
    }

    /* renamed from: o */
    public boolean m10076o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m10074l = m10074l(activity, i10, i11, onCancelListener);
        if (m10074l == null) {
            return false;
        }
        m10081t(activity, m10074l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: p */
    public void m10077p(Context context, int i10) {
        m10082u(context, i10, null, m10088d(context, i10, 0, "n"));
    }

    /* renamed from: q */
    final Dialog m10078q(Context context, int i10, AbstractDialogInterfaceOnClickListenerC5247i0 abstractDialogInterfaceOnClickListenerC5247i0, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C5238f0.m13256d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m13255c = C5238f0.m13255c(context, i10);
        if (m13255c != null) {
            builder.setPositiveButton(m13255c, abstractDialogInterfaceOnClickListenerC5247i0);
        }
        String m13259g = C5238f0.m13259g(context, i10);
        if (m13259g != null) {
            builder.setTitle(m13259g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: r */
    public final Dialog m10079r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C5238f0.m13256d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m10081t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: s */
    public final C5177s0 m10080s(Context context, AbstractC5174r0 abstractC5174r0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C5177s0 c5177s0 = new C5177s0(abstractC5174r0);
        zao.zaa(context, c5177s0, intentFilter);
        c5177s0.m13170a(context);
        if (m10089i(context, "com.google.android.gms")) {
            return c5177s0;
        }
        abstractC5174r0.mo13009a();
        c5177s0.m13171b();
        return null;
    }

    /* renamed from: t */
    final void m10081t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC1263e) {
                C1918n.m10120q(dialog, onCancelListener).mo6926p(((ActivityC1263e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1896c.m10055a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: u */
    final void m10082u(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m10083v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m13258f = C5238f0.m13258f(context, i10);
        String m13257e = C5238f0.m13257e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C5276s.m13324j(context.getSystemService("notification"));
        C0818o.e m4127H = new C0818o.e(context).m4155x(true).m4139g(true).m4146n(m13258f).m4127H(new C0818o.c().m4109n(m13257e));
        if (C9465j.m28148f(context)) {
            C5276s.m13328n(C9471p.m28168e());
            m4127H.m4125F(context.getApplicationInfo().icon).m4121B(2);
            if (C9465j.m28149g(context)) {
                m4127H.m4135a(C0080a.f322a, resources.getString(C0081b.f337o), pendingIntent);
            } else {
                m4127H.m4144l(pendingIntent);
            }
        } else {
            m4127H.m4125F(R.drawable.stat_sys_warning).m4129J(resources.getString(C0081b.f330h)).m4134O(System.currentTimeMillis()).m4144l(pendingIntent).m4145m(m13257e);
        }
        if (C9471p.m28172i()) {
            C5276s.m13328n(C9471p.m28172i());
            synchronized (f7916e) {
                str2 = this.f7918c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m13254b = C5238f0.m13254b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m13254b, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!m13254b.contentEquals(name)) {
                        notificationChannel.setName(m13254b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            m4127H.m4141i(str2);
        }
        Notification m4137c = m4127H.m4137c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C1912k.f7933b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, m4137c);
    }

    /* renamed from: v */
    final void m10083v(Context context) {
        new HandlerC1921p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: w */
    public final boolean m10084w(Activity activity, InterfaceC5147j interfaceC5147j, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m10078q = m10078q(activity, i10, AbstractDialogInterfaceOnClickListenerC5247i0.m13279c(interfaceC5147j, mo10068b(activity, i10, "d"), 2), onCancelListener);
        if (m10078q == null) {
            return false;
        }
        m10081t(activity, m10078q, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: x */
    public final boolean m10085x(Context context, C1894b c1894b, int i10) {
        PendingIntent m10075m;
        if (C9693b.m29070a(context) || (m10075m = m10075m(context, c1894b)) == null) {
            return false;
        }
        m10082u(context, c1894b.m10050u1(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m12964a(context, m10075m, i10, true), zap.zaa | 134217728));
        return true;
    }
}
