package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class FileUtils {
    private static void copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    private static String getBaseName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    private static String getImageExtension(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + extensionFromMimeType;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getImageName(android.content.Context r1, android.net.Uri r2) {
        /*
            android.database.Cursor r1 = queryImageName(r1, r2)
            if (r1 == 0) goto L27
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L27
            int r2 = r1.getColumnCount()     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            if (r2 >= r0) goto L14
            goto L27
        L14:
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L1d
            r1.close()
            return r2
        L1d:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r1 = move-exception
            r2.addSuppressed(r1)
        L26:
            throw r2
        L27:
            if (r1 == 0) goto L2c
            r1.close()
        L2c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.FileUtils.getImageName(android.content.Context, android.net.Uri):java.lang.String");
    }

    private static Cursor queryImageName(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: IOException | SecurityException -> 0x0098, IOException | SecurityException -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException | SecurityException -> 0x0098, blocks: (B:3:0x0001, B:17:0x007e, B:17:0x007e, B:32:0x0097, B:32:0x0097, B:37:0x0094, B:37:0x0094), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getPathFromUri(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L98
            java.io.InputStream r1 = r1.openInputStream(r8)     // Catch: java.lang.Throwable -> L98
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8c
            java.io.File r4 = r7.getCacheDir()     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L8c
            r3.mkdir()     // Catch: java.lang.Throwable -> L8c
            r3.deleteOnExit()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = getImageName(r7, r8)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = getImageExtension(r7, r8)     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L56
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r4.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "Cannot get file name for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L8c
            r4.append(r8)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L8c
            io.flutter.Log.w(r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r7 != 0) goto L44
            java.lang.String r7 = ".jpg"
        L44:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "image_picker"
            r8.append(r2)     // Catch: java.lang.Throwable -> L8c
            r8.append(r7)     // Catch: java.lang.Throwable -> L8c
        L51:
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L8c
            goto L68
        L56:
            if (r7 == 0) goto L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = getBaseName(r2)     // Catch: java.lang.Throwable -> L8c
            r8.append(r2)     // Catch: java.lang.Throwable -> L8c
            r8.append(r7)     // Catch: java.lang.Throwable -> L8c
            goto L51
        L68:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r3, r2)     // Catch: java.lang.Throwable -> L8c
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8c
            copy(r1, r8)     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L82
            r8.close()     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.lang.Throwable -> L98 java.lang.Throwable -> L98
        L81:
            return r7
        L82:
            r7 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r7 = move-exception
            if (r1 == 0) goto L97
            r1.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L98 java.lang.Throwable -> L98
        L97:
            throw r7     // Catch: java.lang.Throwable -> L98 java.lang.Throwable -> L98
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.FileUtils.getPathFromUri(android.content.Context, android.net.Uri):java.lang.String");
    }
}
