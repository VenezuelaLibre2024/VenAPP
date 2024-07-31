.class public final Lzj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj/a$b;,
        Lzj/a$h;,
        Lzj/a$f;,
        Lzj/a$c;,
        Lzj/a$e;,
        Lzj/a$d;,
        Lzj/a$a;,
        Lzj/a$g;
    }
.end annotation


# static fields
.field static final a:Ldj/r;

.field static final b:Ldj/r;

.field static final c:Ldj/r;

.field static final d:Ldj/r;

.field static final e:Ldj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzj/a$h;

    invoke-direct {v0}, Lzj/a$h;-><init>()V

    invoke-static {v0}, Lyj/a;->h(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object v0

    sput-object v0, Lzj/a;->a:Ldj/r;

    new-instance v0, Lzj/a$b;

    invoke-direct {v0}, Lzj/a$b;-><init>()V

    invoke-static {v0}, Lyj/a;->e(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object v0

    sput-object v0, Lzj/a;->b:Ldj/r;

    new-instance v0, Lzj/a$c;

    invoke-direct {v0}, Lzj/a$c;-><init>()V

    invoke-static {v0}, Lyj/a;->f(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object v0

    sput-object v0, Lzj/a;->c:Ldj/r;

    invoke-static {}, Luj/k;->d()Luj/k;

    move-result-object v0

    sput-object v0, Lzj/a;->d:Ldj/r;

    new-instance v0, Lzj/a$f;

    invoke-direct {v0}, Lzj/a$f;-><init>()V

    invoke-static {v0}, Lyj/a;->g(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object v0

    sput-object v0, Lzj/a;->e:Ldj/r;

    return-void
.end method

.method public static a()Ldj/r;
    .locals 1

    sget-object v0, Lzj/a;->b:Ldj/r;

    invoke-static {v0}, Lyj/a;->p(Ldj/r;)Ldj/r;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ldj/r;
    .locals 1

    sget-object v0, Lzj/a;->c:Ldj/r;

    invoke-static {v0}, Lyj/a;->r(Ldj/r;)Ldj/r;

    move-result-object v0

    return-object v0
.end method
