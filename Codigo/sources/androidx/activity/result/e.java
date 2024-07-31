package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final IntentSender f680a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f681b;

    /* renamed from: c, reason: collision with root package name */
    private final int f682c;

    /* renamed from: d, reason: collision with root package name */
    private final int f683d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f679e = new c(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f684a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f685b;

        /* renamed from: c, reason: collision with root package name */
        private int f686c;

        /* renamed from: d, reason: collision with root package name */
        private int f687d;

        public a(IntentSender intentSender) {
            n.e(intentSender, "intentSender");
            this.f684a = intentSender;
        }

        public final e a() {
            return new e(this.f684a, this.f685b, this.f686c, this.f687d);
        }

        public final a b(Intent intent) {
            this.f685b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f687d = i10;
            this.f686c = i11;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<e> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel inParcel) {
            n.e(inParcel, "inParcel");
            return new e(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }
    }

    public e(IntentSender intentSender, Intent intent, int i10, int i11) {
        n.e(intentSender, "intentSender");
        this.f680a = intentSender;
        this.f681b = intent;
        this.f682c = i10;
        this.f683d = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.n.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.n.b(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.e.<init>(android.os.Parcel):void");
    }

    public final Intent a() {
        return this.f681b;
    }

    public final int b() {
        return this.f682c;
    }

    public final int c() {
        return this.f683d;
    }

    public final IntentSender d() {
        return this.f680a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        n.e(dest, "dest");
        dest.writeParcelable(this.f680a, i10);
        dest.writeParcelable(this.f681b, i10);
        dest.writeInt(this.f682c);
        dest.writeInt(this.f683d);
    }
}
