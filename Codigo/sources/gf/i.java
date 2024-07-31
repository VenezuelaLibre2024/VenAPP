package gf;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.c0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class i {
    public static boolean a(Object obj, Object obj2) {
        return q.b(obj, obj2);
    }

    public static String b(jc.b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            ec.d dVar = (ec.d) Tasks.await(bVar.a(false), 30000L, TimeUnit.MILLISECONDS);
            if (dVar.a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + dVar.a());
            }
            return dVar.b();
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e10);
            return null;
        }
    }

    public static String c(oc.b bVar) {
        String str;
        if (bVar != null) {
            try {
                str = ((c0) Tasks.await(bVar.a(false), 30000L, TimeUnit.MILLISECONDS)).g();
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

    public static Uri d(zb.g gVar, String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = hf.e.f16736k;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + d.b(d.a(str.substring(5))));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(a(scheme.toLowerCase(), "http") || a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String c10 = d.c(parse.getEncodedPath());
        if (indexOf == 0 && c10.startsWith("/")) {
            int indexOf2 = c10.indexOf("/b/", 0);
            int i10 = indexOf2 + 3;
            int indexOf3 = c10.indexOf("/", i10);
            int indexOf4 = c10.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = c10.substring(i10, indexOf3);
            c10 = indexOf4 != -1 ? c10.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        s.g(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(c10).build();
    }

    public static long e(String str) {
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
