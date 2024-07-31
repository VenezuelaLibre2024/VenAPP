package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import c4.f;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import n3.a;
import n3.b;
import n3.d;
import n3.e;
import n3.g;
import n3.l;
import n3.p;
import n3.t;
import n3.u;
import n3.v;
import n3.w;
import n3.x;
import n3.y;
import n3.z;
import o3.a;
import o3.b;
import o3.c;
import o3.d;
import o3.f;
import q3.a0;
import q3.b0;
import q3.d0;
import q3.g0;
import q3.q;
import q3.t;
import q3.w;
import q3.y;
import r3.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.b<h> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f7411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f7412c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w3.a f7413d;

        a(b bVar, List list, w3.a aVar) {
            this.f7411b = bVar;
            this.f7412c = list;
            this.f7413d = aVar;
        }

        @Override // c4.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h get() {
            if (this.f7410a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            a2.b.c("Glide registry");
            this.f7410a = true;
            try {
                return i.a(this.f7411b, this.f7412c, this.f7413d);
            } finally {
                this.f7410a = false;
                a2.b.f();
            }
        }
    }

    static h a(b bVar, List<w3.b> list, w3.a aVar) {
        k3.d g10 = bVar.g();
        k3.b f10 = bVar.f();
        Context applicationContext = bVar.j().getApplicationContext();
        e f11 = bVar.j().f();
        h hVar = new h();
        b(applicationContext, hVar, g10, f10, f11);
        c(applicationContext, bVar, hVar, list, aVar);
        return hVar;
    }

    private static void b(Context context, h hVar, k3.d dVar, k3.b bVar, e eVar) {
        h3.j gVar;
        h3.j b0Var;
        h hVar2;
        Object obj;
        hVar.o(new q3.j());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            hVar.o(new t());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> g10 = hVar.g();
        u3.a aVar = new u3.a(context, g10, dVar, bVar);
        h3.j<ParcelFileDescriptor, Bitmap> m10 = g0.m(dVar);
        q qVar = new q(hVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            gVar = new q3.g(qVar);
            b0Var = new b0(qVar, bVar);
        } else {
            b0Var = new w();
            gVar = new q3.i();
        }
        if (i10 >= 28) {
            hVar.e("Animation", InputStream.class, Drawable.class, s3.f.f(g10, bVar));
            hVar.e("Animation", ByteBuffer.class, Drawable.class, s3.f.a(g10, bVar));
        }
        s3.j jVar = new s3.j(context);
        q3.c cVar = new q3.c(bVar);
        v3.a aVar2 = new v3.a();
        v3.d dVar2 = new v3.d();
        ContentResolver contentResolver = context.getContentResolver();
        hVar.a(ByteBuffer.class, new n3.c()).a(InputStream.class, new v(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, gVar).e("Bitmap", InputStream.class, Bitmap.class, b0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new y(qVar));
        }
        hVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m10).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, g0.c(dVar)).d(Bitmap.class, Bitmap.class, x.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new d0()).b(Bitmap.class, cVar).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new q3.a(resources, gVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new q3.a(resources, b0Var)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new q3.a(resources, m10)).b(BitmapDrawable.class, new q3.b(dVar, cVar)).e("Animation", InputStream.class, u3.c.class, new u3.j(g10, aVar, bVar)).e("Animation", ByteBuffer.class, u3.c.class, aVar).b(u3.c.class, new u3.d()).d(g3.a.class, g3.a.class, x.a.a()).e("Bitmap", g3.a.class, Bitmap.class, new u3.h(dVar)).c(Uri.class, Drawable.class, jVar).c(Uri.class, Bitmap.class, new a0(jVar, dVar)).p(new a.C0411a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new t3.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, x.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            hVar2 = hVar;
            obj = AssetFileDescriptor.class;
            hVar2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            hVar2 = hVar;
            obj = AssetFileDescriptor.class;
        }
        p<Integer, InputStream> g11 = n3.f.g(context);
        p<Integer, AssetFileDescriptor> c10 = n3.f.c(context);
        p<Integer, Drawable> e10 = n3.f.e(context);
        Class cls = Integer.TYPE;
        hVar2.d(cls, InputStream.class, g11).d(Integer.class, InputStream.class, g11).d(cls, obj, c10).d(Integer.class, obj, c10).d(cls, Drawable.class, e10).d(Integer.class, Drawable.class, e10).d(Uri.class, InputStream.class, u.f(context)).d(Uri.class, obj, u.e(context));
        t.c cVar2 = new t.c(resources);
        t.a aVar3 = new t.a(resources);
        t.b bVar2 = new t.b(resources);
        hVar2.d(Integer.class, Uri.class, cVar2).d(cls, Uri.class, cVar2).d(Integer.class, obj, aVar3).d(cls, obj, aVar3).d(Integer.class, InputStream.class, bVar2).d(cls, InputStream.class, bVar2);
        hVar2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new w.c()).d(String.class, ParcelFileDescriptor.class, new w.b()).d(String.class, obj, new w.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, obj, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            hVar2.d(Uri.class, InputStream.class, new d.c(context));
            hVar2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        hVar2.d(Uri.class, InputStream.class, new y.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).d(Uri.class, obj, new y.a(contentResolver)).d(Uri.class, InputStream.class, new z.a()).d(URL.class, InputStream.class, new f.a()).d(Uri.class, File.class, new l.a(context)).d(n3.h.class, InputStream.class, new a.C0366a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new s3.k()).q(Bitmap.class, BitmapDrawable.class, new v3.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new v3.c(dVar, aVar2, dVar2)).q(u3.c.class, byte[].class, dVar2);
        h3.j<ByteBuffer, Bitmap> d10 = g0.d(dVar);
        hVar2.c(ByteBuffer.class, Bitmap.class, d10);
        hVar2.c(ByteBuffer.class, BitmapDrawable.class, new q3.a(resources, d10));
    }

    private static void c(Context context, b bVar, h hVar, List<w3.b> list, w3.a aVar) {
        for (w3.b bVar2 : list) {
            try {
                bVar2.b(context, bVar, hVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.a(context, bVar, hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f.b<h> d(b bVar, List<w3.b> list, w3.a aVar) {
        return new a(bVar, list, aVar);
    }
}
