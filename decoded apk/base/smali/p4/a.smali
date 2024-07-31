.class public final Lp4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp4/a;

.field private static b:Z

.field private static c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp4/a;

    invoke-direct {v0}, Lp4/a;-><init>()V

    sput-object v0, Lp4/a;->a:Lp4/a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lp4/a;->c:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 3

    const-class v0, Lp4/a;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lp4/a;->a:Lp4/a;

    invoke-direct {v1}, Lp4/a;->c()V

    sget-object v1, Lp4/a;->c:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v2

    :goto_1
    if-nez v1, :cond_3

    sput-boolean v2, Lp4/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Ljava/lang/String;)Z
    .locals 3

    const-class v0, Lp4/a;

    invoke-static {v0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    const-string v1, "eventName"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v1, Lp4/a;->b:Z

    if-nez v1, :cond_1

    return v2

    :cond_1
    sget-object v1, Lp4/a;->c:Ljava/util/Set;

    invoke-interface {v1, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return v2
.end method

.method private final c()V
    .locals 2

    invoke-static {p0}, La5/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/internal/v;->a:Lcom/facebook/internal/v;

    invoke-static {}, Li4/e0;->m()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/internal/v;->q(Ljava/lang/String;Z)Lcom/facebook/internal/r;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-object v1, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    invoke-virtual {v0}, Lcom/facebook/internal/r;->b()Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/n0;->m(Lorg/json/JSONArray;)Ljava/util/HashSet;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sput-object v0, Lp4/a;->c:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, La5/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
