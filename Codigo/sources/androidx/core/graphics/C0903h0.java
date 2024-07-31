package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.C0961g;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.core.graphics.h0 */
/* loaded from: classes.dex */
public class C0903h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.h0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static ParcelFileDescriptor m4602a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m4594a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m4595b(Context context, Resources resources, int i10) {
        File m4598e = m4598e(context);
        if (m4598e == null) {
            return null;
        }
        try {
            if (m4596c(m4598e, resources, i10)) {
                return m4600g(m4598e);
            }
            return null;
        } finally {
            m4598e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m4596c(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean m4597d = m4597d(file, inputStream);
            m4594a(inputStream);
            return m4597d;
        } catch (Throwable th3) {
            th = th3;
            m4594a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m4597d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[RecognitionOptions.UPC_E];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m4594a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m4594a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    m4594a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    /* renamed from: e */
    public static File m4598e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m4599f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m4602a = a.m4602a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m4602a == null) {
                if (m4602a != null) {
                    m4602a.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(m4602a.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    m4602a.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m4600g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m4601h(Context context, C0961g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0961g.b bVar : bVarArr) {
            if (bVar.m4776b() == 0) {
                Uri m4778d = bVar.m4778d();
                if (!hashMap.containsKey(m4778d)) {
                    hashMap.put(m4778d, m4599f(context, cancellationSignal, m4778d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
