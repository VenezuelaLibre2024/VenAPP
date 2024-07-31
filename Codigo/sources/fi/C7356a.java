package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import ci.InterfaceC2009b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p086ei.AsyncTaskC7196b;

/* renamed from: fi.a */
/* loaded from: classes3.dex */
public class C7356a {
    /* renamed from: a */
    public static int m22189a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            while (true) {
                if (i12 / i14 <= i11 && i13 / i14 <= i10) {
                    break;
                }
                i14 *= 2;
            }
        }
        return i14;
    }

    /* renamed from: b */
    public static int m22190b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int m22201b = C7358c.m22201b();
        if (m22201b > 0) {
            sqrt = Math.min(sqrt, m22201b);
        }
        Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
        return sqrt;
    }

    /* renamed from: c */
    public static void m22191c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m22192d(Context context, Uri uri, Uri uri2, int i10, int i11, InterfaceC2009b interfaceC2009b) {
        new AsyncTaskC7196b(context, uri, uri2, i10, i11, interfaceC2009b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: e */
    public static int m22193e(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: f */
    public static int m22194f(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    /* renamed from: g */
    public static int m22195g(Context context, Uri uri) {
        int i10 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i10 = new C7361f(openInputStream).m22216g();
            m22191c(openInputStream);
            return i10;
        } catch (IOException e10) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e10);
            return i10;
        }
    }

    /* renamed from: h */
    public static boolean m22196h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    /* renamed from: i */
    public static Bitmap m22197i(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError e10) {
            Log.e("BitmapLoadUtils", "transformBitmap: ", e10);
            return bitmap;
        }
    }
}
