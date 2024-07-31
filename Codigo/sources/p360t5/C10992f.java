package p360t5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import ck.C2028m;
import ck.C2033r;
import ck.C2037v;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.C7018k0;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p024b6.C1662a;
import p435x5.InterfaceC12289e;
import p450xk.C12523o;

/* renamed from: t5.f */
/* loaded from: classes.dex */
public final class C10992f {

    /* renamed from: a */
    private final Context f27940a;

    /* renamed from: b */
    private boolean f27941b;

    /* renamed from: c */
    private final a f27942c;

    /* renamed from: d */
    private final a f27943d;

    /* renamed from: e */
    private final a f27944e;

    /* renamed from: f */
    private final Uri f27945f;

    /* renamed from: g */
    private final Uri f27946g;

    /* renamed from: h */
    private final Uri f27947h;

    /* renamed from: i */
    private final Uri f27948i;

    /* renamed from: j */
    private final MethodChannel f27949j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5.f$a */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {

        /* renamed from: a */
        private final int f27950a;

        /* renamed from: b */
        private Uri f27951b;

        /* renamed from: c */
        final /* synthetic */ C10992f f27952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10992f c10992f, int i10, Handler handler) {
            super(handler);
            C9322n.m27781e(handler, "handler");
            this.f27952c = c10992f;
            this.f27950a = i10;
            Uri parse = Uri.parse("content://media");
            C9322n.m27780d(parse, "parse(...)");
            this.f27951b = parse;
        }

