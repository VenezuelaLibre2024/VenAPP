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
import com.mr.flutter.plugin.filepicker.C6664a;
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

/* renamed from: com.mr.flutter.plugin.filepicker.c */
/* loaded from: classes3.dex */
public class C6666c {
    /* renamed from: a */
    public static boolean m19523a(Context context) {
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

    /* renamed from: b */
    private static String m19524b(Class<?> cls, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            return (String) cls.getMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
        }
        File file = (File) cls.getMethod("getDirectory", new Class[0]).invoke(obj, new Object[0]);
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    /* renamed from: c */
    private static String m19525c(Uri uri) {
        String str;
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        return (split.length < 2 || (str = split[1]) == null) ? File.separator : str;
    }

    /* renamed from: d */
    public static String m19526d(Uri uri, Context context) {
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

    /* renamed from: e */
    public static String m19527e(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30 && m19531i(uri)) {
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
            return path + "/" + m19526d(uri, context);
        }
        String m19530h = m19530h(m19529g(uri), context);
        new C6664a.a();
        if (m19530h == null) {
            return File.separator;
        }
        String str = File.separator;
        if (m19530h.endsWith(str)) {
            m19530h = m19530h.substring(0, m19530h.length() - 1);
        }
        String m19525c = m19525c(uri);
        if (m19525c.endsWith(str)) {
            m19525c = m19525c.substring(0, m19525c.length() - 1);
        }
        if (m19525c.length() <= 0) {
            return m19530h;
        }
        if (m19525c.startsWith(str)) {
            return m19530h + m19525c;
        }
        return m19530h + str + m19525c;
    }

    /* renamed from: f */
    public static String[] m19528f(ArrayList<String> arrayList) {
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

    /* renamed from: g */
    private static String m19529g(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    /* renamed from: h */
    private static String m19530h(String str, Context context) {
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
                return m19524b(cls, obj);
            }
            if (str2 != null && str2.equals(str)) {
                return m19524b(cls, obj);
            }
        }
        return null;
    }

    /* renamed from: i */
    private static boolean m19531i(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: j */
    public static void m19532j(File file, C6664a.a aVar) {
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
                aVar.m19501b(bArr);
            } catch (IOException e11) {
                str = "Failed to close file streams: " + e11.getMessage();
                Log.e("FilePickerUtils", str, null);
                aVar.m19501b(bArr);
            }
            aVar.m19501b(bArr);
        } catch (Exception e12) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e12.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    /* renamed from: k */
    public static C6664a m19533k(Context context, Uri uri, boolean z10) {
        FileOutputStream fileOutputStream;
        StringBuilder sb2;
        String str;
        Log.i("FilePickerUtils", "Caching from URI: " + uri.toString());
        C6664a.a aVar = new C6664a.a();
        String m19526d = m19526d(uri, context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getCacheDir().getAbsolutePath());
        sb3.append("/file_picker/");
        sb3.append(m19526d != null ? m19526d : Long.valueOf(System.currentTimeMillis()));
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
            m19532j(file, aVar);
        }
        aVar.m19503d(sb4).m19502c(m19526d).m19505f(uri).m19504e(Long.parseLong(String.valueOf(file.length())));
        return aVar.m19500a();
    }
}
