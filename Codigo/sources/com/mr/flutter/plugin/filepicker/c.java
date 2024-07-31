package com.mr.flutter.plugin.filepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.mr.flutter.plugin.filepicker.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c {
    public static boolean a(Context context) {
        try {
            File[] listFiles = new File(context.getCacheDir() + "/file_picker/").listFiles();
            if (listFiles == null) {
                return true;
            }
            for (File file : listFiles) {
                file.delete();
            }
            return true;
        } catch (Exception e10) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e10.toString());
            return false;
        }
    }

    private static String b(Class<?> cls, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            return (String) cls.getMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
        }
        File file = (File) cls.getMethod("getDirectory", new Class[0]).invoke(obj, new Object[0]);
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    private static String c(Uri uri) {
        String str;
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        return (split.length < 2 || (str = split[1]) == null) ? File.separator : str;
    }

    public static String d(Uri uri, Context context) {
        String str = null;
        try {
            if (uri.getScheme().equals("content")) {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        }
                    } finally {
                        query.close();
                    }
                }
            }
            if (str != null) {
                return str;
            }
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e10) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e10.toString());
            return null;
        }
    }

    public static String e(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30 && i(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (documentId.equals("downloads")) {
                return path;
            }
            if (!documentId.matches("^ms[df]\\:.*")) {
                if (documentId.startsWith("raw:")) {
                    return documentId.split(":")[1];
                }
                return null;
            }
            return path + "/" + d(uri, context);
        }
        String h10 = h(g(uri), context);
        new a.C0194a();
        if (h10 == null) {
            return File.separator;
        }
        String str = File.separator;
        if (h10.endsWith(str)) {
            h10 = h10.substring(0, h10.length() - 1);
        }
        String c10 = c(uri);
        if (c10.endsWith(str)) {
            c10 = c10.substring(0, c10.length() - 1);
        }
        if (c10.length() <= 0) {
            return h10;
        }
        if (c10.startsWith(str)) {
            return h10 + c10;
        }
        return h10 + str + c10;
    }

    public static String[] f(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(arrayList.get(i10));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + arrayList.get(i10) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
        return (String[]) arrayList2.toArray(new String[0]);
    }

    private static String g(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    private static String h(String str, Context context) {
        Class<?> cls;
        Method method;
        Method method2;
        Object invoke;
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            cls = Class.forName("android.os.storage.StorageVolume");
            Method method3 = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            method = cls.getMethod("getUuid", new Class[0]);
            method2 = cls.getMethod("isPrimary", new Class[0]);
            invoke = method3.invoke(storageManager, new Object[0]);
        } catch (Exception unused) {
        }
        if (invoke == null) {
            return null;
        }
        int length = Array.getLength(invoke);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = Array.get(invoke, i10);
            String str2 = (String) method.invoke(obj, new Object[0]);
            if (((Boolean) method2.invoke(obj, new Object[0])) != null && "primary".equals(str)) {
                return b(cls, obj);
            }
            if (str2 != null && str2.equals(str)) {
                return b(cls, obj);
            }
        }
        return null;
    }

    private static boolean i(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static void j(File file, a.C0194a c0194a) {
        String str;
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e10) {
                str = "File not found: " + e10.getMessage();
                Log.e("FilePickerUtils", str, null);
                c0194a.b(bArr);
            } catch (IOException e11) {
                str = "Failed to close file streams: " + e11.getMessage();
                Log.e("FilePickerUtils", str, null);
                c0194a.b(bArr);
            }
            c0194a.b(bArr);
        } catch (Exception e12) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e12.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    public static a k(Context context, Uri uri, boolean z10) {
        FileOutputStream fileOutputStream;
        StringBuilder sb2;
        String str;
        Log.i("FilePickerUtils", "Caching from URI: " + uri.toString());
        a.C0194a c0194a = new a.C0194a();
        String d10 = d(uri, context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getCacheDir().getAbsolutePath());
        sb3.append("/file_picker/");
        sb3.append(d10 != null ? d10 : Long.valueOf(System.currentTimeMillis()));
        String sb4 = sb3.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(sb4);
                try {
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                    } catch (Exception e10) {
                        e = e10;
                        try {
                            fileOutputStream.close();
                            sb2 = new StringBuilder();
                            str = "Failed to retrieve path: ";
                        } catch (IOException | NullPointerException unused) {
                            sb2 = new StringBuilder();
                            str = "Failed to close file streams: ";
                        }
                        sb2.append(str);
                        sb2.append(e.getMessage());
                        Log.e("FilePickerUtils", sb2.toString(), null);
                        return null;
                    }
                } catch (Throwable th2) {
                    fileOutputStream.getFD().sync();
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            }
        }
        Log.d("FilePickerUtils", "File loaded and cached at:" + sb4);
        if (z10) {
            j(file, c0194a);
        }
        c0194a.d(sb4).c(d10).f(uri).e(Long.parseLong(String.valueOf(file.length())));
        return c0194a.a();
    }
}
