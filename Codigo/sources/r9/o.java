package r9;

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
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzhs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f24830a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b, reason: collision with root package name */
    public static final String f24831b = "androidPackageName";

    /* renamed from: c, reason: collision with root package name */
    private static final ComponentName f24832c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d, reason: collision with root package name */
    private static final ga.a f24833d = j.a("GoogleAuthUtil");

    public static void a(Context context, String str) {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        o(account);
        return d(context, account, str, bundle).zza();
    }

    public static TokenData d(Context context, final Account account, final String str, Bundle bundle) {
        s.i("Calling this from your main thread can lead to deadlock");
        s.g(str, "Scope cannot be empty or null.");
        o(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        zzdc.zze(context);
        if (zzhs.zze() && p(context)) {
            try {
                Bundle bundle3 = (Bundle) j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(bundle3);
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f24832c, new n() { // from class: r9.l
            @Override // r9.n
            public final Object a(IBinder iBinder) {
                return o.e(account, str, bundle2, iBinder);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return h(zze);
        }
        throw new IOException("Service call returned null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Object f(Object obj) {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) {
        s.i("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        zzdc.zze(context);
        if (zzhs.zze() && p(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                j(zza.zza(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f24832c, new m(str, bundle), 0L);
    }

    private static TokenData h(Bundle bundle) {
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
        s.j(string);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzby zza = zzby.zza(string);
        if (zzby.zzb(zza)) {
            f24833d.h("isUserRecoverableError status: ".concat(String.valueOf(zza)), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        }
        if (zzby.NETWORK_ERROR.equals(zza) || zzby.SERVICE_UNAVAILABLE.equals(zza) || zzby.INTNERNAL_ERROR.equals(zza) || zzby.AUTH_SECURITY_ERROR.equals(zza) || zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
            throw new IOException(string);
        }
        throw new d(string);
    }

    private static Object i(Context context, ComponentName componentName, n nVar, long j10) {
        ca.a aVar = new ca.a();
        com.google.android.gms.common.internal.i c10 = com.google.android.gms.common.internal.i.c(context);
        try {
            try {
                if (!c10.a(componentName, aVar, "GoogleAuthUtil")) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return nVar.a(aVar.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                c10.e(componentName, aVar, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f24833d.h(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f24833d.h(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof com.google.android.gms.common.api.b) {
                throw ((com.google.android.gms.common.api.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f24833d.h(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    private static Object k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f24833d.h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) {
        try {
            ca.k.a(context.getApplicationContext(), i10);
        } catch (ca.h e10) {
            e = e10;
            throw new d(e.getMessage(), e);
        } catch (ca.i e11) {
            throw new f(e11.b(), e11.getMessage(), e11.a());
        } catch (GooglePlayServicesIncorrectManifestValueException e12) {
            e = e12;
            throw new d(e.getMessage(), e);
        }
    }

    private static void m(com.google.android.gms.common.api.b bVar, String str) {
        f24833d.h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f24831b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f24830a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean p(Context context) {
        if (ca.f.n().h(context, 17895000) != 0) {
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
