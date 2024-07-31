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
import ml.b;

/* loaded from: classes3.dex */
public class a implements kl.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f21484b = {"_id", Constants.CLASS};

    /* renamed from: a, reason: collision with root package name */
    private DefaultBadger f21485a = new DefaultBadger();

    private ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(Constants.CLASS, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // kl.a
    public List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // kl.a
    public void b(Context context, ComponentName componentName, int i10) {
        DefaultBadger defaultBadger = this.f21485a;
        if (defaultBadger != null && defaultBadger.c(context)) {
            this.f21485a.b(context, componentName, i10);
            return;
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f21484b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex(Constants.CLASS)))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(componentName, i10, true));
                }
            }
        } finally {
            b.a(cursor);
        }
    }
}
