.class public Ld0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/camera/core/impl/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/camera/core/impl/t1;

    invoke-static {}, Ld0/c;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/t1;-><init>(Ljava/util/List;)V

    sput-object v0, Ld0/b;->a:Landroidx/camera/core/impl/t1;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/camera/core/impl/s1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Ld0/b;->a:Landroidx/camera/core/impl/t1;

    invoke-virtual {v0, p0}, Landroidx/camera/core/impl/t1;->b(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object p0

    return-object p0
.end method
