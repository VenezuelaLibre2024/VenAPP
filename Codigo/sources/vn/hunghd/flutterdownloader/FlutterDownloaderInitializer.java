package vn.hunghd.flutterdownloader;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.work.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f2.t;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class FlutterDownloaderInitializer extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29419a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final int a(Context context) {
        StringBuilder sb2;
        String str;
        try {
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, "vn.hunghd.flutterdownloader.FlutterDownloaderInitializer"), RecognitionOptions.ITF);
            n.d(providerInfo, "getProviderInfo(...)");
            int i10 = providerInfo.metaData.getInt("vn.hunghd.flutterdownloader.MAX_CONCURRENT_TASKS", 3);
            Log.d("DownloaderInitializer", "MAX_CONCURRENT_TASKS = " + i10);
            return i10;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NameNotFound: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("DownloaderInitializer", sb2.toString());
            return 3;
        } catch (NullPointerException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NullPointer: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("DownloaderInitializer", sb2.toString());
            return 3;
        }
    }

    public Void b(Uri uri) {
        n.e(uri, "uri");
        return null;
    }

    public Void c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        n.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        n.e(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return (String) b(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        n.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Cannot find context from the provider.".toString());
        }
        n.d(context, "requireNotNull(...)");
        t.g(context, new a.b().b(Executors.newFixedThreadPool(a(context))).a());
        return true;
    }

    @Override // android.content.ContentProvider
    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) c(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        n.e(uri, "uri");
        return 0;
    }
}
