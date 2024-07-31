package t5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import ck.m;
import ck.r;
import ck.v;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.k0;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import xk.o;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25796a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25797b;

    /* renamed from: c, reason: collision with root package name */
    private final a f25798c;

    /* renamed from: d, reason: collision with root package name */
    private final a f25799d;

    /* renamed from: e, reason: collision with root package name */
    private final a f25800e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f25801f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f25802g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f25803h;

    /* renamed from: i, reason: collision with root package name */
    private final Uri f25804i;

    /* renamed from: j, reason: collision with root package name */
    private final MethodChannel f25805j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private final int f25806a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f25807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f25808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, int i10, Handler handler) {
            super(handler);
            n.e(handler, "handler");
            this.f25808c = fVar;
            this.f25806a = i10;
            Uri parse = Uri.parse("content://media");
            n.d(parse, "parse(...)");
            this.f25807b = parse;
        }

        private final m<Long, String> c(long j10, int i10) {
            Cursor query;
            Cursor cursor;
            if (Build.VERSION.SDK_INT >= 29) {
                query = b().query(this.f25808c.f25801f, new String[]{"bucket_id", "bucket_display_name"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            m<Long, String> mVar = new m<>(Long.valueOf(query.getLong(query.getColumnIndex("bucket_id"))), query.getString(query.getColumnIndex("bucket_display_name")));
                            mk.b.a(query, null);
                            return mVar;
                        }
                        v vVar = v.f7137a;
                        mk.b.a(cursor, null);
                    } finally {
                    }
                }
            } else {
                ContentResolver b10 = b();
                if (i10 == 2) {
                    query = b10.query(this.f25808c.f25801f, new String[]{"album_id", "album"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                    if (query != null) {
                        try {
                            if (query.moveToNext()) {
                                m<Long, String> mVar2 = new m<>(Long.valueOf(query.getLong(query.getColumnIndex("album_id"))), query.getString(query.getColumnIndex("album")));
                                mk.b.a(query, null);
                                return mVar2;
                            }
                            v vVar2 = v.f7137a;
                            mk.b.a(query, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                } else {
                    query = b10.query(this.f25808c.f25801f, new String[]{"bucket_id", "bucket_display_name"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                    if (query != null) {
                        try {
                            if (query.moveToNext()) {
                                m<Long, String> mVar3 = new m<>(Long.valueOf(query.getLong(query.getColumnIndex("bucket_id"))), query.getString(query.getColumnIndex("bucket_display_name")));
                                mk.b.a(query, null);
                                return mVar3;
                            }
                            v vVar3 = v.f7137a;
                            mk.b.a(cursor, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
            }
            return new m<>(null, null);
        }

        public final Context a() {
            return this.f25808c.b();
        }

        public final ContentResolver b() {
            ContentResolver contentResolver = a().getContentResolver();
            n.d(contentResolver, "getContentResolver(...)");
            return contentResolver;
        }

        public final void d(Uri uri) {
            n.e(uri, "<set-?>");
            this.f25807b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            Long l10;
            Long k10;
            if (uri == null) {
                return;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                k10 = o.k(lastPathSegment);
                l10 = k10;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                if (Build.VERSION.SDK_INT >= 29 || !n.a(uri, this.f25807b)) {
                    this.f25808c.d(uri, "delete", null, null, this.f25806a);
                    return;
                } else {
                    this.f25808c.d(uri, "insert", null, null, this.f25806a);
                    return;
                }
            }
            Cursor query = b().query(this.f25808c.f25801f, new String[]{"date_added", "date_modified", "media_type"}, "_id = ?", new String[]{l10.toString()}, null);
            if (query != null) {
                f fVar = this.f25808c;
                try {
                    if (!query.moveToNext()) {
                        fVar.d(uri, "delete", l10, null, this.f25806a);
                        mk.b.a(query, null);
                        return;
                    }
                    String str = (System.currentTimeMillis() / ((long) AdError.NETWORK_ERROR_CODE)) - query.getLong(query.getColumnIndex("date_added")) < 30 ? "insert" : "update";
                    int i10 = query.getInt(query.getColumnIndex("media_type"));
                    m<Long, String> c10 = c(l10.longValue(), i10);
                    Long a10 = c10.a();
                    String b10 = c10.b();
                    if (a10 != null && b10 != null) {
                        fVar.d(uri, str, l10, a10, i10);
                        v vVar = v.f7137a;
                        mk.b.a(query, null);
                        return;
                    }
                    mk.b.a(query, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        mk.b.a(query, th2);
                        throw th3;
                    }
                }
            }
        }
    }

    public f(Context applicationContext, BinaryMessenger messenger, Handler handler) {
        n.e(applicationContext, "applicationContext");
        n.e(messenger, "messenger");
        n.e(handler, "handler");
        this.f25796a = applicationContext;
        this.f25798c = new a(this, 3, handler);
        this.f25799d = new a(this, 1, handler);
        this.f25800e = new a(this, 2, handler);
        this.f25801f = x5.e.f30417a.a();
        this.f25802g = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.f25803h = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        this.f25804i = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        this.f25805j = new MethodChannel(messenger, "com.fluttercandies/photo_manager/notify");
    }

    private final Context c() {
        return this.f25796a;
    }

    private final void e(a aVar, Uri uri) {
        c().getContentResolver().registerContentObserver(uri, true, aVar);
        aVar.d(uri);
    }

    public final Context b() {
        return this.f25796a;
    }

    public final void d(Uri uri, String changeType, Long l10, Long l11, int i10) {
        HashMap j10;
        n.e(changeType, "changeType");
        j10 = k0.j(r.a("platform", "android"), r.a("uri", String.valueOf(uri)), r.a("type", changeType), r.a("mediaType", Integer.valueOf(i10)));
        if (l10 != null) {
            j10.put(FacebookMediationAdapter.KEY_ID, l10);
        }
        if (l11 != null) {
            j10.put("galleryId", l11);
        }
        b6.a.a(j10);
        this.f25805j.invokeMethod("change", j10);
    }

    public final void f() {
        if (this.f25797b) {
            return;
        }
        a aVar = this.f25799d;
        Uri imageUri = this.f25802g;
        n.d(imageUri, "imageUri");
        e(aVar, imageUri);
        a aVar2 = this.f25798c;
        Uri videoUri = this.f25803h;
        n.d(videoUri, "videoUri");
        e(aVar2, videoUri);
        a aVar3 = this.f25800e;
        Uri audioUri = this.f25804i;
        n.d(audioUri, "audioUri");
        e(aVar3, audioUri);
        this.f25797b = true;
    }

    public final void g() {
        if (this.f25797b) {
            this.f25797b = false;
            c().getContentResolver().unregisterContentObserver(this.f25799d);
            c().getContentResolver().unregisterContentObserver(this.f25798c);
            c().getContentResolver().unregisterContentObserver(this.f25800e);
        }
    }
}
