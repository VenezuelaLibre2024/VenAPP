package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f0 implements n {

    /* renamed from: a */
    private final Context f3500a;

    /* renamed from: b */
    private final Notification.Builder f3501b;

    /* renamed from: c */
    private final o.e f3502c;

    /* renamed from: d */
    private RemoteViews f3503d;

    /* renamed from: e */
    private RemoteViews f3504e;

    /* renamed from: f */
    private final List<Bundle> f3505f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3506g = new Bundle();

    /* renamed from: h */
    private int f3507h;

    /* renamed from: i */
    private RemoteViews f3508i;

    /* loaded from: classes.dex */
    public static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
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

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i10);
            return badgeIconType;
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z10);
            return colorized;
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i10);
            return groupAlertBehavior;
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j10);
            return timeoutAfter;
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i10);
            return semanticAction;
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z10);
            return allowSystemGeneratedContextualActions;
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z10);
            return contextual;
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z10);
            return authenticationRequired;
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i10);
            return foregroundServiceBehavior;
        }
    }

    public f0(o.e eVar) {
        int i10;
        this.f3502c = eVar;
        Context context = eVar.f3547a;
        this.f3500a = context;
        this.f3501b = Build.VERSION.SDK_INT >= 26 ? h.a(context, eVar.K) : new Notification.Builder(eVar.f3547a);
        Notification notification = eVar.R;
        this.f3501b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f3555i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f3551e).setContentText(eVar.f3552f).setContentInfo(eVar.f3557k).setContentIntent(eVar.f3553g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f3554h, (notification.flags & RecognitionOptions.ITF) != 0).setLargeIcon(eVar.f3556j).setNumber(eVar.f3558l).setProgress(eVar.f3566t, eVar.f3567u, eVar.f3568v);
        a.b(a.d(a.c(this.f3501b, eVar.f3563q), eVar.f3561o), eVar.f3559m);
        Iterator<o.a> it = eVar.f3548b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f3506g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f3503d = eVar.H;
        this.f3504e = eVar.I;
        b.a(this.f3501b, eVar.f3560n);
        d.i(this.f3501b, eVar.f3572z);
        d.g(this.f3501b, eVar.f3569w);
        d.j(this.f3501b, eVar.f3571y);
        d.h(this.f3501b, eVar.f3570x);
        this.f3507h = eVar.O;
        e.b(this.f3501b, eVar.C);
        e.c(this.f3501b, eVar.E);
        e.f(this.f3501b, eVar.F);
        e.d(this.f3501b, eVar.G);
        e.e(this.f3501b, notification.sound, notification.audioAttributes);
        List e10 = i11 < 28 ? e(g(eVar.f3549c), eVar.U) : eVar.U;
        if (e10 != null && !e10.isEmpty()) {
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                e.a(this.f3501b, (String) it2.next());
            }
        }
        this.f3508i = eVar.J;
        if (eVar.f3550d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f3550d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), s0.a(eVar.f3550d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3506g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            f.b(this.f3501b, obj);
        }
        c.a(this.f3501b, eVar.D);
        g.e(this.f3501b, eVar.f3565s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            g.c(this.f3501b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            g.b(this.f3501b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            g.d(this.f3501b, remoteViews3);
        }
        if (i13 >= 26) {
            h.b(this.f3501b, eVar.L);
            h.e(this.f3501b, eVar.f3564r);
            h.f(this.f3501b, eVar.M);
            h.g(this.f3501b, eVar.N);
            h.d(this.f3501b, eVar.O);
            if (eVar.B) {
                h.c(this.f3501b, eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f3501b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<s1> it3 = eVar.f3549c.iterator();
            while (it3.hasNext()) {
                i.a(this.f3501b, it3.next().j());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.a(this.f3501b, eVar.Q);
            j.b(this.f3501b, o.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.P) != 0) {
            k.b(this.f3501b, i10);
        }
        if (eVar.S) {
            if (this.f3502c.f3570x) {
                this.f3507h = 2;
            } else {
                this.f3507h = 1;
            }
            this.f3501b.setVibrate(null);
            this.f3501b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f3501b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f3502c.f3569w)) {
                    d.g(this.f3501b, "silent");
                }
                h.d(this.f3501b, this.f3507h);
            }
        }
    }

    private void b(o.a aVar) {
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = f.a(d10 != null ? d10.u() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : u1.b(aVar.e())) {
                d.c(a10, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        g.a(a10, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            i.b(a10, aVar.f());
        }
        if (i10 >= 29) {
            j.c(a10, aVar.j());
        }
        if (i10 >= 31) {
            k.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a10, bundle);
        d.a(this.f3501b, d.d(a10));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<s1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<s1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.n
    public Notification.Builder a() {
        return this.f3501b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews k10;
        RemoteViews i10;
        o.j jVar = this.f3502c.f3562p;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews j10 = jVar != null ? jVar.j(this) : null;
        Notification d10 = d();
        if (j10 != null || (j10 = this.f3502c.H) != null) {
            d10.contentView = j10;
        }
        if (jVar != null && (i10 = jVar.i(this)) != null) {
            d10.bigContentView = i10;
        }
        if (jVar != null && (k10 = this.f3502c.f3562p.k(this)) != null) {
            d10.headsUpContentView = k10;
        }
        if (jVar != null && (a10 = o.a(d10)) != null) {
            jVar.a(a10);
        }
        return d10;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.f3501b);
        }
        Notification a10 = a.a(this.f3501b);
        if (this.f3507h != 0) {
            if (d.f(a10) != null && (a10.flags & RecognitionOptions.UPC_A) != 0 && this.f3507h == 2) {
                h(a10);
            }
            if (d.f(a10) != null && (a10.flags & RecognitionOptions.UPC_A) == 0 && this.f3507h == 1) {
                h(a10);
            }
        }
        return a10;
    }

    public Context f() {
        return this.f3500a;
    }
}
