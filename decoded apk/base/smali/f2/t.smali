.class public abstract Lf2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lf2/t;
    .locals 0

    invoke-static {p0}, Landroidx/work/impl/e0;->m(Landroid/content/Context;)Landroidx/work/impl/e0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/work/impl/e0;->g(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lf2/m;
.end method

.method public abstract b(Ljava/util/UUID;)Lf2/m;
.end method

.method public final c(Lf2/u;)Lf2/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf2/t;->d(Ljava/util/List;)Lf2/m;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Ljava/util/List;)Lf2/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lf2/u;",
            ">;)",
            "Lf2/m;"
        }
    .end annotation
.end method

.method public abstract f(Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lf2/s;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract h()Lf2/m;
.end method
