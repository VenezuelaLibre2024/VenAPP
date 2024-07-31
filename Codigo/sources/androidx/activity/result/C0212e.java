package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.activity.result.e */
/* loaded from: classes.dex */
public final class C0212e implements Parcelable {

    /* renamed from: a */
    private final IntentSender f745a;

    /* renamed from: b */
    private final Intent f746b;

    /* renamed from: c */
    private final int f747c;

    /* renamed from: d */
    private final int f748d;

    /* renamed from: e */
    public static final c f744e = new c(null);
    public static final Parcelable.Creator<C0212e> CREATOR = new b();

    /* renamed from: androidx.activity.result.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final IntentSender f749a;

        /* renamed from: b */
        private Intent f750b;

        /* renamed from: c */
        private int f751c;

        /* renamed from: d */
        private int f752d;

        public a(IntentSender intentSender) {
            C9322n.m27781e(intentSender, "intentSender");
            this.f749a = intentSender;
        }

        /* renamed from: a */
        public final C0212e m841a() {
            return new C0212e(this.f749a, this.f750b, this.f751c, this.f752d);
        }

        /* renamed from: b */
        public final a m842b(Intent intent) {
            this.f750b = intent;
            return this;
        }

        /* renamed from: c */
        public final a m843c(int i10, int i11) {
            this.f752d = i10;
            this.f751c = i11;
            return this;
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C0212e> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0212e createFromParcel(Parcel inParcel) {
            C9322n.m27781e(inParcel, "inParcel");
            return new C0212e(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0212e[] newArray(int i10) {
            return new C0212e[i10];
        }
    }

    /* renamed from: androidx.activity.result.e$c */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C9315g c9315g) {
            this();
        }
    }

    public C0212e(IntentSender intentSender, Intent intent, int i10, int i11) {
        C9322n.m27781e(intentSender, "intentSender");
        this.f745a = intentSender;
        this.f746b = intent;
        this.f747c = i10;
        this.f748d = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0212e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.C9322n.m27781e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.C9322n.m27778b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.C0212e.<init>(android.os.Parcel):void");
    }

    /* renamed from: a */
    public final Intent m837a() {
        return this.f746b;
    }

    /* renamed from: b */
    public final int m838b() {
        return this.f747c;
    }

    /* renamed from: c */
    public final int m839c() {
        return this.f748d;
    }

    /* renamed from: d */
    public final IntentSender m840d() {
        return this.f745a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        C9322n.m27781e(dest, "dest");
        dest.writeParcelable(this.f745a, i10);
        dest.writeParcelable(this.f746b, i10);
        dest.writeInt(this.f747c);
        dest.writeInt(this.f748d);
    }
}
