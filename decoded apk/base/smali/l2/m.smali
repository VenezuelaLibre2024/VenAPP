.class public Ll2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/lifecycle/LiveData;Lm/a;Lm2/b;)Landroidx/lifecycle/LiveData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<In:",
            "Ljava/lang/Object;",
            "Out:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TIn;>;",
            "Lm/a<",
            "TIn;TOut;>;",
            "Lm2/b;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "TOut;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroidx/lifecycle/p;

    invoke-direct {v1}, Landroidx/lifecycle/p;-><init>()V

    new-instance v2, Ll2/m$a;

    invoke-direct {v2, p2, v0, p1, v1}, Ll2/m$a;-><init>(Lm2/b;Ljava/lang/Object;Lm/a;Landroidx/lifecycle/p;)V

    invoke-virtual {v1, p0, v2}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/s;)V

    return-object v1
.end method
