.class public final Lgl/b;
.super Lzk/m1;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final d:Lgl/b;

.field private static final e:Lzk/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lgl/b;

    invoke-direct {v0}, Lgl/b;-><init>()V

    sput-object v0, Lgl/b;->d:Lgl/b;

    sget-object v0, Lgl/m;->c:Lgl/m;

    const-string v1, "kotlinx.coroutines.io.parallelism"

    const/16 v2, 0x40

    invoke-static {}, Lel/i0;->a()I

    move-result v3

    invoke-static {v2, v3}, Luk/j;->b(II)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lel/i0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lgl/m;->H0(I)Lzk/h0;

    move-result-object v0

    sput-object v0, Lgl/b;->e:Lzk/h0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzk/m1;-><init>()V

    return-void
.end method


# virtual methods
.method public D0(Lgk/f;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lgl/b;->e:Lzk/h0;

    invoke-virtual {v0, p1, p2}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    return-void
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lgk/g;->a:Lgk/g;

    invoke-virtual {p0, v0, p1}, Lgl/b;->D0(Lgk/f;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
