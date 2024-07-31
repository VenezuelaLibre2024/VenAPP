.class public Lzd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lac/c;

.field b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lac/c;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/b;->a:Lac/c;

    iput-object p2, p0, Lzd/b;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lzd/b;Lqd/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/b;->b(Lqd/m;)V

    return-void
.end method

.method private synthetic b(Lqd/m;)V
    .locals 11

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Updating active experiment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/protobuf/x;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lzd/b;->a:Lac/c;

    new-instance v10, Lac/b;

    invoke-virtual {p1}, Lqd/m;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lqd/m;->i0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lqd/m;->g0()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/Date;

    invoke-virtual {p1}, Lqd/m;->e0()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p1}, Lqd/m;->h0()J

    move-result-wide v6

    invoke-virtual {p1}, Lqd/m;->f0()J

    move-result-wide v8

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lac/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JJ)V

    invoke-virtual {v0, v10}, Lac/c;->o(Lac/b;)V
    :try_end_0
    .catch Lac/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to set experiment as active with ABT, missing analytics?\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method c(Lqd/m;)V
    .locals 2

    iget-object v0, p0, Lzd/b;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lzd/a;

    invoke-direct {v1, p0, p1}, Lzd/a;-><init>(Lzd/b;Lqd/m;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
