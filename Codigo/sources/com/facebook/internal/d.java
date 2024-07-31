package com.facebook.internal;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements i4.m {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7725b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Integer, a> f7726c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, a> f7727a = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i10, Intent intent);
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final synchronized a b(int i10) {
            return (a) d.f7726c.get(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(int i10, int i11, Intent intent) {
            a b10 = b(i10);
            if (b10 == null) {
                return false;
            }
            return b10.a(i11, intent);
        }

        public final synchronized void c(int i10, a callback) {
            kotlin.jvm.internal.n.e(callback, "callback");
            if (d.f7726c.containsKey(Integer.valueOf(i10))) {
                return;
            }
            d.f7726c.put(Integer.valueOf(i10), callback);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        c(int i10) {
            this.offset = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int h() {
            return i4.e0.q() + this.offset;
        }
    }

    public final void b(int i10, a callback) {
        kotlin.jvm.internal.n.e(callback, "callback");
        this.f7727a.put(Integer.valueOf(i10), callback);
    }

    @Override // i4.m
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        a aVar = this.f7727a.get(Integer.valueOf(i10));
        return aVar == null ? f7725b.d(i10, i11, intent) : aVar.a(i11, intent);
    }
}
