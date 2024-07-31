.class public Lo6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lp6/d;

.field private final c:Lo6/x;

.field private final d:Lq6/b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lp6/d;Lo6/x;Lq6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/v;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lo6/v;->b:Lp6/d;

    iput-object p3, p0, Lo6/v;->c:Lo6/x;

    iput-object p4, p0, Lo6/v;->d:Lq6/b;

    return-void
.end method

.method public static synthetic a(Lo6/v;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lo6/v;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lo6/v;)V
    .locals 0

    invoke-direct {p0}, Lo6/v;->e()V

    return-void
.end method

.method private synthetic d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lo6/v;->b:Lp6/d;

    invoke-interface {v0}, Lp6/d;->J()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh6/p;

    iget-object v2, p0, Lo6/v;->c:Lo6/x;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Lo6/x;->b(Lh6/p;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, Lo6/v;->d:Lq6/b;

    new-instance v1, Lo6/u;

    invoke-direct {v1, p0}, Lo6/u;-><init>(Lo6/v;)V

    invoke-interface {v0, v1}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lo6/v;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lo6/t;

    invoke-direct {v1, p0}, Lo6/t;-><init>(Lo6/v;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
