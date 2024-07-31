.class public final Lvi/y0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/y0$b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lvi/d1;

.field private final c:Lvi/k1;

.field private final d:Lvi/y0$h;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lvi/f;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;Lvi/d1;Lvi/k1;Lvi/y0$h;Ljava/util/concurrent/ScheduledExecutorService;Lvi/f;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultPort not set"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lvi/y0$b;->a:I

    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/d1;

    iput-object p1, p0, Lvi/y0$b;->b:Lvi/d1;

    const-string p1, "syncContext not set"

    invoke-static {p3, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/k1;

    iput-object p1, p0, Lvi/y0$b;->c:Lvi/k1;

    const-string p1, "serviceConfigParser not set"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/y0$h;

    iput-object p1, p0, Lvi/y0$b;->d:Lvi/y0$h;

    iput-object p5, p0, Lvi/y0$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lvi/y0$b;->f:Lvi/f;

    iput-object p7, p0, Lvi/y0$b;->g:Ljava/util/concurrent/Executor;

    iput-object p8, p0, Lvi/y0$b;->h:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Integer;Lvi/d1;Lvi/k1;Lvi/y0$h;Ljava/util/concurrent/ScheduledExecutorService;Lvi/f;Ljava/util/concurrent/Executor;Ljava/lang/String;Lvi/y0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lvi/y0$b;-><init>(Ljava/lang/Integer;Lvi/d1;Lvi/k1;Lvi/y0$h;Ljava/util/concurrent/ScheduledExecutorService;Lvi/f;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    return-void
.end method

.method public static f()Lvi/y0$b$a;
    .locals 1

    new-instance v0, Lvi/y0$b$a;

    invoke-direct {v0}, Lvi/y0$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lvi/y0$b;->a:I

    return v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lvi/y0$b;->g:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Lvi/d1;
    .locals 1

    iget-object v0, p0, Lvi/y0$b;->b:Lvi/d1;

    return-object v0
.end method

.method public d()Lvi/y0$h;
    .locals 1

    iget-object v0, p0, Lvi/y0$b;->d:Lvi/y0$h;

    return-object v0
.end method

.method public e()Lvi/k1;
    .locals 1

    iget-object v0, p0, Lvi/y0$b;->c:Lvi/k1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "defaultPort"

    iget v2, p0, Lvi/y0$b;->a:I

    invoke-virtual {v0, v1, v2}, Leb/i$b;->b(Ljava/lang/String;I)Leb/i$b;

    move-result-object v0

    const-string v1, "proxyDetector"

    iget-object v2, p0, Lvi/y0$b;->b:Lvi/d1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "syncContext"

    iget-object v2, p0, Lvi/y0$b;->c:Lvi/k1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "serviceConfigParser"

    iget-object v2, p0, Lvi/y0$b;->d:Lvi/y0$h;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "scheduledExecutorService"

    iget-object v2, p0, Lvi/y0$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "channelLogger"

    iget-object v2, p0, Lvi/y0$b;->f:Lvi/f;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "executor"

    iget-object v2, p0, Lvi/y0$b;->g:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "overrideAuthority"

    iget-object v2, p0, Lvi/y0$b;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
