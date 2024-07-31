.class public abstract Lvi/y0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/y0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lvi/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;",
            "Lvi/a;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lvi/y0$g;->d()Lvi/y0$g$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/y0$g$a;->b(Ljava/util/List;)Lvi/y0$g$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvi/y0$g$a;->c(Lvi/a;)Lvi/y0$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lvi/y0$g$a;->a()Lvi/y0$g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvi/y0$e;->c(Lvi/y0$g;)V

    return-void
.end method

.method public abstract b(Lvi/g1;)V
.end method

.method public abstract c(Lvi/y0$g;)V
.end method
