package fi;

import android.content.Context;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* renamed from: fi.e */
/* loaded from: classes3.dex */
public class C7360e {
    /* renamed from: a */
    public static void m22204a(Context context, Uri uri, Uri uri2) {
        OutputStream outputStream;
        InputStream openInputStream;
        if (uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
            if (!(openInputStream instanceof FileInputStream) || !(openOutputStream instanceof FileOutputStream)) {
                throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
            }
            FileChannel channel = ((FileInputStream) openInputStream).getChannel();
            channel.transferTo(0L, channel.size(), ((FileOutputStream) openOutputStream).getChannel());
            if (openInputStream != null) {
                openInputStream.close();
            }
            if (openOutputStream != null) {
                openOutputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = openInputStream;
            outputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }
}
