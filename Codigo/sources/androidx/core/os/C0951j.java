package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.j */
/* loaded from: classes.dex */
final class C0951j implements InterfaceC0950i {

    /* renamed from: a */
    private final LocaleList f4473a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0951j(Object obj) {
        this.f4473a = (LocaleList) obj;
    }

    @Override // androidx.core.os.InterfaceC0950i
    /* renamed from: a */
    public String mo4731a() {
        return this.f4473a.toLanguageTags();
    }

    @Override // androidx.core.os.InterfaceC0950i
    /* renamed from: b */
    public Object mo4732b() {
        return this.f4473a;
    }

    public boolean equals(Object obj) {
        return this.f4473a.equals(((InterfaceC0950i) obj).mo4732b());
    }

    @Override // androidx.core.os.InterfaceC0950i
    public Locale get(int i10) {
        return this.f4473a.get(i10);
    }

    public int hashCode() {
        return this.f4473a.hashCode();
    }

    @Override // androidx.core.os.InterfaceC0950i
    public boolean isEmpty() {
        return this.f4473a.isEmpty();
    }

    @Override // androidx.core.os.InterfaceC0950i
    public int size() {
        return this.f4473a.size();
    }

    public String toString() {
        return this.f4473a.toString();
    }
}
