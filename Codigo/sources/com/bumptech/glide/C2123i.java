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
import com.bumptech.glide.C2117c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2140k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import p004a2.C0021b;
import p036c4.C1865f;
import p115g3.InterfaceC7442a;
import p129h3.InterfaceC7626j;
import p193k3.InterfaceC9139b;
import p193k3.InterfaceC9141d;
import p246n3.C9635a;
import p246n3.C9636b;
import p246n3.C9637c;
import p246n3.C9638d;
import p246n3.C9639e;
import p246n3.C9640f;
import p246n3.C9641g;
import p246n3.C9642h;
import p246n3.C9646l;
import p246n3.C9654t;
import p246n3.C9655u;
import p246n3.C9656v;
import p246n3.C9657w;
import p246n3.C9658x;
import p246n3.C9659y;
import p246n3.C9660z;
import p246n3.InterfaceC9650p;
import p263o3.C9773a;
import p263o3.C9774b;
import p263o3.C9775c;
import p263o3.C9776d;
import p263o3.C9778f;
import p302q3.C10228a;
import p302q3.C10229a0;
import p302q3.C10230b;
import p302q3.C10231b0;
import p302q3.C10232c;
import p302q3.C10235d0;
import p302q3.C10240g;
import p302q3.C10241g0;
import p302q3.C10243i;
import p302q3.C10244j;
import p302q3.C10251q;
import p302q3.C10254t;
import p302q3.C10257w;
import p302q3.C10259y;
import p324r3.C10611a;
import p346s3.C10788f;
import p346s3.C10792j;
import p346s3.C10793k;
import p358t3.C10984a;
import p373u3.C11306a;
import p373u3.C11308c;
import p373u3.C11309d;
import p373u3.C11313h;
import p373u3.C11315j;
import p393v3.C11619a;
import p393v3.C11620b;
import p393v3.C11621c;
import p393v3.C11622d;
import p411w3.AbstractC12064a;
import p411w3.InterfaceC12065b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public final class C2123i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.i$a */
    /* loaded from: classes.dex */
    public class a implements C1865f.b<C2122h> {

        /* renamed from: a */
        private boolean f8362a;

        /* renamed from: b */
        final /* synthetic */ ComponentCallbacks2C2116b f8363b;

        /* renamed from: c */
        final /* synthetic */ List f8364c;

        /* renamed from: d */
        final /* synthetic */ AbstractC12064a f8365d;

        a(ComponentCallbacks2C2116b componentCallbacks2C2116b, List list, AbstractC12064a abstractC12064a) {
            this.f8363b = componentCallbacks2C2116b;
            this.f8364c = list;
            this.f8365d = abstractC12064a;
        }

        @Override // p036c4.C1865f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2122h get() {
            if (this.f8362a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            C0021b.m78c("Glide registry");
            this.f8362a = true;
            try {
                return C2123i.m10692a(this.f8363b, this.f8364c, this.f8365d);
            } finally {
                this.f8362a = false;
                C0021b.m81f();
            }
        }
    }

    /* renamed from: a */
    static C2122h m10692a(ComponentCallbacks2C2116b componentCallbacks2C2116b, List<InterfaceC12065b> list, AbstractC12064a abstractC12064a) {
        InterfaceC9141d m10651g = componentCallbacks2C2116b.m10651g();
        InterfaceC9139b m10650f = componentCallbacks2C2116b.m10650f();
        Context applicationContext = componentCallbacks2C2116b.m10654j().getApplicationContext();
        C2119e m10668f = componentCallbacks2C2116b.m10654j().m10668f();
        C2122h c2122h = new C2122h();
        m10693b(applicationContext, c2122h, m10651g, m10650f, m10668f);
        m10694c(applicationContext, componentCallbacks2C2116b, c2122h, list, abstractC12064a);
        return c2122h;
    }

    /* renamed from: b */
    private static void m10693b(Context context, C2122h c2122h, InterfaceC9141d interfaceC9141d, InterfaceC9139b interfaceC9139b, C2119e c2119e) {
        InterfaceC7626j c10240g;
        InterfaceC7626j c10231b0;
        C2122h c2122h2;
        Object obj;
        c2122h.m10688o(new C10244j());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            c2122h.m10688o(new C10254t());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> m10680g = c2122h.m10680g();
        C11306a c11306a = new C11306a(context, m10680g, interfaceC9141d, interfaceC9139b);
        InterfaceC7626j<ParcelFileDescriptor, Bitmap> m30624m = C10241g0.m30624m(interfaceC9141d);
        C10251q c10251q = new C10251q(c2122h.m10680g(), resources.getDisplayMetrics(), interfaceC9141d, interfaceC9139b);
        if (i10 < 28 || !c2119e.m10671a(C2117c.b.class)) {
            c10240g = new C10240g(c10251q);
            c10231b0 = new C10231b0(c10251q, interfaceC9139b);
        } else {
            c10231b0 = new C10257w();
            c10240g = new C10243i();
        }
        if (i10 >= 28) {
            c2122h.m10679e("Animation", InputStream.class, Drawable.class, C10788f.m32866f(m10680g, interfaceC9139b));
            c2122h.m10679e("Animation", ByteBuffer.class, Drawable.class, C10788f.m32864a(m10680g, interfaceC9139b));
        }
        C10792j c10792j = new C10792j(context);
        C10232c c10232c = new C10232c(interfaceC9139b);
        C11619a c11619a = new C11619a();
        C11622d c11622d = new C11622d();
        ContentResolver contentResolver = context.getContentResolver();
        c2122h.m10675a(ByteBuffer.class, new C9637c()).m10675a(InputStream.class, new C9656v(interfaceC9139b)).m10679e("Bitmap", ByteBuffer.class, Bitmap.class, c10240g).m10679e("Bitmap", InputStream.class, Bitmap.class, c10231b0);
        if (ParcelFileDescriptorRewinder.m10753c()) {
            c2122h.m10679e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C10259y(c10251q));
        }
        c2122h.m10679e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m30624m).m10679e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C10241g0.m30614c(interfaceC9141d)).m10678d(Bitmap.class, Bitmap.class, C9658x.a.m28950a()).m10679e("Bitmap", Bitmap.class, Bitmap.class, new C10235d0()).m10676b(Bitmap.class, c10232c).m10679e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C10228a(resources, c10240g)).m10679e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C10228a(resources, c10231b0)).m10679e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C10228a(resources, m30624m)).m10676b(BitmapDrawable.class, new C10230b(interfaceC9141d, c10232c)).m10679e("Animation", InputStream.class, C11308c.class, new C11315j(m10680g, c11306a, interfaceC9139b)).m10679e("Animation", ByteBuffer.class, C11308c.class, c11306a).m10676b(C11308c.class, new C11309d()).m10678d(InterfaceC7442a.class, InterfaceC7442a.class, C9658x.a.m28950a()).m10679e("Bitmap", InterfaceC7442a.class, Bitmap.class, new C11313h(interfaceC9141d)).m10677c(Uri.class, Drawable.class, c10792j).m10677c(Uri.class, Bitmap.class, new C10229a0(c10792j, interfaceC9141d)).m10689p(new C10611a.a()).m10678d(File.class, ByteBuffer.class, new C9638d.b()).m10678d(File.class, InputStream.class, new C9641g.e()).m10677c(File.class, File.class, new C10984a()).m10678d(File.class, ParcelFileDescriptor.class, new C9641g.b()).m10678d(File.class, File.class, C9658x.a.m28950a()).m10689p(new C2140k.a(interfaceC9139b));
        if (ParcelFileDescriptorRewinder.m10753c()) {
            c2122h2 = c2122h;
            obj = AssetFileDescriptor.class;
            c2122h2.m10689p(new ParcelFileDescriptorRewinder.C2129a());
        } else {
            c2122h2 = c2122h;
            obj = AssetFileDescriptor.class;
        }
        InterfaceC9650p<Integer, InputStream> m28868g = C9640f.m28868g(context);
        InterfaceC9650p<Integer, AssetFileDescriptor> m28866c = C9640f.m28866c(context);
        InterfaceC9650p<Integer, Drawable> m28867e = C9640f.m28867e(context);
        Class cls = Integer.TYPE;
        c2122h2.m10678d(cls, InputStream.class, m28868g).m10678d(Integer.class, InputStream.class, m28868g).m10678d(cls, obj, m28866c).m10678d(Integer.class, obj, m28866c).m10678d(cls, Drawable.class, m28867e).m10678d(Integer.class, Drawable.class, m28867e).m10678d(Uri.class, InputStream.class, C9655u.m28939f(context)).m10678d(Uri.class, obj, C9655u.m28938e(context));
        C9654t.c cVar = new C9654t.c(resources);
        C9654t.a aVar = new C9654t.a(resources);
        C9654t.b bVar = new C9654t.b(resources);
        c2122h2.m10678d(Integer.class, Uri.class, cVar).m10678d(cls, Uri.class, cVar).m10678d(Integer.class, obj, aVar).m10678d(cls, obj, aVar).m10678d(Integer.class, InputStream.class, bVar).m10678d(cls, InputStream.class, bVar);
        c2122h2.m10678d(String.class, InputStream.class, new C9639e.c()).m10678d(Uri.class, InputStream.class, new C9639e.c()).m10678d(String.class, InputStream.class, new C9657w.c()).m10678d(String.class, ParcelFileDescriptor.class, new C9657w.b()).m10678d(String.class, obj, new C9657w.a()).m10678d(Uri.class, InputStream.class, new C9635a.c(context.getAssets())).m10678d(Uri.class, obj, new C9635a.b(context.getAssets())).m10678d(Uri.class, InputStream.class, new C9774b.a(context)).m10678d(Uri.class, InputStream.class, new C9775c.a(context));
        if (i10 >= 29) {
            c2122h2.m10678d(Uri.class, InputStream.class, new C9776d.c(context));
            c2122h2.m10678d(Uri.class, ParcelFileDescriptor.class, new C9776d.b(context));
        }
        c2122h2.m10678d(Uri.class, InputStream.class, new C9659y.d(contentResolver)).m10678d(Uri.class, ParcelFileDescriptor.class, new C9659y.b(contentResolver)).m10678d(Uri.class, obj, new C9659y.a(contentResolver)).m10678d(Uri.class, InputStream.class, new C9660z.a()).m10678d(URL.class, InputStream.class, new C9778f.a()).m10678d(Uri.class, File.class, new C9646l.a(context)).m10678d(C9642h.class, InputStream.class, new C9773a.a()).m10678d(byte[].class, ByteBuffer.class, new C9636b.a()).m10678d(byte[].class, InputStream.class, new C9636b.d()).m10678d(Uri.class, Uri.class, C9658x.a.m28950a()).m10678d(Drawable.class, Drawable.class, C9658x.a.m28950a()).m10677c(Drawable.class, Drawable.class, new C10793k()).m10690q(Bitmap.class, BitmapDrawable.class, new C11620b(resources)).m10690q(Bitmap.class, byte[].class, c11619a).m10690q(Drawable.class, byte[].class, new C11621c(interfaceC9141d, c11619a, c11622d)).m10690q(C11308c.class, byte[].class, c11622d);
        InterfaceC7626j<ByteBuffer, Bitmap> m30615d = C10241g0.m30615d(interfaceC9141d);
        c2122h2.m10677c(ByteBuffer.class, Bitmap.class, m30615d);
        c2122h2.m10677c(ByteBuffer.class, BitmapDrawable.class, new C10228a(resources, m30615d));
    }

    /* renamed from: c */
    private static void m10694c(Context context, ComponentCallbacks2C2116b componentCallbacks2C2116b, C2122h c2122h, List<InterfaceC12065b> list, AbstractC12064a abstractC12064a) {
        for (InterfaceC12065b interfaceC12065b : list) {
            try {
                interfaceC12065b.m38739b(context, componentCallbacks2C2116b, c2122h);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC12065b.getClass().getName(), e10);
            }
        }
        if (abstractC12064a != null) {
            abstractC12064a.m38740a(context, componentCallbacks2C2116b, c2122h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C1865f.b<C2122h> m10695d(ComponentCallbacks2C2116b componentCallbacks2C2116b, List<InterfaceC12065b> list, AbstractC12064a abstractC12064a) {
        return new a(componentCallbacks2C2116b, list, abstractC12064a);
    }
}
