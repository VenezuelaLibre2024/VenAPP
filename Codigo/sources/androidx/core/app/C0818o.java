package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.C0832s1;
import androidx.core.content.C0854a;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p299q0.C10218b;
import p299q0.C10219c;
import p299q0.C10220d;
import p299q0.C10222f;

/* renamed from: androidx.core.app.o */
/* loaded from: classes.dex */
public class C0818o {

    /* renamed from: androidx.core.app.o$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f4170a;

        /* renamed from: b */
        private IconCompat f4171b;

        /* renamed from: c */
        private final C0838u1[] f4172c;

        /* renamed from: d */
        private final C0838u1[] f4173d;

        /* renamed from: e */
        private boolean f4174e;

        /* renamed from: f */
        boolean f4175f;

        /* renamed from: g */
        private final int f4176g;

        /* renamed from: h */
        private final boolean f4177h;

        /* renamed from: i */
        @Deprecated
        public int f4178i;

        /* renamed from: j */
        public CharSequence f4179j;

        /* renamed from: k */
        public PendingIntent f4180k;

        /* renamed from: l */
        private boolean f4181l;

        /* renamed from: androidx.core.app.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13157a {

            /* renamed from: a */
            private final IconCompat f4182a;

            /* renamed from: b */
            private final CharSequence f4183b;

            /* renamed from: c */
            private final PendingIntent f4184c;

            /* renamed from: d */
            private boolean f4185d;

            /* renamed from: e */
            private final Bundle f4186e;

            /* renamed from: f */
            private ArrayList<C0838u1> f4187f;

            /* renamed from: g */
            private int f4188g;

            /* renamed from: h */
            private boolean f4189h;

            /* renamed from: i */
            private boolean f4190i;

            /* renamed from: j */
            private boolean f4191j;

