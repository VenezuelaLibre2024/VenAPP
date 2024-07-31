package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* renamed from: androidx.core.app.s1 */
/* loaded from: classes.dex */
public class C0832s1 {

    /* renamed from: a */
    CharSequence f4273a;

    /* renamed from: b */
    IconCompat f4274b;

    /* renamed from: c */
    String f4275c;

    /* renamed from: d */
    String f4276d;

    /* renamed from: e */
    boolean f4277e;

    /* renamed from: f */
    boolean f4278f;

    /* renamed from: androidx.core.app.s1$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static C0832s1 m4269a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            b bVar = new b();
            name = person.getName();
            b m4276f = bVar.m4276f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.m4501b(icon2);
            } else {
                iconCompat = null;
            }
            b m4273c = m4276f.m4273c(iconCompat);
            uri = person.getUri();
            b m4277g = m4273c.m4277g(uri);
            key = person.getKey();
            b m4275e = m4277g.m4275e(key);
            isBot = person.isBot();
            b m4272b = m4275e.m4272b(isBot);
            isImportant = person.isImportant();
            return m4272b.m4274d(isImportant).m4271a();
        }

        /* renamed from: b */
        static Person m4270b(C0832s1 c0832s1) {
            Person.Builder name;
            Person.Builder icon;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            Person build;
            name = new Person.Builder().setName(c0832s1.m4262e());
            icon = name.setIcon(c0832s1.m4260c() != null ? c0832s1.m4260c().m4521u() : null);
            uri = icon.setUri(c0832s1.m4263f());
            key = uri.setKey(c0832s1.m4261d());
            bot = key.setBot(c0832s1.m4264g());
            important = bot.setImportant(c0832s1.m4265h());
            build = important.build();
            return build;
        }
    }

    /* renamed from: androidx.core.app.s1$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        CharSequence f4279a;

        /* renamed from: b */
        IconCompat f4280b;

        /* renamed from: c */
        String f4281c;

        /* renamed from: d */
        String f4282d;

        /* renamed from: e */
        boolean f4283e;

        /* renamed from: f */
        boolean f4284f;

        /* renamed from: a */
        public C0832s1 m4271a() {
            return new C0832s1(this);
        }

        /* renamed from: b */
        public b m4272b(boolean z10) {
            this.f4283e = z10;
            return this;
        }

        /* renamed from: c */
        public b m4273c(IconCompat iconCompat) {
            this.f4280b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public b m4274d(boolean z10) {
            this.f4284f = z10;
            return this;
        }

        /* renamed from: e */
        public b m4275e(String str) {
            this.f4282d = str;
            return this;
        }

        /* renamed from: f */
        public b m4276f(CharSequence charSequence) {
            this.f4279a = charSequence;
            return this;
        }

        /* renamed from: g */
        public b m4277g(String str) {
            this.f4281c = str;
            return this;
        }
    }

    C0832s1(b bVar) {
        this.f4273a = bVar.f4279a;
        this.f4274b = bVar.f4280b;
        this.f4275c = bVar.f4281c;
        this.f4276d = bVar.f4282d;
        this.f4277e = bVar.f4283e;
        this.f4278f = bVar.f4284f;
    }

    /* renamed from: a */
    public static C0832s1 m4258a(Person person) {
        return a.m4269a(person);
    }

    /* renamed from: b */
    public static C0832s1 m4259b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().m4276f(bundle.getCharSequence("name")).m4273c(bundle2 != null ? IconCompat.m4500a(bundle2) : null).m4277g(bundle.getString("uri")).m4275e(bundle.getString(Constants.KEY)).m4272b(bundle.getBoolean("isBot")).m4274d(bundle.getBoolean("isImportant")).m4271a();
    }

    /* renamed from: c */
    public IconCompat m4260c() {
        return this.f4274b;
    }

    /* renamed from: d */
    public String m4261d() {
        return this.f4276d;
    }

    /* renamed from: e */
    public CharSequence m4262e() {
        return this.f4273a;
    }

    /* renamed from: f */
    public String m4263f() {
        return this.f4275c;
    }

    /* renamed from: g */
    public boolean m4264g() {
        return this.f4277e;
    }

    /* renamed from: h */
    public boolean m4265h() {
        return this.f4278f;
    }

    /* renamed from: i */
    public String m4266i() {
        String str = this.f4275c;
        if (str != null) {
            return str;
        }
        if (this.f4273a == null) {
            return "";
        }
        return "name:" + ((Object) this.f4273a);
    }

    /* renamed from: j */
    public Person m4267j() {
        return a.m4270b(this);
    }

    /* renamed from: k */
    public Bundle m4268k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f4273a);
        IconCompat iconCompat = this.f4274b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m4520t() : null);
        bundle.putString("uri", this.f4275c);
        bundle.putString(Constants.KEY, this.f4276d);
        bundle.putBoolean("isBot", this.f4277e);
        bundle.putBoolean("isImportant", this.f4278f);
        return bundle;
    }
}
