.class public Lh6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/t;


# static fields
.field private static volatile e:Lh6/v;


# instance fields
.field private final a:Lr6/a;

.field private final b:Lr6/a;

.field private final c:Ln6/e;

.field private final d:Lo6/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lr6/a;Lr6/a;Ln6/e;Lo6/r;Lo6/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/u;->a:Lr6/a;

    iput-object p2, p0, Lh6/u;->b:Lr6/a;

    iput-object p3, p0, Lh6/u;->c:Ln6/e;

    iput-object p4, p0, Lh6/u;->d:Lo6/r;

    invoke-virtual {p5}, Lo6/v;->c()V

    return-void
.end method

.method private b(Lh6/o;)Lh6/i;
    .locals 4

    invoke-static {}, Lh6/i;->a()Lh6/i$a;

    move-result-object v0

    iget-object v1, p0, Lh6/u;->a:Lr6/a;

    invoke-interface {v1}, Lr6/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh6/i$a;->i(J)Lh6/i$a;

    move-result-object v0

    iget-object v1, p0, Lh6/u;->b:Lr6/a;

    invoke-interface {v1}, Lr6/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh6/i$a;->k(J)Lh6/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lh6/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh6/i$a;->j(Ljava/lang/String;)Lh6/i$a;

    move-result-object v0

    new-instance v1, Lh6/h;

    invoke-virtual {p1}, Lh6/o;->b()Lf6/b;

    move-result-object v2

    invoke-virtual {p1}, Lh6/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lh6/h;-><init>(Lf6/b;[B)V

    invoke-virtual {v0, v1}, Lh6/i$a;->h(Lh6/h;)Lh6/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lh6/o;->c()Lf6/c;

    move-result-object p1

    invoke-virtual {p1}, Lf6/c;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh6/i$a;->g(Ljava/lang/Integer;)Lh6/i$a;

    move-result-object p1

    invoke-virtual {p1}, Lh6/i$a;->d()Lh6/i;

    move-result-object p1

    return-object p1
.end method

.method public static c()Lh6/u;
    .locals 2

    sget-object v0, Lh6/u;->e:Lh6/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh6/v;->b()Lh6/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static d(Lh6/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/f;",
            ")",
            "Ljava/util/Set<",
            "Lf6/b;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lh6/g;

    if-eqz v0, :cond_0

    check-cast p0, Lh6/g;

    invoke-interface {p0}, Lh6/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lh6/u;->e:Lh6/v;

    if-nez v0, :cond_1

    const-class v0, Lh6/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lh6/u;->e:Lh6/v;

    if-nez v1, :cond_0

    invoke-static {}, Lh6/e;->e()Lh6/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lh6/v$a;->a(Landroid/content/Context;)Lh6/v$a;

    move-result-object p0

    invoke-interface {p0}, Lh6/v$a;->build()Lh6/v;

    move-result-object p0

    sput-object p0, Lh6/u;->e:Lh6/v;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lh6/o;Lf6/h;)V
    .locals 3

    iget-object v0, p0, Lh6/u;->c:Ln6/e;

    invoke-virtual {p1}, Lh6/o;->f()Lh6/p;

    move-result-object v1

    invoke-virtual {p1}, Lh6/o;->c()Lf6/c;

    move-result-object v2

    invoke-virtual {v2}, Lf6/c;->c()Lf6/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lh6/p;->f(Lf6/d;)Lh6/p;

    move-result-object v1

    invoke-direct {p0, p1}, Lh6/u;->b(Lh6/o;)Lh6/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Ln6/e;->a(Lh6/p;Lh6/i;Lf6/h;)V

    return-void
.end method

.method public e()Lo6/r;
    .locals 1

    iget-object v0, p0, Lh6/u;->d:Lo6/r;

    return-object v0
.end method

.method public g(Lh6/f;)Lf6/g;
    .locals 4

    new-instance v0, Lh6/q;

    invoke-static {p1}, Lh6/u;->d(Lh6/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lh6/p;->a()Lh6/p$a;

    move-result-object v2

    invoke-interface {p1}, Lh6/f;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh6/p$a;->b(Ljava/lang/String;)Lh6/p$a;

    move-result-object v2

    invoke-interface {p1}, Lh6/f;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lh6/p$a;->c([B)Lh6/p$a;

    move-result-object p1

    invoke-virtual {p1}, Lh6/p$a;->a()Lh6/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lh6/q;-><init>(Ljava/util/Set;Lh6/p;Lh6/t;)V

    return-object v0
.end method
