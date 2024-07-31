package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7695a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String f7696b = FacebookInitProvider.class.getSimpleName();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        kotlin.jvm.internal.n.e(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        kotlin.jvm.internal.n.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        kotlin.jvm.internal.n.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            i4.e0.M(context);
            return false;
        } catch (Exception e10) {
            Log.i(f7696b, "Failed to auto initialize the Facebook SDK", e10);
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        kotlin.jvm.internal.n.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.n.e(uri, "uri");
        return 0;
    }
}
