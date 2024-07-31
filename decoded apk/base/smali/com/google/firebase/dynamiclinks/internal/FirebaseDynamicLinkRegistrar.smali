.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpc/d;)Lfd/b;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(Lpc/d;)Lfd/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lpc/d;)Lfd/b;
    .locals 3

    new-instance v0, Lgd/g;

    const-class v1, Lzb/g;

    invoke-interface {p0, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb/g;

    const-class v2, Lcc/a;

    invoke-interface {p0, v2}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lgd/g;-><init>(Lzb/g;Lee/b;)V

    return-object v0
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

    const-class v0, Lfd/b;

    invoke-static {v0}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v0

    const-string v1, "fire-dl"

    invoke-virtual {v0, v1}, Lpc/c$b;->h(Ljava/lang/String;)Lpc/c$b;

    move-result-object v0

    const-class v2, Lzb/g;

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    const-class v2, Lcc/a;

    invoke-static {v2}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    new-instance v2, Lgd/f;

    invoke-direct {v2}, Lgd/f;-><init>()V

    invoke-virtual {v0, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Lpc/c;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v0, "21.2.0"

    invoke-static {v1, v0}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
