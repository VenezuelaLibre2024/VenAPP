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
import androidx.collection.C0732b;
import androidx.core.app.C0818o;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.f0 */
/* loaded from: classes.dex */
public class C0792f0 implements InterfaceC0815n {

    /* renamed from: a */
    private final Context f4151a;

    /* renamed from: b */
    private final Notification.Builder f4152b;

    /* renamed from: c */
    private final C0818o.e f4153c;

    /* renamed from: d */
    private RemoteViews f4154d;

    /* renamed from: e */
    private RemoteViews f4155e;

    /* renamed from: f */
    private final List<Bundle> f4156f = new ArrayList();

    /* renamed from: g */
    private final Bundle f4157g = new Bundle();

    /* renamed from: h */
    private int f4158h;

    /* renamed from: i */
    private RemoteViews f4159i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Notification m3979a(Notification.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static Notification.Builder m3980b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        /* renamed from: c */
        static Notification.Builder m3981c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        /* renamed from: d */
        static Notification.Builder m3982d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* renamed from: androidx.core.app.f0$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static Notification.Builder m3983a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* renamed from: androidx.core.app.f0$c */
    /* loaded from: classes.dex */
    static class c {
        /* renamed from: a */
        static Notification.Builder m3984a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static Notification.Builder m3985a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        static Notification.Action.Builder m3986b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        static Notification.Action.Builder m3987c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        static Notification.Action m3988d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        static Notification.Action.Builder m3989e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        /* renamed from: f */
        static String m3990f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        static Notification.Builder m3991g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        static Notification.Builder m3992h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        /* renamed from: i */
        static Notification.Builder m3993i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        /* renamed from: j */
        static Notification.Builder m3994j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: androidx.core.app.f0$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static Notification.Builder m3995a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        static Notification.Builder m3996b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        static Notification.Builder m3997c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        /* renamed from: d */
        static Notification.Builder m3998d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        static Notification.Builder m3999e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        static Notification.Builder m4000f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static Notification.Action.Builder m4001a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        static Notification.Builder m4002b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        static Notification.Action.Builder m4003a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        /* renamed from: b */
        static Notification.Builder m4004b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        static Notification.Builder m4005c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        static Notification.Builder m4006d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        static Notification.Builder m4007e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: androidx.core.app.f0$h */
    /* loaded from: classes.dex */
    static class h {
        /* renamed from: a */
        static Notification.Builder m4008a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        static Notification.Builder m4009b(Notification.Builder builder, int i10) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i10);
            return badgeIconType;
        }

        /* renamed from: c */
        static Notification.Builder m4010c(Notification.Builder builder, boolean z10) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z10);
            return colorized;
        }

        /* renamed from: d */
        static Notification.Builder m4011d(Notification.Builder builder, int i10) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i10);
            return groupAlertBehavior;
        }

        /* renamed from: e */
        static Notification.Builder m4012e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        /* renamed from: f */
        static Notification.Builder m4013f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        /* renamed from: g */
        static Notification.Builder m4014g(Notification.Builder builder, long j10) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j10);
            return timeoutAfter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        static Notification.Builder m4015a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        /* renamed from: b */
        static Notification.Action.Builder m4016b(Notification.Action.Builder builder, int i10) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i10);
            return semanticAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static Notification.Builder m4017a(Notification.Builder builder, boolean z10) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z10);
            return allowSystemGeneratedContextualActions;
        }

        /* renamed from: b */
        static Notification.Builder m4018b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        /* renamed from: c */
        static Notification.Action.Builder m4019c(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z10);
            return contextual;
        }

        /* renamed from: d */
        static Notification.Builder m4020d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f0$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static Notification.Action.Builder m4021a(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z10);
            return authenticationRequired;
        }

        /* renamed from: b */
        static Notification.Builder m4022b(Notification.Builder builder, int i10) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i10);
            return foregroundServiceBehavior;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0792f0(C0818o.e eVar) {
        int i10;
        this.f4153c = eVar;
        Context context = eVar.f4219a;
        this.f4151a = context;
        this.f4152b = Build.VERSION.SDK_INT >= 26 ? h.m4008a(context, eVar.f4208K) : new Notification.Builder(eVar.f4219a);
        Notification notification = eVar.f4215R;
        this.f4152b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f4227i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f4223e).setContentText(eVar.f4224f).setContentInfo(eVar.f4229k).setContentIntent(eVar.f4225g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f4226h, (notification.flags & RecognitionOptions.ITF) != 0).setLargeIcon(eVar.f4228j).setNumber(eVar.f4230l).setProgress(eVar.f4238t, eVar.f4239u, eVar.f4240v);
        a.m3980b(a.m3982d(a.m3981c(this.f4152b, eVar.f4235q), eVar.f4233o), eVar.f4231m);
        Iterator<C0818o.a> it = eVar.f4220b.iterator();
        while (it.hasNext()) {
            m3971b(it.next());
        }
        Bundle bundle = eVar.f4201D;
        if (bundle != null) {
            this.f4157g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f4154d = eVar.f4205H;
        this.f4155e = eVar.f4206I;
        b.m3983a(this.f4152b, eVar.f4232n);
        d.m3993i(this.f4152b, eVar.f4244z);
        d.m3991g(this.f4152b, eVar.f4241w);
        d.m3994j(this.f4152b, eVar.f4243y);
        d.m3992h(this.f4152b, eVar.f4242x);
        this.f4158h = eVar.f4212O;
        e.m3996b(this.f4152b, eVar.f4200C);
        e.m3997c(this.f4152b, eVar.f4202E);
        e.m4000f(this.f4152b, eVar.f4203F);
        e.m3998d(this.f4152b, eVar.f4204G);
        e.m3999e(this.f4152b, notification.sound, notification.audioAttributes);
        List m3972e = i11 < 28 ? m3972e(m3973g(eVar.f4221c), eVar.f4218U) : eVar.f4218U;
        if (m3972e != null && !m3972e.isEmpty()) {
            Iterator it2 = m3972e.iterator();
            while (it2.hasNext()) {
                e.m3995a(this.f4152b, (String) it2.next());
            }
        }
        this.f4159i = eVar.f4207J;
        if (eVar.f4222d.size() > 0) {
            Bundle bundle2 = eVar.m4138d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f4222d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), C0831s0.m4255a(eVar.f4222d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.m4138d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f4157g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f4217T;
        if (obj != null) {
            f.m4002b(this.f4152b, obj);
        }
        c.m3984a(this.f4152b, eVar.f4201D);
        g.m4007e(this.f4152b, eVar.f4237s);
        RemoteViews remoteViews = eVar.f4205H;
        if (remoteViews != null) {
            g.m4005c(this.f4152b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f4206I;
        if (remoteViews2 != null) {
            g.m4004b(this.f4152b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f4207J;
        if (remoteViews3 != null) {
            g.m4006d(this.f4152b, remoteViews3);
        }
        if (i13 >= 26) {
            h.m4009b(this.f4152b, eVar.f4209L);
            h.m4012e(this.f4152b, eVar.f4236r);
            h.m4013f(this.f4152b, eVar.f4210M);
            h.m4014g(this.f4152b, eVar.f4211N);
            h.m4011d(this.f4152b, eVar.f4212O);
            if (eVar.f4199B) {
                h.m4010c(this.f4152b, eVar.f4198A);
            }
            if (!TextUtils.isEmpty(eVar.f4208K)) {
                this.f4152b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<C0832s1> it3 = eVar.f4221c.iterator();
            while (it3.hasNext()) {
                i.m4015a(this.f4152b, it3.next().m4267j());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.m4017a(this.f4152b, eVar.f4214Q);
            j.m4018b(this.f4152b, C0818o.d.m4116a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f4213P) != 0) {
            k.m4022b(this.f4152b, i10);
        }
        if (eVar.f4216S) {
            if (this.f4153c.f4242x) {
                this.f4158h = 2;
            } else {
                this.f4158h = 1;
            }
            this.f4152b.setVibrate(null);
            this.f4152b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f4152b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f4153c.f4241w)) {
                    d.m3991g(this.f4152b, "silent");
                }
                h.m4011d(this.f4152b, this.f4158h);
            }
        }
    }

    /* renamed from: b */
    private void m3971b(C0818o.a aVar) {
        IconCompat m4077d = aVar.m4077d();
        Notification.Action.Builder m4001a = f.m4001a(m4077d != null ? m4077d.m4521u() : null, aVar.m4081h(), aVar.m4074a());
        if (aVar.m4078e() != null) {
            for (RemoteInput remoteInput : C0838u1.m4318b(aVar.m4078e())) {
                d.m3987c(m4001a, remoteInput);
            }
        }
        Bundle bundle = aVar.m4076c() != null ? new Bundle(aVar.m4076c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m4075b());
        int i10 = Build.VERSION.SDK_INT;
        g.m4003a(m4001a, aVar.m4075b());
        bundle.putInt("android.support.action.semanticAction", aVar.m4079f());
        if (i10 >= 28) {
            i.m4016b(m4001a, aVar.m4079f());
        }
        if (i10 >= 29) {
            j.m4019c(m4001a, aVar.m4083j());
        }
        if (i10 >= 31) {
            k.m4021a(m4001a, aVar.m4082i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m4080g());
        d.m3986b(m4001a, bundle);
        d.m3985a(this.f4152b, d.m3988d(m4001a));
    }

    /* renamed from: e */
    private static List<String> m3972e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0732b c0732b = new C0732b(list.size() + list2.size());
        c0732b.addAll(list);
        c0732b.addAll(list2);
        return new ArrayList(c0732b);
    }

    /* renamed from: g */
    private static List<String> m3973g(List<C0832s1> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0832s1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m4266i());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m3974h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.InterfaceC0815n
    /* renamed from: a */
    public Notification.Builder mo3975a() {
        return this.f4152b;
    }

    /* renamed from: c */
    public Notification m3976c() {
        Bundle m4073a;
        RemoteViews mo4194k;
        RemoteViews mo4192i;
        C0818o.j jVar = this.f4153c.f4234p;
        if (jVar != null) {
            jVar.mo4092b(this);
        }
        RemoteViews mo4193j = jVar != null ? jVar.mo4193j(this) : null;
        Notification m3977d = m3977d();
        if (mo4193j != null || (mo4193j = this.f4153c.f4205H) != null) {
            m3977d.contentView = mo4193j;
        }
        if (jVar != null && (mo4192i = jVar.mo4192i(this)) != null) {
            m3977d.bigContentView = mo4192i;
        }
        if (jVar != null && (mo4194k = this.f4153c.f4234p.mo4194k(this)) != null) {
            m3977d.headsUpContentView = mo4194k;
        }
        if (jVar != null && (m4073a = C0818o.m4073a(m3977d)) != null) {
            jVar.mo4108a(m4073a);
        }
        return m3977d;
    }

    /* renamed from: d */
    protected Notification m3977d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.m3979a(this.f4152b);
        }
        Notification m3979a = a.m3979a(this.f4152b);
        if (this.f4158h != 0) {
            if (d.m3990f(m3979a) != null && (m3979a.flags & RecognitionOptions.UPC_A) != 0 && this.f4158h == 2) {
                m3974h(m3979a);
            }
            if (d.m3990f(m3979a) != null && (m3979a.flags & RecognitionOptions.UPC_A) == 0 && this.f4158h == 1) {
                m3974h(m3979a);
            }
        }
        return m3979a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m3978f() {
        return this.f4151a;
    }
}
