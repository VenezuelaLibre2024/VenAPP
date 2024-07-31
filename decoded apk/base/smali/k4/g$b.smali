.class final Lk4/g$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk4/g;->m(Li4/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/p<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lk4/g$b;->a:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lk4/g$b;->d(Ljava/lang/Integer;Ljava/util/List;)V

    return-void
.end method

.method private static final d(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 2

    const-string v0, "$processedEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lk4/g;->b()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0, p0}, Ldk/p;->x(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lk4/g;->a:Lk4/g;

    const/4 v1, 0x5

    invoke-virtual {v0, p0, p1, v1}, Lk4/g;->g(Ljava/lang/Integer;Ljava/util/List;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    sget-object p1, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    iget-object p1, p0, Lk4/g$b;->a:Ljava/util/List;

    new-instance v0, Lk4/h;

    invoke-direct {v0, p2, p1}, Lk4/h;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    invoke-static {v0}, Lcom/facebook/internal/n0;->C0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lk4/g$b;->c(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
