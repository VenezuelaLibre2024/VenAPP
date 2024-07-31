package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0869d;
import androidx.core.provider.C0961g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
/* loaded from: classes.dex */
class C0958d {

    /* renamed from: a */
    private static final Comparator<byte[]> f4487a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m4749g;
            m4749g = C0958d.m4749g((byte[]) obj, (byte[]) obj2);
            return m4749g;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Cursor m4751a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m4744b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m4745c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m4746d(C0959e c0959e, Resources resources) {
        return c0959e.m4753b() != null ? c0959e.m4753b() : C0869d.m4429c(resources, c0959e.m4754c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C0961g.a m4747e(Context context, C0959e c0959e, CancellationSignal cancellationSignal) {
        ProviderInfo m4748f = m4748f(context.getPackageManager(), c0959e, context.getResources());
        return m4748f == null ? C0961g.a.m4772a(1, null) : C0961g.a.m4772a(0, m4750h(context, c0959e, m4748f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m4748f(PackageManager packageManager, C0959e c0959e, Resources resources) {
        String m4756e = c0959e.m4756e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m4756e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m4756e);
        }
        if (!resolveContentProvider.packageName.equals(c0959e.m4757f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m4756e + ", but package was not " + c0959e.m4757f());
        }
        List<byte[]> m4744b = m4744b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m4744b, f4487a);
        List<List<byte[]>> m4746d = m4746d(c0959e, resources);
        for (int i10 = 0; i10 < m4746d.size(); i10++) {
            ArrayList arrayList = new ArrayList(m4746d.get(i10));
            Collections.sort(arrayList, f4487a);
            if (m4745c(m4744b, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m4749g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static C0961g.b[] m4750h(Context context, C0959e c0959e, String str, CancellationSignal cancellationSignal) {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(Constants.FILE).build();
        Cursor cursor = null;
        try {
            int i11 = 0;
            cursor = a.m4751a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0959e.m4758g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : i11;
                    int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i11;
                    int i14 = i12;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i15 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i10 = i14;
                        z10 = false;
                    } else {
                        i10 = i14;
                        z10 = true;
                    }
                    arrayList2.add(C0961g.b.m4775a(withAppendedId, i13, i15, z10, i10));
                    i11 = 0;
                }
                arrayList = arrayList2;
            }
            return (C0961g.b[]) arrayList.toArray(new C0961g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
