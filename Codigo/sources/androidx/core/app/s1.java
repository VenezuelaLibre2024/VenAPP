package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f3601a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f3602b;

    /* renamed from: c, reason: collision with root package name */
    String f3603c;

    /* renamed from: d, reason: collision with root package name */
    String f3604d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3605e;

    /* renamed from: f, reason: collision with root package name */
    boolean f3606f;

    /* loaded from: classes.dex */
    static class a {
        static s1 a(Person person) {
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
            b f10 = bVar.f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.b(icon2);
            } else {
                iconCompat = null;
            }
            b c10 = f10.c(iconCompat);
            uri = person.getUri();
            b g10 = c10.g(uri);
            key = person.getKey();
            b e10 = g10.e(key);
            isBot = person.isBot();
            b b10 = e10.b(isBot);
            isImportant = person.isImportant();
            return b10.d(isImportant).a();
        }

        static Person b(s1 s1Var) {
            Person.Builder name;
            Person.Builder icon;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            Person build;
            name = new Person.Builder().setName(s1Var.e());
            icon = name.setIcon(s1Var.c() != null ? s1Var.c().u() : null);
            uri = icon.setUri(s1Var.f());
            key = uri.setKey(s1Var.d());
            bot = key.setBot(s1Var.g());
            important = bot.setImportant(s1Var.h());
            build = important.build();
            return build;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        CharSequence f3607a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f3608b;

        /* renamed from: c, reason: collision with root package name */
        String f3609c;

        /* renamed from: d, reason: collision with root package name */
        String f3610d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3611e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3612f;

        public s1 a() {
            return new s1(this);
        }

        public b b(boolean z10) {
            this.f3611e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f3608b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f3612f = z10;
            return this;
        }

        public b e(String str) {
            this.f3610d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f3607a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f3609c = str;
            return this;
        }
    }

    s1(b bVar) {
        this.f3601a = bVar.f3607a;
        this.f3602b = bVar.f3608b;
        this.f3603c = bVar.f3609c;
        this.f3604d = bVar.f3610d;
        this.f3605e = bVar.f3611e;
        this.f3606f = bVar.f3612f;
    }

    public static s1 a(Person person) {
        return a.a(person);
    }

    public static s1 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.a(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString(Constants.KEY)).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f3602b;
    }

    public String d() {
        return this.f3604d;
    }

    public CharSequence e() {
        return this.f3601a;
    }

    public String f() {
        return this.f3603c;
    }

    public boolean g() {
        return this.f3605e;
    }

    public boolean h() {
        return this.f3606f;
    }

    public String i() {
        String str = this.f3603c;
        if (str != null) {
            return str;
        }
        if (this.f3601a == null) {
            return "";
        }
        return "name:" + ((Object) this.f3601a);
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3601a);
        IconCompat iconCompat = this.f3602b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.t() : null);
        bundle.putString("uri", this.f3603c);
        bundle.putString(Constants.KEY, this.f3604d);
        bundle.putBoolean("isBot", this.f3605e);
        bundle.putBoolean("isImportant", this.f3606f);
        return bundle;
    }
}
