package sk;

import java.util.Random;

/* renamed from: sk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10931a extends AbstractC10933c {
    @Override // sk.AbstractC10933c
    /* renamed from: b */
    public int mo33396b(int i10) {
        return C10934d.m33407e(mo33399f().nextInt(), i10);
    }

    @Override // sk.AbstractC10933c
    /* renamed from: c */
    public int mo33397c() {
        return mo33399f().nextInt();
    }

    @Override // sk.AbstractC10933c
    /* renamed from: d */
    public int mo33398d(int i10) {
        return mo33399f().nextInt(i10);
    }

    /* renamed from: f */
    public abstract Random mo33399f();
}
