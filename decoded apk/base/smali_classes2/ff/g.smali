.class public final Lff/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/g$b;
    }
.end annotation


# static fields
.field private static final c:Lff/g$b;

.field private static final d:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final e:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final f:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final g:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final h:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final a:Lx0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/f<",
            "La1/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lff/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lff/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lff/g$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lff/g;->c:Lff/g$b;

    const-string v0, "firebase_sessions_enabled"

    invoke-static {v0}, La1/f;->a(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Lff/g;->d:La1/d$a;

    const-string v0, "firebase_sessions_sampling_rate"

    invoke-static {v0}, La1/f;->b(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Lff/g;->e:La1/d$a;

    const-string v0, "firebase_sessions_restart_timeout"

    invoke-static {v0}, La1/f;->d(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Lff/g;->f:La1/d$a;

    const-string v0, "firebase_sessions_cache_duration"

    invoke-static {v0}, La1/f;->d(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Lff/g;->g:La1/d$a;

    const-string v0, "firebase_sessions_cache_updated_time"

    invoke-static {v0}, La1/f;->e(Ljava/lang/String;)La1/d$a;

    move-result-object v0

    sput-object v0, Lff/g;->h:La1/d$a;

    return-void
.end method

.method public constructor <init>(Lx0/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/f<",
            "La1/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/g;->a:Lx0/f;

    new-instance p1, Lff/g$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lff/g$a;-><init>(Lff/g;Lgk/Continuation;)V

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, v0}, Lzk/h;->f(Lgk/f;Lok/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic a(Lff/g;)Lx0/f;
    .locals 0

    iget-object p0, p0, Lff/g;->a:Lx0/f;

    return-object p0
.end method

.method public static final synthetic b(Lff/g;La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lff/g;La1/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lff/g;->l(La1/d;)V

    return-void
.end method

.method private final h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La1/d$a<",
            "TT;>;TT;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lff/g$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lff/g$c;

    iget v1, v0, Lff/g$c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lff/g$c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lff/g$c;

    invoke-direct {v0, p0, p3}, Lff/g$c;-><init>(Lff/g;Lgk/Continuation;)V

    :goto_0
    iget-object p3, v0, Lff/g$c;->a:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lff/g$c;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lck/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lck/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lff/g;->a:Lx0/f;

    new-instance v2, Lff/g$d;

    const/4 v4, 0x0

    invoke-direct {v2, p2, p1, p0, v4}, Lff/g$d;-><init>(Ljava/lang/Object;La1/d$a;Lff/g;Lgk/Continuation;)V

    iput v3, v0, Lff/g$c;->c:I

    invoke-static {p3, v2, v0}, La1/g;->a(Lx0/f;Lok/p;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to update cache config value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SettingsCache"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_2
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method private final l(La1/d;)V
    .locals 7

    new-instance v6, Lff/e;

    sget-object v0, Lff/g;->d:La1/d$a;

    invoke-virtual {p1, v0}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    sget-object v0, Lff/g;->e:La1/d$a;

    invoke-virtual {p1, v0}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Double;

    sget-object v0, Lff/g;->f:La1/d$a;

    invoke-virtual {p1, v0}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    sget-object v0, Lff/g;->g:La1/d$a;

    invoke-virtual {p1, v0}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    sget-object v0, Lff/g;->h:La1/d$a;

    invoke-virtual {p1, v0}, La1/d;->b(La1/d$a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Long;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lff/e;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V

    iput-object v6, p0, Lff/g;->b:Lff/e;

    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 6

    iget-object v0, p0, Lff/g;->b:Lff/e;

    const/4 v1, 0x0

    const-string v2, "sessionConfigs"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lff/e;->b()Ljava/lang/Long;

    move-result-object v0

    iget-object v3, p0, Lff/g;->b:Lff/e;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1}, Lff/e;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const/16 v0, 0x3e8

    int-to-long v4, v0

    div-long/2addr v2, v4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v2, v0

    if-gez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lff/g;->b:Lff/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lff/e;->d()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lff/g;->b:Lff/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lff/e;->e()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lff/g;->b:Lff/e;

    if-nez v0, :cond_0

    const-string v0, "sessionConfigs"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lff/e;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/Double;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Double;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lff/g;->e:La1/d$a;

    invoke-direct {p0, v0, p1, p2}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public final j(Ljava/lang/Integer;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lff/g;->g:La1/d$a;

    invoke-direct {p0, v0, p1, p2}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public final k(Ljava/lang/Long;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lff/g;->h:La1/d$a;

    invoke-direct {p0, v0, p1, p2}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public final m(Ljava/lang/Integer;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lff/g;->f:La1/d$a;

    invoke-direct {p0, v0, p1, p2}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public final n(Ljava/lang/Boolean;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lff/g;->d:La1/d$a;

    invoke-direct {p0, v0, p1, p2}, Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
