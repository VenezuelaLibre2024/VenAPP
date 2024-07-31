.class public final Ld4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld4/a$e;,
        Ld4/a$f;,
        Ld4/a$g;,
        Ld4/a$d;
    }
.end annotation


# static fields
.field private static final a:Ld4/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld4/a$g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld4/a$a;

    invoke-direct {v0}, Ld4/a$a;-><init>()V

    sput-object v0, Ld4/a;->a:Ld4/a$g;

    return-void
.end method

.method private static a(Landroidx/core/util/e;Ld4/a$d;)Landroidx/core/util/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ld4/a$f;",
            ">(",
            "Landroidx/core/util/e<",
            "TT;>;",
            "Ld4/a$d<",
            "TT;>;)",
            "Landroidx/core/util/e<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Ld4/a;->c()Ld4/a$g;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ld4/a;->b(Landroidx/core/util/e;Ld4/a$d;Ld4/a$g;)Landroidx/core/util/e;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroidx/core/util/e;Ld4/a$d;Ld4/a$g;)Landroidx/core/util/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/core/util/e<",
            "TT;>;",
            "Ld4/a$d<",
            "TT;>;",
            "Ld4/a$g<",
            "TT;>;)",
            "Landroidx/core/util/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ld4/a$e;

    invoke-direct {v0, p0, p1, p2}, Ld4/a$e;-><init>(Landroidx/core/util/e;Ld4/a$d;Ld4/a$g;)V

    return-object v0
.end method

.method private static c()Ld4/a$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ld4/a$g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Ld4/a;->a:Ld4/a$g;

    return-object v0
.end method

.method public static d(ILd4/a$d;)Landroidx/core/util/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ld4/a$f;",
            ">(I",
            "Ld4/a$d<",
            "TT;>;)",
            "Landroidx/core/util/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Landroidx/core/util/g;

    invoke-direct {v0, p0}, Landroidx/core/util/g;-><init>(I)V

    invoke-static {v0, p1}, Ld4/a;->a(Landroidx/core/util/e;Ld4/a$d;)Landroidx/core/util/e;

    move-result-object p0

    return-object p0
.end method

.method public static e()Landroidx/core/util/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/core/util/e<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const/16 v0, 0x14

    invoke-static {v0}, Ld4/a;->f(I)Landroidx/core/util/e;

    move-result-object v0

    return-object v0
.end method

.method public static f(I)Landroidx/core/util/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "Landroidx/core/util/e<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Landroidx/core/util/g;

    invoke-direct {v0, p0}, Landroidx/core/util/g;-><init>(I)V

    new-instance p0, Ld4/a$b;

    invoke-direct {p0}, Ld4/a$b;-><init>()V

    new-instance v1, Ld4/a$c;

    invoke-direct {v1}, Ld4/a$c;-><init>()V

    invoke-static {v0, p0, v1}, Ld4/a;->b(Landroidx/core/util/e;Ld4/a$d;Ld4/a$g;)Landroidx/core/util/e;

    move-result-object p0

    return-object p0
.end method
