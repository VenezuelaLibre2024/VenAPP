package com.p049zt.shareextend;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import gi.C7573b;
import java.io.File;

/* loaded from: classes3.dex */
public class ShareExtendProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f15024a = {"_display_name", "_size", "_data"};

    /* renamed from: a */
    private static Object[] m19676a(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    /* renamed from: b */
    private static String[] m19677b(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    /* renamed from: c */
    private File m19678c(Uri uri) {
        return new File(Uri.decode(uri.getPath()).substring(1));
    }

    /* renamed from: d */
    public static Uri m19679d(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(Uri.encode(str2)).build();
    }

    /* renamed from: e */
    private static int m19680e(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external deletes");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return C7573b.m23007b(m19678c(uri));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m19678c(uri), m19680e(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File m19678c = m19678c(uri);
        if (strArr == null) {
            strArr = f15024a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = m19678c.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(m19678c.length());
            } else if ("_data".equals(str3)) {
                strArr3[i11] = "_data";
                i10 = i11 + 1;
                objArr[i11] = m19678c.getAbsolutePath();
            }
            i11 = i10;
        }
        String[] m19677b = m19677b(strArr3, i11);
        Object[] m19676a = m19676a(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(m19677b, 1);
        matrixCursor.addRow(m19676a);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
