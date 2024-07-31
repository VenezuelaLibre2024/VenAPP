.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final backgroundDispatcher:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lzk/h0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final blockingDispatcher:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lzk/h0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final firebaseApp:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lzb/g;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lfe/f;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final sessionFirelogPublisher:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Ldf/b0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final sessionGenerator:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Ldf/d0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final sessionsSettings:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lff/f;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final transportFactory:Lpc/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/e0<",
            "Lf6/g;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v0, Lzb/g;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    const-class v0, Lfe/f;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lpc/e0;

    const-class v0, Ldc/a;

    const-class v1, Lzk/h0;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    const-class v0, Ldc/b;

    invoke-static {v0, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lpc/e0;

    const-class v0, Lf6/g;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lpc/e0;

    const-class v0, Ldf/b0;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionFirelogPublisher:Lpc/e0;

    const-class v0, Ldf/d0;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionGenerator:Lpc/e0;

    const-class v0, Lff/f;

    invoke-static {v0}, Lpc/e0;->b(Ljava/lang/Class;)Lpc/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lpc/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Ldf/g0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-5(Lpc/d;)Ldf/g0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lpc/d;)Ldf/d0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-1(Lpc/d;)Ldf/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lpc/d;)Ldf/w;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-4(Lpc/d;)Ldf/w;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lpc/d;)Ldf/b0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-2(Lpc/d;)Ldf/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lpc/d;)Ldf/k;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-0(Lpc/d;)Ldf/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lpc/d;)Lff/f;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-3(Lpc/d;)Lff/f;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda-0(Lpc/d;)Ldf/k;
    .locals 4

    new-instance v0, Ldf/k;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-interface {p0, v1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lzb/g;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lpc/e0;

    invoke-interface {p0, v2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[sessionsSettings]"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lff/f;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    invoke-interface {p0, v3}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v3, "container[backgroundDispatcher]"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lgk/f;

    invoke-direct {v0, v1, v2, p0}, Ldf/k;-><init>(Lzb/g;Lff/f;Lgk/f;)V

    return-object v0
.end method

.method private static final getComponents$lambda-1(Lpc/d;)Ldf/d0;
    .locals 3

    new-instance p0, Ldf/d0;

    sget-object v0, Ldf/k0;->a:Ldf/k0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Ldf/d0;-><init>(Ldf/j0;Lok/a;ILkotlin/jvm/internal/g;)V

    return-object p0
.end method

.method private static final getComponents$lambda-2(Lpc/d;)Ldf/b0;
    .locals 7

    new-instance v6, Ldf/c0;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-interface {p0, v0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "container[firebaseApp]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lzb/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lpc/e0;

    invoke-interface {p0, v0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "container[firebaseInstallationsApi]"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lfe/f;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lpc/e0;

    invoke-interface {p0, v0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "container[sessionsSettings]"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lff/f;

    new-instance v4, Ldf/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lpc/e0;

    invoke-interface {p0, v0}, Lpc/d;->b(Lpc/e0;)Lee/b;

    move-result-object v0

    const-string v5, "container.getProvider(transportFactory)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Ldf/g;-><init>(Lee/b;)V

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    invoke-interface {p0, v0}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "container[backgroundDispatcher]"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Lgk/f;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ldf/c0;-><init>(Lzb/g;Lfe/f;Lff/f;Ldf/h;Lgk/f;)V

    return-object v6
.end method

.method private static final getComponents$lambda-3(Lpc/d;)Lff/f;
    .locals 5

    new-instance v0, Lff/f;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-interface {p0, v1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lzb/g;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lpc/e0;

    invoke-interface {p0, v2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[blockingDispatcher]"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgk/f;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    invoke-interface {p0, v3}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgk/f;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lpc/e0;

    invoke-interface {p0, v4}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[firebaseInstallationsApi]"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lfe/f;

    invoke-direct {v0, v1, v2, v3, p0}, Lff/f;-><init>(Lzb/g;Lgk/f;Lgk/f;Lfe/f;)V

    return-object v0
.end method

.method private static final getComponents$lambda-4(Lpc/d;)Ldf/w;
    .locals 3

    new-instance v0, Ldf/x;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-interface {p0, v1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb/g;

    invoke-virtual {v1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    const-string v2, "container[firebaseApp].applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    invoke-interface {p0, v2}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "container[backgroundDispatcher]"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lgk/f;

    invoke-direct {v0, v1, p0}, Ldf/x;-><init>(Landroid/content/Context;Lgk/f;)V

    return-object v0
.end method

.method private static final getComponents$lambda-5(Lpc/d;)Ldf/g0;
    .locals 2

    new-instance v0, Ldf/h0;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-interface {p0, v1}, Lpc/d;->e(Lpc/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "container[firebaseApp]"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lzb/g;

    invoke-direct {v0, p0}, Ldf/h0;-><init>(Lzb/g;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Lpc/c;

    const-class v1, Ldf/k;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v2, "fire-sessions"

    invoke-virtual {v1, v2}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lpc/e0;

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lpc/e0;

    invoke-static {v4}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v5

    invoke-virtual {v1, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lpc/e0;

    invoke-static {v5}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v1, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v6, Ldf/m;

    invoke-direct {v6}, Ldf/m;-><init>()V

    invoke-virtual {v1, v6}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->e()Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v6, 0x0

    aput-object v1, v0, v6

    const-class v1, Ldf/d0;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v6, "session-generator"

    invoke-virtual {v1, v6}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    new-instance v6, Ldf/n;

    invoke-direct {v6}, Ldf/n;-><init>()V

    invoke-virtual {v1, v6}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v6, 0x1

    aput-object v1, v0, v6

    const-class v1, Ldf/b0;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v6, "session-publisher"

    invoke-virtual {v1, v6}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v6

    invoke-virtual {v1, v6}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lpc/e0;

    invoke-static {v6}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v7

    invoke-virtual {v1, v7}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    invoke-static {v4}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lpc/e0;

    invoke-static {v4}, Lpc/q;->m(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    invoke-static {v5}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v4, Ldf/o;

    invoke-direct {v4}, Ldf/o;-><init>()V

    invoke-virtual {v1, v4}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-class v1, Lff/f;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v4, "sessions-settings"

    invoke-virtual {v1, v4}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lpc/e0;

    invoke-static {v4}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    invoke-static {v5}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    invoke-static {v6}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v4, Ldf/p;

    invoke-direct {v4}, Ldf/p;-><init>()V

    invoke-virtual {v1, v4}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const-class v1, Ldf/w;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v4, "sessions-datastore"

    invoke-virtual {v1, v4}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    invoke-static {v5}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v4, Ldf/q;

    invoke-direct {v4}, Ldf/q;-><init>()V

    invoke-virtual {v1, v4}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const-class v1, Ldf/g0;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-string v4, "sessions-service-binder"

    invoke-virtual {v1, v4}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v1

    invoke-static {v3}, Lpc/q;->k(Lpc/e0;)Lpc/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v3, Ldf/r;

    invoke-direct {v3}, Ldf/r;-><init>()V

    invoke-virtual {v1, v3}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "1.2.0"

    invoke-static {v2, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ldk/p;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
