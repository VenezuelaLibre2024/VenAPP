package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f3706k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f3707a;

    /* renamed from: b, reason: collision with root package name */
    Object f3708b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3709c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3710d;

    /* renamed from: e, reason: collision with root package name */
    public int f3711e;

    /* renamed from: f, reason: collision with root package name */
    public int f3712f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3713g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f3714h;

    /* renamed from: i, reason: collision with root package name */
    public String f3715i;

    /* renamed from: j, reason: collision with root package name */
    public String f3716j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static IconCompat a(Object obj) {
            androidx.core.util.h.k(obj);
            int d10 = d(obj);
            if (d10 == 2) {
                return IconCompat.k(null, c(obj), b(obj));
            }
            if (d10 == 4) {
                return IconCompat.g(e(obj));
            }
            if (d10 == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f3708b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f3707a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb5;
                    case 0: goto L8;
                    case 1: goto L9c;
                    case 2: goto L91;
                    case 3: goto L84;
                    case 4: goto L7b;
                    case 5: goto L65;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.p()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto La4
            L20:
                if (r5 == 0) goto L4a
                java.io.InputStream r5 = r4.q(r5)
                if (r5 == 0) goto L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L76
                goto L6d
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.p()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L4a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.p()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L65:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L72
                java.lang.Object r5 = r4.f3708b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L6d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto La4
            L72:
                java.lang.Object r5 = r4.f3708b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L76:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.c(r5, r1)
                goto La0
            L7b:
                java.lang.Object r5 = r4.f3708b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La4
            L84:
                java.lang.Object r5 = r4.f3708b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f3711e
                int r1 = r4.f3712f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La4
            L91:
                java.lang.String r5 = r4.n()
                int r0 = r4.f3711e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La4
            L9c:
                java.lang.Object r5 = r4.f3708b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            La0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            La4:
                android.content.res.ColorStateList r0 = r4.f3713g
                if (r0 == 0) goto Lab
                r5.setTintList(r0)
            Lab:
                android.graphics.PorterDuff$Mode r4 = r4.f3714h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f3706k
                if (r4 == r0) goto Lb4
                r5.setTintMode(r4)
            Lb4:
                return r5
            Lb5:
                java.lang.Object r4 = r4.f3708b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f3707a = -1;
        this.f3709c = null;
        this.f3710d = null;
        this.f3711e = 0;
        this.f3712f = 0;
        this.f3713g = null;
        this.f3714h = f3706k;
        this.f3715i = null;
    }

    IconCompat(int i10) {
        this.f3709c = null;
        this.f3710d = null;
        this.f3711e = 0;
        this.f3712f = 0;
        this.f3713g = null;
        this.f3714h = f3706k;
        this.f3715i = null;
        this.f3707a = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0047. Please report as an issue. */
    public static IconCompat a(Bundle bundle) {
        Object parcelable;
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f3711e = bundle.getInt("int1");
        iconCompat.f3712f = bundle.getInt("int2");
        iconCompat.f3716j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f3713g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f3714h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable("obj");
                iconCompat.f3708b = parcelable;
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString("obj");
                iconCompat.f3708b = parcelable;
                return iconCompat;
            case 3:
                iconCompat.f3708b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    static Bitmap c(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat d(Uri uri) {
        androidx.core.util.c.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3708b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3708b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        androidx.core.util.c.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3708b = str;
        return iconCompat;
    }

    public static IconCompat i(byte[] bArr, int i10, int i11) {
        androidx.core.util.c.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f3708b = bArr;
        iconCompat.f3711e = i10;
        iconCompat.f3712f = i11;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i10) {
        androidx.core.util.c.c(context);
        return k(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat k(Resources resources, String str, int i10) {
        androidx.core.util.c.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f3711e = i10;
        if (resources != null) {
            try {
                iconCompat.f3708b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f3708b = str;
        }
        iconCompat.f3716j = str;
        return iconCompat;
    }

    private static String w(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap l() {
        int i10 = this.f3707a;
        if (i10 == -1) {
            Object obj = this.f3708b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f3708b;
        }
        if (i10 == 5) {
            return c((Bitmap) this.f3708b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int m() {
        int i10 = this.f3707a;
        if (i10 == -1) {
            return a.b(this.f3708b);
        }
        if (i10 == 2) {
            return this.f3711e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i10 = this.f3707a;
        if (i10 == -1) {
            return a.c(this.f3708b);
        }
        if (i10 == 2) {
            String str = this.f3716j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3708b).split(":", -1)[0] : this.f3716j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i10 = this.f3707a;
        return i10 == -1 ? a.d(this.f3708b) : i10;
    }

    public Uri p() {
        int i10 = this.f3707a;
        if (i10 == -1) {
            return a.e(this.f3708b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f3708b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream q(Context context) {
        StringBuilder sb2;
        String str;
        Uri p10 = p();
        String scheme = p10.getScheme();
        if ("content".equals(scheme) || Constants.FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(p10);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3708b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(p10);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    public void r() {
        Parcelable parcelable;
        this.f3714h = PorterDuff.Mode.valueOf(this.f3715i);
        switch (this.f3707a) {
            case -1:
                parcelable = this.f3710d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f3710d;
                if (parcelable == null) {
                    byte[] bArr = this.f3709c;
                    this.f3708b = bArr;
                    this.f3707a = 3;
                    this.f3711e = 0;
                    this.f3712f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3709c, Charset.forName("UTF-16"));
                this.f3708b = str;
                if (this.f3707a == 2 && this.f3716j == null) {
                    this.f3716j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3708b = this.f3709c;
                return;
        }
        this.f3708b = parcelable;
    }

    public void s(boolean z10) {
        this.f3715i = this.f3714h.name();
        switch (this.f3707a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f3708b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3709c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f3709c = ((String) this.f3708b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3709c = (byte[]) this.f3708b;
                return;
            case 4:
            case 6:
                this.f3709c = this.f3708b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f3710d = (Parcelable) this.f3708b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle t() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f3707a
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.f3708b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.f3708b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.f3708b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.f3708b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            java.lang.String r1 = "type"
            int r2 = r3.f3707a
            r0.putInt(r1, r2)
            java.lang.String r1 = "int1"
            int r2 = r3.f3711e
            r0.putInt(r1, r2)
            java.lang.String r1 = "int2"
            int r2 = r3.f3712f
            r0.putInt(r1, r2)
            java.lang.String r1 = "string1"
            java.lang.String r2 = r3.f3716j
            r0.putString(r1, r2)
            android.content.res.ColorStateList r1 = r3.f3713g
            if (r1 == 0) goto L55
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L55:
            android.graphics.PorterDuff$Mode r1 = r3.f3714h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f3706k
            if (r1 == r2) goto L64
            java.lang.String r2 = "tint_mode"
            java.lang.String r1 = r1.name()
            r0.putString(r2, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.t():android.os.Bundle");
    }

    public String toString() {
        int height;
        if (this.f3707a == -1) {
            return String.valueOf(this.f3708b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(w(this.f3707a));
        switch (this.f3707a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3708b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f3708b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3716j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3711e);
                if (this.f3712f != 0) {
                    sb2.append(" off=");
                    height = this.f3712f;
                    sb2.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3708b);
                break;
        }
        if (this.f3713g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3713g);
        }
        if (this.f3714h != f3706k) {
            sb2.append(" mode=");
            sb2.append(this.f3714h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Deprecated
    public Icon u() {
        return v(null);
    }

    public Icon v(Context context) {
        return a.g(this, context);
    }
}
