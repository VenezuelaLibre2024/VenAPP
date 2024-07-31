package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f569a;

    /* renamed from: b, reason: collision with root package name */
    final long f570b;

    /* renamed from: c, reason: collision with root package name */
    final long f571c;

    /* renamed from: d, reason: collision with root package name */
    final float f572d;

    /* renamed from: e, reason: collision with root package name */
    final long f573e;

    /* renamed from: f, reason: collision with root package name */
    final int f574f;

    /* renamed from: r, reason: collision with root package name */
    final CharSequence f575r;

    /* renamed from: s, reason: collision with root package name */
    final long f576s;

    /* renamed from: t, reason: collision with root package name */
    List<CustomAction> f577t;

    /* renamed from: u, reason: collision with root package name */
    final long f578u;

    /* renamed from: v, reason: collision with root package name */
    final Bundle f579v;

    /* renamed from: w, reason: collision with root package name */
    private PlaybackState f580w;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f581a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f582b;

        /* renamed from: c, reason: collision with root package name */
        private final int f583c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f584d;

        /* renamed from: e, reason: collision with root package name */
        private PlaybackState.CustomAction f585e;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f581a = parcel.readString();
            this.f582b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f583c = parcel.readInt();
            this.f584d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f581a = str;
            this.f582b = charSequence;
            this.f583c = i10;
            this.f584d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
            customAction2.f585e = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f582b) + ", mIcon=" + this.f583c + ", mExtras=" + this.f584d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f581a);
            TextUtils.writeToParcel(this.f582b, parcel, i10);
            parcel.writeInt(this.f583c);
            parcel.writeBundle(this.f584d);
        }
    }

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    /* loaded from: classes.dex */
    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f569a = i10;
        this.f570b = j10;
        this.f571c = j11;
        this.f572d = f10;
        this.f573e = j12;
        this.f574f = i11;
        this.f575r = charSequence;
        this.f576s = j13;
        this.f577t = new ArrayList(list);
        this.f578u = j14;
        this.f579v = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f569a = parcel.readInt();
        this.f570b = parcel.readLong();
        this.f572d = parcel.readFloat();
        this.f576s = parcel.readLong();
        this.f571c = parcel.readLong();
        this.f573e = parcel.readLong();
        this.f575r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f577t = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f578u = parcel.readLong();
        this.f579v = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f574f = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            arrayList = new ArrayList(j10.size());
            Iterator<PlaybackState.CustomAction> it = j10.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle a10 = c.a(playbackState);
        MediaSessionCompat.a(a10);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), a10);
        playbackStateCompat.f580w = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f569a + ", position=" + this.f570b + ", buffered position=" + this.f571c + ", speed=" + this.f572d + ", updated=" + this.f576s + ", actions=" + this.f573e + ", error code=" + this.f574f + ", error message=" + this.f575r + ", custom actions=" + this.f577t + ", active item id=" + this.f578u + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f569a);
        parcel.writeLong(this.f570b);
        parcel.writeFloat(this.f572d);
        parcel.writeLong(this.f576s);
        parcel.writeLong(this.f571c);
        parcel.writeLong(this.f573e);
        TextUtils.writeToParcel(this.f575r, parcel, i10);
        parcel.writeTypedList(this.f577t);
        parcel.writeLong(this.f578u);
        parcel.writeBundle(this.f579v);
        parcel.writeInt(this.f574f);
    }
}
