.class public abstract Lql/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/d0$a;
    }
.end annotation


# static fields
.field public static final a:Lql/d0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lql/d0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/d0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/d0;->a:Lql/d0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/nio/charset/Charset;
    .locals 2

    invoke-virtual {p0}, Lql/d0;->e()Lql/w;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lxk/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lql/w;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lxk/d;->b:Ljava/nio/charset/Charset;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lql/d0;->f()Ldm/d;

    move-result-object v0

    invoke-static {v0}, Lrl/d;->m(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract e()Lql/w;
.end method

.method public abstract f()Ldm/d;
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lql/d0;->f()Ldm/d;

    move-result-object v0

    :try_start_0
    invoke-direct {p0}, Lql/d0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lrl/d;->I(Ldm/d;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {v0, v1}, Ldm/d;->U0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lmk/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method
