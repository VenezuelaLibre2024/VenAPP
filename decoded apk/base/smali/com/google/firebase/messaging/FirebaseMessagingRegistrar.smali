.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Lpc/d;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, Lzb/g;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzb/g;

    const-class v0, Lpd/a;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpd/a;

    const-class v0, Lye/i;

    invoke-interface {p0, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v3

    const-class v0, Lod/j;

    invoke-interface {p0, v0}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v4

    const-class v0, Lfe/f;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lfe/f;

    const-class v0, Lf6/g;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lf6/g;

    const-class v0, Lnd/d;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lnd/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lzb/g;Lpd/a;Lee/b;Lee/b;Lfe/f;Lf6/g;Lnd/d;)V

    return-object v8
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lpc/c;

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lzb/g;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lpd/a;

    invoke-static {v3}, Lpc/q;->h(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lye/i;

    invoke-static {v3}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lod/j;

    invoke-static {v3}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lf6/g;

    invoke-static {v3}, Lpc/q;->h(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lfe/f;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v3, Lnd/d;

    invoke-static {v3}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/firebase/messaging/c0;

    invoke-direct {v3}, Lcom/google/firebase/messaging/c0;-><init>()V

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->c()Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "23.3.1"

    invoke-static {v2, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
