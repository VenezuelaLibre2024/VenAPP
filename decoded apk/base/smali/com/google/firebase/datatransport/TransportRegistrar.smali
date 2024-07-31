.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Lf6/g;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(Lpc/d;)Lf6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lpc/d;)Lf6/g;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Lpc/d;)Lf6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lpc/d;)Lf6/g;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(Lpc/d;)Lf6/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/d;)Lf6/g;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lh6/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lh6/u;->g(Lh6/f;)Lf6/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(Lpc/d;)Lf6/g;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lh6/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lh6/u;->g(Lh6/f;)Lf6/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(Lpc/d;)Lf6/g;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lh6/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lh6/u;->g(Lh6/f;)Lf6/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lpc/c;

    const-class v1, Lf6/g;

    invoke-static {v1}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    const-string v3, "fire-transport"

    invoke-virtual {v2, v3}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v2

    const-class v4, Landroid/content/Context;

    invoke-static {v4}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    new-instance v5, Led/c;

    invoke-direct {v5}, Led/c;-><init>()V

    invoke-virtual {v2, v5}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v0, v5

    const-class v2, Led/a;

    invoke-static {v2, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v2

    invoke-static {v2}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v2

    invoke-static {v4}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v5

    invoke-virtual {v2, v5}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v2

    new-instance v5, Led/d;

    invoke-direct {v5}, Led/d;-><init>()V

    invoke-virtual {v2, v5}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lpc/c$b;->d()Lpc/c;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v0, v5

    const-class v2, Led/b;

    invoke-static {v2, v1}, Lpc/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lpc/e0;

    move-result-object v1

    invoke-static {v1}, Lpc/c;->e(Lpc/e0;)Lpc/c$b;

    move-result-object v1

    invoke-static {v4}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    new-instance v2, Led/e;

    invoke-direct {v2}, Led/e;-><init>()V

    invoke-virtual {v1, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "18.2.0"

    invoke-static {v3, v1}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
