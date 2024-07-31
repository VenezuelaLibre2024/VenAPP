package gf;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C6053c0;
import ec.AbstractC7174d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p141hf.AbstractC7722e;
import p180jc.InterfaceC9036b;
import p272oc.InterfaceC9835b;
import p485zb.C12867g;

/* renamed from: gf.i */
/* loaded from: classes2.dex */
public class C7567i {
    /* renamed from: a */
    public static boolean m22969a(Object obj, Object obj2) {
        return C5270q.m13304b(obj, obj2);
    }

    /* renamed from: b */
    public static String m22970b(InterfaceC9036b interfaceC9036b) {
        if (interfaceC9036b == null) {
            return null;
        }
        try {
            AbstractC7174d abstractC7174d = (AbstractC7174d) Tasks.await(interfaceC9036b.mo23457a(false), 30000L, TimeUnit.MILLISECONDS);
            if (abstractC7174d.mo21369a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + abstractC7174d.mo21369a());
            }
            return abstractC7174d.mo21370b();
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e10);
            return null;
        }
    }

    /* renamed from: c */
    public static String m22971c(InterfaceC9835b interfaceC9835b) {
        String str;
        if (interfaceC9835b != null) {
            try {
                str = ((C6053c0) Tasks.await(interfaceC9835b.mo16385a(false), 30000L, TimeUnit.MILLISECONDS)).m16477g();
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.e("StorageUtil", "error getting token " + e10);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* renamed from: d */
    public static Uri m22972d(C12867g c12867g, String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = AbstractC7722e.f18386k;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + C7562d.m22962b(C7562d.m22961a(str.substring(5))));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(m22969a(scheme.toLowerCase(), "http") || m22969a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String m22963c = C7562d.m22963c(parse.getEncodedPath());
        if (indexOf == 0 && m22963c.startsWith("/")) {
            int indexOf2 = m22963c.indexOf("/b/", 0);
            int i10 = indexOf2 + 3;
            int indexOf3 = m22963c.indexOf("/", i10);
            int indexOf4 = m22963c.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = m22963c.substring(i10, indexOf3);
            m22963c = indexOf4 != -1 ? m22963c.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        C5276s.m13321g(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(m22963c).build();
    }

    /* renamed from: e */
    public static long m22973e(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e10) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e10);
            return 0L;
        }
    }
}