            public C13157a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C13157a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0838u1[] c0838u1Arr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f4185d = true;
                this.f4189h = true;
                this.f4182a = iconCompat;
                this.f4183b = e.m4117e(charSequence);
                this.f4184c = pendingIntent;
                this.f4186e = bundle;
                this.f4187f = c0838u1Arr == null ? null : new ArrayList<>(Arrays.asList(c0838u1Arr));
                this.f4185d = z10;
                this.f4188g = i10;
                this.f4189h = z11;
                this.f4190i = z12;
                this.f4191j = z13;
            }

            /* renamed from: c */
            private void m4084c() {
                if (this.f4190i && this.f4184c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* renamed from: a */
            public C13157a m4085a(C0838u1 c0838u1) {
                if (this.f4187f == null) {
                    this.f4187f = new ArrayList<>();
                }
                if (c0838u1 != null) {
                    this.f4187f.add(c0838u1);
                }
                return this;
            }

            /* renamed from: b */
            public a m4086b() {
                m4084c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C0838u1> arrayList3 = this.f4187f;
                if (arrayList3 != null) {
                    Iterator<C0838u1> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0838u1 next = it.next();
                        if (next.m4327k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C0838u1[] c0838u1Arr = arrayList.isEmpty() ? null : (C0838u1[]) arrayList.toArray(new C0838u1[arrayList.size()]);
                return new a(this.f4182a, this.f4183b, this.f4184c, this.f4186e, arrayList2.isEmpty() ? null : (C0838u1[]) arrayList2.toArray(new C0838u1[arrayList2.size()]), c0838u1Arr, this.f4185d, this.f4188g, this.f4189h, this.f4190i, this.f4191j);
            }

            /* renamed from: d */
            public C13157a m4087d(boolean z10) {
                this.f4185d = z10;
                return this;
            }

            /* renamed from: e */
            public C13157a m4088e(boolean z10) {
                this.f4190i = z10;
                return this;
            }

            /* renamed from: f */
            public C13157a m4089f(boolean z10) {
                this.f4189h = z10;
                return this;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m4510k(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0838u1[] c0838u1Arr, C0838u1[] c0838u1Arr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f4175f = true;
            this.f4171b = iconCompat;
            if (iconCompat != null && iconCompat.m4515o() == 2) {
                this.f4178i = iconCompat.m4513m();
            }
            this.f4179j = e.m4117e(charSequence);
            this.f4180k = pendingIntent;
            this.f4170a = bundle == null ? new Bundle() : bundle;
            this.f4172c = c0838u1Arr;
            this.f4173d = c0838u1Arr2;
            this.f4174e = z10;
            this.f4176g = i10;
            this.f4175f = z11;
            this.f4177h = z12;
            this.f4181l = z13;
        }

        /* renamed from: a */
        public PendingIntent m4074a() {
            return this.f4180k;
        }

        /* renamed from: b */
        public boolean m4075b() {
            return this.f4174e;
        }

        /* renamed from: c */
        public Bundle m4076c() {
            return this.f4170a;
        }

        /* renamed from: d */
        public IconCompat m4077d() {
            int i10;
            if (this.f4171b == null && (i10 = this.f4178i) != 0) {
                this.f4171b = IconCompat.m4510k(null, "", i10);
            }
            return this.f4171b;
        }

        /* renamed from: e */
        public C0838u1[] m4078e() {
            return this.f4172c;
        }

        /* renamed from: f */
        public int m4079f() {
            return this.f4176g;
        }

        /* renamed from: g */
        public boolean m4080g() {
            return this.f4175f;
        }

        /* renamed from: h */
        public CharSequence m4081h() {
            return this.f4179j;
        }

        /* renamed from: i */
        public boolean m4082i() {
            return this.f4181l;
        }

        /* renamed from: j */
        public boolean m4083j() {
            return this.f4177h;
        }
    }

    /* renamed from: androidx.core.app.o$b */
    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: e */
        private IconCompat f4192e;

        /* renamed from: f */
        private IconCompat f4193f;

        /* renamed from: g */
        private boolean f4194g;

        /* renamed from: h */
        private CharSequence f4195h;

        /* renamed from: i */
        private boolean f4196i;

        /* renamed from: androidx.core.app.o$b$a */
        /* loaded from: classes.dex */
        private static class a {
            /* renamed from: a */
            static Notification.BigPictureStyle m4099a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            /* renamed from: b */
            static Notification.BigPictureStyle m4100b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigPictureStyle m4101c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m4102d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: e */
            static void m4103e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.o$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C13158b {
            /* renamed from: a */
            static void m4104a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.o$b$c */
        /* loaded from: classes.dex */
        private static class c {
            /* renamed from: a */
            static void m4105a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            static void m4106b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m4107c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        /* renamed from: n */
        private static IconCompat m4090n(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.m4501b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m4505f((Bitmap) parcelable);
            }
            return null;
        }

        /* renamed from: q */
        public static IconCompat m4091q(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? m4090n(parcelable) : m4090n(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle m4101c = a.m4101c(a.m4100b(interfaceC0815n.mo3975a()), this.f4268b);
            IconCompat iconCompat = this.f4192e;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.m4105a(m4101c, this.f4192e.m4522v(interfaceC0815n instanceof C0792f0 ? ((C0792f0) interfaceC0815n).m3978f() : null));
                } else if (iconCompat.m4515o() == 1) {
                    m4101c = a.m4099a(m4101c, this.f4192e.m4512l());
                }
            }
            if (this.f4194g) {
                if (this.f4193f == null) {
                    a.m4102d(m4101c, null);
                } else {
                    C13158b.m4104a(m4101c, this.f4193f.m4522v(interfaceC0815n instanceof C0792f0 ? ((C0792f0) interfaceC0815n).m3978f() : null));
                }
            }
            if (this.f4270d) {
                a.m4103e(m4101c, this.f4269c);
            }
            if (i10 >= 31) {
                c.m4107c(m4101c, this.f4196i);
                c.m4106b(m4101c, this.f4195h);
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: l */
        protected void mo4094l(Bundle bundle) {
            super.mo4094l(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f4193f = m4090n(bundle.getParcelable("android.largeIcon.big"));
                this.f4194g = true;
            }
            this.f4192e = m4091q(bundle);
            this.f4196i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        /* renamed from: o */
        public b m4095o(Bitmap bitmap) {
            this.f4193f = bitmap == null ? null : IconCompat.m4505f(bitmap);
            this.f4194g = true;
            return this;
        }

        /* renamed from: p */
        public b m4096p(Bitmap bitmap) {
            this.f4192e = bitmap == null ? null : IconCompat.m4505f(bitmap);
            return this;
        }

        /* renamed from: r */
        public b m4097r(CharSequence charSequence) {
            this.f4268b = e.m4117e(charSequence);
            return this;
        }

        /* renamed from: s */
        public b m4098s(CharSequence charSequence) {
            this.f4269c = e.m4117e(charSequence);
            this.f4270d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.o$c */
    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: e */
        private CharSequence f4197e;

        /* renamed from: androidx.core.app.o$c$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static Notification.BigTextStyle m4112a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m4113b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m4114c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.BigTextStyle m4115d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: a */
        public void mo4108a(Bundle bundle) {
            super.mo4108a(bundle);
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            Notification.BigTextStyle m4112a = a.m4112a(a.m4114c(a.m4113b(interfaceC0815n.mo3975a()), this.f4268b), this.f4197e);
            if (this.f4270d) {
                a.m4115d(m4112a, this.f4269c);
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: l */
        protected void mo4094l(Bundle bundle) {
            super.mo4094l(bundle);
            this.f4197e = bundle.getCharSequence("android.bigText");
        }

        /* renamed from: n */
        public c m4109n(CharSequence charSequence) {
            this.f4197e = e.m4117e(charSequence);
            return this;
        }

        /* renamed from: o */
        public c m4110o(CharSequence charSequence) {
            this.f4268b = e.m4117e(charSequence);
            return this;
        }

        /* renamed from: p */
        public c m4111p(CharSequence charSequence) {
            this.f4269c = e.m4117e(charSequence);
            this.f4270d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.o$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m4116a(d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.o$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: A */
        boolean f4198A;

        /* renamed from: B */
        boolean f4199B;

        /* renamed from: C */
        String f4200C;

        /* renamed from: D */
        Bundle f4201D;

        /* renamed from: E */
        int f4202E;

        /* renamed from: F */
        int f4203F;

        /* renamed from: G */
        Notification f4204G;

        /* renamed from: H */
        RemoteViews f4205H;

        /* renamed from: I */
        RemoteViews f4206I;

        /* renamed from: J */
        RemoteViews f4207J;

        /* renamed from: K */
        String f4208K;

        /* renamed from: L */
        int f4209L;

        /* renamed from: M */
        String f4210M;

        /* renamed from: N */
        long f4211N;

        /* renamed from: O */
        int f4212O;

        /* renamed from: P */
        int f4213P;

        /* renamed from: Q */
        boolean f4214Q;

        /* renamed from: R */
        Notification f4215R;

        /* renamed from: S */
        boolean f4216S;

        /* renamed from: T */
        Object f4217T;

        /* renamed from: U */
        @Deprecated
        public ArrayList<String> f4218U;

        /* renamed from: a */
        public Context f4219a;

        /* renamed from: b */
        public ArrayList<a> f4220b;

        /* renamed from: c */
        public ArrayList<C0832s1> f4221c;

        /* renamed from: d */
        ArrayList<a> f4222d;

        /* renamed from: e */
        CharSequence f4223e;

        /* renamed from: f */
        CharSequence f4224f;

        /* renamed from: g */
        PendingIntent f4225g;

        /* renamed from: h */
        PendingIntent f4226h;

        /* renamed from: i */
        RemoteViews f4227i;

        /* renamed from: j */
        Bitmap f4228j;

        /* renamed from: k */
        CharSequence f4229k;

        /* renamed from: l */
        int f4230l;

        /* renamed from: m */
        int f4231m;

        /* renamed from: n */
        boolean f4232n;

        /* renamed from: o */
        boolean f4233o;

        /* renamed from: p */
        j f4234p;

        /* renamed from: q */
        CharSequence f4235q;

        /* renamed from: r */
        CharSequence f4236r;

        /* renamed from: s */
        CharSequence[] f4237s;

        /* renamed from: t */
        int f4238t;

        /* renamed from: u */
        int f4239u;

        /* renamed from: v */
        boolean f4240v;

        /* renamed from: w */
        String f4241w;

        /* renamed from: x */
        boolean f4242x;

        /* renamed from: y */
        String f4243y;

        /* renamed from: z */
        boolean f4244z;

        /* renamed from: androidx.core.app.o$e$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static AudioAttributes m4158a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            static AudioAttributes.Builder m4159b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            static AudioAttributes.Builder m4160c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            /* renamed from: d */
            static AudioAttributes.Builder m4161d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            /* renamed from: e */
            static AudioAttributes.Builder m4162e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f4220b = new ArrayList<>();
            this.f4221c = new ArrayList<>();
            this.f4222d = new ArrayList<>();
            this.f4232n = true;
            this.f4244z = false;
            this.f4202E = 0;
            this.f4203F = 0;
            this.f4209L = 0;
            this.f4212O = 0;
            this.f4213P = 0;
            Notification notification = new Notification();
            this.f4215R = notification;
            this.f4219a = context;
            this.f4208K = str;
            notification.when = System.currentTimeMillis();
            this.f4215R.audioStreamType = -1;
            this.f4231m = 0;
            this.f4218U = new ArrayList<>();
            this.f4214Q = true;
        }

        /* renamed from: e */
        protected static CharSequence m4117e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: f */
        private Bitmap m4118f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f4219a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C10219c.f25261b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C10219c.f25260a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        /* renamed from: q */
        private void m4119q(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.f4215R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.f4215R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        /* renamed from: A */
        public e m4120A(boolean z10) {
            m4119q(8, z10);
            return this;
        }

        /* renamed from: B */
        public e m4121B(int i10) {
            this.f4231m = i10;
            return this;
        }

        /* renamed from: C */
        public e m4122C(int i10, int i11, boolean z10) {
            this.f4238t = i10;
            this.f4239u = i11;
            this.f4240v = z10;
            return this;
        }

        /* renamed from: D */
        public e m4123D(String str) {
            this.f4210M = str;
            return this;
        }

        /* renamed from: E */
        public e m4124E(boolean z10) {
            this.f4232n = z10;
            return this;
        }

        /* renamed from: F */
        public e m4125F(int i10) {
            this.f4215R.icon = i10;
            return this;
        }

        /* renamed from: G */
        public e m4126G(Uri uri) {
            Notification notification = this.f4215R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m4162e = a.m4162e(a.m4160c(a.m4159b(), 4), 5);
            this.f4215R.audioAttributes = a.m4158a(m4162e);
            return this;
        }

        /* renamed from: H */
        public e m4127H(j jVar) {
            if (this.f4234p != jVar) {
                this.f4234p = jVar;
                if (jVar != null) {
                    jVar.m4242m(this);
                }
            }
            return this;
        }

        /* renamed from: I */
        public e m4128I(CharSequence charSequence) {
            this.f4235q = m4117e(charSequence);
            return this;
        }

        /* renamed from: J */
        public e m4129J(CharSequence charSequence) {
            this.f4215R.tickerText = m4117e(charSequence);
            return this;
        }

        /* renamed from: K */
        public e m4130K(long j10) {
            this.f4211N = j10;
            return this;
        }

        /* renamed from: L */
        public e m4131L(boolean z10) {
            this.f4233o = z10;
            return this;
        }

        /* renamed from: M */
        public e m4132M(long[] jArr) {
            this.f4215R.vibrate = jArr;
            return this;
        }

        /* renamed from: N */
        public e m4133N(int i10) {
            this.f4203F = i10;
            return this;
        }

        /* renamed from: O */
        public e m4134O(long j10) {
            this.f4215R.when = j10;
            return this;
        }

        /* renamed from: a */
        public e m4135a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f4220b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public e m4136b(a aVar) {
            if (aVar != null) {
                this.f4220b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m4137c() {
            return new C0792f0(this).m3976c();
        }

        /* renamed from: d */
        public Bundle m4138d() {
            if (this.f4201D == null) {
                this.f4201D = new Bundle();
            }
            return this.f4201D;
        }

        /* renamed from: g */
        public e m4139g(boolean z10) {
            m4119q(16, z10);
            return this;
        }

        /* renamed from: h */
        public e m4140h(String str) {
            this.f4200C = str;
            return this;
        }

        /* renamed from: i */
        public e m4141i(String str) {
            this.f4208K = str;
            return this;
        }

        /* renamed from: j */
        public e m4142j(int i10) {
            this.f4202E = i10;
            return this;
        }

        /* renamed from: k */
        public e m4143k(boolean z10) {
            this.f4198A = z10;
            this.f4199B = true;
            return this;
        }

        /* renamed from: l */
        public e m4144l(PendingIntent pendingIntent) {
            this.f4225g = pendingIntent;
            return this;
        }

        /* renamed from: m */
        public e m4145m(CharSequence charSequence) {
            this.f4224f = m4117e(charSequence);
            return this;
        }

        /* renamed from: n */
        public e m4146n(CharSequence charSequence) {
            this.f4223e = m4117e(charSequence);
            return this;
        }

        /* renamed from: o */
        public e m4147o(int i10) {
            Notification notification = this.f4215R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: p */
        public e m4148p(PendingIntent pendingIntent) {
            this.f4215R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: r */
        public e m4149r(PendingIntent pendingIntent, boolean z10) {
            this.f4226h = pendingIntent;
            m4119q(RecognitionOptions.ITF, z10);
            return this;
        }

        /* renamed from: s */
        public e m4150s(String str) {
            this.f4241w = str;
            return this;
        }

        /* renamed from: t */
        public e m4151t(int i10) {
            this.f4212O = i10;
            return this;
        }

        /* renamed from: u */
        public e m4152u(boolean z10) {
            this.f4242x = z10;
            return this;
        }

        /* renamed from: v */
        public e m4153v(Bitmap bitmap) {
            this.f4228j = m4118f(bitmap);
            return this;
        }

        /* renamed from: w */
        public e m4154w(int i10, int i11, int i12) {
            Notification notification = this.f4215R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: x */
        public e m4155x(boolean z10) {
            this.f4244z = z10;
            return this;
        }

        /* renamed from: y */
        public e m4156y(int i10) {
            this.f4230l = i10;
            return this;
        }

        /* renamed from: z */
        public e m4157z(boolean z10) {
            m4119q(2, z10);
            return this;
        }
    }

    /* renamed from: androidx.core.app.o$f */
    /* loaded from: classes.dex */
    public static class f extends j {

        /* renamed from: e */
        private int f4245e;

        /* renamed from: f */
        private C0832s1 f4246f;

        /* renamed from: g */
        private PendingIntent f4247g;

        /* renamed from: h */
        private PendingIntent f4248h;

        /* renamed from: i */
        private PendingIntent f4249i;

        /* renamed from: j */
        private boolean f4250j;

        /* renamed from: k */
        private Integer f4251k;

        /* renamed from: l */
        private Integer f4252l;

        /* renamed from: m */
        private IconCompat f4253m;

        /* renamed from: n */
        private CharSequence f4254n;

        /* renamed from: androidx.core.app.o$f$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static void m4170a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.o$f$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            static Notification.Builder m4171a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            /* renamed from: b */
            static Notification.Action.Builder m4172b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            /* renamed from: c */
            static Notification.Action.Builder m4173c(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            /* renamed from: d */
            static Notification.Action m4174d(Notification.Action.Builder builder) {
                return builder.build();
            }

            /* renamed from: e */
            static Notification.Action.Builder m4175e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.o$f$c */
        /* loaded from: classes.dex */
        static class c {
            /* renamed from: a */
            static Notification.Builder m4176a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            /* renamed from: b */
            static Notification.Builder m4177b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.o$f$d */
        /* loaded from: classes.dex */
        public static class d {
            /* renamed from: a */
            static Notification.Action.Builder m4178a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            /* renamed from: b */
            static void m4179b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.o$f$e */
        /* loaded from: classes.dex */
        public static class e {
            /* renamed from: a */
            static Notification.Builder m4180a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            /* renamed from: b */
            static Notification.Action.Builder m4181b(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* renamed from: androidx.core.app.o$f$f, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C13159f {
            /* renamed from: a */
            static Notification.Builder m4182a(Notification.Builder builder, Person person) {
                Notification.Builder addPerson;
                addPerson = builder.addPerson(person);
                return addPerson;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.o$f$g */
        /* loaded from: classes.dex */
        public static class g {
            /* renamed from: a */
            static Notification.CallStyle m4183a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forIncomingCall;
                forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
                return forIncomingCall;
            }

            /* renamed from: b */
            static Notification.CallStyle m4184b(Person person, PendingIntent pendingIntent) {
                Notification.CallStyle forOngoingCall;
                forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
                return forOngoingCall;
            }

            /* renamed from: c */
            static Notification.CallStyle m4185c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forScreeningCall;
                forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
                return forScreeningCall;
            }

            /* renamed from: d */
            static Notification.CallStyle m4186d(Notification.CallStyle callStyle, int i10) {
                Notification.CallStyle answerButtonColorHint;
                answerButtonColorHint = callStyle.setAnswerButtonColorHint(i10);
                return answerButtonColorHint;
            }

            /* renamed from: e */
            static Notification.Action.Builder m4187e(Notification.Action.Builder builder, boolean z10) {
                Notification.Action.Builder authenticationRequired;
                authenticationRequired = builder.setAuthenticationRequired(z10);
                return authenticationRequired;
            }

            /* renamed from: f */
            static Notification.CallStyle m4188f(Notification.CallStyle callStyle, int i10) {
                Notification.CallStyle declineButtonColorHint;
                declineButtonColorHint = callStyle.setDeclineButtonColorHint(i10);
                return declineButtonColorHint;
            }

            /* renamed from: g */
            static Notification.CallStyle m4189g(Notification.CallStyle callStyle, boolean z10) {
                Notification.CallStyle isVideo;
                isVideo = callStyle.setIsVideo(z10);
                return isVideo;
            }

            /* renamed from: h */
            static Notification.CallStyle m4190h(Notification.CallStyle callStyle, Icon icon) {
                Notification.CallStyle verificationIcon;
                verificationIcon = callStyle.setVerificationIcon(icon);
                return verificationIcon;
            }

            /* renamed from: i */
            static Notification.CallStyle m4191i(Notification.CallStyle callStyle, CharSequence charSequence) {
                Notification.CallStyle verificationText;
                verificationText = callStyle.setVerificationText(charSequence);
                return verificationText;
            }
        }

        /* renamed from: n */
        private static Notification.Action m4163n(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat m4077d = aVar.m4077d();
            Notification.Action.Builder m4178a = d.m4178a(m4077d == null ? null : m4077d.m4521u(), aVar.m4081h(), aVar.m4074a());
            Bundle bundle = aVar.m4076c() != null ? new Bundle(aVar.m4076c()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m4075b());
            e.m4181b(m4178a, aVar.m4075b());
            if (i10 >= 31) {
                g.m4187e(m4178a, aVar.m4082i());
            }
            b.m4172b(m4178a, bundle);
            C0838u1[] m4078e = aVar.m4078e();
            if (m4078e != null) {
                for (RemoteInput remoteInput : C0838u1.m4318b(m4078e)) {
                    b.m4173c(m4178a, remoteInput);
                }
            }
            return b.m4174d(m4178a);
        }

        /* renamed from: p */
        private String m4164p() {
            Resources resources;
            int i10;
            int i11 = this.f4245e;
            if (i11 == 1) {
                resources = this.f4267a.f4219a.getResources();
                i10 = C10222f.f25314e;
            } else if (i11 == 2) {
                resources = this.f4267a.f4219a.getResources();
                i10 = C10222f.f25315f;
            } else {
                if (i11 != 3) {
                    return null;
                }
                resources = this.f4267a.f4219a.getResources();
                i10 = C10222f.f25316g;
            }
            return resources.getString(i10);
        }

        /* renamed from: q */
        private boolean m4165q(a aVar) {
            return aVar != null && aVar.m4076c().getBoolean("key_action_priority");
        }

        /* renamed from: r */
        private a m4166r(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C0854a.getColor(this.f4267a.f4219a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f4267a.f4219a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a m4086b = new a.C13157a(IconCompat.m4509j(this.f4267a.f4219a, i10), spannableStringBuilder, pendingIntent).m4086b();
            m4086b.m4076c().putBoolean("key_action_priority", true);
            return m4086b;
        }

        /* renamed from: s */
        private a m4167s() {
            int i10 = C10220d.f25263b;
            int i11 = C10220d.f25262a;
            PendingIntent pendingIntent = this.f4247g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f4250j;
            return m4166r(z10 ? i10 : i11, z10 ? C10222f.f25311b : C10222f.f25310a, this.f4251k, C10218b.f25258a, pendingIntent);
        }

        /* renamed from: t */
        private a m4168t() {
            int i10;
            Integer num;
            int i11;
            int i12 = C10220d.f25264c;
            PendingIntent pendingIntent = this.f4248h;
            if (pendingIntent == null) {
                i10 = C10222f.f25313d;
                num = this.f4252l;
                i11 = C10218b.f25259b;
                pendingIntent = this.f4249i;
            } else {
                i10 = C10222f.f25312c;
                num = this.f4252l;
                i11 = C10218b.f25259b;
            }
            return m4166r(i12, i10, num, i11, pendingIntent);
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: a */
        public void mo4108a(Bundle bundle) {
            String str;
            Parcelable m4268k;
            super.mo4108a(bundle);
            bundle.putInt("android.callType", this.f4245e);
            bundle.putBoolean("android.callIsVideo", this.f4250j);
            C0832s1 c0832s1 = this.f4246f;
            if (c0832s1 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    str = "android.callPerson";
                    m4268k = c0832s1.m4267j();
                } else {
                    str = "android.callPersonCompat";
                    m4268k = c0832s1.m4268k();
                }
                bundle.putParcelable(str, m4268k);
            }
            IconCompat iconCompat = this.f4253m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", iconCompat.m4522v(this.f4267a.f4219a));
            }
            bundle.putCharSequence("android.verificationText", this.f4254n);
            bundle.putParcelable("android.answerIntent", this.f4247g);
            bundle.putParcelable("android.declineIntent", this.f4248h);
            bundle.putParcelable("android.hangUpIntent", this.f4249i);
            Integer num = this.f4251k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f4252l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle m4183a = null;
            charSequence = null;
            if (i10 < 31) {
                Notification.Builder mo3975a = interfaceC0815n.mo3975a();
                C0832s1 c0832s1 = this.f4246f;
                mo3975a.setContentTitle(c0832s1 != null ? c0832s1.m4262e() : null);
                Bundle bundle = this.f4267a.f4201D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequence = this.f4267a.f4201D.getCharSequence("android.text");
                }
                if (charSequence == null) {
                    charSequence = m4164p();
                }
                mo3975a.setContentText(charSequence);
                C0832s1 c0832s12 = this.f4246f;
                if (c0832s12 != null) {
                    if (c0832s12.m4260c() != null) {
                        d.m4179b(mo3975a, this.f4246f.m4260c().m4522v(this.f4267a.f4219a));
                    }
                    if (i10 >= 28) {
                        C13159f.m4182a(mo3975a, this.f4246f.m4267j());
                    } else {
                        c.m4176a(mo3975a, this.f4246f.m4263f());
                    }
                }
                ArrayList<a> m4169o = m4169o();
                e.m4180a(mo3975a);
                Iterator<a> it = m4169o.iterator();
                while (it.hasNext()) {
                    b.m4171a(mo3975a, m4163n(it.next()));
                }
                c.m4177b(mo3975a, "call");
                return;
            }
            int i11 = this.f4245e;
            if (i11 == 1) {
                m4183a = g.m4183a(this.f4246f.m4267j(), this.f4248h, this.f4247g);
            } else if (i11 == 2) {
                m4183a = g.m4184b(this.f4246f.m4267j(), this.f4249i);
            } else if (i11 == 3) {
                m4183a = g.m4185c(this.f4246f.m4267j(), this.f4249i, this.f4247g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f4245e));
            }
            if (m4183a != null) {
                e.m4180a(interfaceC0815n.mo3975a());
                a.m4170a(m4183a, interfaceC0815n.mo3975a());
                Integer num = this.f4251k;
                if (num != null) {
                    g.m4186d(m4183a, num.intValue());
                }
                Integer num2 = this.f4252l;
                if (num2 != null) {
                    g.m4188f(m4183a, num2.intValue());
                }
                g.m4191i(m4183a, this.f4254n);
                IconCompat iconCompat = this.f4253m;
                if (iconCompat != null) {
                    g.m4190h(m4183a, iconCompat.m4522v(this.f4267a.f4219a));
                }
                g.m4189g(m4183a, this.f4250j);
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
        @Override // androidx.core.app.C0818o.j
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void mo4094l(android.os.Bundle r4) {
            /*
                r3 = this;
                super.mo4094l(r4)
                java.lang.String r0 = "android.callType"
                int r0 = r4.getInt(r0)
                r3.f4245e = r0
                java.lang.String r0 = "android.callIsVideo"
                boolean r0 = r4.getBoolean(r0)
                r3.f4250j = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L2c
                java.lang.String r0 = "android.callPerson"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L2c
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.Person r0 = (android.app.Person) r0
                androidx.core.app.s1 r0 = androidx.core.app.C0832s1.m4258a(r0)
                goto L3c
            L2c:
                java.lang.String r0 = "android.callPersonCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L3e
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.app.s1 r0 = androidx.core.app.C0832s1.m4259b(r0)
            L3c:
                r3.f4246f = r0
            L3e:
                java.lang.String r0 = "android.verificationIcon"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L51
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m4501b(r0)
                goto L61
            L51:
                java.lang.String r0 = "android.verificationIconCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L63
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m4500a(r0)
            L61:
                r3.f4253m = r0
            L63:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r0 = r4.getCharSequence(r0)
                r3.f4254n = r0
                java.lang.String r0 = "android.answerIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f4247g = r0
                java.lang.String r0 = "android.declineIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f4248h = r0
                java.lang.String r0 = "android.hangUpIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f4249i = r0
                java.lang.String r0 = "android.answerColor"
                boolean r1 = r4.containsKey(r0)
                r2 = 0
                if (r1 == 0) goto L9b
                int r0 = r4.getInt(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L9c
            L9b:
                r0 = r2
            L9c:
                r3.f4251k = r0
                java.lang.String r0 = "android.declineColor"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto Lae
                int r4 = r4.getInt(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            Lae:
                r3.f4252l = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0818o.f.mo4094l(android.os.Bundle):void");
        }

        /* renamed from: o */
        public ArrayList<a> m4169o() {
            a m4168t = m4168t();
            a m4167s = m4167s();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m4168t);
            ArrayList<a> arrayList2 = this.f4267a.f4220b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.m4083j()) {
                        arrayList.add(aVar);
                    } else if (!m4165q(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (m4167s != null && i10 == 1) {
                        arrayList.add(m4167s);
                        i10--;
                    }
                }
            }
            if (m4167s != null && i10 >= 1) {
                arrayList.add(m4167s);
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.core.app.o$g */
    /* loaded from: classes.dex */
    public static class g extends j {

        /* renamed from: androidx.core.app.o$g$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static Notification.Builder m4195a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* renamed from: androidx.core.app.o$g$b */
        /* loaded from: classes.dex */
        static class b {
            /* renamed from: a */
            static Notification.DecoratedCustomViewStyle m4196a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            a.m4195a(interfaceC0815n.mo3975a(), b.m4196a());
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: i */
        public RemoteViews mo4192i(InterfaceC0815n interfaceC0815n) {
            return null;
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: j */
        public RemoteViews mo4193j(InterfaceC0815n interfaceC0815n) {
            return null;
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: k */
        public RemoteViews mo4194k(InterfaceC0815n interfaceC0815n) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.o$h */
    /* loaded from: classes.dex */
    public static class h extends j {

        /* renamed from: e */
        private ArrayList<CharSequence> f4255e = new ArrayList<>();

        /* renamed from: androidx.core.app.o$h$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static Notification.InboxStyle m4200a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            /* renamed from: b */
            static Notification.InboxStyle m4201b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            /* renamed from: c */
            static Notification.InboxStyle m4202c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.InboxStyle m4203d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            Notification.InboxStyle m4202c = a.m4202c(a.m4201b(interfaceC0815n.mo3975a()), this.f4268b);
            if (this.f4270d) {
                a.m4203d(m4202c, this.f4269c);
            }
            Iterator<CharSequence> it = this.f4255e.iterator();
            while (it.hasNext()) {
                a.m4200a(m4202c, it.next());
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: l */
        protected void mo4094l(Bundle bundle) {
            super.mo4094l(bundle);
            this.f4255e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f4255e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        /* renamed from: n */
        public h m4197n(CharSequence charSequence) {
            if (charSequence != null) {
                this.f4255e.add(e.m4117e(charSequence));
            }
            return this;
        }

        /* renamed from: o */
        public h m4198o(CharSequence charSequence) {
            this.f4268b = e.m4117e(charSequence);
            return this;
        }

        /* renamed from: p */
        public h m4199p(CharSequence charSequence) {
            this.f4269c = e.m4117e(charSequence);
            this.f4270d = true;
            return this;
        }
    }

    /* renamed from: androidx.core.app.o$i */
    /* loaded from: classes.dex */
    public static class i extends j {

        /* renamed from: e */
        private final List<e> f4256e = new ArrayList();

        /* renamed from: f */
        private final List<e> f4257f = new ArrayList();

        /* renamed from: g */
        private C0832s1 f4258g;

        /* renamed from: h */
        private CharSequence f4259h;

        /* renamed from: i */
        private Boolean f4260i;

        /* renamed from: androidx.core.app.o$i$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static Notification.BigTextStyle m4212a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m4213b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m4214c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m4215d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* renamed from: androidx.core.app.o$i$b */
        /* loaded from: classes.dex */
        static class b {
            /* renamed from: a */
            static Notification.MessagingStyle m4216a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            /* renamed from: b */
            static Notification.MessagingStyle m4217b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            /* renamed from: c */
            static Notification.MessagingStyle m4218c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: androidx.core.app.o$i$c */
        /* loaded from: classes.dex */
        static class c {
            /* renamed from: a */
            static Notification.MessagingStyle m4219a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                Notification.MessagingStyle addHistoricMessage;
                addHistoricMessage = messagingStyle.addHistoricMessage(message);
                return addHistoricMessage;
            }
        }

        /* renamed from: androidx.core.app.o$i$d */
        /* loaded from: classes.dex */
        static class d {
            /* renamed from: a */
            static Notification.MessagingStyle m4220a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            /* renamed from: b */
            static Notification.MessagingStyle m4221b(Notification.MessagingStyle messagingStyle, boolean z10) {
                Notification.MessagingStyle groupConversation;
                groupConversation = messagingStyle.setGroupConversation(z10);
                return groupConversation;
            }
        }

        /* renamed from: androidx.core.app.o$i$e */
        /* loaded from: classes.dex */
        public static final class e {

            /* renamed from: a */
            private final CharSequence f4261a;

            /* renamed from: b */
            private final long f4262b;

            /* renamed from: c */
            private final C0832s1 f4263c;

            /* renamed from: d */
            private Bundle f4264d = new Bundle();

            /* renamed from: e */
            private String f4265e;

            /* renamed from: f */
            private Uri f4266f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.o$i$e$a */
            /* loaded from: classes.dex */
            public static class a {
                /* renamed from: a */
                static Notification.MessagingStyle.Message m4234a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                /* renamed from: b */
                static Notification.MessagingStyle.Message m4235b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.app.o$i$e$b */
            /* loaded from: classes.dex */
            public static class b {
                /* renamed from: a */
                static Notification.MessagingStyle.Message m4236a(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public e(CharSequence charSequence, long j10, C0832s1 c0832s1) {
                this.f4261a = charSequence;
                this.f4262b = j10;
                this.f4263c = c0832s1;
            }

            /* renamed from: a */
            static Bundle[] m4222a(List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m4225l();
                }
                return bundleArr;
            }

            /* renamed from: e */
            static e m4223e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? C0832s1.m4259b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new C0832s1.b().m4276f(bundle.getCharSequence("sender")).m4271a() : null : C0832s1.m4258a((Person) bundle.getParcelable("sender_person")));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            eVar.m4232j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            eVar.m4228d().putAll(bundle.getBundle("extras"));
                        }
                        return eVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            /* renamed from: f */
            static List<e> m4224f(Parcelable[] parcelableArr) {
                e m4223e;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (m4223e = m4223e((Bundle) parcelable)) != null) {
                        arrayList.add(m4223e);
                    }
                }
                return arrayList;
            }

            /* renamed from: l */
            private Bundle m4225l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f4261a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f4262b);
                C0832s1 c0832s1 = this.f4263c;
                if (c0832s1 != null) {
                    bundle.putCharSequence("sender", c0832s1.m4262e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f4263c.m4267j());
                    } else {
                        bundle.putBundle("person", this.f4263c.m4268k());
                    }
                }
                String str = this.f4265e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f4266f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f4264d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* renamed from: b */
            public String m4226b() {
                return this.f4265e;
            }

            /* renamed from: c */
            public Uri m4227c() {
                return this.f4266f;
            }

            /* renamed from: d */
            public Bundle m4228d() {
                return this.f4264d;
            }

            /* renamed from: g */
            public C0832s1 m4229g() {
                return this.f4263c;
            }

            /* renamed from: h */
            public CharSequence m4230h() {
                return this.f4261a;
            }

            /* renamed from: i */
            public long m4231i() {
                return this.f4262b;
            }

            /* renamed from: j */
            public e m4232j(String str, Uri uri) {
                this.f4265e = str;
                this.f4266f = uri;
                return this;
            }

            /* renamed from: k */
            Notification.MessagingStyle.Message m4233k() {
                Notification.MessagingStyle.Message m4234a;
                C0832s1 m4229g = m4229g();
                if (Build.VERSION.SDK_INT >= 28) {
                    m4234a = b.m4236a(m4230h(), m4231i(), m4229g != null ? m4229g.m4267j() : null);
                } else {
                    m4234a = a.m4234a(m4230h(), m4231i(), m4229g != null ? m4229g.m4262e() : null);
                }
                if (m4226b() != null) {
                    a.m4235b(m4234a, m4226b(), m4227c());
                }
                return m4234a;
            }
        }

        i() {
        }

        public i(C0832s1 c0832s1) {
            if (TextUtils.isEmpty(c0832s1.m4262e())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f4258g = c0832s1;
        }

        /* renamed from: o */
        public static i m4204o(Notification notification) {
            j m4241g = j.m4241g(notification);
            if (m4241g instanceof i) {
                return (i) m4241g;
            }
            return null;
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: a */
        public void mo4108a(Bundle bundle) {
            super.mo4108a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f4258g.m4262e());
            bundle.putBundle("android.messagingStyleUser", this.f4258g.m4268k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f4259h);
            if (this.f4259h != null && this.f4260i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f4259h);
            }
            if (!this.f4256e.isEmpty()) {
                bundle.putParcelableArray("android.messages", e.m4222a(this.f4256e));
            }
            if (!this.f4257f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", e.m4222a(this.f4257f));
            }
            Boolean bool = this.f4260i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: b */
        public void mo4092b(InterfaceC0815n interfaceC0815n) {
            m4211u(m4209s());
            Notification.MessagingStyle m4220a = Build.VERSION.SDK_INT >= 28 ? d.m4220a(this.f4258g.m4267j()) : b.m4217b(this.f4258g.m4262e());
            Iterator<e> it = this.f4256e.iterator();
            while (it.hasNext()) {
                b.m4216a(m4220a, it.next().m4233k());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<e> it2 = this.f4257f.iterator();
                while (it2.hasNext()) {
                    c.m4219a(m4220a, it2.next().m4233k());
                }
            }
            if (this.f4260i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                b.m4218c(m4220a, this.f4259h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                d.m4221b(m4220a, this.f4260i.booleanValue());
            }
            a.m4215d(m4220a, interfaceC0815n.mo3975a());
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: h */
        protected String mo4093h() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.C0818o.j
        /* renamed from: l */
        protected void mo4094l(Bundle bundle) {
            super.mo4094l(bundle);
            this.f4256e.clear();
            this.f4258g = bundle.containsKey("android.messagingStyleUser") ? C0832s1.m4259b(bundle.getBundle("android.messagingStyleUser")) : new C0832s1.b().m4276f(bundle.getString("android.selfDisplayName")).m4271a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f4259h = charSequence;
            if (charSequence == null) {
                this.f4259h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f4256e.addAll(e.m4224f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f4257f.addAll(e.m4224f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f4260i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        /* renamed from: n */
        public i m4205n(e eVar) {
            if (eVar != null) {
                this.f4256e.add(eVar);
                if (this.f4256e.size() > 25) {
                    this.f4256e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: p */
        public CharSequence m4206p() {
            return this.f4259h;
        }

        /* renamed from: q */
        public List<e> m4207q() {
            return this.f4256e;
        }

        /* renamed from: r */
        public C0832s1 m4208r() {
            return this.f4258g;
        }

        /* renamed from: s */
        public boolean m4209s() {
            e eVar = this.f4267a;
            if (eVar != null && eVar.f4219a.getApplicationInfo().targetSdkVersion < 28 && this.f4260i == null) {
                return this.f4259h != null;
            }
            Boolean bool = this.f4260i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: t */
        public i m4210t(CharSequence charSequence) {
            this.f4259h = charSequence;
            return this;
        }

        /* renamed from: u */
        public i m4211u(boolean z10) {
            this.f4260i = Boolean.valueOf(z10);
            return this;
        }
    }

    /* renamed from: androidx.core.app.o$j */
    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        protected e f4267a;

        /* renamed from: b */
        CharSequence f4268b;

        /* renamed from: c */
        CharSequence f4269c;

        /* renamed from: d */
        boolean f4270d = false;

        /* renamed from: c */
        static j m4237c(String str) {
            if (str == null) {
                return null;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new g();
                case 1:
                    return new b();
                case 2:
                    return new f();
                case 3:
                    return new h();
                case 4:
                    return new c();
                case 5:
                    return new i();
                default:
                    return null;
            }
        }

        /* renamed from: d */
        private static j m4238d(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new i();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new g();
            }
            return null;
        }

        /* renamed from: e */
        static j m4239e(Bundle bundle) {
            j m4237c = m4237c(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return m4237c != null ? m4237c : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : m4238d(bundle.getString("android.template"));
        }

        /* renamed from: f */
        static j m4240f(Bundle bundle) {
            j m4239e = m4239e(bundle);
            if (m4239e == null) {
                return null;
            }
            try {
                m4239e.mo4094l(bundle);
                return m4239e;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public static j m4241g(Notification notification) {
            Bundle m4073a = C0818o.m4073a(notification);
            if (m4073a == null) {
                return null;
            }
            return m4240f(m4073a);
        }

        /* renamed from: a */
        public void mo4108a(Bundle bundle) {
            if (this.f4270d) {
                bundle.putCharSequence("android.summaryText", this.f4269c);
            }
            CharSequence charSequence = this.f4268b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo4093h = mo4093h();
            if (mo4093h != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo4093h);
            }
        }

        /* renamed from: b */
        public abstract void mo4092b(InterfaceC0815n interfaceC0815n);

        /* renamed from: h */
        protected String mo4093h() {
            return null;
        }

        /* renamed from: i */
        public RemoteViews mo4192i(InterfaceC0815n interfaceC0815n) {
            return null;
        }

        /* renamed from: j */
        public RemoteViews mo4193j(InterfaceC0815n interfaceC0815n) {
            return null;
        }

        /* renamed from: k */
        public RemoteViews mo4194k(InterfaceC0815n interfaceC0815n) {
            return null;
        }

        /* renamed from: l */
        protected void mo4094l(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f4269c = bundle.getCharSequence("android.summaryText");
                this.f4270d = true;
            }
            this.f4268b = bundle.getCharSequence("android.title.big");
        }

        /* renamed from: m */
        public void m4242m(e eVar) {
            if (this.f4267a != eVar) {
                this.f4267a = eVar;
                if (eVar != null) {
                    eVar.m4127H(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m4073a(Notification notification) {
        return notification.extras;
    }
}
