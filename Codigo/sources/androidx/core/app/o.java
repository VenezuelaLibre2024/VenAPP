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
import androidx.core.app.s1;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class o {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f3519a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f3520b;

        /* renamed from: c, reason: collision with root package name */
        private final u1[] f3521c;

        /* renamed from: d, reason: collision with root package name */
        private final u1[] f3522d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3523e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3524f;

        /* renamed from: g, reason: collision with root package name */
        private final int f3525g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f3526h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f3527i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f3528j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f3529k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3530l;

        /* renamed from: androidx.core.app.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0038a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f3531a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f3532b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f3533c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f3534d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f3535e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<u1> f3536f;

            /* renamed from: g, reason: collision with root package name */
            private int f3537g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f3538h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f3539i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f3540j;

            public C0038a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0038a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u1[] u1VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f3534d = true;
                this.f3538h = true;
                this.f3531a = iconCompat;
                this.f3532b = e.e(charSequence);
                this.f3533c = pendingIntent;
                this.f3535e = bundle;
                this.f3536f = u1VarArr == null ? null : new ArrayList<>(Arrays.asList(u1VarArr));
                this.f3534d = z10;
                this.f3537g = i10;
                this.f3538h = z11;
                this.f3539i = z12;
                this.f3540j = z13;
            }

            private void c() {
                if (this.f3539i && this.f3533c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0038a a(u1 u1Var) {
                if (this.f3536f == null) {
                    this.f3536f = new ArrayList<>();
                }
                if (u1Var != null) {
                    this.f3536f.add(u1Var);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<u1> arrayList3 = this.f3536f;
                if (arrayList3 != null) {
                    Iterator<u1> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        u1 next = it.next();
                        if (next.k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                u1[] u1VarArr = arrayList.isEmpty() ? null : (u1[]) arrayList.toArray(new u1[arrayList.size()]);
                return new a(this.f3531a, this.f3532b, this.f3533c, this.f3535e, arrayList2.isEmpty() ? null : (u1[]) arrayList2.toArray(new u1[arrayList2.size()]), u1VarArr, this.f3534d, this.f3537g, this.f3538h, this.f3539i, this.f3540j);
            }

            public C0038a d(boolean z10) {
                this.f3534d = z10;
                return this;
            }

            public C0038a e(boolean z10) {
                this.f3539i = z10;
                return this;
            }

            public C0038a f(boolean z10) {
                this.f3538h = z10;
                return this;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.k(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u1[] u1VarArr, u1[] u1VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f3524f = true;
            this.f3520b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.f3527i = iconCompat.m();
            }
            this.f3528j = e.e(charSequence);
            this.f3529k = pendingIntent;
            this.f3519a = bundle == null ? new Bundle() : bundle;
            this.f3521c = u1VarArr;
            this.f3522d = u1VarArr2;
            this.f3523e = z10;
            this.f3525g = i10;
            this.f3524f = z11;
            this.f3526h = z12;
            this.f3530l = z13;
        }

        public PendingIntent a() {
            return this.f3529k;
        }

        public boolean b() {
            return this.f3523e;
        }

        public Bundle c() {
            return this.f3519a;
        }

        public IconCompat d() {
            int i10;
            if (this.f3520b == null && (i10 = this.f3527i) != 0) {
                this.f3520b = IconCompat.k(null, "", i10);
            }
            return this.f3520b;
        }

        public u1[] e() {
            return this.f3521c;
        }

        public int f() {
            return this.f3525g;
        }

        public boolean g() {
            return this.f3524f;
        }

        public CharSequence h() {
            return this.f3528j;
        }

        public boolean i() {
            return this.f3530l;
        }

        public boolean j() {
            return this.f3526h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f3541e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f3542f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3543g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f3544h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f3545i;

        /* loaded from: classes.dex */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.o$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0039b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        private static IconCompat n(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat q(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? n(parcelable) : n(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c10 = a.c(a.b(nVar.a()), this.f3596b);
            IconCompat iconCompat = this.f3541e;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.a(c10, this.f3541e.v(nVar instanceof f0 ? ((f0) nVar).f() : null));
                } else if (iconCompat.o() == 1) {
                    c10 = a.a(c10, this.f3541e.l());
                }
            }
            if (this.f3543g) {
                if (this.f3542f == null) {
                    a.d(c10, null);
                } else {
                    C0039b.a(c10, this.f3542f.v(nVar instanceof f0 ? ((f0) nVar).f() : null));
                }
            }
            if (this.f3598d) {
                a.e(c10, this.f3597c);
            }
            if (i10 >= 31) {
                c.c(c10, this.f3545i);
                c.b(c10, this.f3544h);
            }
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.o.j
        protected void l(Bundle bundle) {
            super.l(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f3542f = n(bundle.getParcelable("android.largeIcon.big"));
                this.f3543g = true;
            }
            this.f3541e = q(bundle);
            this.f3545i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public b o(Bitmap bitmap) {
            this.f3542f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f3543g = true;
            return this;
        }

        public b p(Bitmap bitmap) {
            this.f3541e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        public b r(CharSequence charSequence) {
            this.f3596b = e.e(charSequence);
            return this;
        }

        public b s(CharSequence charSequence) {
            this.f3597c = e.e(charSequence);
            this.f3598d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f3546e;

        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.o.j
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            Notification.BigTextStyle a10 = a.a(a.c(a.b(nVar.a()), this.f3596b), this.f3546e);
            if (this.f3598d) {
                a.d(a10, this.f3597c);
            }
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.o.j
        protected void l(Bundle bundle) {
            super.l(bundle);
            this.f3546e = bundle.getCharSequence("android.bigText");
        }

        public c n(CharSequence charSequence) {
            this.f3546e = e.e(charSequence);
            return this;
        }

        public c o(CharSequence charSequence) {
            this.f3596b = e.e(charSequence);
            return this;
        }

        public c p(CharSequence charSequence) {
            this.f3597c = e.e(charSequence);
            this.f3598d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* renamed from: a, reason: collision with root package name */
        public Context f3547a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f3548b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<s1> f3549c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f3550d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f3551e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f3552f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f3553g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f3554h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f3555i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f3556j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f3557k;

        /* renamed from: l, reason: collision with root package name */
        int f3558l;

        /* renamed from: m, reason: collision with root package name */
        int f3559m;

        /* renamed from: n, reason: collision with root package name */
        boolean f3560n;

        /* renamed from: o, reason: collision with root package name */
        boolean f3561o;

        /* renamed from: p, reason: collision with root package name */
        j f3562p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f3563q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f3564r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f3565s;

        /* renamed from: t, reason: collision with root package name */
        int f3566t;

        /* renamed from: u, reason: collision with root package name */
        int f3567u;

        /* renamed from: v, reason: collision with root package name */
        boolean f3568v;

        /* renamed from: w, reason: collision with root package name */
        String f3569w;

        /* renamed from: x, reason: collision with root package name */
        boolean f3570x;

        /* renamed from: y, reason: collision with root package name */
        String f3571y;

        /* renamed from: z, reason: collision with root package name */
        boolean f3572z;

        /* loaded from: classes.dex */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f3548b = new ArrayList<>();
            this.f3549c = new ArrayList<>();
            this.f3550d = new ArrayList<>();
            this.f3560n = true;
            this.f3572z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f3547a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f3559m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3547a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(q0.c.f23314b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(q0.c.f23313a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        private void q(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public e A(boolean z10) {
            q(8, z10);
            return this;
        }

        public e B(int i10) {
            this.f3559m = i10;
            return this;
        }

        public e C(int i10, int i11, boolean z10) {
            this.f3566t = i10;
            this.f3567u = i11;
            this.f3568v = z10;
            return this;
        }

        public e D(String str) {
            this.M = str;
            return this;
        }

        public e E(boolean z10) {
            this.f3560n = z10;
            return this;
        }

        public e F(int i10) {
            this.R.icon = i10;
            return this;
        }

        public e G(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e10 = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(e10);
            return this;
        }

        public e H(j jVar) {
            if (this.f3562p != jVar) {
                this.f3562p = jVar;
                if (jVar != null) {
                    jVar.m(this);
                }
            }
            return this;
        }

        public e I(CharSequence charSequence) {
            this.f3563q = e(charSequence);
            return this;
        }

        public e J(CharSequence charSequence) {
            this.R.tickerText = e(charSequence);
            return this;
        }

        public e K(long j10) {
            this.N = j10;
            return this;
        }

        public e L(boolean z10) {
            this.f3561o = z10;
            return this;
        }

        public e M(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e N(int i10) {
            this.F = i10;
            return this;
        }

        public e O(long j10) {
            this.R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3548b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f3548b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new f0(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e g(boolean z10) {
            q(16, z10);
            return this;
        }

        public e h(String str) {
            this.C = str;
            return this;
        }

        public e i(String str) {
            this.K = str;
            return this;
        }

        public e j(int i10) {
            this.E = i10;
            return this;
        }

        public e k(boolean z10) {
            this.A = z10;
            this.B = true;
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f3553g = pendingIntent;
            return this;
        }

        public e m(CharSequence charSequence) {
            this.f3552f = e(charSequence);
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f3551e = e(charSequence);
            return this;
        }

        public e o(int i10) {
            Notification notification = this.R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e p(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e r(PendingIntent pendingIntent, boolean z10) {
            this.f3554h = pendingIntent;
            q(RecognitionOptions.ITF, z10);
            return this;
        }

        public e s(String str) {
            this.f3569w = str;
            return this;
        }

        public e t(int i10) {
            this.O = i10;
            return this;
        }

        public e u(boolean z10) {
            this.f3570x = z10;
            return this;
        }

        public e v(Bitmap bitmap) {
            this.f3556j = f(bitmap);
            return this;
        }

        public e w(int i10, int i11, int i12) {
            Notification notification = this.R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e x(boolean z10) {
            this.f3572z = z10;
            return this;
        }

        public e y(int i10) {
            this.f3558l = i10;
            return this;
        }

        public e z(boolean z10) {
            q(2, z10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends j {

        /* renamed from: e, reason: collision with root package name */
        private int f3573e;

        /* renamed from: f, reason: collision with root package name */
        private s1 f3574f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f3575g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f3576h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f3577i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3578j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f3579k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f3580l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f3581m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f3582n;

        /* loaded from: classes.dex */
        static class a {
            static void a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class b {
            static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action d(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        /* loaded from: classes.dex */
        static class c {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class d {
            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class e {
            static Notification.Builder a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* renamed from: androidx.core.app.o$f$f, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0040f {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                Notification.Builder addPerson;
                addPerson = builder.addPerson(person);
                return addPerson;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class g {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forIncomingCall;
                forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
                return forIncomingCall;
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                Notification.CallStyle forOngoingCall;
                forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
                return forOngoingCall;
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                Notification.CallStyle forScreeningCall;
                forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
                return forScreeningCall;
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                Notification.CallStyle answerButtonColorHint;
                answerButtonColorHint = callStyle.setAnswerButtonColorHint(i10);
                return answerButtonColorHint;
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                Notification.Action.Builder authenticationRequired;
                authenticationRequired = builder.setAuthenticationRequired(z10);
                return authenticationRequired;
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, int i10) {
                Notification.CallStyle declineButtonColorHint;
                declineButtonColorHint = callStyle.setDeclineButtonColorHint(i10);
                return declineButtonColorHint;
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                Notification.CallStyle isVideo;
                isVideo = callStyle.setIsVideo(z10);
                return isVideo;
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                Notification.CallStyle verificationIcon;
                verificationIcon = callStyle.setVerificationIcon(icon);
                return verificationIcon;
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                Notification.CallStyle verificationText;
                verificationText = callStyle.setVerificationText(charSequence);
                return verificationText;
            }
        }

        private static Notification.Action n(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat d10 = aVar.d();
            Notification.Action.Builder a10 = d.a(d10 == null ? null : d10.u(), aVar.h(), aVar.a());
            Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            e.b(a10, aVar.b());
            if (i10 >= 31) {
                g.e(a10, aVar.i());
            }
            b.b(a10, bundle);
            u1[] e10 = aVar.e();
            if (e10 != null) {
                for (RemoteInput remoteInput : u1.b(e10)) {
                    b.c(a10, remoteInput);
                }
            }
            return b.d(a10);
        }

        private String p() {
            Resources resources;
            int i10;
            int i11 = this.f3573e;
            if (i11 == 1) {
                resources = this.f3595a.f3547a.getResources();
                i10 = q0.f.f23348e;
            } else if (i11 == 2) {
                resources = this.f3595a.f3547a.getResources();
                i10 = q0.f.f23349f;
            } else {
                if (i11 != 3) {
                    return null;
                }
                resources = this.f3595a.f3547a.getResources();
                i10 = q0.f.f23350g;
            }
            return resources.getString(i10);
        }

        private boolean q(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a r(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.a.getColor(this.f3595a.f3547a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3595a.f3547a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a b10 = new a.C0038a(IconCompat.j(this.f3595a.f3547a, i10), spannableStringBuilder, pendingIntent).b();
            b10.c().putBoolean("key_action_priority", true);
            return b10;
        }

        private a s() {
            int i10 = q0.d.f23316b;
            int i11 = q0.d.f23315a;
            PendingIntent pendingIntent = this.f3575g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f3578j;
            return r(z10 ? i10 : i11, z10 ? q0.f.f23345b : q0.f.f23344a, this.f3579k, q0.b.f23311a, pendingIntent);
        }

        private a t() {
            int i10;
            Integer num;
            int i11;
            int i12 = q0.d.f23317c;
            PendingIntent pendingIntent = this.f3576h;
            if (pendingIntent == null) {
                i10 = q0.f.f23347d;
                num = this.f3580l;
                i11 = q0.b.f23312b;
                pendingIntent = this.f3577i;
            } else {
                i10 = q0.f.f23346c;
                num = this.f3580l;
                i11 = q0.b.f23312b;
            }
            return r(i12, i10, num, i11, pendingIntent);
        }

        @Override // androidx.core.app.o.j
        public void a(Bundle bundle) {
            String str;
            Parcelable k10;
            super.a(bundle);
            bundle.putInt("android.callType", this.f3573e);
            bundle.putBoolean("android.callIsVideo", this.f3578j);
            s1 s1Var = this.f3574f;
            if (s1Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    str = "android.callPerson";
                    k10 = s1Var.j();
                } else {
                    str = "android.callPersonCompat";
                    k10 = s1Var.k();
                }
                bundle.putParcelable(str, k10);
            }
            IconCompat iconCompat = this.f3581m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", iconCompat.v(this.f3595a.f3547a));
            }
            bundle.putCharSequence("android.verificationText", this.f3582n);
            bundle.putParcelable("android.answerIntent", this.f3575g);
            bundle.putParcelable("android.declineIntent", this.f3576h);
            bundle.putParcelable("android.hangUpIntent", this.f3577i);
            Integer num = this.f3579k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3580l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a10 = null;
            charSequence = null;
            if (i10 < 31) {
                Notification.Builder a11 = nVar.a();
                s1 s1Var = this.f3574f;
                a11.setContentTitle(s1Var != null ? s1Var.e() : null);
                Bundle bundle = this.f3595a.D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequence = this.f3595a.D.getCharSequence("android.text");
                }
                if (charSequence == null) {
                    charSequence = p();
                }
                a11.setContentText(charSequence);
                s1 s1Var2 = this.f3574f;
                if (s1Var2 != null) {
                    if (s1Var2.c() != null) {
                        d.b(a11, this.f3574f.c().v(this.f3595a.f3547a));
                    }
                    if (i10 >= 28) {
                        C0040f.a(a11, this.f3574f.j());
                    } else {
                        c.a(a11, this.f3574f.f());
                    }
                }
                ArrayList<a> o10 = o();
                e.a(a11);
                Iterator<a> it = o10.iterator();
                while (it.hasNext()) {
                    b.a(a11, n(it.next()));
                }
                c.b(a11, "call");
                return;
            }
            int i11 = this.f3573e;
            if (i11 == 1) {
                a10 = g.a(this.f3574f.j(), this.f3576h, this.f3575g);
            } else if (i11 == 2) {
                a10 = g.b(this.f3574f.j(), this.f3577i);
            } else if (i11 == 3) {
                a10 = g.c(this.f3574f.j(), this.f3577i, this.f3575g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3573e));
            }
            if (a10 != null) {
                e.a(nVar.a());
                a.a(a10, nVar.a());
                Integer num = this.f3579k;
                if (num != null) {
                    g.d(a10, num.intValue());
                }
                Integer num2 = this.f3580l;
                if (num2 != null) {
                    g.f(a10, num2.intValue());
                }
                g.i(a10, this.f3582n);
                IconCompat iconCompat = this.f3581m;
                if (iconCompat != null) {
                    g.h(a10, iconCompat.v(this.f3595a.f3547a));
                }
                g.g(a10, this.f3578j);
            }
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
        @Override // androidx.core.app.o.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void l(android.os.Bundle r4) {
            /*
                r3 = this;
                super.l(r4)
                java.lang.String r0 = "android.callType"
                int r0 = r4.getInt(r0)
                r3.f3573e = r0
                java.lang.String r0 = "android.callIsVideo"
                boolean r0 = r4.getBoolean(r0)
                r3.f3578j = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L2c
                java.lang.String r0 = "android.callPerson"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L2c
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.Person r0 = (android.app.Person) r0
                androidx.core.app.s1 r0 = androidx.core.app.s1.a(r0)
                goto L3c
            L2c:
                java.lang.String r0 = "android.callPersonCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L3e
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.app.s1 r0 = androidx.core.app.s1.b(r0)
            L3c:
                r3.f3574f = r0
            L3e:
                java.lang.String r0 = "android.verificationIcon"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L51
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)
                goto L61
            L51:
                java.lang.String r0 = "android.verificationIconCompat"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto L63
                android.os.Bundle r0 = r4.getBundle(r0)
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.a(r0)
            L61:
                r3.f3581m = r0
            L63:
                java.lang.String r0 = "android.verificationText"
                java.lang.CharSequence r0 = r4.getCharSequence(r0)
                r3.f3582n = r0
                java.lang.String r0 = "android.answerIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f3575g = r0
                java.lang.String r0 = "android.declineIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f3576h = r0
                java.lang.String r0 = "android.hangUpIntent"
                android.os.Parcelable r0 = r4.getParcelable(r0)
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r3.f3577i = r0
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
                r3.f3579k = r0
                java.lang.String r0 = "android.declineColor"
                boolean r1 = r4.containsKey(r0)
                if (r1 == 0) goto Lae
                int r4 = r4.getInt(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            Lae:
                r3.f3580l = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.o.f.l(android.os.Bundle):void");
        }

        public ArrayList<a> o() {
            a t10 = t();
            a s10 = s();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(t10);
            ArrayList<a> arrayList2 = this.f3595a.f3548b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!q(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (s10 != null && i10 == 1) {
                        arrayList.add(s10);
                        i10--;
                    }
                }
            }
            if (s10 != null && i10 >= 1) {
                arrayList.add(s10);
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends j {

        /* loaded from: classes.dex */
        static class a {
            static Notification.Builder a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        /* loaded from: classes.dex */
        static class b {
            static Notification.DecoratedCustomViewStyle a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            a.a(nVar.a(), b.a());
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.o.j
        public RemoteViews i(n nVar) {
            return null;
        }

        @Override // androidx.core.app.o.j
        public RemoteViews j(n nVar) {
            return null;
        }

        @Override // androidx.core.app.o.j
        public RemoteViews k(n nVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends j {

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f3583e = new ArrayList<>();

        /* loaded from: classes.dex */
        static class a {
            static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            Notification.InboxStyle c10 = a.c(a.b(nVar.a()), this.f3596b);
            if (this.f3598d) {
                a.d(c10, this.f3597c);
            }
            Iterator<CharSequence> it = this.f3583e.iterator();
            while (it.hasNext()) {
                a.a(c10, it.next());
            }
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.o.j
        protected void l(Bundle bundle) {
            super.l(bundle);
            this.f3583e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f3583e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public h n(CharSequence charSequence) {
            if (charSequence != null) {
                this.f3583e.add(e.e(charSequence));
            }
            return this;
        }

        public h o(CharSequence charSequence) {
            this.f3596b = e.e(charSequence);
            return this;
        }

        public h p(CharSequence charSequence) {
            this.f3597c = e.e(charSequence);
            this.f3598d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends j {

        /* renamed from: e, reason: collision with root package name */
        private final List<e> f3584e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<e> f3585f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private s1 f3586g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f3587h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f3588i;

        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        /* loaded from: classes.dex */
        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* loaded from: classes.dex */
        static class c {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                Notification.MessagingStyle addHistoricMessage;
                addHistoricMessage = messagingStyle.addHistoricMessage(message);
                return addHistoricMessage;
            }
        }

        /* loaded from: classes.dex */
        static class d {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                Notification.MessagingStyle groupConversation;
                groupConversation = messagingStyle.setGroupConversation(z10);
                return groupConversation;
            }
        }

        /* loaded from: classes.dex */
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f3589a;

            /* renamed from: b, reason: collision with root package name */
            private final long f3590b;

            /* renamed from: c, reason: collision with root package name */
            private final s1 f3591c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f3592d = new Bundle();

            /* renamed from: e, reason: collision with root package name */
            private String f3593e;

            /* renamed from: f, reason: collision with root package name */
            private Uri f3594f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public static class b {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public e(CharSequence charSequence, long j10, s1 s1Var) {
                this.f3589a = charSequence;
                this.f3590b = j10;
                this.f3591c = s1Var;
            }

            static Bundle[] a(List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).l();
                }
                return bundleArr;
            }

            static e e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? s1.b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new s1.b().f(bundle.getCharSequence("sender")).a() : null : s1.a((Person) bundle.getParcelable("sender_person")));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            eVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            eVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return eVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<e> f(Parcelable[] parcelableArr) {
                e e10;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e10 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e10);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3589a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f3590b);
                s1 s1Var = this.f3591c;
                if (s1Var != null) {
                    bundle.putCharSequence("sender", s1Var.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f3591c.j());
                    } else {
                        bundle.putBundle("person", this.f3591c.k());
                    }
                }
                String str = this.f3593e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3594f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3592d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f3593e;
            }

            public Uri c() {
                return this.f3594f;
            }

            public Bundle d() {
                return this.f3592d;
            }

            public s1 g() {
                return this.f3591c;
            }

            public CharSequence h() {
                return this.f3589a;
            }

            public long i() {
                return this.f3590b;
            }

            public e j(String str, Uri uri) {
                this.f3593e = str;
                this.f3594f = uri;
                return this;
            }

            Notification.MessagingStyle.Message k() {
                Notification.MessagingStyle.Message a10;
                s1 g10 = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    a10 = b.a(h(), i(), g10 != null ? g10.j() : null);
                } else {
                    a10 = a.a(h(), i(), g10 != null ? g10.e() : null);
                }
                if (b() != null) {
                    a.b(a10, b(), c());
                }
                return a10;
            }
        }

        i() {
        }

        public i(s1 s1Var) {
            if (TextUtils.isEmpty(s1Var.e())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f3586g = s1Var;
        }

        public static i o(Notification notification) {
            j g10 = j.g(notification);
            if (g10 instanceof i) {
                return (i) g10;
            }
            return null;
        }

        @Override // androidx.core.app.o.j
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f3586g.e());
            bundle.putBundle("android.messagingStyleUser", this.f3586g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f3587h);
            if (this.f3587h != null && this.f3588i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f3587h);
            }
            if (!this.f3584e.isEmpty()) {
                bundle.putParcelableArray("android.messages", e.a(this.f3584e));
            }
            if (!this.f3585f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", e.a(this.f3585f));
            }
            Boolean bool = this.f3588i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.o.j
        public void b(n nVar) {
            u(s());
            Notification.MessagingStyle a10 = Build.VERSION.SDK_INT >= 28 ? d.a(this.f3586g.j()) : b.b(this.f3586g.e());
            Iterator<e> it = this.f3584e.iterator();
            while (it.hasNext()) {
                b.a(a10, it.next().k());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<e> it2 = this.f3585f.iterator();
                while (it2.hasNext()) {
                    c.a(a10, it2.next().k());
                }
            }
            if (this.f3588i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                b.c(a10, this.f3587h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                d.b(a10, this.f3588i.booleanValue());
            }
            a.d(a10, nVar.a());
        }

        @Override // androidx.core.app.o.j
        protected String h() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.o.j
        protected void l(Bundle bundle) {
            super.l(bundle);
            this.f3584e.clear();
            this.f3586g = bundle.containsKey("android.messagingStyleUser") ? s1.b(bundle.getBundle("android.messagingStyleUser")) : new s1.b().f(bundle.getString("android.selfDisplayName")).a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f3587h = charSequence;
            if (charSequence == null) {
                this.f3587h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f3584e.addAll(e.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f3585f.addAll(e.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f3588i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public i n(e eVar) {
            if (eVar != null) {
                this.f3584e.add(eVar);
                if (this.f3584e.size() > 25) {
                    this.f3584e.remove(0);
                }
            }
            return this;
        }

        public CharSequence p() {
            return this.f3587h;
        }

        public List<e> q() {
            return this.f3584e;
        }

        public s1 r() {
            return this.f3586g;
        }

        public boolean s() {
            e eVar = this.f3595a;
            if (eVar != null && eVar.f3547a.getApplicationInfo().targetSdkVersion < 28 && this.f3588i == null) {
                return this.f3587h != null;
            }
            Boolean bool = this.f3588i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public i t(CharSequence charSequence) {
            this.f3587h = charSequence;
            return this;
        }

        public i u(boolean z10) {
            this.f3588i = Boolean.valueOf(z10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        protected e f3595a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f3596b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f3597c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3598d = false;

        static j c(String str) {
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

        private static j d(String str) {
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

        static j e(Bundle bundle) {
            j c10 = c(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return c10 != null ? c10 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : d(bundle.getString("android.template"));
        }

        static j f(Bundle bundle) {
            j e10 = e(bundle);
            if (e10 == null) {
                return null;
            }
            try {
                e10.l(bundle);
                return e10;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static j g(Notification notification) {
            Bundle a10 = o.a(notification);
            if (a10 == null) {
                return null;
            }
            return f(a10);
        }

        public void a(Bundle bundle) {
            if (this.f3598d) {
                bundle.putCharSequence("android.summaryText", this.f3597c);
            }
            CharSequence charSequence = this.f3596b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h10 = h();
            if (h10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h10);
            }
        }

        public abstract void b(n nVar);

        protected String h() {
            return null;
        }

        public RemoteViews i(n nVar) {
            return null;
        }

        public RemoteViews j(n nVar) {
            return null;
        }

        public RemoteViews k(n nVar) {
            return null;
        }

        protected void l(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f3597c = bundle.getCharSequence("android.summaryText");
                this.f3598d = true;
            }
            this.f3596b = bundle.getCharSequence("android.title.big");
        }

        public void m(e eVar) {
            if (this.f3595a != eVar) {
                this.f3595a = eVar;
                if (eVar != null) {
                    eVar.H(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
