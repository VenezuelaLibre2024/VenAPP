package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;
import ml.C9615b;
import p207kl.InterfaceC9289a;

/* renamed from: me.leolin.shortcutbadger.impl.a */
/* loaded from: classes3.dex */
public class C9578a implements InterfaceC9289a {

    /* renamed from: b */
    private static final String[] f23338b = {"_id", Constants.CLASS};

    /* renamed from: a */
    private DefaultBadger f23339a = new DefaultBadger();

    /* renamed from: c */
    private ContentValues m28527c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(Constants.CLASS, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        DefaultBadger defaultBadger = this.f23339a;
        if (defaultBadger != null && defaultBadger.m28519c(context)) {
            this.f23339a.mo27712b(context, componentName, i10);
            return;
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f23338b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, m28527c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex(Constants.CLASS)))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, m28527c(componentName, i10, true));
                }
            }
        } finally {
            C9615b.m28613a(cursor);
        }
    }
}
