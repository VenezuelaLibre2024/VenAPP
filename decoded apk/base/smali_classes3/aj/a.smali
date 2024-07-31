.class public abstract Laj/a;
.super Laj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Laj/a<",
        "TS;>;>",
        "Laj/b<",
        "TS;>;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Lvi/d;Lvi/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Laj/b;-><init>(Lvi/d;Lvi/c;)V

    return-void
.end method

.method public static e(Laj/b$a;Lvi/d;)Laj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Laj/b<",
            "TT;>;>(",
            "Laj/b$a<",
            "TT;>;",
            "Lvi/d;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lvi/c;->k:Lvi/c;

    invoke-static {p0, p1, v0}, Laj/a;->f(Laj/b$a;Lvi/d;Lvi/c;)Laj/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Laj/b$a;Lvi/d;Lvi/c;)Laj/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Laj/b<",
            "TT;>;>(",
            "Laj/b$a<",
            "TT;>;",
            "Lvi/d;",
            "Lvi/c;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Laj/c;->c:Lvi/c$c;

    sget-object v1, Laj/c$d;->BLOCKING:Laj/c$d;

    invoke-virtual {p2, v0, v1}, Lvi/c;->q(Lvi/c$c;Ljava/lang/Object;)Lvi/c;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Laj/b$a;->a(Lvi/d;Lvi/c;)Laj/b;

    move-result-object p0

    return-object p0
.end method