        /* renamed from: c */
        private final C2028m<Long, String> m33591c(long j10, int i10) {
            Cursor query;
            Cursor cursor;
            if (Build.VERSION.SDK_INT >= 29) {
                query = m33593b().query(this.f27952c.f27945f, new String[]{"bucket_id", "bucket_display_name"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                if (query != null) {
                    try {
                        if (query.moveToNext()) {
                            C2028m<Long, String> c2028m = new C2028m<>(Long.valueOf(query.getLong(query.getColumnIndex("bucket_id"))), query.getString(query.getColumnIndex("bucket_display_name")));
                            C9602b.m28593a(query, null);
                            return c2028m;
                        }
                        C2037v c2037v = C2037v.f8089a;
                        C9602b.m28593a(cursor, null);
                    } finally {
                    }
                }
            } else {
                ContentResolver m33593b = m33593b();
                if (i10 == 2) {
                    query = m33593b.query(this.f27952c.f27945f, new String[]{"album_id", "album"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                    if (query != null) {
                        try {
                            if (query.moveToNext()) {
                                C2028m<Long, String> c2028m2 = new C2028m<>(Long.valueOf(query.getLong(query.getColumnIndex("album_id"))), query.getString(query.getColumnIndex("album")));
                                C9602b.m28593a(query, null);
                                return c2028m2;
                            }
                            C2037v c2037v2 = C2037v.f8089a;
                            C9602b.m28593a(query, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                } else {
                    query = m33593b.query(this.f27952c.f27945f, new String[]{"bucket_id", "bucket_display_name"}, "_id = ?", new String[]{String.valueOf(j10)}, null);
                    if (query != null) {
                        try {
                            if (query.moveToNext()) {
                                C2028m<Long, String> c2028m3 = new C2028m<>(Long.valueOf(query.getLong(query.getColumnIndex("bucket_id"))), query.getString(query.getColumnIndex("bucket_display_name")));
                                C9602b.m28593a(query, null);
                                return c2028m3;
                            }
                            C2037v c2037v3 = C2037v.f8089a;
                            C9602b.m28593a(cursor, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                }
            }
            return new C2028m<>(null, null);
        }

        /* renamed from: a */
        public final Context m33592a() {
            return this.f27952c.m33587b();
        }

        /* renamed from: b */
        public final ContentResolver m33593b() {
            ContentResolver contentResolver = m33592a().getContentResolver();
            C9322n.m27780d(contentResolver, "getContentResolver(...)");
            return contentResolver;
        }

        /* renamed from: d */
        public final void m33594d(Uri uri) {
            C9322n.m27781e(uri, "<set-?>");
            this.f27951b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            Long l10;
            Long m41025k;
            if (uri == null) {
                return;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                m41025k = C12523o.m41025k(lastPathSegment);
                l10 = m41025k;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                if (Build.VERSION.SDK_INT >= 29 || !C9322n.m27777a(uri, this.f27951b)) {
                    this.f27952c.m33588d(uri, "delete", null, null, this.f27950a);
                    return;
                } else {
                    this.f27952c.m33588d(uri, "insert", null, null, this.f27950a);
                    return;
                }
            }
            Cursor query = m33593b().query(this.f27952c.f27945f, new String[]{"date_added", "date_modified", "media_type"}, "_id = ?", new String[]{l10.toString()}, null);
            if (query != null) {
                C10992f c10992f = this.f27952c;
                try {
                    if (!query.moveToNext()) {
                        c10992f.m33588d(uri, "delete", l10, null, this.f27950a);
                        C9602b.m28593a(query, null);
                        return;
                    }
                    String str = (System.currentTimeMillis() / ((long) AdError.NETWORK_ERROR_CODE)) - query.getLong(query.getColumnIndex("date_added")) < 30 ? "insert" : "update";
                    int i10 = query.getInt(query.getColumnIndex("media_type"));
                    C2028m<Long, String> m33591c = m33591c(l10.longValue(), i10);
                    Long m10335a = m33591c.m10335a();
                    String m10336b = m33591c.m10336b();
                    if (m10335a != null && m10336b != null) {
                        c10992f.m33588d(uri, str, l10, m10335a, i10);
                        C2037v c2037v = C2037v.f8089a;
                        C9602b.m28593a(query, null);
                        return;
                    }
                    C9602b.m28593a(query, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C9602b.m28593a(query, th2);
                        throw th3;
                    }
                }
            }
        }
    }

    public C10992f(Context applicationContext, BinaryMessenger messenger, Handler handler) {
        C9322n.m27781e(applicationContext, "applicationContext");
        C9322n.m27781e(messenger, "messenger");
        C9322n.m27781e(handler, "handler");
        this.f27940a = applicationContext;
        this.f27942c = new a(this, 3, handler);
        this.f27943d = new a(this, 1, handler);
        this.f27944e = new a(this, 2, handler);
        this.f27945f = InterfaceC12289e.f32929a.m39634a();
        this.f27946g = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        this.f27947h = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        this.f27948i = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        this.f27949j = new MethodChannel(messenger, "com.fluttercandies/photo_manager/notify");
    }

    /* renamed from: c */
    private final Context m33585c() {
        return this.f27940a;
    }

    /* renamed from: e */
    private final void m33586e(a aVar, Uri uri) {
        m33585c().getContentResolver().registerContentObserver(uri, true, aVar);
        aVar.m33594d(uri);
    }

    /* renamed from: b */
    public final Context m33587b() {
        return this.f27940a;
    }

    /* renamed from: d */
    public final void m33588d(Uri uri, String changeType, Long l10, Long l11, int i10) {
        HashMap m20423j;
        C9322n.m27781e(changeType, "changeType");
        m20423j = C7018k0.m20423j(C2033r.m10353a("platform", "android"), C2033r.m10353a("uri", String.valueOf(uri)), C2033r.m10353a("type", changeType), C2033r.m10353a("mediaType", Integer.valueOf(i10)));
        if (l10 != null) {
            m20423j.put(FacebookMediationAdapter.KEY_ID, l10);
        }
        if (l11 != null) {
            m20423j.put("galleryId", l11);
        }
        C1662a.m9132a(m20423j);
        this.f27949j.invokeMethod("change", m20423j);
    }

    /* renamed from: f */
    public final void m33589f() {
        if (this.f27941b) {
            return;
        }
        a aVar = this.f27943d;
        Uri imageUri = this.f27946g;
        C9322n.m27780d(imageUri, "imageUri");
        m33586e(aVar, imageUri);
        a aVar2 = this.f27942c;
        Uri videoUri = this.f27947h;
        C9322n.m27780d(videoUri, "videoUri");
        m33586e(aVar2, videoUri);
        a aVar3 = this.f27944e;
        Uri audioUri = this.f27948i;
        C9322n.m27780d(audioUri, "audioUri");
        m33586e(aVar3, audioUri);
        this.f27941b = true;
    }

    /* renamed from: g */
    public final void m33590g() {
        if (this.f27941b) {
            this.f27941b = false;
            m33585c().getContentResolver().unregisterContentObserver(this.f27943d);
            m33585c().getContentResolver().unregisterContentObserver(this.f27942c);
            m33585c().getContentResolver().unregisterContentObserver(this.f27944e);
        }
    }
}
