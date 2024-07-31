.class public Lbe/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a([B)[B
    .locals 0

    invoke-static {p0}, Lbe/v0;->c([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf6/f;[B)V
    .locals 0

    invoke-static {p0, p1}, Lbe/v0;->d(Lf6/f;[B)V

    return-void
.end method

.method private static synthetic c([B)[B
    .locals 0

    return-object p0
.end method

.method private static synthetic d(Lf6/f;[B)V
    .locals 0

    invoke-static {p1}, Lf6/c;->d(Ljava/lang/Object;)Lf6/c;

    move-result-object p1

    invoke-interface {p0, p1}, Lf6/f;->b(Lf6/c;)V

    return-void
.end method

.method static e(Lzb/g;Lf6/g;Lcc/a;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)Lzd/q2;
    .locals 9
    .param p6    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param

    new-instance v0, Lbe/t0;

    invoke-direct {v0}, Lbe/t0;-><init>()V

    const-string v1, "FIREBASE_INAPPMESSAGING"

    const-class v2, [B

    invoke-interface {p1, v1, v2, v0}, Lf6/g;->a(Ljava/lang/String;Ljava/lang/Class;Lf6/e;)Lf6/f;

    move-result-object p1

    new-instance v8, Lzd/q2;

    new-instance v1, Lbe/u0;

    invoke-direct {v1, p1}, Lbe/u0;-><init>(Lf6/f;)V

    move-object v0, v8

    move-object v2, p2

    move-object v3, p0

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lzd/q2;-><init>(Lzd/q2$b;Lcc/a;Lzb/g;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)V

    return-object v8
.end method
