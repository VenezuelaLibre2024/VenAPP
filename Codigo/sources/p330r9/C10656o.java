package p330r9;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import ca.C1902f;
import ca.C1906h;
import ca.C1908i;
import ca.C1912k;
import ca.ServiceConnectionC1892a;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.internal.AbstractC5246i;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzhs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ga.C7533a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: r9.o */
/* loaded from: classes.dex */
public class C10656o {

    /* renamed from: a */
    public static final String[] f26944a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    public static final String f26945b = "androidPackageName";

    /* renamed from: c */
    private static final ComponentName f26946c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d */
    private static final C7533a f26947d = C10651j.m32424a("GoogleAuthUtil");

    /* renamed from: a */
    public static void m32426a(Context context, String str) {
        m32432g(context, str, 0L);
    }

    /* renamed from: b */
    public static String m32427b(Context context, Account account, String str) {
        return m32428c(context, account, str, new Bundle());
    }

    /* renamed from: c */
    public static String m32428c(Context context, Account account, String str, Bundle bundle) {
        m32440o(account);
        return m32429d(context, account, str, bundle).zza();
    }

    /* renamed from: d */
    public static TokenData m32429d(Context context, final Account account, final String str, Bundle bundle) {
        C5276s.m13323i("Calling this from your main thread can lead to deadlock");
        C5276s.m13321g(str, "Scope cannot be empty or null.");
        m32440o(account);
        m32437l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m32439n(context, bundle2);
        zzdc.zze(context);
        if (zzhs.zze() && m32441p(context)) {
            try {
                Bundle bundle3 = (Bundle) m32435j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                m32436k(bundle3);
                return m32433h(bundle3);
            } catch (C5102b e10) {
                m32438m(e10, "token retrieval");
            }
        }
        return (TokenData) m32434i(context, f26946c, new InterfaceC10655n() { // from class: r9.l
            @Override // p330r9.InterfaceC10655n
            /* renamed from: a */
            public final Object mo32425a(IBinder iBinder) {
                return C10656o.m32430e(account, str, bundle2, iBinder);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ TokenData m32430e(Account account, String str, Bundle bundle, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return m32433h(zze);
        }
        throw new IOException("Service call returned null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Object m32431f(Object obj) {
        m32436k(obj);
        return obj;
    }

    /* renamed from: g */
    public static void m32432g(Context context, String str, long j10) {
        C5276s.m13323i("Calling this from your main thread can lead to deadlock");
        m32437l(context, 8400000);
        Bundle bundle = new Bundle();
        m32439n(context, bundle);
        zzdc.zze(context);
        if (zzhs.zze() && m32441p(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                m32435j(zza.zza(zzbwVar), "clear token");
                return;
            } catch (C5102b e10) {
                m32438m(e10, "clear token");
            }
        }
        m32434i(context, f26946c, new C10654m(str, bundle), 0L);
    }

    /* renamed from: h */
    private static TokenData m32433h(Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        C5276s.m13324j(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzby zza = zzby.zza(string);
        if (zzby.zzb(zza)) {
            f26947d.m22876h("isUserRecoverableError status: ".concat(String.valueOf(zza)), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        }
        if (zzby.NETWORK_ERROR.equals(zza) || zzby.SERVICE_UNAVAILABLE.equals(zza) || zzby.INTNERNAL_ERROR.equals(zza) || zzby.AUTH_SECURITY_ERROR.equals(zza) || zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
            throw new IOException(string);
        }
        throw new C10645d(string);
    }

    /* renamed from: i */
    private static Object m32434i(Context context, ComponentName componentName, InterfaceC10655n interfaceC10655n, long j10) {
        ServiceConnectionC1892a serviceConnectionC1892a = new ServiceConnectionC1892a();
        AbstractC5246i m13271c = AbstractC5246i.m13271c(context);
        try {
            try {
                if (!m13271c.m13273a(componentName, serviceConnectionC1892a, "GoogleAuthUtil")) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return interfaceC10655n.mo32425a(serviceConnectionC1892a.m10045a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                m13271c.m13274e(componentName, serviceConnectionC1892a, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    /* renamed from: j */
    private static Object m32435j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f26947d.m22876h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f26947d.m22876h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof C5102b) {
                throw ((C5102b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f26947d.m22876h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    /* renamed from: k */
    private static Object m32436k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f26947d.m22876h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    /* renamed from: l */
    private static void m32437l(Context context, int i10) {
        try {
            C1912k.m10095a(context.getApplicationContext(), i10);
        } catch (C1906h e10) {
            e = e10;
            throw new C10645d(e.getMessage(), e);
        } catch (C1908i e11) {
            throw new C10647f(e11.m10091b(), e11.getMessage(), e11.m10122a());
        } catch (GooglePlayServicesIncorrectManifestValueException e12) {
            e = e12;
            throw new C10645d(e.getMessage(), e);
        }
    }

    /* renamed from: m */
    private static void m32438m(C5102b c5102b, String str) {
        f26947d.m22876h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(c5102b));
    }

    /* renamed from: n */
    private static void m32439n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f26945b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* renamed from: o */
    private static void m32440o(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f26944a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    /* renamed from: p */
    private static boolean m32441p(Context context) {
        if (C1902f.m10067n().mo10072h(context, 17895000) != 0) {
            return false;
        }
        List zzl = zzhs.zzb().zzl();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzl.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
