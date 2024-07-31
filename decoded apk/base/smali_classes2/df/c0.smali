.class public final Ldf/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/c0$a;
    }
.end annotation


# static fields
.field public static final g:Ldf/c0$a;

.field private static final h:D


# instance fields
.field private final b:Lzb/g;

.field private final c:Lfe/f;

.field private final d:Lff/f;

.field private final e:Ldf/h;

.field private final f:Lgk/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/c0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ldf/c0;->g:Ldf/c0$a;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    sput-wide v0, Ldf/c0;->h:D

    return-void
.end method

.method public constructor <init>(Lzb/g;Lfe/f;Lff/f;Ldf/h;Lgk/f;)V
    .locals 1

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionSettings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventGDTLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/c0;->b:Lzb/g;

    iput-object p2, p0, Ldf/c0;->c:Lfe/f;

    iput-object p3, p0, Ldf/c0;->d:Lff/f;

    iput-object p4, p0, Ldf/c0;->e:Ldf/h;

    iput-object p5, p0, Ldf/c0;->f:Lgk/f;

    return-void
.end method

.method public static final synthetic b(Ldf/c0;Ldf/z;)V
    .locals 0

    invoke-direct {p0, p1}, Ldf/c0;->g(Ldf/z;)V

    return-void
.end method

.method public static final synthetic c(Ldf/c0;)Lzb/g;
    .locals 0

    iget-object p0, p0, Ldf/c0;->b:Lzb/g;

    return-object p0
.end method

.method public static final synthetic d(Ldf/c0;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ldf/c0;->h(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ldf/c0;)Lff/f;
    .locals 0

    iget-object p0, p0, Ldf/c0;->d:Lff/f;

    return-object p0
.end method

.method public static final synthetic f(Ldf/c0;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ldf/c0;->j(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ldf/z;)V
    .locals 3

    const-string v0, "SessionFirelogPublisher"

    :try_start_0
    iget-object v1, p0, Ldf/c0;->e:Ldf/h;

    invoke-interface {v1, p1}, Ldf/h;->a(Ldf/z;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Successfully logged Session Start event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ldf/z;->c()Ldf/e0;

    move-result-object p1

    invoke-virtual {p1}, Ldf/e0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Error logging Session Start event to DataTransport: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private final h(Lgk/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ldf/c0$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ldf/c0$b;

    iget v1, v0, Ldf/c0$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldf/c0$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldf/c0$b;

    invoke-direct {v0, p0, p1}, Ldf/c0$b;-><init>(Ldf/c0;Lgk/Continuation;)V

    :goto_0
    iget-object p1, v0, Ldf/c0$b;->a:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldf/c0$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ldf/c0;->c:Lfe/f;

    invoke-interface {p1}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v2, "firebaseInstallations.id"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, v0, Ldf/c0$b;->c:I

    invoke-static {p1, v0}, Ljl/b;->a(Lcom/google/android/gms/tasks/Task;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    const-string v0, "SessionFirelogPublisher"

    const-string v1, "Error getting Firebase Installation ID. Using an empty ID"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    :goto_3
    return-object p1
.end method

.method private final i()Z
    .locals 4

    sget-wide v0, Ldf/c0;->h:D

    iget-object v2, p0, Ldf/c0;->d:Lff/f;

    invoke-virtual {v2}, Lff/f;->b()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final j(Lgk/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ldf/c0$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ldf/c0$d;

    iget v1, v0, Ldf/c0$d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldf/c0$d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldf/c0$d;

    invoke-direct {v0, p0, p1}, Ldf/c0$d;-><init>(Ldf/c0;Lgk/Continuation;)V

    :goto_0
    iget-object p1, v0, Ldf/c0$d;->b:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldf/c0$d;->d:I

    const-string v3, "SessionFirelogPublisher"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Ldf/c0$d;->a:Ljava/lang/Object;

    check-cast v0, Ldf/c0;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    const-string p1, "Data Collection is enabled for at least one Subscriber"

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ldf/c0;->d:Lff/f;

    iput-object p0, v0, Ldf/c0$d;->a:Ljava/lang/Object;

    iput v4, v0, Ldf/c0$d;->d:I

    invoke-virtual {p1, v0}, Lff/f;->g(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Ldf/c0;->d:Lff/f;

    invoke-virtual {p1}, Lff/f;->d()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_4

    const-string p1, "Sessions SDK disabled. Events will not be sent."

    :goto_2
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {v0}, Ldf/c0;->i()Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "Sessions SDK has dropped this session due to sampling."

    goto :goto_2

    :cond_5
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Ldf/y;)V
    .locals 7

    const-string v0, "sessionDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldf/c0;->f:Lgk/f;

    invoke-static {v0}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Ldf/c0$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Ldf/c0$c;-><init>(Ldf/c0;Ldf/y;Lgk/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    return-void
.end method
