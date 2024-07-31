.class public final Lff/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/f$a;
    }
.end annotation


# static fields
.field public static final c:Lff/f$a;

.field private static final d:Lrk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrk/a<",
            "Landroid/content/Context;",
            "Lx0/f<",
            "La1/d;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lff/h;

.field private final b:Lff/h;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lff/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lff/f$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lff/f;->c:Lff/f$a;

    sget-object v0, Ldf/v;->a:Ldf/v;

    invoke-virtual {v0}, Ldf/v;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lz0/a;->b(Ljava/lang/String;Ly0/b;Lok/l;Lzk/k0;ILjava/lang/Object;)Lrk/a;

    move-result-object v0

    sput-object v0, Lff/f;->d:Lrk/a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lgk/f;Lgk/f;Lfe/f;Ldf/b;)V
    .locals 9

    new-instance v0, Lff/b;

    invoke-direct {v0, p1}, Lff/b;-><init>(Landroid/content/Context;)V

    new-instance v7, Lff/c;

    new-instance v8, Lff/d;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v8

    move-object v2, p5

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lff/d;-><init>(Ldf/b;Lgk/f;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    sget-object p2, Lff/f;->c:Lff/f$a;

    invoke-static {p2, p1}, Lff/f$a;->a(Lff/f$a;Landroid/content/Context;)Lx0/f;

    move-result-object v6

    move-object v1, v7

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Lff/c;-><init>(Lgk/f;Lfe/f;Ldf/b;Lff/a;Lx0/f;)V

    invoke-direct {p0, v0, v7}, Lff/f;-><init>(Lff/h;Lff/h;)V

    return-void
.end method

.method public constructor <init>(Lff/h;Lff/h;)V
    .locals 1

    const-string v0, "localOverrideSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff/f;->a:Lff/h;

    iput-object p2, p0, Lff/f;->b:Lff/h;

    return-void
.end method

.method public constructor <init>(Lzb/g;Lgk/f;Lgk/f;Lfe/f;)V
    .locals 7

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallationsApi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v2

    const-string v0, "firebaseApp.applicationContext"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldf/a0;->a:Ldf/a0;

    invoke-virtual {v0, p1}, Ldf/a0;->b(Lzb/g;)Ldf/b;

    move-result-object v6

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lff/f;-><init>(Landroid/content/Context;Lgk/f;Lgk/f;Lfe/f;Ldf/b;)V

    return-void
.end method

.method public static final synthetic a()Lrk/a;
    .locals 1

    sget-object v0, Lff/f;->d:Lrk/a;

    return-object v0
.end method

.method private final e(D)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v2

    if-gtz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private final f(J)Z
    .locals 1

    invoke-static {p1, p2}, Lyk/a;->G(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lyk/a;->B(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final b()D
    .locals 3

    iget-object v0, p0, Lff/f;->a:Lff/h;

    invoke-interface {v0}, Lff/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lff/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lff/f;->b:Lff/h;

    invoke-interface {v0}, Lff/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lff/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public final c()J
    .locals 3

    iget-object v0, p0, Lff/f;->a:Lff/h;

    invoke-interface {v0}, Lff/h;->b()Lyk/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lyk/a;->K()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lff/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lff/f;->b:Lff/h;

    invoke-interface {v0}, Lff/h;->b()Lyk/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lyk/a;->K()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lff/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    sget-object v0, Lyk/a;->b:Lyk/a$a;

    const/16 v0, 0x1e

    sget-object v1, Lyk/d;->MINUTES:Lyk/d;

    invoke-static {v0, v1}, Lyk/c;->h(ILyk/d;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lff/f;->a:Lff/h;

    invoke-interface {v0}, Lff/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lff/f;->b:Lff/h;

    invoke-interface {v0}, Lff/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final g(Lgk/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lff/f$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lff/f$b;

    iget v1, v0, Lff/f$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lff/f$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lff/f$b;

    invoke-direct {v0, p0, p1}, Lff/f$b;-><init>(Lff/f;Lgk/Continuation;)V

    :goto_0
    iget-object p1, v0, Lff/f$b;->b:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lff/f$b;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lff/f$b;->a:Ljava/lang/Object;

    check-cast v2, Lff/f;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lff/f;->a:Lff/h;

    iput-object p0, v0, Lff/f$b;->a:Ljava/lang/Object;

    iput v4, v0, Lff/f$b;->d:I

    invoke-interface {p1, v0}, Lff/h;->d(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lff/f;->b:Lff/h;

    const/4 v2, 0x0

    iput-object v2, v0, Lff/f$b;->a:Ljava/lang/Object;

    iput v3, v0, Lff/f$b;->d:I

    invoke-interface {p1, v0}, Lff/h;->d(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
