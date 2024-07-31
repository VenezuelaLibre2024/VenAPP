.class public Lvi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/j$b;
    }
.end annotation


# static fields
.field private static final a:Lvi/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/g<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvi/j$a;

    invoke-direct {v0}, Lvi/j$a;-><init>()V

    sput-object v0, Lvi/j;->a:Lvi/g;

    return-void
.end method

.method public static a(Lvi/d;Ljava/util/List;)Lvi/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/d;",
            "Ljava/util/List<",
            "+",
            "Lvi/h;",
            ">;)",
            "Lvi/d;"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/h;

    new-instance v1, Lvi/j$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lvi/j$b;-><init>(Lvi/d;Lvi/h;Lvi/i;)V

    move-object p0, v1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static varargs b(Lvi/d;[Lvi/h;)Lvi/d;
    .locals 0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lvi/j;->a(Lvi/d;Ljava/util/List;)Lvi/d;

    move-result-object p0

    return-object p0
.end method
